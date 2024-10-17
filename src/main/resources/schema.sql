-- H2 Schema Script

-- -----------------------------------------------------
-- Schema SmartTransit
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS SmartTransit;

-- -----------------------------------------------------
-- Table SmartTransit.Routes
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS SmartTransit.Routes (
  idRoutes INT NOT NULL AUTO_INCREMENT,
  startPoint VARCHAR(255) NOT NULL,
  endPoint VARCHAR(255) NOT NULL,
  transportType VARCHAR(50) NOT NULL,
  scheduleId INT NOT NULL,
  PRIMARY KEY (idRoutes)
);

-- -----------------------------------------------------
-- Table SmartTransit.Schedules
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS SmartTransit.Schedules (
  idSchedules INT NOT NULL AUTO_INCREMENT,
  routeId INT NOT NULL,
  departureTime DATETIME NOT NULL,
  arrivalTime DATETIME NOT NULL,
  frequency VARCHAR(50) NOT NULL,
  PRIMARY KEY (idSchedules, routeId)
);

-- -----------------------------------------------------
-- Table SmartTransit.Payments
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS SmartTransit.Payments (
  idPayments INT NOT NULL AUTO_INCREMENT,
  userId INT NOT NULL,
  ticketId INT NOT NULL,
  amount FLOAT NOT NULL,
  Paymentscol VARCHAR(45) NOT NULL,
  status VARCHAR(50) NOT NULL,
  date DATE NOT NULL,
  PRIMARY KEY (idPayments, userId, ticketId, date)
);

-- -----------------------------------------------------
-- Table SmartTransit.Tickets
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS SmartTransit.Tickets (
  idTickets INT NOT NULL AUTO_INCREMENT,
  userId INT NOT NULL,
  routeId INT NOT NULL,
  purchase DATE NOT NULL,
  qrCode VARCHAR(255) NOT NULL,
  status VARCHAR(50) NOT NULL,
  PRIMARY KEY (idTickets)
);

-- -----------------------------------------------------
-- Table SmartTransit.Users
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS SmartTransit.Users (
  idUsers INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  phone VARCHAR(20) NOT NULL,
  PRIMARY KEY (idUsers)
);

-- -----------------------------------------------------
-- Foreign Key Constraints
-- -----------------------------------------------------
ALTER TABLE SmartTransit.Schedules ADD CONSTRAINT fk_route
    FOREIGN KEY (routeId) REFERENCES SmartTransit.Routes(idRoutes)
    ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE SmartTransit.Tickets ADD CONSTRAINT fk_user
    FOREIGN KEY (userId) REFERENCES SmartTransit.Users(idUsers)
    ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE SmartTransit.Payments ADD CONSTRAINT fk_ticket
    FOREIGN KEY (ticketId) REFERENCES SmartTransit.Tickets(idTickets)
    ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE SmartTransit.Payments ADD CONSTRAINT fk_user_payment
    FOREIGN KEY (userId) REFERENCES SmartTransit.Users(idUsers)
    ON DELETE CASCADE ON UPDATE CASCADE;
