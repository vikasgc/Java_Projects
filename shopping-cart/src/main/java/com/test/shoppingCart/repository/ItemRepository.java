package com.test.shoppingCart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.shoppingCart.model.Item;

public interface ItemRepository extends MongoRepository<Item, Integer>{

}
