function calcPR() {
  var cost = document.getElementById("c").value;
  var ECP = document.getElementById("role").value;

  if (ECP == "University Course") {
    let result = parseFloat(cost) * parseFloat(".8");

    if (!isNaN(result)) {
      document.getElementById("pr").innerHTML = result;
    }
  } else if (ECP == "Seminar") {
    let result = parseFloat(cost) * parseFloat(".6");

    if (!isNaN(result)) {
      document.getElementById("pr").innerHTML = result;
    }
  } else if (ECP == "Certification Prep Classes") {
    let result = parseFloat(cost) * parseFloat(".75");

    if (!isNaN(result)) {
      document.getElementById("pr").innerHTML = result;
    }
  } else if (ECP == "Certification") {
    let result = parseFloat(cost) * parseFloat("1");

    if (!isNaN(result)) {
      document.getElementById("pr").innerHTML = result;
    }
  } else if (ECP == "Technical-Training") {
    let result = parseFloat(cost) * parseFloat(".9");

    if (!isNaN(result)) {
      document.getElementById("pr").innerHTML = result;
    }
  } else if (ECP == "other") {
    let result = parseFloat(cost) * parseFloat(".3");

    if (!isNaN(result)) {
      document.getElementById("pr").innerHTML = result;
    }
  }
}

window.onload = function (){
	document.getElementByID("buttonCPR").addEventListener("click",calcPR);
}
