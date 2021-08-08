package com.digitalinovation.controledeponto.service.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface ServiceInterface<E extends Serializable> {

    E save(E entidade);

    List<E> findAll();

    Optional<E> findById(Long id);

    void deleteById(Long id);
}
