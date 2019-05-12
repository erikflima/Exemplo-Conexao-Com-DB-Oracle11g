package com.erik.company.exemploConexao.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erik.company.exemploConexao.entity.User;
import com.erik.company.exemploConexao.service.UserService;



@RestController                                             //Anotacao do Spring que torna essa classe um endpoint.
@RequestMapping(value="/usuario", produces="application/json") //Anotacao do Spring que uso para definir qual sera o caminho do endpoint. Digo que recebe json e produso json.
public class UserController {
	
	
     @Autowired
     UserService userService;
 
     
     
     @GetMapping(value = "/pegarTodosUsuarios")
     public List<User> pegarTodosOsUsuarios() {
    	 
    	 List<User> listaDeUsuarios = userService.pegarTodosOsUsuarios();
    	 
         return listaDeUsuarios;
        		 
     }
 
     
     //------
     
     
     @PostMapping(value = "/adicionarNovoUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public User adicionarNovoUsuario( @RequestBody User userRecebido ) {
    	 
    	 User userAdicionado = userService.adicionarNovoUsuario( userRecebido );
    	 
         return userAdicionado;
     }

 
 }