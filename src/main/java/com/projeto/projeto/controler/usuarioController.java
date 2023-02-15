package com.projeto.projeto.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.projeto.interUsuario.usuarioInterface;
import com.projeto.projeto.objects.usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")

public class usuarioController {
        
    @Autowired
    private usuarioInterface user;
    
    @GetMapping
    public List<usuario> listaUser(){
        return (List<usuario> ) user.findAll();
    }

    
    //TELA LOGIN
    @GetMapping("/{login}")
    public usuario login(@PathVariable("login") String login){ 

        usuario result = user.login(login.toString());
        
        if(result == null){
            usuario aux = new usuario(); 
            aux.setId(0);
            return aux;
        }

        return result;
    }
    
    /*
    //TELA VERIFICA EMAIL (CADASTRO)
    @GetMapping("/cadastro/{email}")
    public boolean cadastro(@PathVariable("email") String email){ 

        System.out.println("testando");
        System.out.println(email);
        Usuario result = usu.login2(email.toString());
        System.out.println(result);
        
        if(result != null){
            return false;
        }
        else{
            return true;
        }
    }*/

    @PostMapping("/cadastrar")
    public void login(@RequestBody usuario use){
        System.out.println("-------------------------");
        System.out.println(use);
        System.out.println(use.getNome());
        System.out.println(use.getNomedologin());

        user.save(use);
        
    }

}
