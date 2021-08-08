package com.digitalinovation.controledeponto.service.abstracts;

import com.digitalinovation.controledeponto.repository.abstracts.AbstractRepository;
import com.digitalinovation.controledeponto.service.interfaces.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
@SuppressWarnings({"unchecked", "SpringJavaInjectionPointsAutowiringInspection"})
public abstract class AbstractService<E extends Serializable, R extends AbstractRepository> implements ServiceInterface<E> {

    @Autowired
    private R abstractRepository;

    @Override
    public E save(E entidade) {
        return (E) abstractRepository.save(entidade);
    }

    @Override
    public List<E> findAll() {
        return (List<E>) abstractRepository.findAll();
    }

    @Override
    public Optional<E> findById(Long id) {
        return abstractRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        abstractRepository.deleteById(id);
    }
}
