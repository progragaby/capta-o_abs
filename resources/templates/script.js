const btnAdicionar = document.getElementById("btn-add");
const mensagemAdicionado = document.getElementById("mensagem-adicionado");

btnAdicionar.addEventListener("click", function() {
  mensagemAdicionado.classList.add("mensagem-mostrada");
  setTimeout(function() {
    mensagemAdicionado.classList.remove("mensagem-mostrada");
  }, 2000);
});



const usuario = sessionStorage.getItem("usuario");
if (usuario === null) usuario = "";

usuario.length > 0

  ? (document.getElementById("email").innerText = usuario.toString())

  : (document.getElementById("email").innerText = "Nome do usuário indefinido!");

 

 

function error(user1, pass1) {

  const inputUser = document.getElementById("user_input");

  const inputSenha = document.getElementById("password_input");

  const msgError = document.getElementById("errorMsg");

  const btnLog = document.getElementById("btn-log");

 

  //   const user1 = "admin";

  //   const pass1 = "admin";


  msgError.hidden = true;

  if (inputSenha.value == pass1 && inputUser.value == user1) {

    msgError.hidden = true;

    btnLog.style.marginTop = "25px";

  } else {

    msgError.hidden = false;

    btnLog.style.marginTop = "10px";

  }

}

 

// function valideteLogin () {

//     const inputUser = document.getElementById("user_input")

//     const inputSenha = document.getElementById("password_input")

//     const btnLog = document.getElementById("btn-log")

 

//     const user1 = "admin"

//     const pass1 = "admin"

 

//     if (inputSenha.value == pass1 && inputUser.value == user1) {

//       btnLog.href = '../../home/Att-Grade/html/index-grade.html';

//     }

// }

 

function validateLogin() {

  const inputUser = document.getElementById("email");
  const inputSenha = document.getElementById("senha");
  const msgError = document.getElementById("errorMsg");
  msgError.hidden = true;
  const usuario = inputUser.value;
  const senha = inputSenha.value;

  if(inputUser.value === ""){

    alert("Preencha esse campo");

    return;

  }
  const url =

    "http:/172.19.1.108:8080/login/logar?usuario=" + usuario + "&senha=" + senha;

 

 

  var myHeaders = new Headers();

 

  myHeaders.append("Content-Type", "text/plain");

  myHeaders.append("X-Custom-Header", "ProcessThisImmediately");

  myHeaders.append("Access-Control-Allow-Origin", "*");

  myHeaders.append("Access-Control-Request-Method", "GET, POST");

  myHeaders.append("Access-Control-Request-Headers", "*");

  myHeaders.append("Access-Control-Max-Age", "3600");

 

  var myInit = {

    method: "GET",

    headers: myHeaders,

    mode: "cors",

    cache: "default",

  };

 

  var myRequest = new Request(url, myInit);

 

  fetch(myRequest)

    .then((resposta) => {

      return resposta.json();

    })

    .then((data) => {

      console.log(data);

      error(data.usuario, data.senha);

      // Troca de janela

      sessionStorage.setItem("usuario", data.usuario);

      window.location.href = "http://127.0.0.1:3000/index.html";

 

    })

    .catch((error) => console.log(error));

}