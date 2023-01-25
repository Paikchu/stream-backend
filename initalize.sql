
CREATE DATABASE stream;

USE stream;

CREATE TABLE User
(
    u_id         INT primary key AUTO_INCREMENT,
    u_name       varchar(50) NOT NULL,
    u_email      varchar(50) NOT NULL UNIQUE,
    u_pwd        varchar(50) NOT NULL,
    u_permission INT         NOT NULL DEFAULT 1
);

CREATE TABLE Company
(
    com_id   INT primary key,
    com_name varchar(50) NOT NULL
);

CREATE TABLE Manager
(
    m_id    INT primary key,
    m_email VARCHAR(50) NOT NULL,
    m_pwd   VARCHAR(50) NOT NULL
);

CREATE TABLE Game
(
    g_id           INT primary key,
    g_name         varchar(50) NOT NULL,
    g_intro        varchar(1024),
    g_release_date DATE        NOT NULL,
    g_price        DOUBLE      NOT NULL,
    g_tag          VARCHAR(20),
    com_id         INT,
    g_volumn       INT         NOT NULL,
    g_income       DOUBLE      NOT NULL,
    g_rate         DOUBLE,
    FOREIGN KEY (com_id) REFERENCES Company (com_id)
);

CREATE TABLE Cart
(
    u_id INT,
    g_id INT,
    FOREIGN KEY (u_id) REFERENCES User (u_id),
    FOREIGN KEY (g_id) REFERENCES Game (g_id)
);

CREATE TABLE Comment
(
    g_id         INT,
    u_id         INT,
    comm_content VARCHAR(256) NOT NULL,
    comm_rate    DOUBLE,
    FOREIGN KEY (g_id) REFERENCES Game (g_id),
    FOREIGN KEY (u_id) REFERENCES User (u_id)
);

CREATE TABLE Library
(
    u_id INT,
    g_id INT,
    FOREIGN KEY (u_id) REFERENCES User (u_id),
    FOREIGN KEY (g_id) REFERENCES Game (g_id)
);

CREATE TABLE Transaction
(
    t_id    INT primary key,
    g_id    INT,
    u_id    INT,
    t_type  INT    not null,
    t_date  DATE   NOT NULL,
    t_value DOUBLE NOT NULL,
    FOREIGN KEY (g_id) REFERENCES Game (g_id),
    FOREIGN KEY (u_id) REFERENCES User (u_id)
);