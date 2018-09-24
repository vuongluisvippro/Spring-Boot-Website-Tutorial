package com.tutorial.genealogy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.genealogy.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	User findUserEntityByUsername(String userName);
}
