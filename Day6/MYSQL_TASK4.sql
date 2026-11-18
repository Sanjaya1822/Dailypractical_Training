use demo;
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(100)
);
INSERT INTO users VALUES
(1, 'Ajay', 'ajay@gmail.com'),
(2, 'Kavita', 'kavita.@yahoo.com'),
(3, 'Rahul', 'rahul123@outlook.com'),
(4, 'Priya', 'priya@ gmail.com'),
(5, 'Arun', 'arun2026@gmail.com'),
(6, 'Divya', 'divya@company.in');

SELECT LEFT(email, LOCATE('@', email) - 1) AS username
FROM users;

SELECT substring(email, LOCATE('@', email)+1,LOCATE('.', email)-1) AS username
FROM users;