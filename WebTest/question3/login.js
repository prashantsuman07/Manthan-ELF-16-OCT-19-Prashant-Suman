window.addEventListener("DOMContentLoaded", setupForm);

function setupForm(){
	const form = document.getElementById("login-form");
	form.addEventListener("submit", handleSubmit);
}//setupForm

function handleSubmit(event){
	event.preventDefault();

	const {
        email,
        password,
		result
	} = event.target;

	const processUser = loginUser;
	const response    = processUser(email.value, password.value);
	result.innerHTML  = response;
}//handleSubmit

function loginUser(email, password){
    	const registeredUser     = window.localStorage.getItem("email");
        const registeredPassword = window.localStorage.getItem("password");
        const registeredUserName     = window.localStorage.getItem("username");
    
    	const validUser     = email == registeredUser;
    	const validPassword = password == registeredPassword;
    
    	if(validUser && validPassword){
            return `User ${email} successfully logged-in! 
            <table>
            <tr>
            <td>
            username</td>
            <td>
            Useremail</td></tr>
            <tr>
            <td>
            ${registeredUserName}</td>
            <td>
            ${registeredUser}</td></tr></table>`;
            
    	}
            else if(!validUser)     return `Username ${email} has not been registered. `;
    	else if(!validPassword) return `Incorrect password for username ${email}`;
    }//loginUser