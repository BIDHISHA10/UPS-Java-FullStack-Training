
document.getElementById("contactForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let name = document.getElementById("name").value;

    document.getElementById("result").innerText =
        "Thank you, " + name + "! Your message has been received.";

    document.getElementById("contactForm").reset();
});
