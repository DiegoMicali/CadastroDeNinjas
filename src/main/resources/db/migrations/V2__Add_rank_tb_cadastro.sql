-- V2: igrations para adicionar a coluna de RANK na tablea de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);