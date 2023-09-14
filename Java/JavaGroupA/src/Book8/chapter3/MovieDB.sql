drop database if exists movies;
create database movies;
use movies;

create table movie(
id int not null auto_increment,
title varchar(50),
year int,
price decimal(8, 2),
primary key (id)
);

insert into movie (title, year, price)
values ("It's a Wonderful Life", 1946, 14.95);
insert into movie (title, year, price)
values ("Young Frankenstein", 1974, 16.95);
insert into movie (title, year, price)
values ("Star Wars", 1977, 17.95);
insert into movie (title, year, price)
values ("The Princess Bride", 1987, 16.95);
insert into movie (title, year, price)
values ("Glory", 1989, 14.95);
insert into movie (title, year, price)
values("The Game",1997,14.95);
insert into movie (title, year, price)
values("Shakespeare in Love",1998,19.95);
insert into movie (title, year, price)
values("Zombieland",2009,18.95);
insert into movie (title, year, price)
values("The King's Speech",2010,17.85);
insert into movie (title, year, price)
values("Star Trek Into Darkness",2013,19.95);

SELECT * FROM movie;
SELECT title, year FROM movie ORDER BY year DESC;
-- SELECT * FROM movie ORDER BY year DESC;
SELECT title, year FROM movie WHERE year <= 1980 ORDER BY year;
SELECT title, year FROM movie WHERE year < 1979 and year > 1970 ORDER BY year;
-- SELECT id, title, year FROM movie WHERE title LIKE "%princess%";
SELECT title, year FROM movie WHERE title LIKE "s%";
SELECT * FROM movie WHERE id = 7;
-- SELECT count(*), MIN(year) FROM movie;
SELECT count(*), MAX(year) FROM movie;
SELECT count(*) as count, MIN(year) as earliest, MAX(year) as latest FROM movie;
-- SELECT count(*) as numOfMovies FROM movie WHERE year >= 1997;

create table friend(
lastName varchar(50),
firstName varchar(50),
movieId int);

insert into friend (lastName, firstName, movieId)
values ("Haskell", "Eddie", 3);
insert into friend (lastName, firstName, movieId)
values ("Haskell", "Eddie", 5);
insert into friend (lastName, firstName, movieId)
values ("Cleaver", "Wally", 9);
insert into friend (lastName, firstName, movieId)
values ("Mondello", "Lumpy", 2);
insert into friend (lastName, firstName, movieId)
values ("Cleaver", "Wally", 3);

SELECT lastName, firstName, title 
FROM movie, friend WHERE movie.id = friend.movieId;
-- SELECT firstName, title AS favMovie
-- FROM movie, friend WHERE movie.id = friend.movieId;
SELECT * FROM friend;
SELECT DISTINCT firstName, lastName FROM friend;
SELECT count(DISTINCT lastName, firstName) FROM friend;
SELECT DISTINCT firstName FROM friend;
-- SELECT count(DISTINCT firstName) FROM friend;
SELECT * FROM movie WHERE id = 7;
-- DELETE FROM movie WHERE id = 7;
-- SELECT * FROM friend WHERE lastName = "Haskell";
-- DELETE FROM friend WHERE lastName = "Haskell";

SELECT title, price FROM movie WHERE id = 8;
UPDATE movie SET price = 180.85 WHERE id = 8;

UPDATE friend set firstName = "Edward" WHERE firstName = "Eddie";
SELECT * FROM friend WHERE firstName = "Edward";

-- UPDATE movie SET price = price * 1.1;
-- SELECT price FROM movie;

SELECT avg(price) FROM movie;