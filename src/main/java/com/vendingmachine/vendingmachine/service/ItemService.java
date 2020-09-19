package com.vendingmachine.vendingmachine.service;

import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    ItemEntity create(ItemEntity item);

    Page<ItemEntity> retrieveAll(Pageable pageable);

    ItemEntity retrieveById(Long id);

    ItemEntity createOrUpdate(ItemEntity item);

    void remove(Long id);

    long getCount();

    long getCount(String name);
}
