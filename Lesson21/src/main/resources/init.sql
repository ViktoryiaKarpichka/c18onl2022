DROP TABLE IF EXISTS students;
create table students
(
    id      serial
        primary key,
    name    varchar(45)  not null,
    surname varchar(100) not null,
    course  integer      not null,
    city_id bigint
        constraint students_city_id_fk
            references city
);

alter table students
    owner to postgres;

INSERT INTO students(name, surname, course, city_id)
VALUES ('Alex', 'Surkov', 1, 1);
INSERT INTO students(name, surname, course, city_id)
VALUES ('Anna', 'Borodich', 2, 2);
INSERT INTO students(name, surname, course, city_id)
VALUES ('Sergey', 'Kryvnitskiy', 3, 3);
INSERT INTO students(name, surname, course, city_id)
VALUES ('Alina', 'Kedich', 4, 4);
INSERT INTO students(name, surname, course, city_id)
VALUES ('Petr', 'Medvedzev', 5, 5);

--insert into students values (6,'Olga','Petrova',1);
--select * from students where course>1;
--alter table students  add city varchar(50);
DROP TABLE IF EXISTS city;
create table city
(
    id   serial
        primary key,
    name varchar(45) not null
);

alter table city
    owner to postgres;

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

alter table students
    add constraint students_city_id_fk
        foreign key (city_id) references city;

SELECT *
FROM students s
         left join city c on c.id = s.city_id;