package com.pdf.PdfGen.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endereco;

    private String bairro;

    private String cidade;

    private String cep;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

}
