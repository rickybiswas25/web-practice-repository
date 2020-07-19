USE `webrepository`;

CREATE TABLE `user`
(
    `id` INT(4),
    `active` CHAR(1) DEFAULT 1,
    `email` VARCHAR(20),
    `name` VARCHAR(25)  NOT NULL,
    `password` VARCHAR(120) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE `role`
(
    `id` INT(4),
    `role` VARCHAR(10),
    PRIMARY KEY (`id`)
);

CREATE TABLE `user_role`
(
    `user_id` INT(4),
    `role_id` INT(4),
    CONSTRAINT `user_role_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
    CONSTRAINT `role_user_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
);

