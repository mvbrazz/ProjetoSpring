package com.projeto.projeto.interUsuario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.projeto.projeto.objects.usuario;

public interface usuarioInterface extends CrudRepository<usuario, Integer> {  
    @Query(nativeQuery = true,value = "SELECT * FROM usuario WHERE nomedologin like ?1")
    usuario login(String loginusuario);  
}






    
    

