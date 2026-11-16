Create table students(
Student_ID int primary key,
Student_Name varchar(50),
Age int,
City varchar(30),
Marks int);

Create table employee(
Emp_ID int,
Emp_Name varchar(50),
Salary decimal (10,2),
Department varchar(30),
Joining_Date Date);

Create table department(
Dept_ID int,
Dept_Name varchar(50),
Location Varchar (50));

create table product(
Product_ID int,
Product_Name varchar(100),
Price Decimal (10,2),
Quantity int);



alter table students add email varchar(100);
alter table employee add phone_number bigint , add dob date;

alter table students modify Student_Name varchar(100);

alter table employee modify salary decimal(12,2);

alter table students modify age smallint;

alter table students rename column city to student_city;

alter table students drop email;

desc students;

alter table students rename to student_details;

INSERT INTO product (Product_ID, Product_Name, Price, Quantity)
VALUES
(101, 'Laptop', 55000.00, 10),
(102, 'Mobile Phone', 18000.00, 25),
(103, 'Keyboard', 1200.50, 40);

truncate table product;
drop table department;




create table customer(
Customer_ID int PRIMARY KEY, 
Customer_Name varchar(20) NOT NULL,
Email varchar(50) UNIQUE,
Age int CHECK (Age >= 18));


create table bank_account(
Account_ID int PRIMARY KEY,
Account_Holder varchar(30) NOT NULL,
Balance int DEFAULT 0,
Account_Type varchar(50) check(account_type in ('Savings',
'Current')));


create table department_master (
dep_id int primary key,
name varchar(20));

create table employee_master(
emp_id int primary key ,
emp_name varchar(20),
foreign key(emp_id) references  department_master(dep_id));



Create table Student_Exam(
Exam_ID int PRIMARY KEY,
Student_Name varchar(50) NOT NULL,
Marks int CHECK(Marks between 0 and 100),
Result varchar(20) DEFAULT 'Pending');


Create table Orders(
Order_ID int PRIMARY KEY,
Customer_ID int NOT NULL unique,
Order_Date DATE,
Amount int check(amount>0),
Order_Status varchar(50) DEFAULT 'Processing');


