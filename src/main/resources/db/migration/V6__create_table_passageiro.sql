CREATE TABLE passageiro (
id BIGSERIAL PRIMARY KEY,
nome VARCHAR(255),
sexo VARCHAR(15),
rg VARCHAR(255),
data_nascimento DATE,
data_unitario DECIMAL(15,2),
contrato_id BIGSERIAL,
viagem_id BIGSERIAL,
CONSTRAINT fk_passageiro_contrato FOREIGN KEY(contrato_id) REFERENCES contrato(id),
CONSTRAINT fk_passageiro_viagem FOREIGN KEY(viagem_id) REFERENCES viagem(id)
);