-- H2 Data Script

-- Insert sample data into SmartTransit.Users
INSERT INTO Users (name, email, password, phone) VALUES
('John Doe', 'john.doe@example.com', 'password123', '1234567890'),
('Jane Smith', 'jane.smith@example.com', 'password456', '0987654321');

-- Insert sample data into SmartTransit.Routes
INSERT INTO Routes (start_point, end_point, transport_type, schedule_id) VALUES
('Station A', 'Station B', 'Bus', 1),
('Station C', 'Station D', 'Train', 2);

-- Insert sample data into SmartTransit.Schedules
INSERT INTO Schedules (routeId, departureTime, arrivalTime, frequency) VALUES
(1, '2024-10-07 08:00:00', '2024-10-07 08:30:00', 'Every 30 mins'),
(2, '2024-10-07 09:00:00', '2024-10-07 09:45:00', 'Every hour');

-- Insert sample data into SmartTransit.Tickets
INSERT INTO Tickets (userId, routeId, purchase, qrCode, status) VALUES
(1, 1, '2024-10-07', 'QR123456789', 'Active'),
(2, 2, '2024-10-07', 'QR987654321', 'Active');

-- Insert sample data into SmartTransit.Payments
INSERT INTO Payments (userId, ticketId, amount, Paymentscol, status, date) VALUES
(1, 1, 2.50, 'Credit Card', 'Completed', '2024-10-07'),
(2, 2, 5.00, 'PayPal', 'Completed', '2024-10-07');
