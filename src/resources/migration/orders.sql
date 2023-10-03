CREATE TABLE api.orders
(
    id             int NOT NULL AUTO_INCREMENT,
    date           date,
    customer_id int,
    product_name varchar(100),
    amount int,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers(id));
);