window.addEventListener("DOMContentLoaded", setupForm);

function setupForm(){
	const form = document.getElementById("register-form");
	form.addEventListener("submit", handleSubmit);
}//setupForm

function handleSubmit(event){
	event.preventDefault();

	const {
        username,
        email,
        passw,
        passw1,
        website,
		result
	} = event.target;

	const processUser = registerUser;
	const response    = processUser(username.value,email.value, passw.value,passw1.value,website.value);
	result.innerHTML  = response;
}//handleSubmit

function registerUser(username,email,passw,passw1,website){
    window.localStorage.setItem("username", username);
    window.localStorage.setItem("email", email);  
    window.localStorage.setItem("password", passw);
    window.localStorage.setItem("cnfpassword", passw1);
    window.localStorage.setItem("website", website);

	return `New user ${username} now registered!`;
}//registerUser

