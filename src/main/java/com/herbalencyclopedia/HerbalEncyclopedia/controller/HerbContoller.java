package com.herbalencyclopedia.HerbalEncyclopedia.controller;

import com.herbalencyclopedia.HerbalEncyclopedia.Dto.HerbRequestDto;
import com.herbalencyclopedia.HerbalEncyclopedia.Dto.HerbResponseDto;
import com.herbalencyclopedia.HerbalEncyclopedia.service.HerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/herb")
public class HerbContoller {

    @Autowired
    private HerbService herbService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/allherbnames")
    public List<HerbResponseDto> allHerbNames() {
        return herbService.getAllHerbNames();
    }

    @PostMapping("/addherb")
    public ResponseEntity<?> addHerb(@RequestBody HerbRequestDto request) {
        return herbService.addHerb(request);

    }


    @GetMapping("/slideshow")
    public ResponseEntity<Map<String, Object>> getHerbsSlideshow(
            @RequestParam(defaultValue = "0") int start,
            @RequestParam(defaultValue = "5") int count) {

        Map<String, Object> response = herbService.getHerbsForSlideshow(start, count);
        return ResponseEntity.ok(response);
    }




    @PostMapping("/addHerb")
    public ResponseEntity<?> addHerb(
            @RequestParam("name") String name,
            @RequestParam(value = "subname", required = false) String subname,
            @RequestParam(value = "history", required = false) String history,
            @RequestParam(value = "pros", required = false) String pros,
            @RequestParam(value = "cons", required = false) String cons,
            @RequestParam("image") MultipartFile imageFile
    ) {

        HerbRequestDto request = new HerbRequestDto();
        request.setName(name);
        request.setSubname(subname);
        request.setHistory(history);
        request.setPros(pros);
        request.setCons(cons);
        return herbService.addHerb(request);
    }



}
