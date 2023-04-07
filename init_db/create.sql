# CREATE DATABASE stream;
# USE stream;
DROP TABLE IF EXISTS `Game_Description`;
DROP TABLE IF EXISTS `Transaction`;
DROP TABLE IF EXISTS `Game`;
DROP TABLE IF EXISTS `Cart`;
DROP TABLE IF EXISTS `Library`;
DROP TABLE IF EXISTS `Order`;
DROP TABLE IF EXISTS `Game_Description`;


DROP TABLE IF EXISTS `Company`;
CREATE TABLE Company
(
    c_id         INT primary key AUTO_INCREMENT,
    c_name       varchar(50) NOT NULL,
    c_email         varchar(50) NOT NULL ,
    c_pd        varchar(50) NOT NULL,
    c_permission INT         NOT NULL DEFAULT 1
);


DROP TABLE IF EXISTS `User`;
CREATE TABLE User
(
    u_id         INT primary key AUTO_INCREMENT,
    u_name       varchar(50) NOT NULL,
    u_email      varchar(50) NOT NULL UNIQUE,
    u_pd        varchar(50) NOT NULL,
    u_permission INT         NOT NULL DEFAULT 0
);


DROP TABLE IF EXISTS `Manager`;
CREATE TABLE Manager
(
    m_id    INT primary key AUTO_INCREMENT,
    m_name VARCHAR(50) NOT NULL,
    m_email VARCHAR(50) NOT NULL,
    m_pd   VARCHAR(50) NOT NULL
);

CREATE TABLE Game
(
    g_id           INT primary key AUTO_INCREMENT,
    g_name         varchar(50) NOT NULL,
    g_intro        varchar(1024),
    g_release_date DATE        NOT NULL,
    g_price        DOUBLE      NOT NULL,
    g_tag          VARCHAR(20),
    g_cid         INT,
    FOREIGN KEY (g_cid) REFERENCES Company (c_id)
);

DROP TABLE IF EXISTS `Cart`;
CREATE TABLE Cart
(
    cart_uid INT,
    cart_gid INT,
    FOREIGN KEY (cart_uid) REFERENCES User (u_id),
    FOREIGN KEY (cart_gid) REFERENCES Game (g_id)
);

DROP TABLE IF EXISTS `Comment`;
CREATE TABLE Comment
(
    com_id INT PRIMARY KEY AUTO_INCREMENT,
    com_uid INT,
    com_gid INT,
    com_content VARCHAR(256) NOT NULL,
    com_date    DATE NOT NULL
);

CREATE TABLE Library
(
    lib_uid INT,
    lib_gid INT,
    FOREIGN KEY (lib_uid) REFERENCES User (u_id),
    FOREIGN KEY (lib_gid) REFERENCES Game (g_id)
);

CREATE TABLE `Order`
(
    o_id    INT primary key AUTO_INCREMENT,
    o_gid    INT,
    o_uid    INT,
    o_value  DOUBLE    not null,
    o_time  DATE   NOT NULL,
    FOREIGN KEY (o_gid) REFERENCES Game (g_id),
    FOREIGN KEY (o_uid) REFERENCES User (u_id)
);

CREATE TABLE Game_Description
(
    game_id INT primary key AUTO_INCREMENT,
    g_OS varchar(50) NOT NULL,
    g_Processor varchar(50) NOT NULL,
    g_RAM varchar(50) NOT NULL,
    g_Memory varchar(50) NOT NULL,
    g_Network varchar(50) NOT NULL,
    g_GraphicCard varchar(50) NOT NULL,
    g_ExtraRequire varchar(50)
)


