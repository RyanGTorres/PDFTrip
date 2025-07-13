CREATE TABLE informacoes_viagem (
id BIGSERIAL PRIMARY KEY,
hora_apresentacao VARCHAR(20),
hora_saida VARCHAR(20),
local_embarque VARCHAR(255),
viagem_id BIGSERIAL,
CONSTRAINT fk_informacoes_viagem_viagem FOREIGN KEY (viagem_id)
REFERENCES viagem(id)
);