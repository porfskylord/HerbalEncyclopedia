package com.herbalencyclopedia.HerbalEncyclopedia.service;

import com.herbalencyclopedia.HerbalEncyclopedia.Dto.HerbRequestDto;
import com.herbalencyclopedia.HerbalEncyclopedia.Dto.AllHerbResponseDto;
import com.herbalencyclopedia.HerbalEncyclopedia.Dto.HerbResponseDto;
import com.herbalencyclopedia.HerbalEncyclopedia.entity.Herb;
import com.herbalencyclopedia.HerbalEncyclopedia.repository.HerbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HerbService {

    @Autowired
    private HerbRepo herbRepo;

    public List<AllHerbResponseDto> getAllHerbNames() {
        return herbRepo.findAll().stream()
                .map(Herb -> AllHerbResponseDto.builder()
                        .id(String.valueOf(Herb.getId()))
                        .name(Herb.getName())
                        .build())
                .collect(Collectors.toList());

    }

    public ResponseEntity<?> addHerb(HerbRequestDto request) {

        Herb herb = Herb.builder()
                .name(request.getName())
                .subname(request.getSubname())
                .image(request.getImage())
                .history(request.getHistory())
                .pros(request.getPros())
                .cons(request.getCons())
                .build();

        Herb savedHerb = herbRepo.save(herb);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Herb added successfully");
        response.put("createdAt", savedHerb.getCreatedAt());
        return ResponseEntity.ok(response);

    }


    public Map<String, Object> getHerbsForSlideshow(int start, int count) {
        List<Herb> allHerbs = herbRepo.findAll(Sort.by("id"));
        int total = allHerbs.size();

        if (total == 0) {
            return Map.of("herbs", Collections.emptyList(), "nextStart", 0);
        }

        int end = start + count;
        List<Herb> result;

        if (end <= total) {
            result = allHerbs.subList(start, end);
        } else {
            result = new ArrayList<>();
            result.addAll(allHerbs.subList(start, total));
            result.addAll(allHerbs.subList(0, end % total));
        }

        int nextStart = (start + count) % total;

        return Map.of(
                "herbs", result,
                "nextStart", nextStart
        );
    }


    public ResponseEntity<?> addHerbs(String name, String subname, String history, String pros, String cons, MultipartFile imageFile) {
        try {
            String uploadDir = "uploads/";
            Files.createDirectories(Paths.get(uploadDir));

            String fileName = UUID.randomUUID() + "_" + imageFile.getOriginalFilename();
            Path filePath = Paths.get(uploadDir + fileName);
            Files.copy(imageFile.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            Herb herb = Herb.builder()
                    .name(name)
                    .subname(subname)
                    .history(history)
                    .pros(pros)
                    .cons(cons)
                    .image(fileName)
                    .build();

            Herb savedHerb = herbRepo.save(herb);

            Map<String, Object> response = new HashMap<>();
            response.put("message", "Herb added successfully");
            response.put("createdAt", savedHerb.getCreatedAt());
            response.put("imageUrl", "/uploads/" + fileName);

            return ResponseEntity.ok(response);

        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save image: " + e.getMessage());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to add Herb: " + ex.getMessage());
        }
    }

    public HerbResponseDto getHerb(Long id) {
        Herb herb = herbRepo.findById(id).orElse(null);
        return HerbResponseDto.builder()
                .id(String.valueOf(herb.getId()))
                .name(herb.getName())
                .subname(herb.getSubname())
                .image(herb.getImage())
                .history(herb.getHistory())
                .pros(herb.getPros())
                .cons(herb.getCons())
                .build();
    }
}
