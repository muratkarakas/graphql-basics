package com.eteration.graphql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

	private final Map<String,User> users;

	public UserRepository() {
		users = new HashMap<>();
		users.put("1",new User("1", "murat@eteration.com"));
		users.put("2",new User("2", "ugur@eteration.com"));
	}

	public List<User> getAllUsers() {
		return   new ArrayList<>(users.values());
	}

	public User findById(String userId) {
		
		return users.get(userId);
	}

}