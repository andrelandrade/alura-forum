INSERT INTO usuario (nome, email, password) VALUES ('admin', 'admin@email.com', '$2a$12$SW954bz9..VgMfXs5f71EOf/3Wr3tf/pvJfmSswTuSZdrCzDxyyEW');
INSERT INTO role (nome) VALUES('ADMIN');
INSERT INTO usuario_role (usuario_id, role_id) VALUES (2, 2);