package com.appspc.apilibros.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appspc.apilibros.models.User;
import com.appspc.apilibros.repositories.UserRepository;
import com.appspc.apilibros.services.ServiceCRUD;

import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements ServiceCRUD<User,Long> {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User createEntity(User entity){
        return userRepo.save(entity);
    }
    
    @Override
    public Collection<User> getAllEntities(){
        return (Collection<User>) userRepo.findAll();
    }

    @Override
    public void deleteEntity(Long id){
        userRepo.deleteById(id);
    }

    @Override
    public void updateEntity(User entity){
        userRepo.save(entity);
    }

    @Override
    public User getEntityById(Long id){
        return userRepo.findById(id).get();
    }

    public List<User> findByUsername(String username){
        return userRepo.findByUsername(username);
    }
}