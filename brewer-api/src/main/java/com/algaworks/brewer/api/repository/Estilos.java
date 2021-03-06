package com.algaworks.brewer.api.repository;

import com.algaworks.brewer.api.model.Estilo;
import com.algaworks.brewer.api.repository.helper.estilo.EstilosQueries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>, EstilosQueries {

    public Optional<Estilo> findByNomeIgnoreCase(String nome);

}
