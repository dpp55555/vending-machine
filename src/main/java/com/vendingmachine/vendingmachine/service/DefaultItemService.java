package com.vendingmachine.vendingmachine.service;

import com.vendingmachine.vendingmachine.entity.ItemEntity;
import com.vendingmachine.vendingmachine.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultItemService implements ItemService {

    private final ItemRepository itemRepository;

    public DefaultItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemEntity create(ItemEntity entity) {
        return itemRepository.save(entity);
    }

}
