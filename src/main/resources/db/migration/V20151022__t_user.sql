CREATE TABLE IF NOT EXISTS t_user (
  password varchar(10) NOT NULL,
  username varchar(10) NOT NULL,
  id int(11) NOT NULL,
  PRIMARY KEY (id)
) DEFAULT CHARSET=utf8;