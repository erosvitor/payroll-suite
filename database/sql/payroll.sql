CREATE DATABASE payroll;

USE payroll;

CREATE TABLE employees (
  id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(60) NOT NULL,
  salary DECIMAL(9,2) NOT NULL,
  birthday DATE NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE employees_dependents (
  id INTEGER NOT NULL AUTO_INCREMENT,
  id_employee INTEGER NOT NULL,
  name VARCHAR(60) NOT NULL,
  birthday DATE NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_employee) REFERENCES employees(id) ON DELETE CASCADE
);
