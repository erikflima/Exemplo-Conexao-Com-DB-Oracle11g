package com.erik.company.exemploConexao.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erik.company.exemploConexao.entity.User;


/*
O que eu quero eh criar um objeto que tenha metodos que acessa uma tabela no meu banco de dados, blz!
Entao eu crio um interface, que extend que herda de "JpaRepository" da biblioteca Hibernate-JPA.
Essa "JpaRepository" obriga o herdador a implementar um monte de metodos. 
Eh tipo um esqueminha, pq que vai implementar esse monte de metodos, eh o Spring, quando eu usar a anotacao "@Autowired" em alguma parte do codigo.

   Obs: -> JpaRepository<Classe da tabela que quero me conectar, Tipo da chave primaria da tabela> 
*/
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
}