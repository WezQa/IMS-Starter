use ims;


CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

create table if not exists `items` (
`Item_No` int(11) not null auto_increment,
`Item Name` varchar(40) default null,
`Item Price` double null default null,
Primary Key (Item_No)

);

create table if not exists `orders` (
`Order_No` int (11) not null auto_increment,
fk_id int not null,
Primary Key (Order_no),
foreign key (fk_id) references customers(id)
);

create table if not exists `orders_items` (
`Order_Items_ID` int (11) not null auto_increment,
fk_Order_No int not null,
fk_Item_No int not null,
`Price` double null default null,
`Quantity` int(11) not null,
foreign key (fk_Order_No) references orders(Order_No),
foreign key (fk_Item_No) references items(Item_No),
Primary Key (Order_Items_ID)
);
