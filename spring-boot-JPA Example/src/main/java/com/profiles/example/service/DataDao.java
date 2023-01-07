package com.profiles.example.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDao extends CrudRepository<EntityPojo, Long> {
}
