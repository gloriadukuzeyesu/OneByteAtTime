# Write your MySQL query statement below

SELECT EU.unique_id, EM.name
FROM Employees EM
LEFT JOIN EmployeeUNI EU
ON EM.id = EU.id; 