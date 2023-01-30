alter table students
    add constraint students_city_id_fk
        foreign key (id_city) references city;
select *
from students s
         left join city c on c.id = s.id_city
