--QUERY 1--
SELECT first_name, last_name,salary FROM employees ORDER BY last_name;
--QUERY 2--
SELECT DISTINCT job_id FROM employees WHERE department_id=30;
--QUERY 3--
SELECT employee_id, first_name, last_name, department_id FROM employees WHERE first_name LIKE 'J%' AND last_name LIKE 'L%';
--QUERY 4--
SELECT employee_id, first_name, last_name, department_id FROM employees WHERE first_name NOT LIKE 'J%' AND last_name LIKE '%en%' ORDER BY first_name;
--QUERY 5--
SELECT employee_id, first_name, last_name, department_id FROM employees WHERE commission_pct IS NULL;
--QUERY 6--
SELECT first_name, department_id FROM employees WHERE job_id LIKE 'AD%';
--QUERY 7--
SELECT first_name AS Nombre ,last_name AS Apellido FROM employees WHERE department_id=&departamento;
--QUERY 8--
SELECT first_name, last_name, salary*1.075 FROM employees;
--QUERY 9--
SELECT * FROM departments WHERE location_id=2500;
--QUERY 10--
SELECT first_name, salary, commission_pct, hire_date,department_id FROM employees WHERE department_id IN (50,80,100) AND salary BETWEEN 3000 AND 10000 AND EXTRACT(YEAR FROM hire_date)>=2000 ORDER BY hire_date ASC, salary DESC;
--OBTENER FECHA SYSTEMA--
SELECT sysdate, current_date FROM dual;
SELECT SUBSTR(FIRST_NAME,1,3), ROUND(SALARY/14,2), TO_CHAR(HIRE_DATE,'DD-MM-YYYY HH24:MI:SS') FROM employees WHERE department_id=30;
SELECT TO_CHAR(TO_DATE('19-07-1993'),'day') FROM DUAL;

--EJERCICIOS FUNCIONES--
--QUERY 1--
SELECT first_name || ' ' || FLOOR(MONTHS_BETWEEN(sysdate,hire_date)) FROM employees WHERE department_id=30;
--QUERY 2--
SELECT first_name, TO_CHAR(hire_date,'day/month/YYYY') FROM employees WHERE job_id='IT_PROG';
--QUERY 3--
SELECT UPPER(SUBSTR(first_name,1,3)), salary*NVL(commission_pct,0) AS Bono FROM employees;
--QUERY 4--
SELECT AVG(salary) FROM employees WHERE job_id='IT_PROG';
--QUERY 5--
SELECT MAX(salary) AS maximo, MIN(Salary) AS minimo , MAX(salary) - MIN(salary) AS diferencia FROM employees;
--QUERY 6--
SELECT  department_id FROM employees GROUP BY department_id HAVING (COUNT(DISTINCT (job_id)))>=2; 
--QUERY 7--
SELECT COUNT (DISTINCT job_id) FROM employees WHERE salary BETWEEN 1000 AND 7800 AND department_id=30;
--QUERY 8--
SELECT first_name FROM employees GROUP BY first_name HAVING COUNT(first_name)=1 ORDER BY first_name ;
--QUERY 9--
SELECT COUNT(CASE WHEN TO_CHAR(hire_date,'d') = 6 THEN 1 END) AS Sabados, COUNT(CASE WHEN TO_CHAR(hire_date,'d')=7 THEN 1 END) AS Domingos FROM employees;
--QUERY 10--
SELECT first_name,last_name, CASE WHEN salary <3000 THEN 'Bajo' WHEN salary BETWEEN 3000 AND 8000 THEN 'Medio' WHEN Salary>8000 THEN 'Alto' END AS Sueldo, CASE department_id WHEN 90 THEN 'Administrativo' WHEN 80 THEN 'Ventas' ELSE 'Otro' END AS Departamento  FROM employees;
-----------------EJERCICIOS JOIN-------------------------
--QUERY 1--
SELECT e.first_name, d.department_id, d.department_name, l.location_id, SUBSTR(l.city,1,3) FROM Employees e JOIN DEPARTMENTS d ON e.department_id=d.department_id JOIN Locations l ON d.location_id=l.location_id WHERE d.department_id=20 OR e.job_id LIKE 'SA%'; 
--QUERY 2--
SELECT e.first_name, e.job_id, d.department_name,d.department_id FROM EMPLOYEES e
JOIN DEPARTMENTS d ON e.department_id=d.department_id;
--QUERY 3--
SELECT e.first_name, e.job_id, d.department_name,d.department_id FROM EMPLOYEES e
RIGHT OUTER JOIN DEPARTMENTS d ON e.department_id=d.department_id;
--QUERY 4--
SELECT e.last_name,e.salary,c.country_name,r.region_name FROM employees e JOIN departments d ON d.department_id=e.department_id JOIN Locations l ON l.location_id=d.location_id JOIN Countries c ON l.COUNTRY_ID=c.COUNTRY_ID JOIN Regions r ON c.REGION_ID=r.REGION_ID WHERE d.DEPARTMENT_ID IN (20,30);
--QUERY 5--
SELECT e.last_name, e.first_name, e.salary
FROM departments d JOIN employees e ON d.manager_id=e.employee_id;
--QUERY 6--
SELECT e.last_name, e.first_name, e.salary
FROM departments d FULL JOIN employees e ON d.manager_id=e.employee_id WHERE d.manager_id IS NULL AND e.last_name IS NOT NULL;
--QUERY 7--
SELECT DISTINCT m.first_name,m.last_name FROM employees e JOIN Employees m ON e.manager_id=m.employee_id;
--QUERY 8--
SELECT e.employee_id,e.last_name,e.manager_id,m.last_name, a.employee_id,a.last_name FROM employees e JOIN Employees m ON e.manager_id=m.employee_id JOIN Departments d on e.department_id=d.department_id JOIN Employees a ON d.manager_id=a.employee_id WHERE e.department_id IN (10,20,30);
SELECT * from employees where department_id IN (10,20,30);
----------------------SUBCONSULTAS-----------------
--Empleados que no sean directores de un departamento
SELECT * FROM Employees WHERE employee_id NOT IN (SELECT manager_id FROM DEPARTMENTS WHERE manager_id IS NOT NULL);
--QUERY 1--
SELECT first_name || ' ' || last_name FROM Employees WHERE Salary = (SELECT MAX(Salary) FROM Employees);
--QUERY 2--
SELECT first_name, job_id, salary FROM employees Where Salary = (SELECT MIN(Salary) FROM Employees WHERE department_id=30) AND Department_id=30;
--QUERY 3--
SELECT first_name, last_name FROM Employees WHERE manager_id IN (SELECT EMPLOYEE_ID FROM employees WHERE last_name='King');
--QUERY 4--
SELECT first_name, job_title, salary, hire_date FROM Employees e JOIN Jobs j ON j.job_id=e.job_id WHERE Salary > (SELECT MAX(Salary) From EMPLOYEES WHERE job_id LIKE 'SA%')ORDER BY Salary DESC;
--QUERY 5--
SELECT first_name, department_name, salary, job_title FROM Employees e JOIN Departments d ON d.department_id=e.department_id JOIN Jobs j ON j.job_id=e.job_id WHERE d.department_id = (SELECT department_id From Employees WHERE first_name='Irene') AND Salary < (SELECT AVG(Salary)FROM Employees WHERE department_id=10);
--QUERY 6--
SELECT * from employees e JOIN (SELECT department_id, AVG(Salary) AS media From Employees Group By department_id) m ON m.department_id=e.department_id WHERE e.Salary > m.media;
--QUERY 7--
