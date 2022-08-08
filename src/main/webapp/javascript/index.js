
let submitButton = document.getElementById("button");
submitButton.addEventListener("click",(event) => {
  event.preventDefault();


  let xhttp = new XMLHttpRequest();


let Favorite = document.getElementById("favorite").value

// console.log(signInfo);


xhttp.onreadystatechange = function (){


if(this.readyState == 4 && xhttp.status == 200){


  console.log(xhttp.responseText);


  let data = JSON.parse(xhttp.responseText);

 } 
};


xhttp.open("GET",`http://localhost:8080/app/candy?id=${Favorite}`)


xhttp.send();
}
);

function renderHTML(data){

  //target the p tag that has an id = "favorite"
  let response = document.getElementById("input")
  //append the response data
  response.append("Favorite:" + data.name);
  response.append(document.createElement("br"));

  response.append("ID:" + data.id)
  response.append(document.createElement('br'));
  response.append(document.createElement('br'));
 
  input.innerText = "My Favorite candy is:" + data.name;
}