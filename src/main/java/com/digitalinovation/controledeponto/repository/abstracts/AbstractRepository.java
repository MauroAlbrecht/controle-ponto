package com.digitalinovation.controledeponto.repository.abstracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface AbstractRepository<E extends Serializable> extends CrudRepository<E, Long> {
}
