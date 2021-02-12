let whiskeys = ["Ardbeg", "Laphroaig", "Lagavulin"];

function userSearch() {

    let user_search = document.getElementById("search-input").value;
    //console.log(typeof(user_search));

    if (user_search == "") {
        return alert("Please enter the name of a whiskey...");

    }

    for (let whiskey in whiskeys) {
        if (whiskey != user_search) {
            return alert("Sorry, whiskey not found in our database...");
        } else {
            console.log(true);
        }
    }
    
}