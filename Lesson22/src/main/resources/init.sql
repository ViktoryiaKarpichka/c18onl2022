drop table if exists workers;
create table workers
(
    id          serial
        constraint workers_pkey
            primary key,
    login       varchar(20) not null,
    salary      decimal,
    age         integer     not null,
    date        timestamp,
    description varchar(100)

);

insert into workers (login, salary, age, date, description)
VALUES ('zzz', 536.00, 25, '2020-01-25', 'java developer'),
       ('andrej', 259.08, 37, '2000-10-19', 'product manager'),
       ('ivan', 300.5067, 20, '2019-10-12', 'java developer'),
       ('nikolaj', 500.8990, 29, '2020-06-05', 'java developer'),
       ('petr', 900.90, 19, '2020-12-30', 'full-stack'),
       ('user', 400.30, 34, '2029-11-23', 'business analytics'),
       ('unnamed', 500.35, 38, '2021-06-12', 'java developer'),
       ('eee', 460.70, 29, '2000-10-17', 'java developer'),
       ('admin', 200.890, 47, '2015-10-18', 'it recruiter');

-- Для решения задач данного блока вам понадобятся следующие SQL команды и функции: IN.
-- Выберите из таблицы workers записи с id равным 1, 2, 3, 5, 14.5
select *
from workers
where id in (1, 2, 3, 5, 14);

--Выберите из таблицы workers записи с login равным 'eee', 'bbb', 'zzz'.
select *
from workers
where login in ('eee', 'bbb', 'zzz');

--Выберите из таблицы workers записи с id равным 1, 2, 3, 7, 9, и логином, равным 'user', 'admin', 'ivan' и зарплатой больше 300.
select *
from workers
where login in ('user', 'admin', 'ivan')
  and id in (1, 2, 3, 7, 9)
  and salary > 500;

--    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: BETWEEN.
--   Выберите из таблицы workers записи c зарплатой от 300 до 1000.
select *
from workers
where salary between 300 and 1000;

--Выберите из таблицы workers записи c id от 3 до 10 и зарплатой от 300 до 500.
select *
from workers
where salary between 300 and 500
  and id between 3 and 10;

-- Для решения задач данного блока вам понадобятся следующие SQL команды и функции: AS.
-- Выберите из таблицы workers все записи так, чтобы вместо id было userId, вместо login – userLogin, вместо salary - userSalary.
select id userId, login userLogin, salary userSalary
from workers;

--     Выберите из таблицы workers все записи так, чтобы туда попали только записи с разной зарплатой (без дублей).
select distinct salary
from workers;

--Получите SQL запросом все возрасты без дублирования.
select distinct age
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: MIN, MAX.
--     Найдите в таблице workers минимальную зарплату.
select min(salary)
from workers;

--     Найдите в таблице workers максимальную зарплату.
select max(salary)
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: SUM.
--     Найдите в таблице workers суммарную зарплату.
select sum(salary)
from workers;

--     Найдите в таблице workers суммарную зарплату для людей в возрасте от 21 до 25.
select sum(salary)
from workers
where age between 21 and 25;

--     Найдите в таблице workers суммарную зарплату для id, равного 1, 2, 3 и 5.
select sum(salary)
from workers
where id in (1, 2, 3, 5);

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: AVG.
--     Найдите в таблице workers среднюю зарплату.
select avg(salary)
from workers;

--     Найдите в таблице workers средний возраст.
select avg(age)
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: NOW, CURRENT_DATE, CURRENT_TIME.
--     Выберите из таблицы workers все записи, у которых дата больше текущей.
select *
from workers
where date > current_timestamp;
select *
from workers
where date > current_date;
select *
from workers
where date > current_time;

--     Вставьте в таблицу workers запись с полем date с текущим моментом времени в формате 'год-месяц-день часы:минуты:секунды'.
UPDATE workers
SET date = now()
WHERE id = 1;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функция: extract.
--     Выберите из таблицы workers все записи за 2016 год.
--select *
--from workers
--where date_part('Year', date) = 2016;
select *
from workers
where extract(year from date) = 2019;

