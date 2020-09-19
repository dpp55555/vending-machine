package com.vendingmachine.vendingmachine.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class ItemDto {
    @NotBlank String name;
}