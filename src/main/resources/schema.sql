USE shoppingmall;

create table user(
    id bigint PRIMARY KEY auto_increment,
    account VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(30),
    username VARCHAR(20),
    tel VARCHAR(20),
    phone VARCHAR(20),
    zipcode VARCHAR(10),
    address VARCHAR(100),
    emaill VARCHAR(50) NOT NULL UNIQUE,
    created DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
)

CREATE TABLE menu(
    id INT PRIMARY KEY auto_increment,
    name VARCHAR(50)
)

CREATE TABLE submenu(
    id INT PRIMARY KEY auto_increment,
    menuid INT,
    name VARCHAR(50)
)

CREATE TABLE product(
    id bigint PRIMARY KEY auto_increment,
    name varchar(50),
    price INT,
    menuid INT,
    submenuid INT,
    detail TEXT ,
    image VARCHAR(100),
    factory VARCHAR(50)
)

create table car(
    id bigint PRIMARY KEY auto_increment,
    userid bigint,
    productid bigint,
    price int,
    amount int,
    total int
)

CREATE TABLE review(
    id bigint PRIMARY KEY auto_increment,
    productid bigint,
    userid bigint,
    content text,
    created datetime default CURRENT_TIMESTAMP,
    modified datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)