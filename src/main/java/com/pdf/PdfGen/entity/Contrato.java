package com.pdf.PdfGen.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identificador;

    private Double valorTotalContrato;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<Passageiro> passageiros;

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<Pagamento> pagamentos;
}
