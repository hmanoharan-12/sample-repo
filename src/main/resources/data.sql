CREATE TABLE useraccount (
  user_id INT NOT NULL,
  username VARCHAR(30) NOT NULL,
  email VARCHAR(20) NOT NULL,
  date_created date NOT NULL);

INSERT INTO useraccount
    (user_id, username, email, date_created)
VALUES 
    (095654 ,'rambros2009', 'ramos209@aol.com', '2010-09-10'),
    (987123,'camoquine2009', 'campos@aol.com', '2010-09-10'),
    (453214,'badsturb309', 'tunde@gmail.com', '2010-09-10');