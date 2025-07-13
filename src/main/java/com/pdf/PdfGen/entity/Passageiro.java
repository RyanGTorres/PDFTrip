package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "passageiro")
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sexo;

    private String rg;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "data_unitario")
    private BigDecimal valorUnitario;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
}
