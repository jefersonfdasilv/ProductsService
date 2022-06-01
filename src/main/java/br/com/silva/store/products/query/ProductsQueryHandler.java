package br.com.silva.store.products.query;

import java.util.ArrayList;
import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.silva.store.products.core.data.ProductEntity;
import br.com.silva.store.products.core.data.ProductsRepository;
import br.com.silva.store.products.query.rest.ProductRestModel;

@Component
public class ProductsQueryHandler {
	
	private final ProductsRepository productsRepository;
	
	public ProductsQueryHandler(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	}
	
	@QueryHandler
	public List<ProductRestModel> findProducts(FindProductsQuery query) {
		
		List<ProductRestModel> productsRest = new ArrayList<>();
		
		List<ProductEntity> storedProducts =  productsRepository.findAll();
		
		for(ProductEntity productEntity: storedProducts) {
			ProductRestModel productRestModel = new ProductRestModel();
			BeanUtils.copyProperties(productEntity, productRestModel);
			productsRest.add(productRestModel);
		}
		
		return productsRest;
		
	}

}

