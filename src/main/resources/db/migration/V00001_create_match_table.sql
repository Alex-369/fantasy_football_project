DROP TABLE IF EXISTS Match;

CREATE TABLE Match (
  match_id INT PRIMARY KEY AUTO_INCREMENT,
  date DATETIME NOT NULL,
  stadium VARCHAR(100),
  home_team_id INT,
  away_team_id INT,
  home_team_score INT,
  away_team_score INT,
  FOREIGN KEY (home_team_id) REFERENCES Team (team_id),
  FOREIGN KEY (away_team_id) REFERENCES Team (team_id)
);