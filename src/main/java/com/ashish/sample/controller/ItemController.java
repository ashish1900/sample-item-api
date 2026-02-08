package com.ashish.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.sample.model.Item;
import com.ashish.sample.service.ItemService;

import jakarta.validation.Valid;



// Rest controller to handle item realted api requests
@RestController
@RequestMapping("/items")
public class ItemController {

	private final ItemService itemService;
	
	
	// constructer based dependency injection
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	
	
	// and keep the service active on free hosting platforms
	@GetMapping("/ping")
	public String keepAlive() {
	    return "Application is running";
	}
	
	
	// api to  add new item
	@PostMapping
	public ResponseEntity<Item> addItem(@Valid @RequestBody Item item){
		Item savedItem = itemService.addItem(item);
		return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
	}
	
	
	
	
	// api to fetch a single item by its id
	@GetMapping("/{id}")
	public ResponseEntity<Item> getItemById(@PathVariable Long id){
		Item item = itemService.getItemById(id);
		if(item == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(item);
	}

}
