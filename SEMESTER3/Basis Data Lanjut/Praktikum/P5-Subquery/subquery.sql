USE [TSQL];

SELECT
	o.custid, c.contactname
FROM Sales.Orders o
JOIN Sales.Customers c ON o.custid = c.custid
WHERE o.empid = 5 GROUP BY o.custid, c.contactname;

SELECT
	o.custid, c.contactname, c.city
FROM Sales.Orders o
JOIN Sales.Customers c ON o.custid = c.custid
WHERE o.empid = 5 GROUP BY o.custid, c.contactname, c.city;

SELECT 
	o.custid,
	YEAR(o.orderdate) AS orderyear,
	COUNT(*) AS total_orders
FROM Sales.Orders o 
WHERE o.empid = 5
GROUP BY o.custid, YEAR(o.orderdate);

SELECT 
	c.categoryid,
    c.categoryname
FROM Production.Categories c
JOIN Production.Products p ON c.categoryid = p.categoryid
JOIN Sales.OrderDetails od ON p.productid = od.productid
JOIN Sales.Orders o ON od.orderid = o.orderid
WHERE YEAR(o.orderdate) = 2008
GROUP BY c.categoryid, c.categoryname;

SELECT 
	o.orderid,
	o.orderdate,
	SUM(od.qty * od.unitprice) AS salesamount
FROM Sales.Orders o
JOIN Sales.OrderDetails od ON o.orderid = od.orderid
GROUP BY o.orderid, o.orderdate
ORDER BY salesamount DESC;

SELECT 
	o.orderid,
	o.orderdate,
	SUM(od.qty * od.unitprice) AS salesamount,
	COUNT(od.orderid) AS nooforderlines,
	AVG(od.qty * od.unitprice) AS avgsalesamountperorderlines
FROM Sales.Orders o
JOIN Sales.OrderDetails od ON o.orderid = od.orderid
GROUP BY o.orderid, o.orderdate
ORDER BY salesamount DESC;

SELECT
	FORMAT(o.orderdate, 'yyyyMM') AS yearmonthno,
	SUM(od.qty * od.unitprice) AS salesamountpermonth
FROM Sales.Orders o
JOIN Sales.OrderDetails od ON o.orderid = od.orderid
GROUP BY FORMAT(o.orderdate, 'yyyyMM')
ORDER BY yearmonthno;

SELECT 
	c.custid,
	c.contactname,
	SUM(od.qty * od.unitprice) AS totalsalesamount,
	MAX(od.qty * od.unitprice) AS maxsalesamountperoderline,
	COUNT(*) AS numberofrows,
	COUNT(o.orderid) AS numberoforderlines
FROM Sales.Customers c
LEFT JOIN Sales.Orders o ON c.custid = o.orderid
LEFT JOIN Sales.OrderDetails od ON o.orderid = od.orderid
GROUP BY c.custid, c.contactname
ORDER BY totalsalesamount DESC;


SELECT * FROM Sales.Orders;



