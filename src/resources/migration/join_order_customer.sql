SELECT product_name from orders
INNER JOIN customers c on orders.customer_id = c.id
WHERE c.name = 'alexey';