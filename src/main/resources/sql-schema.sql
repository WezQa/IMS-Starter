use ims;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

create table if not exists `items` (
`ItemID` int(11) not null auto_increment,
`Item` varchar(40) default null,
`Price` double null default null,
Primary Key (ItemID)

);

create table if not exists `orders` (
`OrderNum` int (11) unique not null auto_increment,
id int (11) null default null,
Primary Key (OrderNum),
foreign key (id) references customers(id)
);

create table if not exists `orders_items` (
`Order_Items_ID` int (11) unique not null auto_increment,
OrderNum int (11) not null,
ItemID int (11) not null,
`Total` double null default null,
`Quantity` double null default null,
foreign key (OrderNum) references orders(OrderNum),
foreign key (ItemID) references items(ItemID),
Primary Key (Order_Items_ID)
);
