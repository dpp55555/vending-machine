package com.vendingmachine.vendingmachine.converter;

import com.vendingmachine.vendingmachine.dto.ItemResponseDto;
import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.core.convert.converter.Converter;

public class ItemEntityConverterToCreateItemResponseDto implements Converter<ItemEntity, ItemResponseDto> {
    @Override
    public ItemResponseDto convert(ItemEntity itemEntity) {
        return new ItemResponseDto(itemEntity.getId(), itemEntity.getName());
    }
}
