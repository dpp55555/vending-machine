package com.vendingmachine.vendingmachine.converter;

import com.vendingmachine.vendingmachine.dto.CreateItemResponseDto;
import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.core.convert.converter.Converter;

public class ItemEntityConverterToCreateItemResponseDto implements Converter<ItemEntity, CreateItemResponseDto> {
    @Override
    public CreateItemResponseDto convert(ItemEntity itemEntity) {
        return new CreateItemResponseDto(itemEntity.getId(), itemEntity.getName());
    }
}
