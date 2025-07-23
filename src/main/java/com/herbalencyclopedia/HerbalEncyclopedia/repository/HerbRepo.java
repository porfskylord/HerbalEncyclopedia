package com.herbalencyclopedia.HerbalEncyclopedia.repository;

import com.herbalencyclopedia.HerbalEncyclopedia.entity.Herb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HerbRepo extends JpaRepository<Herb, Long> {
    Optional<Herb> findByName(String name);
}
