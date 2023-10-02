CREATE TABLE api.persons
(
    age            int,
    phone_number   int,
    name           varchar(100),
    surname       varchar(100),
    city_of_living varchar(100),
    CONSTRAINT user_id PRIMARY KEY (name, surname, age)
);