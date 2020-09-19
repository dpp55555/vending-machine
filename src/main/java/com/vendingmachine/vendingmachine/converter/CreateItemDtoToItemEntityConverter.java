package com.vendingmachine.vendingmachine.converter;

import com.vendingmachine.vendingmachine.dto.ItemDto;
import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.core.convert.converter.Converter;

public class CreateItemDtoToItemEntityConverter implements Converter<ItemDto, ItemEntity> {
    @Override
    public ItemEntity convert(ItemDto itemDto) {
        return new ItemEntity(itemDto.getName());
    }
}
