package com.pdf.PdfGen.entity;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String rg;

    private String email;

    private String dd;

    private String telefone;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
