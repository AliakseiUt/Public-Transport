document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    fetch('/api/admin/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: `username=${username}&password=${password}`
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById('login-message').innerText = data;
    })
    .catch(error => {
        console.error('Error:', error);
    });
});
function changeLanguage(lang) {
    const translations = {
        en: {
            title: "Smart Public Transport",
            users: "Users",
            routes: "Routes",
            schedules: "Schedules",
            // Добавьте другие переводы
        },
        ru: {
            title: "Умное приложение общественного транспорта",
            users: "Пользователи",
            routes: "Маршруты",
            schedules: "Расписания",
            // Добавьте другие переводы
        },
        zh: {
            title: "智能公共交通应用",
            users: "用户",
            routes: "路线",
            schedules: "时间表",
            // Добавьте другие переводы
        },
    };

    document.querySelector('h1').innerText = translations[lang].title;
    document.querySelector('nav a[href="users.html"]').innerText = translations[lang].users;
    document.querySelector('nav a[href="routes.html"]').innerText = translations[lang].routes;
    document.querySelector('nav a[href="schedules.html"]').innerText = translations[lang].schedules;
}
