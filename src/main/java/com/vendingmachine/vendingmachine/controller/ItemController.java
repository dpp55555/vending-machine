package com.vendingmachine.vendingmachine.controller;

import com.vendingmachine.vendingmachine.dto.ItemDto;
import com.vendingmachine.vendingmachine.dto.ItemResponseDto;
import com.vendingmachine.vendingmachine.entity.ItemEntity;
import com.vendingmachine.vendingmachine.service.ItemService;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@RestController
public class ItemController {

    private final ConversionService conversionService;
    private final ItemService itemService;

    public ItemController(ConversionService conversionService,
                          ItemService itemService) {
        this.conversionService = conversionService;
        this.itemService = itemService;
    }

    @PostMapping("/items")
    public ItemResponseDto create(@RequestBody @Valid ItemDto dto) {
        final ItemEntity newItem = conversionService.convert(dto, ItemEntity.class);
        return conversionService.convert(itemService.create(newItem), ItemResponseDto.class);
    }

    @GetMapping("/items")
    public List<ItemEntity> retrieve() {
        return itemService.retrieveAll();
    }

    @GetMapping("/items/{id}")
    public ItemEntity retrieve(@PathVariable @NotNull Long id) {
        return itemService.retrieveById(id);
    }

    @PutMapping("/items/{id}")
    public ItemResponseDto update(@PathVariable Long id,
                                  @RequestBody @Valid ItemDto dto) {
        final ItemEntity item = conversionService.convert(dto, ItemEntity.class);
        Objects.requireNonNull(item).setId(id);
        ItemEntity updatedItem = itemService.createOrUpdate(item);
        return conversionService.convert(updatedItem, ItemResponseDto.class);
    }

    @DeleteMapping("/items/{id}")
    public void remove(@PathVariable @NotNull Long id) {
        itemService.remove(id);
    }

}

