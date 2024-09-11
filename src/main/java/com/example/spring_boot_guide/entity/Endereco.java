package com.example.spring_boot_guide.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Entity(name = "Endereco")
@Data
@EqualsAndHashCode
@ToString
public class Endereco implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idEndereco;
        private String rua;
        private int numero;
        private String bairro;
        private String cep;
        private String cidade;
        private String estado;
}