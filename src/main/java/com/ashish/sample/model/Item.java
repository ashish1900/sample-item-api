package com.ashish.sample.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	// unique identifier for item
	private Long id;
	
	// item name is mandatory
	@NotBlank(message = "Item name is required")
	private String name;
	
	
	private String description;
	
	private Double price;
	
	private String category;
}
