USE [tokosepeda];

INSERT INTO sales.customers(first_name, last_name, phone, email, street, city, state, zip_code)
	VALUES('Lavina','Cantik',087765776316,'lavina@gmail.com','Jl. Perusahaan ','Malang','JT',12345);


SELECT * FROM sales.customers;

SELECT TOP 10 * FROM sales.customers
WHERE first_name LIKE 'L%' ORDER BY customer_id DESC;

SELECT 
	p.product_id AS id_produk, p.product_name AS nama_produk, c.category_name AS kategori, p.list_price AS harga
FROM production.products AS p
JOIN production.categories AS c ON p.category_id = c.category_id
WHERE p.list_price >= 1000 ORDER BY product_id ASC
OFFSET 7 ROWS FETCH NEXT 9 ROWS ONLY;


