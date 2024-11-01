package com.appspc.apilibros.repositories;

import com.appspc.apilibros.models.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findByUsername(String username);
}
