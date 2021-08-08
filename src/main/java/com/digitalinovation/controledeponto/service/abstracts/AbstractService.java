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

    /**
     * Salva entidade no banco de dados
     * @param entidade - entidade a ser salva no banco de dados
     * @return
     */
    @Override
    public E save(E entidade) {
        return (E) abstractRepository.save(entidade);
    }

    /**
     * Busca na base de dados todos os registros
     * @return
     */
    @Override
    public List<E> findAll() {
        return (List<E>) abstractRepository.findAll();
    }

    /**
     * Busca na base de dados pelo código identificador da entidade
     * @param id
     * @return
     */
    @Override
    public Optional<E> findById(Long id) {
        return abstractRepository.findById(id);
    }

    /**
     * Deleta da base de dados pelo código identificador da entidade
     * @param id
     */
    @Override
    public void deleteById(Long id) {
        abstractRepository.deleteById(id);
    }
}
