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

function userLogin() {

}