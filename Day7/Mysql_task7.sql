use demo;

desc employee;
INSERT INTO Employee(Emp_ID,Emp_Name,Department,salary,city) VALUES
(1, 'Amit', 'IT', 30000, 'Delhi'),
(2, 'Neha', 'HR', 45000, 'Mumbai'),
(3, 'Ravi', 'IT', 60000, 'Delhi'),
(4, 'Priya', 'Sales', 25000, 'Pune'),
(5, 'Rahul', 'HR', 50000, 'Delhi'),
(6, 'Sneha', 'Sales', 35000, 'Mumbai'),
(7, 'Karan', 'IT', 70000, 'Pune'),
(8, 'Pooja', 'HR', 40000, 'Delhi');


select * from employees where salary > 40000;

select * from employees where salary < (select avg(salary) from employees);

select * from employees where salary = (select max(salary) from employees);

select * from employees where salary = (select min(salary) from employees);

select * from employees where department_id = (select department_id from employees where name = 'amit');

select * from employees where department_id in (select department_id from employees where salary > 45000);

select * from employees where salary > all (select salary from employees where department_id = (select department_id from departments where department_name = 'hr'));

select * from employees where salary > any (select salary from employees where department_id = (select department_id from departments where department_name = 'sales'));

select department_id from employees group by department_id having avg(salary) > (select avg(salary) from employees);

select * from employees where department_id <> (select department_id from departments where department_name = 'it');