# Write your MySQL query statement below
SELECT MAX(salary)  AS secondhighestsalary from Employee
where salary < (select max(salary) from Employee);