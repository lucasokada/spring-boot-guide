package com.example.spring_boot_guide.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Pessoa implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idPessoa;
        private String nome;

        @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
        @JoinColumn(name = "pessoa_idPessoa")
        private List<Endereco> endereco;

        private Acesso acesso;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "contato_idContato")
        private Contato contato;

        public Pessoa() {
                this.endereco = new ArrayList<>();
        }

        public void setEndereco(Endereco endereco) {
                this.endereco.add(endereco);
        }
}