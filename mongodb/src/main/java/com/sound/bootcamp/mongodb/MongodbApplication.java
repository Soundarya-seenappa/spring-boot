package com.sound.bootcamp.mongodb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.sound.bootcamp.mongodb.model.Product;
import com.sound.bootcamp.mongodb.repo.ProductReposity;

@SpringBootApplication
public class MongodbApplication implements CommandLineRunner {
	@Autowired
	private ProductReposity productReposity;

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		addProducts();
		System.out.println(getAllProducts());
		update();
	    delete();
		 //Optional<Product> productOp= getProductById("2");
		//deleteProductById("3");
		//System.out.println(product);
		
		
	}
	public void addProducts() {
		System.out.println("startin adding product");
		Product product1= new Product("1", "bata", "shoes",1000);
		productReposity.save(product1);
		
		Product product2= new Product("2", "husky", "dogs",3000);
		productReposity.save(product2);
		Product product3= new Product("3", "oneplus", "Electronics",2000);
		productReposity.save(product3);
		
		System.out.println("product added");
	}
	
	public List<Product> getAllProducts(){
	return productReposity.findAll();
	}
	public void update() {
		System.out.println("original product");
		//Product product1= new Product("1", "bata", "shoes",1000);
		Product product2= new Product("2", "husky", "dogs",3000);
		//Product product3= new Product("3", "oneplus", "Electronics",2000);
		
		System.out.println("updated");
		product2.setName("pug");
		productReposity.save(product2);
		
		
	}
	public void delete() {
		productReposity.deleteById("3");
	}
	
	
	/*public Optional<Product> getProductById(String Id) {
		
		Optional<Product> productOp = productReposity.findById(Id);
		return  productOp;
	}
	public Product doUpdate(Product product) {
		
			return productReposity.save(product);

		}
	public void deleteProductById(String id) {
		productReposity.deleteById(id);
	}*/

	
//	public Product edit(Product product) {
//
//		return productReposity.save(product);
//
//	}


	

}
