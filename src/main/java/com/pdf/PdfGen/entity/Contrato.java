package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identificador;

    @Column(name = "valor_total_contrato")
    private BigDecimal valorTotalContrato;

    private BigDecimal valor;

    private BigDecimal desconto;

    private BigDecimal total;

    @Column(name = "forma_pagamento")
    private String formaPagamento;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<Passageiro> passageiros;

}
