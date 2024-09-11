package com.example.spring_boot_guide.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

//Usada para se tornar entidade embutida de Pessoa
@Embeddable
@Data
@EqualsAndHashCode
@ToString
public class Acesso implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "acesso_usuario", unique = true)
    private String usuario;

    @Column(name = "acesso_senha")
    private String senha;
}