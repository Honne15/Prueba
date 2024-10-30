package com.appspc.apilibros.services;

import java.util.Collection;

public interface ServiceCRUD<E,ID> {
    
    E createEntity(E entity);

    Collection<E> getAllEntities();

    void deleteEntity(ID id);

    void updateEntity(E entity);

    E getEntityById(ID id);

}
