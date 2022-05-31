-- MySQL Script generated by MySQL Workbench
-- Sun May  8 16:21:48 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Drivers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Drivers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `e-mail` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Licenses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Licenses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `number` VARCHAR(45) NOT NULL,
  `exp_data` VARCHAR(45) NOT NULL,
  `driver_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Licenses_Drivers_idx` (`driver_id` ASC) VISIBLE,
  CONSTRAINT `fk_Licenses_Drivers`
    FOREIGN KEY (`driver_id`)
    REFERENCES `mydb`.`Drivers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Park_Cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Park_Cars` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NOT NULL,
  `year` VARCHAR(45) NOT NULL,
  `driver_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Cars_Drivers1_idx` (`driver_id` ASC) VISIBLE,
  CONSTRAINT `fk_Cars_Drivers1`
    FOREIGN KEY (`driver_id`)
    REFERENCES `mydb`.`Drivers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Car_Services`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Car_Services` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Personal_Cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Personal_Cars` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NOT NULL,
  `year` VARCHAR(45) NOT NULL,
  `drivers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Personal_cars_Drivers1_idx` (`drivers_id` ASC) VISIBLE,
  CONSTRAINT `fk_Personal_cars_Drivers1`
    FOREIGN KEY (`drivers_id`)
    REFERENCES `mydb`.`Drivers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Orders` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `car_id` INT NOT NULL,
  `car_service_id` INT NULL,
  `price` INT NOT NULL,
  `personal_cars_id` INT NOT NULL,
  INDEX `fk_Cars_has_Car_services_Car_services1_idx` (`car_service_id` ASC) VISIBLE,
  INDEX `fk_Cars_has_Car_services_Cars1_idx` (`car_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  INDEX `fk_Orders_Personal_Cars1_idx` (`personal_cars_id` ASC) VISIBLE,
  CONSTRAINT `fk_Cars_has_Car_services_Cars1`
    FOREIGN KEY (`car_id`)
    REFERENCES `mydb`.`Park_Cars` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cars_has_Car_services_Car_services1`
    FOREIGN KEY (`car_service_id`)
    REFERENCES `mydb`.`Car_Services` (`id`)
    ON DELETE NO ACTION
    ON UPDATE SET NULL,
  CONSTRAINT `fk_Orders_Personal_Cars1`
    FOREIGN KEY (`personal_cars_id`)
    REFERENCES `mydb`.`Personal_Cars` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Garages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Garages` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `color` VARCHAR(45) NOT NULL,
  `size` VARCHAR(45) NOT NULL,
  `car_id` INT NOT NULL,
  `personal_cars_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Garages_Cars1_idx` (`car_id` ASC) VISIBLE,
  INDEX `fk_Garages_Personal_Cars1_idx` (`personal_cars_id` ASC) VISIBLE,
  CONSTRAINT `fk_Garages_Cars1`
    FOREIGN KEY (`car_id`)
    REFERENCES `mydb`.`Park_Cars` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Garages_Personal_Cars1`
    FOREIGN KEY (`personal_cars_id`)
    REFERENCES `mydb`.`Personal_Cars` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Workers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Workers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Families`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Families` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `number_of_family_members` INT NOT NULL,
  `father's_name` VARCHAR(45) NOT NULL,
  `workers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Families_Workers1_idx` (`workers_id` ASC) VISIBLE,
  CONSTRAINT `fk_Families_Workers1`
    FOREIGN KEY (`workers_id`)
    REFERENCES `mydb`.`Workers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categories` (
  `id` INT NOT NULL,
  `category` VARCHAR(45) NOT NULL,
  `license_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Categories_Licenses1_idx` (`license_id` ASC) VISIBLE,
  CONSTRAINT `fk_Categories_Licenses1`
    FOREIGN KEY (`license_id`)
    REFERENCES `mydb`.`Licenses` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Replacement_Drivers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Replacement_Drivers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Distributors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Distributors` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Replacement_drivers_id` INT NOT NULL,
  `Park_Cars_id` INT NOT NULL,
  INDEX `fk_Replacement_drivers_has_Park_Cars_Park_Cars1_idx` (`Park_Cars_id` ASC) VISIBLE,
  INDEX `fk_Replacement_drivers_has_Park_Cars_Replacement_drivers1_idx` (`Replacement_drivers_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Replacement_drivers_has_Park_Cars_Replacement_drivers1`
    FOREIGN KEY (`Replacement_drivers_id`)
    REFERENCES `mydb`.`Replacement_Drivers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Replacement_drivers_has_Park_Cars_Park_Cars1`
    FOREIGN KEY (`Park_Cars_id`)
    REFERENCES `mydb`.`Park_Cars` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Alcohol_Tests`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Alcohol_Tests` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `results` VARCHAR(45) NOT NULL,
  `drivers_id` INT NOT NULL,
  `replacement_driver_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Alcohol tests_Drivers1_idx` (`drivers_id` ASC) VISIBLE,
  INDEX `fk_Alcohol tests_Replacement_drivers1_idx` (`replacement_driver_id` ASC) VISIBLE,
  CONSTRAINT `fk_Alcohol tests_Drivers1`
    FOREIGN KEY (`drivers_id`)
    REFERENCES `mydb`.`Drivers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alcohol tests_Replacement_drivers1`
    FOREIGN KEY (`replacement_driver_id`)
    REFERENCES `mydb`.`Replacement_Drivers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Modes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Modes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `worker_id` INT NOT NULL,
  `car_service_id` INT NOT NULL,
  INDEX `fk_Workers_has_Car_Services_Car_Services1_idx` (`car_service_id` ASC) VISIBLE,
  INDEX `fk_Workers_has_Car_Services_Workers1_idx` (`worker_id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Workers_has_Car_Services_Workers1`
    FOREIGN KEY (`worker_id`)
    REFERENCES `mydb`.`Workers` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Workers_has_Car_Services_Car_Services1`
    FOREIGN KEY (`car_service_id`)
    REFERENCES `mydb`.`Car_Services` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Replacement_Workers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Replacement_Workers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  `mode_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Replacement_Workers_Modes1_idx` (`mode_id` ASC) VISIBLE,
  CONSTRAINT `fk_Replacement_Workers_Modes1`
    FOREIGN KEY (`mode_id`)
    REFERENCES `mydb`.`Modes` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;