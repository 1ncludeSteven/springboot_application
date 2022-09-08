package com.example.demo.dao;

import com.example.demo.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {

    private static List<Item> items = new ArrayList<>();

    static {
        items.add(new Item("1", "item 1", "item 1 description", 12.0));
        items.add(new Item("2", "item 2", "item 2 description", 13.0));
        items.add(new Item("3", "item 3", "item 3 description", 14.0));
        items.add(new Item("4", "item 4", "item 4 description", 15.0));
        items.add(new Item("5", "item 5", "item 5 description", 16.0));
        items.add(new Item("6", "item 6", "item 6 description", 17.0));
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public List<Item> getAllItems() {
        return items;
    }

    public void updateItem(Item item) {
        for (Item item1 : items) {
            if (item.getId().equals(item1.getId())) {
                item1.setDesc(item.getDesc());
                item1.setName(item.getName());
                item1.setPrice(item.getPrice());
            }
        }
    }

    public void deleteItem(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return;
            }
        }
    }

}
