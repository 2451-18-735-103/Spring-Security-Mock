package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Login;

@Repository
public interface UserRepository extends MongoRepository<Login, String>{

	Login findByUsername(String username);


}
