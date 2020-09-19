package com.vendingmachine.vendingmachine.converter;

import com.vendingmachine.vendingmachine.dto.CreateItemDto;
import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.core.convert.converter.Converter;

public class CreateItemDtoToItemEntityConverter implements Converter<CreateItemDto, ItemEntity> {
    @Override
    public ItemEntity convert(CreateItemDto createItemDto) {
        return new ItemEntity(createItemDto.getName());
    }
}
