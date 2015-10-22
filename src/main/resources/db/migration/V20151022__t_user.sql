CREATE TABLE IF NOT EXISTS t_user (
  id int(11) NOT NULL,
  username varchar(10) NOT NULL,
  password varchar(10) NOT NULL,
  PRIMARY KEY (id)
) DEFAULT CHARSET=utf8;