--     Выберите из таблицы workers все записи за март любого года.
select *
from workers
where extract(month from date) = 03;
--     Выберите из таблицы workers все записи за третий день месяца.
select *
from workers
where extract(day from date) = 03;
--     Выберите из таблицы workers все записи за пятый день апреля любого года.
select *
from workers
where extract(day from date) = 05
  and extract(month from date) = 04;
--     Выберите из таблицы workers все записи за следующие дни любого месяца: 1, 7, 11, 12, 15, 19, 21, 29.
select *
from workers
where extract(day from date) in (1, 7, 11, 12, 15, 19, 21, 29);
--     Выберите из таблицы workers все записи за вторник.
--SELECT *, DAYOFWEEK(date) as day, DAYNAME(date) as dayname FROM workers
select *
from workers
where extract(dow from date) = 02;
--     Выберите из таблицы workers все записи за первую декаду любого месяца 2016 года.
select *
from workers
where extract(quarter from date) = 1
  and extract(Year from date) = 2016;
--     Выберите из таблицы workers все записи, в которых день меньше месяца.
select *
from workers
where extract(day from date) < extract(month from date);
--     При выборке из таблицы workers запишите день, месяц и год в отдельные поля.
select *, extract(day from date) as day, extract(month from date) as month, extract(year from date) as year
from workers;
--     При выборке из таблицы workers создайте новое поле today, в котором будет номер текущего дня недели.
select *, extract(dow from date) as dayOfWeek
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: DATE_FORMAT.
--     При выборке из таблицы workers выведите дату в формате '31.12.2025'.
select to_char(date, 'dd.MM.YYYY')
from workers;
--     При выборке из таблицы workers выведите дату в формате '2025% 31.12'.
select to_char(date, 'YYYY%.dd.MM')
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: INTERVAL, DATE_ADD, DATE_SUB.
--     При выборке из таблицы workers прибавьте к дате 1 день.
select (date + interval '1 day')
from workers;
--     При выборке из таблицы workers отнимите от даты 1 день.
select (date - interval '1 day')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день, 2 часа.
select (date + interval '1 day 2 hour')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 год, 2 месяца.
select (date + interval '1 year 2 month')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день, 2 часа, 3 минуты.
select (date + interval '1 day 2 hour 3 minute')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день, 2 часа, 3 минуты, 5 секунд.
select (date + interval '1 day 2 hour 3 minute 5 second')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день и отнимите 2 часа.
select (date + interval '1 day' - interval '2 hour')
from workers;

