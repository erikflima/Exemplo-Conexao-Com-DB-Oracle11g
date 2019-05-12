package com.erik.company.exemploConexao.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity                     //Isso eh uma anotacao do Hibernate, no qual estou dizendo que essa classe reprenta um tabela do banco de dados.
@Table(name = "USER_TABLE") //Nome da tabela que essa classe representa.
public class User implements Serializable {
	
	
	private static final long serialVersionUID = 3960436649365666213L; //Numero gerado pelo Java automaticamente.
	
	
    
    @Id                                             //Anotacao do Hibernate, no qual estou dizendo que o campo "id" eh o campo chave da tabela.
    @GeneratedValue(strategy = GenerationType.AUTO) //Anotacao do Hibernate que diz que o campo "id" campo eh Auto-incrementado.E o "Strategy" eh pra dizer como que vai ser esse auto-incremento, que nesse caso vai ser de um em um.	
    @Column(name = "ID")                            //Nome real da coluna da tabela no banco de dados.
    private Integer id;
  
    
    @Column(name = "USER_NAME", nullable = true, length = 255) //Nome real da coluna da tabela no banco de dados.
    private String name;
  
    
    @Column(name = "USER_SALARY", nullable = true, length = 10) //Nome real da coluna da tabela no banco de dados.
    private Integer salary;
  
    
    
    public User() {
    	
    }
    
    
  //-----------Getters and Setters-------------//  
    
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    

}