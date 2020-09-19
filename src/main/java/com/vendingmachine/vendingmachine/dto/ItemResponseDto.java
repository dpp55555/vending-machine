package com.vendingmachine.vendingmachine.dto;

import lombok.Data;
import lombok.Value;

@Value
public class ItemResponseDto {
    Long id;
    String name;
}