CREATE TABLE IF NOT EXISTS contrato (
id BIGSERIAL PRIMARY KEY,
identificador VARCHAR(255),
valor_total_contrato DECIMAL (15 , 2),
valor DECIMAL(15, 2),
desconto DECIMAL (15, 2),
total DECIMAL (15,2),
forma_pagamento VARCHAR(255),
observacao VARCHAR(255),
client_id BIGSERIAL,
viagem_id BIGSERIAL,
CONSTRAINT fk_contrato_cliente FOREIGN KEY(client_id) REFERENCES cliente(id),
CONSTRAINT fk_contrato_viagem FOREIGN KEY(viagem_id) REFERENCES viagem(id)
);