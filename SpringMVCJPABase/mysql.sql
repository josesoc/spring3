CREATE TABLE  article (
  article_id INT(10) AUTO_INCREMENT,
  article_name VARCHAR(20) not null,
  article_desc VARCHAR(30) not NULL,
  date_added date,
  PRIMARY KEY (article_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


