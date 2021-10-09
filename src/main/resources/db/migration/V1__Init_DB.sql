CREATE TABLE `Colors` (
                          `color_name` varchar(45) NOT NULL,
                          PRIMARY KEY (`color_name`),
                          UNIQUE KEY `color_name_UNIQUE` (`color_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `SocksByType` (
                               `type_id` int NOT NULL AUTO_INCREMENT,
                               `color` varchar(45) DEFAULT NULL,
                               `cotton_part` int DEFAULT NULL,
                               `quantity` varchar(45) DEFAULT NULL,
                               PRIMARY KEY (`type_id`),
                               UNIQUE KEY `type_id_UNIQUE` (`type_id`),
                               KEY `color_key_idx` (`color`),
                               CONSTRAINT `color_key` FOREIGN KEY (`color`) REFERENCES `Colors` (`color_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;