package com.example.demo.controller;

import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {

    @Autowired
    private ItemDao itemDao;

    @GetMapping('/item/{id}')
    public Item getItem(@PathVariable String id) {

    }
}
