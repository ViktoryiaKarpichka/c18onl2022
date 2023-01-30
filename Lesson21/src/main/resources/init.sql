--------------------------------------------------------
--  DDL for Table students
--------------------------------------------------------
DROP TABLE IF EXISTS students;
CREATE TABLE IF NOT EXISTS students
(
    id      serial primary key,
    name    VARCHAR(45)  NOT NULL,
    surname VARCHAR(100) NOT NULL,
    course  INT          NOT NULL,
    id_city serial
);

INSERT INTO students(name, surname, course)
VALUES ('Alex', 'Surkov', 1);
INSERT INTO students(name, surname, course)
VALUES ('Anna', 'Borodich', 2);
INSERT INTO students(name, surname, course)
VALUES ('Sergey', 'Kryvnitskiy', 3);
INSERT INTO students(name, surname, course)
VALUES ('Alina', 'Kedich', 4);
INSERT INTO students(name, surname, course)
VALUES ('Petr', 'Medvedzev', 5);

--insert into students values (6,'Olga','Petrova',1);
--select * from students where course>1;
--alter table students  add city varchar(50);