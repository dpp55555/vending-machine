package com.vendingmachine.vendingmachine.service;

import com.vendingmachine.vendingmachine.entity.ItemEntity;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    ItemEntity create(ItemEntity entity);
}
