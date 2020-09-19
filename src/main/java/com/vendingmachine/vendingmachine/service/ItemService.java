package com.vendingmachine.vendingmachine.service;

import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    ItemEntity create(ItemEntity item);

    List<ItemEntity> retrieveAll();

    ItemEntity retrieveById(Long id);

    ItemEntity createOrUpdate(ItemEntity item);

    void remove(Long id);
}
