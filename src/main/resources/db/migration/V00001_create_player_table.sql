DROP TABLE IF EXISTS Player;

CREATE TABLE Player (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  age INT,
  nationality VARCHAR(50),
  position VARCHAR(50),
  price DECIMAL(10, 2),
  points INT,
  tourPoints INT,
  photo VARCHAR(200)
);