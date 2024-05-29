package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Users;
@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {

}
