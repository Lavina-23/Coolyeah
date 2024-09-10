USE [TSQL]
GO

SELECT * FROM Sales.Customers;

SELECT
custid, companyname, contactname, contacttitle, address, city, region, postalcode, country, phone, fax
FROM Sales.Customers;

SELECT * 
FROM [Sales].[Customers]

SELECT contactname, address, postalcode, city, country
FROM Sales.Customers;

SELECT country FROM Sales.Customers;

SELECT DISTINCT country 
FROM Sales.Customers;

SELECT
	c.contactname, c.contacttitle
FROM Sales.Customers AS c;

SELECT
	c.contactname AS Name, c.contacttitle AS Title, c.companyname AS [Company Name]
FROM Sales.Customers AS c;

SELECT 
	p.categoryid, p.productname
FROM Production.Products AS p;

SELECT
	p.categoryid, p.productname,
	CASE
		WHEN p.categoryid = 1 THEN 'Baverages'
		WHEN p.categoryid = 2 THEN 'Condiments'
		WHEN p.categoryid = 3 THEN 'Confections'
		WHEN p.categoryid = 4 THEN 'Dairy Products'
		WHEN p.categoryid = 5 THEN 'Grains/Cereal'
		WHEN p.categoryid = 6 THEN 'Meat/Poultry'
		WHEN p.categoryid = 7 THEN 'Produce'
		WHEN p.categoryid = 8 THEN 'Seafood'
		ELSE 'Other'
	END AS categoryname
FROM Production.Products AS p;

SELECT
	p.categoryid AS ID_KATEGORI, p.productname AS NAMA_PRODUK,
	CASE
		WHEN p.categoryid = 1 THEN 'Baverages'
		WHEN p.categoryid = 2 THEN 'Condiments'
		WHEN p.categoryid = 3 THEN 'Confections'
		WHEN p.categoryid = 4 THEN 'Dairy Products'
		WHEN p.categoryid = 5 THEN 'Grains/Cereal'
		WHEN p.categoryid = 6 THEN 'Meat/Poultry'
		WHEN p.categoryid = 7 THEN 'Produce'
		WHEN p.categoryid = 8 THEN 'Seafood'
		ELSE 'Other'
	END AS NAMA_KATEGORI,
	CASE 
		WHEN p.categoryid IN (1, 7, 8) THEN 'Campaign Products'
		ELSE 'Non-Campaign Products'
	END AS STATUS
FROM Production.Products AS p WHERE p.categoryid = 8;

SELECT
	e.firstname AS FIRST_NAME, e.lastname AS LAST_NAME, e.city AS CITY, e.country AS COUNTRY
FROM HR.Employees AS e WHERE e.country = 'USA' AND e.city = 'Seattle';


