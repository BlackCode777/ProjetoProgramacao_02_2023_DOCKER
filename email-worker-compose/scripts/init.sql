create database email-sender

\c email-sender

create table emails (
        id SERIAL not null,
        data TIMESTAMP not null default current_timestamp,
        assunto VARCHAR(100) not null,
        mensagem VARCHAR(250) not null
)