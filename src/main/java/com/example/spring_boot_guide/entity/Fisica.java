package com.example.spring_boot_guide.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.util.Date;

@Entity
@Table(name = "PessoaFisica")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper = true, includeFieldNames = true)
public class Fisica extends Pessoa {
     @Serial
     private static final long serialVersionUID = 1L;

     @Column(name = "cpf", unique = true)
     private String cpf;

     @Temporal(TemporalType.TIMESTAMP)
     private Date dataNascimento;

     public Fisica() {
     }
}