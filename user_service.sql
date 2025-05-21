CREATE TABLE users (
    id varchar(100),
    name varchar(100) not null,
    address varchar(100) not null,
    age integer,
    gender TINYINT,
    avatar varchar(500),
    created_date timestamp,
    updated_date timestamp,
);