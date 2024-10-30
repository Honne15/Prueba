package com.appspc.apilibros.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appspc.apilibros.models.Rol;
import com.appspc.apilibros.repositories.RolRepository;
import com.appspc.apilibros.services.ServiceCRUD;

import java.util.Collection;

@Service
public class RolServiceImpl implements ServiceCRUD<Rol,Long> {

    @Autowired
    private RolRepository rolRepo;

    @Override
    public Rol createEntity(Rol entity){
        return rolRepo.save(entity);
    }
    
    @Override
    public Collection<Rol> getAllEntities(){
        return (Collection<Rol>) rolRepo.findAll();
    }

    @Override
    public void deleteEntity(Long id){
        rolRepo.deleteById(id);
    }

    @Override
    public void updateEntity(Rol entity){
        rolRepo.save(entity);
    }

    @Override
    public Rol getEntityById(Long id){
        return rolRepo.findById(id).get();
    }

}
