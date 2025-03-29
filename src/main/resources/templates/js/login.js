function login(){
    const loginAccount = document.getElementById('loginAccount').value;
    const password = document.getElementById('password').value;

    if (!/^[a-zA-Z][a-zA-Z0-9]*$/.test(loginAccount)) {
        alert('Login account must start with a letter and contain only letters and numbers');
        document.getElementById('loginAccount').focus();
        return;
    }

    if (password.length < 8 || !/[a-zA-Z]/.test(password) || !/\d/.test(password) || !/[^a-zA-Z0-9]/.test(password)) {
        alert('Password must be at least 8 characters long and contain letters, numbers, and special characters');
        document.getElementById('password').focus();
        return;
    }

    document.getElementById('loginAccount').value = '';
    document.getElementById('password').value = '';
}