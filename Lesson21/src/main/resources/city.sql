DROP TABLE IF EXISTS city;
CREATE TABLE IF NOT EXISTS city
(
    id       serial primary key,
    nameCity VARCHAR(45) NOT NULL
);
insert into city
values (1, 'Minsk');
insert into city
values (2, 'Grodno');
insert into city
values (3, 'Brest');
insert into city
values (4, 'Minsk');
insert into city
values (5, 'Minsk');
