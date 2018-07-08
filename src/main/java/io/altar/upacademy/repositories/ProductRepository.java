package io.altar.upacademy.repositories;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import io.altar.upacademy.model.Product;



@RequestScoped

public class ProductRepository extends EntityRepository<Product> {

	public ProductRepository() {
		super(Product.class);
	}
	


	
}