use demo;

CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(50),
    Category VARCHAR(50),
    Price INT,
    Quantity INT,
    Brand VARCHAR(50),
    City VARCHAR(50),
    Status VARCHAR(20)
);

INSERT INTO Products VALUES
(1, 'Laptop', 'Electronics', 55000, 10, 'HP', 'Delhi', 'Available'),
(2, 'Mouse', 'Accessories', 500, 50, 'Dell', 'Delhi', 'Available'),
(3, 'Keyboard', 'Accessories', 1200, 30, 'HP', 'Noida', 'Available'),
(4, 'Monitor', 'Electronics', 12000, 15, 'Dell', 'Noida', 'Available'),
(5, 'Mobile', 'Electronics', 25000, 20, 'Samsung', 'Delhi', 'Available'),
(6, 'Headphones', 'Accessories', 2000, 40, 'Sony', 'Gurgaon', 'Available'),
(7, 'Tablet', 'Electronics', 30000, 12, 'Samsung', 'Noida', 'Available'),
(8, 'Printer', 'Electronics', 15000, 8, 'HP', 'Gurgaon', 'Available'),
(9, 'USB Cable', 'Accessories', 300, 100, 'Dell', 'Delhi', 'Available'),
(10, 'Smart Watch', 'Electronics', 8000, 25, 'Samsung', 'Noida', 'Available'),
(11, 'Webcam', 'Accessories', 2500, 18, 'Sony', 'Gurgaon', 'Available'),
(12, 'Speaker', 'Accessories', 3500, 22, 'Sony', 'Delhi', 'Available'),
(13, 'Camera', 'Electronics', 40000, 5, 'Canon', 'Noida', 'Available'),
(14, 'Power Bank', 'Accessories', 1800, 35, 'Samsung', 'Delhi', 'Available'),
(15, 'Scanner', 'Electronics', 10000, 7, 'Canon', 'Gurgaon', 'Unavailable');

select productname from products p  where price< (select avg(price) from products where category =p.category);
select productname from products p  where price = (select avg(price) from products where category =p.category);

select * from products p where quantity in (select max(quantity) from products where category=p.category);

select *from products p where price > any(select price from products where p.category=category);
select *from products p where price > all(select price from products where p.category=category);
