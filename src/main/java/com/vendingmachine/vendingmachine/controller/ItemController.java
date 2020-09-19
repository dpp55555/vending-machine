package com.vendingmachine.vendingmachine.controller;

import com.vendingmachine.vendingmachine.dto.CreateItemDto;
import com.vendingmachine.vendingmachine.dto.CreateItemResponseDto;
import com.vendingmachine.vendingmachine.entity.ItemEntity;
import com.vendingmachine.vendingmachine.service.DefaultItemService;
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

@RestController
public class ItemController {

    private final ConversionService conversionService;
    private final ItemService serviceService;

    public ItemController(ConversionService conversionService,
                          DefaultItemService serviceService) {
        this.conversionService = conversionService;
        this.serviceService = serviceService;
    }

    @PostMapping("/items/new")
    public CreateItemResponseDto create(@RequestBody @Valid CreateItemDto dto) {
        final ItemEntity newItem = conversionService.convert(dto, ItemEntity.class);
        return conversionService.convert(serviceService.create(newItem), CreateItemResponseDto.class);
    }

    @GetMapping("/items")
    public String retrieve() {
        return "retrieve";
    }

    @GetMapping("/items/{id}")
    public String retrieve(@PathVariable String id) {
        return "retrieve";
    }

    @PutMapping("/items/{id}/update")
    public String update(@PathVariable String id) {
        return "retrieve";
    }

    @DeleteMapping("/items/{id}/remove")
    public String remove(@PathVariable String id) {
        return "retrieve";
    }

}

