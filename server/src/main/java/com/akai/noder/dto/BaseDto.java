package com.akai.noder.dto;

import lombok.Data;

@Data
public class BaseDto {

    private Long id;

    public BaseDto() {}

    public BaseDto(Long id) {
        this.id = id;
    }
}
