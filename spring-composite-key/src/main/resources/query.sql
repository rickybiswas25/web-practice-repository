USE `webrepository`;

CREATE TABLE `composite_idclass_example_entity` (
	`account_type` INTEGER,
	`account_number` VARCHAR(30),
	PRIMARY KEY (`account_type`, `account_number`)
);

CREATE TABLE `composite_embedded_example_entity` (
	`account_type` INTEGER,
	`account_number` VARCHAR(30),
	PRIMARY KEY (`account_type`, `account_number`)
);
INSERT INTO `composite_embedded_example_entity` (`account_type`, `account_number`) VALUES (1, "09273182");
INSERT INTO `composite_idclass_example_entity` (`account_type`, `account_number`) VALUES (1, "09273182");
