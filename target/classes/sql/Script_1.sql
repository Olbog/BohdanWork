select * from garages; 
insert into drivers (name, `e-mail`, age ) values ('Simi', 'Sim@mail.com', '26'); 
insert into drivers (name, `e-mail`, age ) values ('Ara', 'Ara@mail.com', '26'); 
insert into drivers (name, `e-mail`, age ) values ('Ilya', 'Ilya@mail.com', '26'); 
insert into drivers (name, `e-mail`, age ) values ('Ibra', 'Ibra@mail.com', '26'); 
insert into drivers (name, `e-mail`, age ) values ( 'Kolya', 'Kolya@mail.com', '26'); 
insert into drivers (name, `e-mail`, age ) values ( 'Ivan', 'Ivan@mail.com', '31'); 
insert into drivers (name, `e-mail`, age ) values ( 'Petya', 'Petya@mail.com', '32'); 
insert into drivers ( name, `e-mail`, age ) values ( 'Simon', 'Simon@mail.com', '21'); 
insert into drivers ( name, `e-mail`, age ) values ( 'Petr', 'Petr@mail.com', '36'); 
insert into drivers ( name, `e-mail`, age ) values ( 'Atem', 'Atem@mail.com', '36'); 
insert into drivers ( name, `e-mail`, age ) values ( 'Artem', 'Artem@mail.com', '29'); 
insert into drivers ( name, `e-mail`, age ) values ( 'Vasya', 'Vasya@mail.com', '23'); 
insert into drivers ( name, `e-mail`, age ) values ( 'Kate', 'Kate@mail.com', '22');
insert into drivers ( name, `e-mail`, age ) values ( 'Kate', 'Kate@mail.com', '22');



insert into licenses (number, exp_data, driver_id) values ('123321', '2025', 1 );
insert into licenses ( number, exp_data, driver_id) values ('1255321', '2024', 2 );
insert into licenses ( number, exp_data, driver_id) values ( '3455321', '2027', 4 );
insert into licenses (number, exp_data, driver_id) values ('1995391', '2026', 3 );


insert into categories (id, category, license_id) values (1, 'B', 1 );
insert into categories (id, category, license_id) values (4, 'B', 4 );
insert into categories (id, category, license_id) values (2, 'C', 4 );
insert into categories (id, category, license_id) values (3, 'C', 4 );
insert into categories (id, category, license_id) values (3, 'C', 4 );


update categories set category = 'C', license_id = 2 where id = 3;
update categories set category = 'A', license_id = 5 where id = 5;

insert into replacement_drivers (id, name, age) values (1, 'Alehandro', '23' );
insert into replacement_drivers (name, age) values ('Andy', '29' );
insert into replacement_drivers (name, age) values ('Leha', '37' );

insert into alcohol_tests ( results,drivers_id, replacement_driver_id) values ('Negative', 1, 1 );
insert into alcohol_tests  ( results, drivers_id, replacement_driver_id) values ('Negative', 2, 2 );
insert into alcohol_tests  ( results, drivers_id, replacement_driver_id) values ('Negative', 3, 3 );
insert into alcohol_tests  ( results, drivers_id, replacement_driver_id) values ('Positive', 4, 4 );

insert into park_cars (model, year, driver_id) values ('iveco', '2003', 1 );
insert into park_cars (model, year, driver_id) values ('iveco', '2021', 2 );
insert into park_cars (model, year, driver_id) values ('man', '2014', 4 );
insert into park_cars (model, year, driver_id) values ('man', '2011', 3 );
insert into park_cars (model, year, driver_id) values ('volvo', '2001', 2 );
insert into park_cars (model, year, driver_id) values ('vaz', '2013', 6 );

insert into distributors (id, Replacement_drivers_id, Park_Cars_id) values (1, 1,2);
insert into distributors (id, Replacement_drivers_id, Park_Cars_id) values (2, 2,3);
insert into distributors (Replacement_drivers_id, Park_Cars_id) values (1,2);
insert into distributors (Replacement_drivers_id, Park_Cars_id) values (2,1);
insert into distributors (Replacement_drivers_id, Park_Cars_id) values (3,3);

insert into personal_cars (id, model, year, drivers_id ) values (1,'mazda', '2009', 1);
insert into personal_cars (model, year, drivers_id ) values ('mazda', '2009', 1);
insert into personal_cars (model, year, drivers_id ) values ('BMW', '2017', 2);
insert into personal_cars (model, year, drivers_id ) values ('opel', '2020', 3);

insert into garages (color, size, car_id, personal_cars_id ) values ('green', '15x12', 1, 1);
insert into garages (color, size, car_id, personal_cars_id ) values ('red', '12x10', 2, 2);
insert into garages (color, size, car_id, personal_cars_id ) values ('blue', '14x10', 3, 3);

