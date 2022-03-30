package com.test.shoppingCart.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.shoppingCart.model.Item;
import com.test.shoppingCart.repository.ItemRepository;

@RestController
public class ItemController {

@Autowired
private ItemRepository repository;

@PostMapping("/addItem")
public String saveItem(@RequestBody Item item) {
repository.save(item);
return "Added Item with ID!";
}

@GetMapping("/findAllItems")
public List<Item> getItems(){
return repository.findAll();
}

@GetMapping("/findAllItems/{id}")
public Optional<Item> findItem(@PathVariable int id){
return repository.findById(id);
}

@DeleteMapping("/delete/{id}")
public String deleteItem(@PathVariable int id){
repository.deleteById(id);
return "Item Deleted with ID::"+id;
}

}