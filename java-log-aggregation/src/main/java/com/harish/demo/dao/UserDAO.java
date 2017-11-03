package com.harish.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harish.demo.domain.User;

/**
 * An interface declaration in order to perform CRUD operations for {@link User} resource
 *
 * @author vlotar
 */
@Repository
//public interface UserDAO extends CrudRepository<User, Long> {
public interface UserDAO extends MongoRepository<User, Long> {
}
