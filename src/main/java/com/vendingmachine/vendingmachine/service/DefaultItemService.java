package com.vendingmachine.vendingmachine.service;

import com.vendingmachine.vendingmachine.entity.ItemEntity;
import com.vendingmachine.vendingmachine.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultItemService implements ItemService {

    private final ItemRepository itemRepository;

    public DefaultItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemEntity create(ItemEntity item) {
        checkItemName(item);
        return itemRepository.save(item);
    }

    private void checkItemName(ItemEntity item) {
        itemRepository.findByName(item.getName())
                .map(it -> new IllegalArgumentException("Item with name: " + item.getName() + " already exists."));
    }

    @Override
    public List<ItemEntity> retrieveAll() {
        return itemRepository.findAll();
    }

    @Override
    public ItemEntity retrieveById(Long id) {
        return itemRepository.findById(id)
                .orElse(null);
    }

    @Override
    public ItemEntity createOrUpdate(ItemEntity item) {
        return itemRepository.save(item);
    }

    @Override
    public void remove(Long id) {
        itemRepository.deleteById(id);
    }

}
