DROP TABLE IF EXISTS Team;

CREATE TABLE Team (
  team_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  coach VARCHAR(100),
  formation VARCHAR(20),
  league VARCHAR(50)
  emblem VARCHAR(200)
);