insert into workers ( name,  age  ) values ( 'Jim', '27');
insert into workers ( name,  age  ) values ( 'Antony', '24');
insert into workers ( name,  age  ) values ( 'Arni', '36');

insert into families (number_of_family_members, `father's_name`, workers_id  ) values (4, 'Alex', 1);
insert into families (number_of_family_members, `father's_name`, workers_id  ) values (3, 'Atri', 2);
insert into families (number_of_family_members, `father's_name`, workers_id  ) values (2, 'Maxim', 3);


insert into modes ( worker_id, car_service_id   ) values (1,1);
insert into modes ( worker_id, car_service_id   ) values (2,1);
insert into modes ( worker_id, car_service_id   ) values (3,1);
insert into modes ( worker_id, car_service_id   ) values (3,2);
insert into modes ( worker_id, car_service_id   ) values (2,3);
insert into modes ( worker_id, car_service_id   ) values (3,4);
insert into modes ( worker_id, car_service_id   ) values (3,5);

insert into replacement_workers ( name, age, mode_id ) values ( 'Antoni', '19', 1);
insert into replacement_workers ( name, age, mode_id ) values ( 'Max', '23', 2);
insert into replacement_workers ( name, age, mode_id ) values ( 'Roi', '33', 3);
insert into replacement_workers ( name, age, mode_id ) values ( 'Kvit', '32', 4);


insert into car_services ( status) values ('Done!');
insert into car_services ( status) values ('NOT ready!');
insert into car_services ( status) values ('NOT ready!');
insert into car_services ( status) values ('Done!');
insert into car_services ( status) values ('Done!');
insert into car_services ( status) values ('Done!');
insert into car_services ( status) values ('NOT ready!');
insert into car_services ( status) values ('Done!');

insert into orders (car_id, car_service_id, price, personal_cars_id) values (1, 1, 30, 1);
insert into orders (car_id, car_service_id, price, personal_cars_id) values (2, 2, 35, 1);
insert into orders (car_id, car_service_id, price, personal_cars_id) values (3, 3, 90, 3);
 
-- 10 statements for updating.

update drivers set name = 'Oleg', `e-mail` = 'Oleg@mail.com', age = 27 where id = 2;
update drivers set name = 'nomame', `e-mail` = 'noname@mail.com', age = 22 where id = 3;
update drivers set name = 'Anna', `e-mail` = 'anna@mail.com', age = 27 where id = 4;
update drivers set name = 'Nils', `e-mail` = 'Nils@mail.com', age = 55 where id = 5;
update drivers set name = 'Gans', `e-mail` = 'Gans@mail.com', age = 23 where id = 6;
update drivers set name = 'Andrey', `e-mail` = 'Andrey@mail.com', age = 37 where id = 7;
update drivers set name = 'Mari', `e-mail` = 'Mari@mail.com', age = 30 where id = 11;
update drivers set name = 'Olya', `e-mail` = 'Olya@mail.com', age = 19 where id = 8;
update drivers set name = 'Serg', `e-mail` = 'Serg@mail.com', age = 33 where id = 9;
update licenses set number = '345453456', exp_data = '2029', driver_id = 3 where id = 2;

-- 10 statements for deletions. 

DELETE FROM drivers WHERE ID = 36 LIMIT 1;
DELETE FROM drivers WHERE ID = 35 LIMIT 1;
DELETE FROM drivers WHERE ID = 34 LIMIT 1;
DELETE FROM drivers WHERE ID = 33 LIMIT 1;
DELETE FROM drivers WHERE ID = 32 LIMIT 1;
DELETE FROM car_services WHERE ID = 4 LIMIT 1;
DELETE FROM car_services WHERE ID = 5 LIMIT 1;
DELETE FROM car_services WHERE ID = 6 LIMIT 1;
DELETE FROM car_services WHERE ID = 7 LIMIT 1;
DELETE FROM car_services WHERE ID = 8 LIMIT 1;

-- 5 alter table.

alter table car_services add number_of_garages varchar(45) after status;
alter table car_services drop number_of_garages;
alter table drivers change column age ages int;
alter table drivers change column ages age int;
alter table orders rename to new_orders;
alter table new_orders rename to orders;

--  1 big statement to join all tables in the database.

select categories.*, licenses.*, drivers.*, alcohol_tests.*, replacement_drivers.*, distributors.*, park_cars.*, garages.*, personal_cars.*, orders.*,  car_services.*, modes.*, workers.*,
families.*, replacement_workers.*
from categories, licenses, drivers, alcohol_tests, replacement_drivers, distributors, park_cars, garages, personal_cars, orders, car_services, modes, workers, families, replacement_workers
where categories.license_id = licenses.id and licenses.driver_id = drivers.id and alcohol_tests.drivers_id = drivers.id and alcohol_tests.replacement_driver_id = replacement_drivers.id and
distributors.Replacement_drivers_id = replacement_drivers.id and distributors.Park_Cars_id = park_cars.id and garages.car_id = park_cars.id and garages.personal_cars_id = personal_cars.id and
personal_cars.drivers_id = drivers.id and orders.personal_cars_id = personal_cars.id and orders.car_id = park_cars.id and orders.car_service_id = car_services.id and modes.car_service_id = car_services.id and
modes.worker_id = workers.id and families.workers_id = workers.id ; 

