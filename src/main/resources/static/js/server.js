const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Простой массив пользователей для примера
let users = [];

// Эндпоинт для расписания
app.get('/api/schedule', (req, res) => {
    res.json({ schedule: ['Route 1', 'Route 2'] });
});

// Эндпоинт для бронирования билетов
app.post('/api/book-tickets', (req, res) => {
    const { route, seats } = req.body;
    // Здесь должна быть логика для бронирования
    res.json({ message: `Reserved ${seats} seat(s) on ${route}` });
});

// Эндпоинт для регистрации
app.post('/api/register', (req, res) => {
    const { username, password } = req.body;
    users.push({ username, password }); // Сохранение пользователя (небезопасно на практике!)
    res.json({ message: 'User registered successfully!' });
});

// Запуск сервера
app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});
