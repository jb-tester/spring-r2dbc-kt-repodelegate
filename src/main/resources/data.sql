CREATE TABLE IF NOT EXISTS person (
                                      id INT AUTO_INCREMENT PRIMARY KEY ,
                                      first_name VARCHAR(255),
                                      last_name VARCHAR(255),
                                      address VARCHAR(255),
                                      age INT
);
INSERT INTO person(first_name, last_name, address, age) VALUES ( 'vasya','petrov', 'spb, nevsky,1 ',51 );
INSERT INTO person(first_name, last_name, address, age) VALUES ( 'lena','smirnova', 'spb, bolshoy pr vo, 11 ',55 );
INSERT INTO person(first_name, last_name, address, age) VALUES ( 'masha','ivanova', 'spb, sadovaya, 12 ', 35 );
INSERT INTO person(first_name, last_name, address, age) VALUES ( 'katya','alekseeva', 'spb, nevsky,1 ', 18 );
INSERT INTO person(first_name, last_name, address, age) VALUES ( 'vasya','ivanov', 'spb, sadovaya, 12 ', 10 );
INSERT INTO person(first_name, last_name, address, age) VALUES ( 'ivan','ivanov', 'spb, sadovaya, 12 ', 40 );