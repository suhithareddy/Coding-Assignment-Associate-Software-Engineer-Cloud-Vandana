
function validateForm() {
    const firstName = document.getElementById("FirstName").value;
    const lastName = document.getElementById("LastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("Email").value;
    const mobileNumber = document.getElementById("mobile_number").value;
    const gender = document.getElementsByName("gender");
    
    if (
        firstName === "" ||
        lastName === "" ||
        dob === "" ||
        country === "" ||
        profession === "" ||
        email === "" ||
        mobileNumber === "" ||
        ![...gender].some(e => e.checked)
    ) {
        alert("Please fill in all mandatory fields before submitting.");
        return;
    }

    showPopup();
}


function showPopup() {
    const FirstName = document.getElementById("FirstName").value;
    const LastName = document.getElementById("LastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const profession = document.getElementById("profession").value;
    const Email = document.getElementById("Email").value;
    const mobile_number = document.getElementById("mobile_number").value;
    const gender = document.getElementsByName("gender");
    const genderOption = Array.from(gender).find(e => e.checked);

    const resultDisplay = document.getElementById("resultDisplay");

    resultDisplay.innerHTML = `<strong>FirstName : </strong> ${FirstName}<br>`;
    resultDisplay.innerHTML += `<strong>LastName :</strong> ${LastName}<br>`;
    resultDisplay.innerHTML += `<strong>dob :</strong>  ${dob}<br>`;
    resultDisplay.innerHTML += `<strong>country :</strong> ${country}<br>`;
    resultDisplay.innerHTML += `<strong>profession :</strong> ${profession}<br>`;
    resultDisplay.innerHTML += `<strong>Email :</strong> ${Email}<br>`;
    resultDisplay.innerHTML += `<strong>mobile_number :</strong> ${mobile_number}<br>`;
    resultDisplay.innerHTML += `<strong>gender_Option :</strong> ${genderOption ? genderOption.value : "N/A"}<br>`;

    const popup = document.getElementById("popup");
    popup.style.display = "block";
}


function closePopup() {
    const popup = document.getElementById("popup");
    popup.style.display = "none";


    const form = document.getElementById("survey-form");
    form.reset();
}

  