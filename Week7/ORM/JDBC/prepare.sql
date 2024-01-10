-- Create the user
CREATE USER IF NOT EXISTS 'fawry-intern'@'%' IDENTIFIED BY 'fawry';

-- Grant all privileges to the user
GRANT ALL PRIVILEGES ON *.* TO 'fawry-intern'@'%' WITH GRANT OPTION;

-- Create the database
CREATE DATABASE IF NOT EXISTS `fawry-tasks`;

-- Switch to the newly created database
USE `fawry-tasks`;

-- Drop the jdbcTable if it exists
DROP TABLE IF EXISTS `jdbcTable`;

-- Create a sample table called jdbcTable
CREATE TABLE `jdbcTable` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `description` TEXT,
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert some sample data into the jdbcTable
INSERT INTO `jdbcTable` (`name`, `description`) VALUES
('Task 1', 'Description for Task 1'),
('Task 2', 'Description for Task 2'),
('Task 3', 'Description for Task 3');
