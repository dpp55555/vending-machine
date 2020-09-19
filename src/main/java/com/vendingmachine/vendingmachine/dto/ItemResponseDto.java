package com.vendingmachine.vendingmachine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemResponseDto {
    Long id;
    String name;
}