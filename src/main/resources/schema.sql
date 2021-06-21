CREATE TABLE `Racers` (
                          `id` INT NOT NULL AUTO_INCREMENT,
                          `name` varchar(255) NOT NULL,
                          `surname` varchar(255) NOT NULL,
                          PRIMARY KEY (`id`)
);

CREATE TABLE `Teams` (
                         `id` INT NOT NULL AUTO_INCREMENT,
                         `name` varchar(255) NOT NULL,
                         PRIMARY KEY (`id`)
);

CREATE TABLE `Seasons` (
                           `id` INT NOT NULL AUTO_INCREMENT,
                           `year` INT NOT NULL AUTO_INCREMENT,
                           PRIMARY KEY (`id`)
);

CREATE TABLE `SEASON_RESULTS` (
                                 `id` INT NOT NULL AUTO_INCREMENT,
                                 `position` INT NOT NULL,
                                 `racer_id` INT NOT NULL,
                                 `team_id` INT NOT NULL,
                                 `season_id` INT NOT NULL,
                                 PRIMARY KEY (`id`)
);

ALTER TABLE `SEASON_RESULTS` ADD CONSTRAINT `SeasonResults_fk0` FOREIGN KEY (`racer_id`) REFERENCES `Racers`(`id`);

ALTER TABLE `SEASON_RESULTS` ADD CONSTRAINT `SeasonResults_fk1` FOREIGN KEY (`team_id`) REFERENCES `Teams`(`id`);

ALTER TABLE `SEASON_RESULTS` ADD CONSTRAINT `SeasonResults_fk2` FOREIGN KEY (`season_id`) REFERENCES `Seasons`(`id`);
