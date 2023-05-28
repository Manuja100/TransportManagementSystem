var drop = document.getElementsByClassName("faq");
var i;
for (i = 0; i < drop.length; i++) {
    drop[i].addEventListener("click", function () {
        
        var body = this.nextElementSibling;
        if (body.style.display === "block") {
            body.style.display = "none";
        } else {
            body.style.display = "block";
        }
    });
}




