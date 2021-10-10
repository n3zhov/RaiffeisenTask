CREATE TABLE `socks_by_type` (
                                 `type_id` varchar(48) NOT NULL,
                                 `color` varchar(45) DEFAULT NULL,
                                 `cotton_part` int DEFAULT NULL,
                                 `quantity` varchar(45) DEFAULT NULL,
                                 PRIMARY KEY (`type_id`),
                                 UNIQUE KEY `type_id_UNIQUE` (`type_id`),
                                 KEY `color_key_idx` (`color`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;