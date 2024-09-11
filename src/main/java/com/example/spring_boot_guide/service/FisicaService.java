package com.example.spring_boot_guide.service;

import com.example.spring_boot_guide.entity.Fisica;
import com.example.spring_boot_guide.repository.FisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//esta anotação serve para indicar ao framework que classe é um bean que deverá
//ser gerenciado pela implementação de IoC (do inglês, Inversion of Control) Container do
//framework Spring.
@Component
public class FisicaService {
    //esta anotação indica ao framework que o atributo foi injetado na classe e deve
    //ser por ele gerenciado.
    @Autowired
    private FisicaRepository repository;

    public FisicaService() {
    }

    public Fisica save(Fisica entity) {
        Fisica persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Fisica findByCpf(String cpf) {
        Fisica insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByCpf(cpf);
        }

        return insertedEntity;
    }

    public void delete(Fisica entity) {
        if (repository != null) {
        repository.delete(entity);
        }
    }

    public Fisica update(Fisica entity) {
        Fisica persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Fisica> findAll() {
        List<Fisica> list = null;

        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
        }

        return list;
    }
}