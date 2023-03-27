CREATE DATABASE stream;
USE stream;

DROP TABLE IF EXISTS `Cart`;
DROP TABLE IF EXISTS `Manager`;
DROP TABLE IF EXISTS `Comment`;
DROP TABLE IF EXISTS `Library`;
DROP TABLE IF EXISTS `Transaction`;
DROP TABLE IF EXISTS `Game`;
DROP TABLE IF EXISTS `Company`;
DROP TABLE IF EXISTS `User`;


DROP TABLE IF EXISTS `Company`;
CREATE TABLE Company
(
    com_id         INT primary key AUTO_INCREMENT,
    com_name       varchar(50) NOT NULL,
    com_email      varchar(50) NOT NULL UNIQUE,
    com_pwd        varchar(50) NOT NULL,
    com_permission INT         NOT NULL DEFAULT 1
);


DROP TABLE IF EXISTS `User`;
CREATE TABLE User
(
    u_id         INT primary key AUTO_INCREMENT,
    u_name       varchar(50) NOT NULL,
    u_email      varchar(50) NOT NULL UNIQUE,
    u_pwd        varchar(50) NOT NULL,
    u_permission INT         NOT NULL DEFAULT 1
);


DROP TABLE IF EXISTS `Manager`;
CREATE TABLE Manager
(
    m_id    INT primary key AUTO_INCREMENT,
    m_name VARCHAR(50) NOT NULL ,
    m_email VARCHAR(50) NOT NULL,
    m_pwd   VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS `Game`;
CREATE TABLE Game
(
    g_id           INT primary key AUTO_INCREMENT,
    g_name         varchar(50) NOT NULL,
    g_intro        varchar(1024),
    g_release_date DATE        NOT NULL,
    g_price        DOUBLE      NOT NULL,
    g_tag          VARCHAR(20),
    com_id         INT,
    g_volume       INT         NOT NULL,
    g_income       DOUBLE      NOT NULL,
    g_rate         DOUBLE,
    FOREIGN KEY (com_id) REFERENCES Company (com_id)
);

DROP TABLE IF EXISTS `Cart`;
CREATE TABLE Cart
(
    c_id INT PRIMARY KEY AUTO_INCREMENT,
    u_id INT,
    g_id INT,
    FOREIGN KEY (u_id) REFERENCES User (u_id),
    FOREIGN KEY (g_id) REFERENCES Game (g_id)
);

DROP TABLE IF EXISTS `Comment`;
CREATE TABLE Comment
(
    comm_id INT PRIMARY KEY AUTO_INCREMENT,
    g_id         INT,
    u_id         INT,
    comm_content VARCHAR(256) NOT NULL,
    comm_rate    DOUBLE,
    FOREIGN KEY (g_id) REFERENCES Game (g_id),
    FOREIGN KEY (u_id) REFERENCES User (u_id)
);

DROP TABLE IF EXISTS `Library`;
CREATE TABLE Library
(
    l_id INT PRIMARY KEY AUTO_INCREMENT,
    u_id INT,
    g_id INT,
    FOREIGN KEY (u_id) REFERENCES User (u_id),
    FOREIGN KEY (g_id) REFERENCES Game (g_id)
);

DROP TABLE IF EXISTS `Transaction`;
CREATE TABLE Transaction
(
    t_id    INT primary key AUTO_INCREMENT,
    g_id    INT,
    u_id    INT,
    t_type  INT    not null,
    t_date  DATE   NOT NULL,
    t_value DOUBLE NOT NULL,
    FOREIGN KEY (g_id) REFERENCES Game (g_id),
    FOREIGN KEY (u_id) REFERENCES User (u_id)
);





