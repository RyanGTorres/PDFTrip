package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "informacoes_viagem")
public class InformacoesViagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String horaApresentacao;

    private String horaSaida;

    private String localEmbarque;

    @ManyToOne
    private Viagem viagem;
}
