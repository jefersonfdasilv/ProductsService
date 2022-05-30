package br.com.silva.store.products.query.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsQueryController {
	
	@GetMapping
	public String index() {
		return "It works";
	}
}
