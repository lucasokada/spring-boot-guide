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

@Entity(name = "Contato")
@Data
@EqualsAndHashCode
@ToString
public class Contato implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idContato;
        private String telefoneResidencial;
        private String telefoneComercial;
        private String celular;
        private String email;
}