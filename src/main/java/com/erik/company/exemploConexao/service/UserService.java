package com.erik.company.exemploConexao.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erik.company.exemploConexao.dao.UserDao;
import com.erik.company.exemploConexao.entity.User;


@Service  //Anotacao do Spring que transforma essa classe em um "service". Ou seja, agora essa classe pode ser injetada em outros lugares.
public class UserService {
	
	
    @Autowired
    UserDao userRepository;

    
    //Busca todos as linhas da tabela
    public List<User> pegarTodosOsUsuarios() {
    	
    	
    	List<User> listaDeUsuarios = userRepository.findAll();
    	
        return listaDeUsuarios;
    }

    
    //----------------------
    
    
    //Adiciona um novo usuario na tabela
    public User adicionarNovoUsuario( User userRecebido ) {
    	
    	User usuarioQueFoiSalvo = userRepository.save( userRecebido );
    	
        return usuarioQueFoiSalvo;
    }
  

}