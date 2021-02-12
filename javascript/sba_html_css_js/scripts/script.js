let whiskeys = ["Ardbeg", "Laphroaig", "Lagavulin"];

function userSearch() {

    let user_search = document.getElementById("search-input").value;

    if (user_search == "") {
        return alert("Please enter the name of a whiskey...");
    } else {
        if (whiskeys.includes(user_search)) {
            console.log(true);
            //document.getElementById("whiskey-pic")
            return window.location.href = "whiskey.html";
        } else {
            alert("Sorry, whiskey not found in our database...");
        }
    }
}

function validateForm(){
    var nameRegex = /^[a-zA-Z\-]+$/;
    var validUsername = document.getElementById("username").value.match(nameRegex);
    if(validUsername == null){
        alert("Your username is not valid. Only characters A-Z or a-z or -...");
        document.frm.username.focus();
        return false;
    } else {
        return true;
    }
}

function userLogin() {

    let user_username = document.getElementById("username").value;
    let user_password = document.getElementById("password").value;

    if (user_username == "" || user_password == "") {
        return alert("Please don't leave username or password blank...");
    } else {
        if (validateForm() == true){
            return window.location.href = "profile.html";
        }
    }
}

function focusMethodHome() {
    return document.getElementById("search-input").focus();
}

function focusMethodLogin() {
    return document.getElementById("username").focus();
}