package com.sound.bootcamp.mongodb.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sound.bootcamp.mongodb.model.Product;

@Repository

public interface ProductReposity extends MongoRepository<Product,String> {

	

	

}
