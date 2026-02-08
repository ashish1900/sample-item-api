package com.ashish.sample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.ashish.sample.model.Item;

// sevice layer to handle business logic for items 
@Service
public class ItemService {

	// in memory for storage for items
	private final List<Item> items = new ArrayList<>();
	
	// Counter to genrate uniqe item ids
	private  Long idCounter = 1L;
	
	
	
	// add new item
	public Item addItem(Item item) {
		item.setId(idCounter++);
		items.add(item);
		return item;
	}
	
	
	
	// get item by id;
	public Item getItemById(Long id) {
		for(Item item : items) {
			if(item.getId().equals(id)){
				return item;
			}
		}
		return null;
	}
	
	
}
