/*
Enter your query here.
*/

CREATE TABLE EMPLOYEE (
                          id INT PRIMARY KEY,
                          name VARCHAR(20),
                          salary int,
                          age INT,
                          address VARCHAR(25)
);

SELECT e1.NAME AS LowerEarningEmployee, e2.NAME AS HigherEarningEmployee
FROM EMPLOYEE e1
         JOIN EMPLOYEE e2 ON e1.SALARY < e2.SALARY
ORDER BY e1.ID, e2.SALARY;