package com.herbalencyclopedia.HerbalEncyclopedia.Dto;

@lombok.Data
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class HerbResponseDto {
    private String id;
    private String name;
    private String subname;
    private String image;
    private String history;
    private String pros;
    private String cons;
}
