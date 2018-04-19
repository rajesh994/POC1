package com.example.POC1;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.POC1.User;
public interface userMongoRepository extends MongoRepository<User, String> {
	public User findByusername(String string);
}