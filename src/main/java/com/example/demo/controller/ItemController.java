package com.example.demo.controller;

import com.example.demo.dao.ItemDao;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemDao itemDao;

    @GetMapping("/item/{id}")
    public Item getItem(@PathVariable String id) {
        return itemDao.getItem(id);
    }

    @GetMapping("/item")
    public List<Item> getItems() {
        return itemDao.getAllItems();
    }

    @PutMapping
    public String updateItem() {

    }
}
