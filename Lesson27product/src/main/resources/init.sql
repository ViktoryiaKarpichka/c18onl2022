DROP TABLE IF EXISTS categories;
create table categories
(
    id        serial
        primary key,
    name      varchar(50)  not null,
    imageName varchar(100) not null,
    course    integer      not null
);

alter table categories
    owner to postgres;

INSERT INTO categories(id, name, imageName)
VALUES (1, "Mobile phones", "mobile.jpeg"),
VALUES (2, "Laptops", "laptop.jpeg"),
VALUES (3, "GPS Navigators", "jps_nav.jpeg"),
VALUES (4, "Fridges", "fridge.jpeg"),
VALUES (5, "Cars", "car.jpeg"),
VALUES (6, "Cameras", "camera.jpeg");
