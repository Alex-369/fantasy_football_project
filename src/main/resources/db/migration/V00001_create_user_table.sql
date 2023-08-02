-- ensure that the table with this name is removed before creating a new one.
DROP TABLE IF EXISTS User;

-- Create User table
CREATE TABLE User (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL
);