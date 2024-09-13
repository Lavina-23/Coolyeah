USE [TSQL]
GO

SELECT CURRENT_TIMESTAMP AS currentdatetime,

 CAST(GETDATE() AS DATE) AS currentdatetime,

 CONVERT(varchar, GETDATE(), 108) AS currenttime,

 YEAR(GETDATE()) AS currentyear,

 MONTH(GETDATE()) AS currentmonth,

 DAY(GETDATE()) AS currentday,

 DATEPART(WEEK, GETDATE()) AS currentweeknumber,

 DATENAME(MONTH, GETDATE()) AS currentmonthname;


SELECT CAST(GETDATE() AS DATE) AS todaydate;

SELECT CONVERT(varchar, GETDATE(), 107) AS todaydate;

SELECT CONVERT(varchar, GETDATE(), 106) AS todaydate;

SELECT DATEADD(MONTH, 5, GETDATE()) AS fivemonths,
	
	DATEDIFF(DAY, GETDATE(), DATEADD(MONTH, 5, GETDATE())) AS diffdays,

	DATEDIFF(WEEK, '1945-08-17', '2022-08-17') AS diffweeks,

	DATEADD(DAY, 1 - DAY(GETDATE()), GETDATE()) AS firstday;

CREATE TABLE Sales.Somedates (
	isitdate varchar(9)
);

INSERT INTO Sales.Somedates (isitdate) VALUES 
	('20230101'),
	('20230102'),
	('20230103X'),
	('20230104'),
	('20230105'),
	('20230106'),
	('20230107Y'),
	('20230108');

SELECT 
	isitdate,
	CASE 
		WHEN ISDATE(isitdate) = 1 THEN CONVERT(DATE, isitdate)
		ELSE NULL
	END AS converteddate
FROM Sales.Somedates;

SELECT CURRENT_TIMESTAMP;

SELECT SYSDATETIME() AS  currentdate;

SELECT DISTINCT
    custid,
    shipname,
    shippeddate
FROM 
    Sales.Orders
WHERE 
    shippeddate >= '2008-03-01' 
    AND shippeddate < '2008-04-01';

SELECT CURRENT_TIMESTAMP AS todaydate;

SELECT DATEADD(DAY, 1 - DAY(GETDATE()), CAST(GETDATE() AS DATETIME)) AS firstday;

SELECT DATEADD(DAY, 30 - DAY(GETDATE()), CAST(GETDATE() AS DATETIME)) AS lastday;

SELECT 
    orderid,
    custid,
    orderdate,
    shipaddress
FROM 
    Sales.Orders
WHERE 
    DAY(orderdate) > DAY(EOMONTH(orderdate)) -5
	AND DAY(orderdate) <= DAY(EOMONTH(orderdate));

SELECT contactname FROM Sales.Customers

SELECT 
	CONCAT (contactname, ' (city:',city,',)')
FROM Sales.Customers;

SELECT 
    contactname,
    contacttitle
FROM 
    Sales.Customers
WHERE 
    LEFT(contactname, 1) BETWEEN 'A' AND 'G';

SELECT 
    contactname,
    REPLACE(contactname, ',', '') AS contactname_no_comma,
    LEFT(contactname, CHARINDEX(',', contactname + ',') - 1) AS lastname
FROM 
    Sales.Customers;

SELECT 
    custid,
    'C' + FORMAT(custid, '00000') AS formatted_custid
FROM 
    Sales.Customers;

SELECT 
    contactname,
    LEN(contactname) - LEN(REPLACE(contactname, 'a', '')) AS count_a
FROM 
    Sales.Customers
ORDER BY 
    count_a DESC;
