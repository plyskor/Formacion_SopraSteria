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