package com.vendingmachine.vendingmachine.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CreateItemResponseDto {
    Long id;
    String name;
}