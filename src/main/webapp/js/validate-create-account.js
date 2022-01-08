function validateUserForm() {

	let name = document.forms["userForm"]["name"].value;
	let email = document.forms["userForm"]["email"].value;
	let password = document.forms["userForm"]["password"].value;
	let phone = document.forms["userForm"]["phone"].value;
	let address = document.forms["userForm"]["address"].value;

	if (name == "") {
		alert("Name must be filled out");
		document.forms["userForm"]["name"].focus();
		return false;
	}

	if (email == "") {
		alert("Email must be filled out");
		document.forms["userForm"]["name"].focus();
		return false;
	} else {
		let mailFormat = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
		if(!email.match(mailFormat)){
			alert("Your email address is incorrect format!");
			document.forms["userForm"]["email"].focus();
			return false;
		}
	}

	if (password == "") {
		alert("Password must be filled out");
		document.forms["userForm"]["password"].focus();
		return false;
	}

	if (phone == "") {
		alert("Phone must be filled out");
		document.forms["userForm"]["phone"].focus();
		return false;
	} else {
		let phoneFormat = /^[0]{1}[0-9]{9}$/;
  		if(!phone.match(phoneFormat)){
			alert("Your phone number is incorrect format!");
			document.forms["userForm"]["phone"].focus();
			return false;
		}
	}

	if (address == "") {
		alert("Address must be filled out");
		document.forms["userForm"]["address"].focus();
		return false;
	}

}