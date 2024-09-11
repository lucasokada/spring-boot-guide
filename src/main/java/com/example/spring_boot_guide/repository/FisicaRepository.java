package com.example.spring_boot_guide.repository;

import com.example.spring_boot_guide.entity.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FisicaRepository extends JpaRepository<Fisica, Long> {
    Fisica findByCpf(String cpf);
}
