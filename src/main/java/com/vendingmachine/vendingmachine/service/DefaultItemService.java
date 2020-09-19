package com.vendingmachine.vendingmachine.service;

import com.vendingmachine.vendingmachine.entity.ItemEntity;
import com.vendingmachine.vendingmachine.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DefaultItemService implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public ItemEntity create(ItemEntity item) {
        return itemRepository.save(item);
    }

    @Override
    public Page<ItemEntity> retrieveAll(Pageable pageable) {
        return itemRepository.findAll(pageable);
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
    public long getCount() {
        return itemRepository.count();
    }

    @Override
    public void remove(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public long getCount(String name) {
        return itemRepository.countByName(name);
    }

}