-- 5 statements with inner

select categories.*,  licenses.*
from categories inner join licenses
on categories.license_id = licenses.id;

select alcohol_tests.*,  drivers.*
from alcohol_tests inner join drivers
on alcohol_tests.drivers_id = drivers.id;

select park_cars.*,  drivers.*
from park_cars inner join drivers
on park_cars.driver_id = drivers.id;

select park_cars.*,  orders.*
from park_cars inner join orders
on orders.car_id = park_cars.id;

select personal_cars.*,  orders.*
from personal_cars inner join orders
on orders.personal_cars_id = personal_cars.id;  


-- 5 statements with left

select categories.*,  licenses.number
from categories LEFT OUTER JOIN licenses
on categories.license_id = licenses.id;

select alcohol_tests.*,  drivers.`e-mail`
from alcohol_tests LEFT OUTER JOIN drivers
on alcohol_tests.drivers_id = drivers.id;

select park_cars.*,  drivers.name
from park_cars LEFT OUTER JOIN drivers
on park_cars.driver_id = drivers.id;

select park_cars.*,  orders.price
from park_cars LEFT OUTER JOIN orders
on orders.car_id = park_cars.id;


select personal_cars.*,  orders.price
from personal_cars LEFT OUTER JOIN orders
on orders.personal_cars_id = personal_cars.id;  

-- 5 statements with right

select licenses.number, categories.*
from categories RIGHT OUTER JOIN licenses
on categories.license_id = licenses.id;

select drivers.`e-mail`, alcohol_tests.*
from alcohol_tests RIGHT OUTER JOIN drivers
on alcohol_tests.drivers_id = drivers.id;

select drivers.name, park_cars.*
from park_cars RIGHT OUTER JOIN drivers
on park_cars.driver_id = drivers.id;

select orders.price, park_cars.*
from park_cars RIGHT OUTER JOIN orders
on orders.car_id = park_cars.id;


select orders.price, personal_cars.*
from personal_cars RIGHT OUTER JOIN orders
on orders.personal_cars_id = personal_cars.id;  


-- 5 statements with outer joins.

select * from categories
LEFT JOIN licenses ON categories.license_id = licenses.id
UNION 
select * from categories
RIGHT JOIN licenses ON categories.license_id = licenses.id
WHERE categories.id is null;


select * from alcohol_tests
LEFT JOIN drivers ON alcohol_tests.drivers_id = drivers.id
UNION 
select * from alcohol_tests
RIGHT JOIN drivers ON alcohol_tests.drivers_id = drivers.id
WHERE alcohol_tests.id is null;


select * from distributors
LEFT JOIN park_cars ON distributors.Park_Cars_id = park_cars.id
UNION 
select * from distributors
RIGHT JOIN park_cars ON distributors.Park_Cars_id = park_cars.id
WHERE distributors.id is null;


select * from modes
LEFT JOIN replacement_workers ON replacement_workers.mode_id = modes.id
UNION 
select * from modes
RIGHT JOIN replacement_workers ON replacement_workers.mode_id = modes.id
WHERE modes.id is null;


select * from orders
LEFT JOIN personal_cars ON orders.personal_cars_id = personal_cars.id
UNION 
select * from orders
RIGHT JOIN personal_cars ON orders.personal_cars_id = personal_cars.id
WHERE orders.id is null;

-- 7 statements with aggregate functions and group by and without having.

select name, AVG(age)  
from drivers 
group by name;

select name, MIN(age)  
from drivers
group by name;

select name, COUNT(name)  
from drivers 
group by name;

select name, MAX(age)  
from drivers
group by name;

select name, SUM(age)  
from drivers
group by name;


select results, COUNT(results)  
from alcohol_tests 
group by results;

select category, COUNT(category )  
from categories 
group by category;

-- 7 statements with aggregate functions and group by and with having.

select name, AVG(age)  
from drivers 
group by name
HAVING AVG(age) > 30;

select name, MIN(age)  
from drivers
group by name
HAVING AVG(age)< 22;

select name, COUNT(name)  
from drivers 
group by name
HAVING COUNT(name) > 2;

select name, MAX(age)  
from drivers
group by name
HAVING MAX(age) < 21;

select name, SUM(age)  
from drivers
group by name
HAVING SUM(age) >77;


select results, COUNT(results)
from alcohol_tests 
group by results
HAVING results = 'Negative';

select category, COUNT(category )  
from categories 
group by category
HAVING category = 'A';


