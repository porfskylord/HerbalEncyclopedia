package com.herbalencyclopedia.HerbalEncyclopedia.Dto;

import lombok.Data;

@Data
public class HerbRequestDto {
    private String name;
    private String subname;
    private String image;
    private String history;
    private String pros;
    private String cons;
}
