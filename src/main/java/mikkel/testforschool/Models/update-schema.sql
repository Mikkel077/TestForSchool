CREATE SCHEMA carbase;
CREATE TABLE carbase.car
(
    id    BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    model VARCHAR(255),
    color VARCHAR(255),
    miles INTEGER                                 NOT NULL,
    CONSTRAINT pk_car PRIMARY KEY (id)
);

INSERT INTO carbase.car
values (default, 'CitiGo', 'white', 20000);


INSERT INTO carbase.car
values (default, 'Up!', 'Grey', 20000);