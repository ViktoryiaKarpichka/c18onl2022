DROP TABLE IF EXISTS categories;
create table categories
(
    id        serial
        primary key,
    name      varchar(50)  not null,
    imageName varchar(100) not null

);

alter table categories
    owner to postgres;

INSERT INTO categories (id, name, imageName)
VALUES (1, 'Mobile phones', 'mobile.jpeg');
INSERT INTO categories (id, name, imageName)
VALUES (2, 'Laptops', 'laptop.jpeg');
INSERT INTO categories (id, name, imageName)
VALUES (3, 'GPS Navigators', 'jps_nav.jpeg');
INSERT INTO categories (id, name, imageName)
VALUES (4, 'Fridges', 'fridge.jpeg');
INSERT INTO categories (id, name, imageName)
VALUES (5, 'Cars', 'car.jpeg');
INSERT INTO categories (id, name, imageName)
VALUES (6, 'Cameras', 'camera.jpeg');

drop table if exists users;
create table if not exists users
(
    id
    serial
    primary
    key,
    name
    varchar
(
    45
) not null,
    surname varchar
(
    45
) not null,
    email varchar
(
    200
) not null,
    password varchar
(
    50
) not null,
    birthday timestamp not null,
    balance int not null
    );

alter table users
    owner to postgres;

INSERT INTO "online-store".users (name, surname, email, password, birthday, balance)
VALUES ('Ivan', 'Ivanov', 'admin@tms.by', 'admin', 20.03.1999, 5500),
       ('Petr', 'Petrov', 'petia@tms.by', '123', 10.12.2008, 7509);
