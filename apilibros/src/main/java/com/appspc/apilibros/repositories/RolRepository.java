package com.appspc.apilibros.repositories;

import com.appspc.apilibros.models.Rol;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends CrudRepository<Rol,Long>{

}
