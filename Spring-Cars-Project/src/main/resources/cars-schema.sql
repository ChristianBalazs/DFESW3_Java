drop table if exists `cars` CASCADE;
create table
	`cars`
	(
	id integer AUTO_INCREMENT,
	carBrand varchar(255),
	carColour varchar(255),
	carType varchar(255),
	maxSpeed int,
	engineHp int,
	primary key (id)
	)
