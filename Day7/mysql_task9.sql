use demo;
CREATE TABLE Patients (
    PatientID INT PRIMARY KEY,
    PatientName VARCHAR(50),
    Age INT,
    Gender VARCHAR(10),
    City VARCHAR(50),
    Disease VARCHAR(50),
    BillAmount DECIMAL(10,2)
);

CREATE TABLE Doctors (

    DoctorID INT PRIMARY KEY,

    DoctorName VARCHAR(50),

    Specialization VARCHAR(50),

    Salary DECIMAL(10,2),

    City VARCHAR(50)

);
 
CREATE TABLE Treatments (

    TreatmentID INT PRIMARY KEY,

    PatientID INT,

    DoctorID INT,

    TreatmentName VARCHAR(50),

    TreatmentCost DECIMAL(10,2),

    TreatmentDate DATE

);

INSERT INTO Patients VALUES
(101, 'Arun', 25, 'Male', 'Chennai', 'Fever', 2500.00),
(102, 'Priya', 32, 'Female', 'Coimbatore', 'Diabetes', 5000.00),
(103, 'Karthik', 45, 'Male', 'Madurai', 'Heart Disease', 25000.00),
(104, 'Divya', 28, 'Female', 'Salem', 'Migraine', 3500.00),
(105, 'Rahul', 55, 'Male', 'Chennai', 'Blood Pressure', 8000.00),
(106, 'Sneha', 22, 'Female', 'Trichy', 'Fever', 1500.00),
(107, 'Vijay', 40, 'Male', 'Coimbatore', 'Asthma', 6000.00),
(108, 'Meena', 35, 'Female', 'Madurai', 'Diabetes', 4500.00),
(109, 'Suresh', 60, 'Male', 'Salem', 'Heart Disease', 30000.00),
(110, 'Anitha', 30, 'Female', 'Chennai', 'Migraine', 4000.00);

INSERT INTO Doctors VALUES
(201, 'Dr. Kumar', 'Cardiology', 85000.00, 'Chennai'),
(202, 'Dr. Priya', 'Neurology', 75000.00, 'Coimbatore'),
(203, 'Dr. Rajesh', 'General Medicine', 60000.00, 'Madurai'),
(204, 'Dr. Lakshmi', 'Diabetology', 70000.00, 'Salem'),
(205, 'Dr. Anand', 'Pulmonology', 80000.00, 'Trichy');

INSERT INTO Treatments VALUES
(301, 101, 203, 'Fever Treatment', 1500.00, '2026-01-05'),
(302, 102, 204, 'Diabetes Checkup', 3000.00, '2026-01-06'),
(303, 103, 201, 'Heart Checkup', 15000.00, '2026-01-07'),
(304, 104, 202, 'Migraine Treatment', 2000.00, '2026-01-08'),
(305, 105, 201, 'BP Treatment', 5000.00, '2026-01-09'),
(306, 106, 203, 'Fever Treatment', 1000.00, '2026-01-10'),
(307, 107, 205, 'Asthma Treatment', 4000.00, '2026-01-11'),
(308, 108, 204, 'Diabetes Checkup', 2500.00, '2026-01-12'),
(309, 109, 201, 'Heart Surgery', 20000.00, '2026-01-13'),
(310, 110, 202, 'Migraine Treatment', 2500.00, '2026-01-14'),
(311, 101, 203, 'Follow-up Checkup', 800.00, '2026-02-01'),
(312, 102, 204, 'Sugar Test', 1200.00, '2026-02-02'),
(313, 103, 201, 'ECG Test', 3000.00, '2026-02-03'),
(314, 107, 205, 'Lung Function Test', 2000.00, '2026-02-04'),
(315, 109, 201, 'Follow-up Checkup', 1500.00, '2026-02-05');

select * from patients where billamount > (select avg(billamount) from patients );

select *from doctors d where not exists (select doctorid from treatments where treatments.doctorid=d.doctorid);

select max(salary) as sec_highest from doctors where salary <(select max(salary) from doctors);

select * from patients p where exists ( select d.doctorid from treatments t
join doctors d on t.doctorid = d.doctorid where t.patientid = p.patientid
and d.specialization = 'Cardiology');

select *from doctors where salary> all(select salary from doctors where city="madurai");

select *from patients p where billamount> (select avg(billamount) from patients where p.city=city);

select *from patients p where not exists (select treatmentid from treatments where p.patientid=patientid and TreatmentCost <5000 );

select *from doctors where salary > any(select salary from doctors where city="chennai");

select d.doctorid, d.doctorname, count(distinct t.patientid) as total_patients from doctors d
join treatments t on d.doctorid = t.doctorid group by d.doctorid, d.doctorname order by total_patients desc limit 1;

select patientid, sum(treatmentcost) as total_cost from treatments
group by patientid having sum(treatmentcost) > (
select avg(total_cost) from (
select sum(treatmentcost) as total_cost from treatments group by patientid) as temp);