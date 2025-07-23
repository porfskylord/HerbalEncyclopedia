package com.herbalencyclopedia.HerbalEncyclopedia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "herb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Herb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private String subname;

    @Column
    private String image;

    @Column
    private String history;

    @Column
    private String pros;

    @Column
    private String cons;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

}