--     На математические операции
--     При выборке из таблицы workers создайте новое поле res, в котором будет число 3.
select *, 3 as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет строка 'eee'.
select *, 'еее' as res
from workers;
--     При выборке из таблицы workers создайте новое поле 3, в котором будет число 3.
select *, 3 "3"
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать сумма зарплаты и возраста.
select salary, age, (salary + age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать разность зарплаты и возраста.
select salary, age, (salary - age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать произведение зарплаты и возраста.
select salary, age, (salary * age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать среднее арифметическое зарплаты и возраста.
select salary, age, ((salary + age) / 2) as res
from workers;
--     Выберите из таблицы workers все записи, в которых сумма дня и месяца меньше 10-ти.
select *
from workers
where (extract(day from date) + extract(month from date)) < 10;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: LEFT, RIGHT, SUBSTRING.
--     При выборке из таблицы workers получите первые 5 символов поля description.
select "left"(description, 5)
from workers;
--     При выборке из таблицы workers получите последние 5 символов поля description.
select "right"(description, 5)
from workers;
--     При выборке из таблицы workers получите из поля description символы со второго по десятый.
select substring(description, 2, 10)
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: UNION.
--     Даны две таблицы: таблица category и таблица sub_category с полями id и cityName. Достаньте одним запросом названия категорий и подкатегорий.
drop table if exists category;
drop table if exists sub_category;
create table category
(
    id   serial primary key,
    name varchar not null
);
create table sub_category
(
    id   serial primary key,
    name varchar not null
);
insert into category (name)
values ('electronic'),
       ('clothes'),
       ('cars');
insert into sub_category (name)
values ('tv'),
       ('coat'),
       ('audi');
select name
from category
union
select name
from sub_category;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: CONCAT, CONCAT_WS.
--     При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно зарплата и возраст (слитно).
select concat(salary, age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно зарплата и возраст (слитно), а после возраста будут идти три знака '!'.
select concat(salary, age, '!!!') as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно зарплата и возраст через дефис.
select concat_ws('-', salary, age) as res
from workers;
--     При выборке из таблицы workers получите первые 5 символов логина и добавьте троеточие.
select concat("left"(login, 5), '...') as res
from workers;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: GROUP BY.
--     Найдите самые маленькие зарплаты по группам возрастов (для каждого возраста свою минимальную зарплату).
select age, min(salary)
from workers
group by age;
--     Найдите самый большой возраст по группам зарплат (для каждой зарплаты свой максимальный возраст).
select salary, max(age)
from workers
group by salary;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: GROUP_CONCAT.
--     Выберите из таблицы workers уникальные возраста так, чтобы для каждого возраста было поле res, в котором будут лежать через дефис id записей с таким возрастом.
select age, string_agg(concat(id, 'id'), '-') as res
from workers
group by age;

--     Выберите из таблицы workers все записи, зарплата в которых больше средней зарплаты.
select *
from workers
where salary > (select avg(salary) from workers);
--     Выберите из таблицы workers все записи, возраст в которых меньше среднего возраста, деленного на 2 и умноженного на 3.
select *
from workers
where age < (select (avg(salary) / 2 * 3) from workers);
--     Выберите из таблицы workers записи с минимальной зарплатой.
select *
from workers
where salary = (select min(salary) from workers);
--     Выберите из таблицы workers записи с максимальной зарплатой.
select *
from workers
where salary = (select max(salary) from workers);
--     При выборке из таблицы workers создайте новое поле max,
--     в котором будет лежать максимальное значение зарплаты для возраста 25 лет.
select *, (select max(salary) from workers where age = 25) as max
from workers;
--     При выборке из таблицы workers создайте новое поле avg,
--     в котором будет лежать деленная на 2 разница между максимальным значением
--     возраста и минимальным значением возраста в во всей таблице.
select *, (select (max(age) - min(age)) / 2 from workers) as avg
from workers;
--     При выборке из таблицы workers создайте новое поле avg,
--     в котором будет лежать деленная на 2 разница между максимальным значением зарплаты
--     и минимальным значением зарплаты для возраста 25 лет.
select *, (select (max(salary) - min(salary)) / 2 from workers) as avg
from workers
where age = 25;

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: JOIN.
--     Даны две таблицы: таблица category с полями id и cityName и таблица page с полями id, cityName и category_id. Достаньте одним запросом все страницы вместе с их категориями.
--
--     Даны 3 таблицы: таблица category с полями id и cityName, таблица sub_category с полями id и cityName и таблица page с полями id, cityName и sub_category_id. Достаньте одним запросом все страницы вместе с их подкатегориями и категориями.

--     Задачи данного блока следует решать SQL запросами, а не через PhpMyAdmin.
--     Создайте базы данных test1 и test2.
create
database test1;
create
database test2;

--     Удалите базу данных test2.
drop
database test1;

--     Создайте в базе данных test1 таблицы table1 и table2 с полями id, login, salary, age, date.
create table test1.table1
(
    id     serial primary key,
    login  varchar not null,
    salary int,
    age    int,
    date   timestamp
);
create table test1.table2
(
    id     serial primary key,
    login  varchar not null,
    salary int,
    age    int,
    date   timestamp
);
--     Переименуйте таблицу table2 в table3.
alter table test1.table2
    rename to table3;
--     Удалите таблицу table3.
drop table table3;
--     Добавьте в таблицу table1 поле status.
alter table test1.table1
    add column status text;
--     Удалите из таблицы table1 поле age.
alter table test1.table1
    drop column age;
--     Переименуйте поле login на user_login.
alter table table3
    rename column login to user_login;
--     Смените типа поля salary с int на varchar(255).
alter table table3
alter
column salary type varchar;
--     Очистите таблицу table1.
truncate test1.table1;
--     Очистите все таблицы базы данных test1.
 drop
schema test1;






