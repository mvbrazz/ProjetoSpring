function login(){

    var inputUsuario = document.querySelector("#usuario");
    var inputSenha = document.querySelector("#senha");
    let el = document.getElementById('mensagem');


    const usuario = inputUsuario.value;
    const senha = inputSenha.value;

    const request = new XMLHttpRequest();  

    request.open('GET', 'http://localhost:8080/usuario/'+usuario)

    request.onload = function () {

        var senhaCriptografada = encriptar(senha); 
      
        const cont =  JSON.parse(this.responseText);

        if(cont.senha == senhaCriptografada && cont.nomedologin == usuario){
            
            alert("Parabéns, Conseguiu logar, finalmente !!!")    ; 

            el.style.visibility = "hidden";
            document.getElementById('usuario').value='';
            document.getElementById('senha').value='';
            
            redirecionarMenu();

        }
        else{
            //alert("Senha  ou email incorreto")  ;   
            el.style.visibility = "visible";
        }
    }
  
    request.onerror = function () {
      console.log('erro ao executar a requisição de login')
    }
    
    request.send()

}
  
function encriptar(senha){

    var encondedString;
    encondedString = btoa(senha);
    return encondedString;    

}

function decriptar(senha){

    var decodedString;
    decodedString = atob(senha);
    return decodedString.toString();    

}

function redirecionarMenu(){
    window.location.href = "../model/menu.html";
}