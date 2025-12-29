# Practice Environment link: 
- https://www.programiz.com/sql/online-compiler 
-- Online SQL Editor to Run SQL Online.
-- Use the editor to create new tables, insert data and all other SQL operations.
-- create table students( rollNo int, name varchar(50), email varchar(50))
--insert into students( rollNo, name, email) values (1,"Ronak", "ustav@gmail.com");
--update students set email="ronak@gmail.com" where name ="Ronak";
-- select * students
--select rollNo, name from students
--select * from Customers where age>22;
--select * from Customers order by age asc limit 4;
--select count(*) as total, avg(age) as avgAge from Customers;
--select distinct customer_id from Orders;
--select C.first_name , O.item from Customers C inner join Orders O on  c.customer_id=O.customer_id;
--select upper(first_name),age from Customers where age>( select avg(age) from Customers);
select first_name from Customers union select item from Orders;

