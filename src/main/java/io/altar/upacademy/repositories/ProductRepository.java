package io.altar.upacademy.repositories;

import io.altar.upacademy.model.Product;

public class ProductRepository extends EntityRepository {
	
	private static final ProductRepository INSTANCE = new ProductRepository();// privado - nao podemos aceder a este atributo atraves de outras classes. final- nao vai ser alterado
	
	private ProductRepository() {
		this.addEntity(new Product());
	}
	
	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	

}

//O Padr�o Singleton tem como defini��o garantir que uma classe tenha apenas uma inst�ncia de si mesma e que forne�a um ponto global de acesso a ela. Ou seja, uma classe gerencia a pr�pria inst�ncia dela al�m de evitar que qualquer outra classe crie uma inst�ncia dela. Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela. O Padr�o Singleton tamb�m oferece um ponto global de acesso a sua inst�ncia. A pr�pria classe sempre vai oferecer a pr�pria inst�ncia dela e caso n�o tenha ainda uma inst�ncia, ent�o ela mesma cria e retorna essa nova inst�ncia criada.

// o contrutor e private para so instanciarmos dentro desta classe

//é importante para algumas classes ter apenas uma instância a cada momento

//como garantir que uma classe tem apenas uma instância e que esta instância é facilmente acessível?
//variável global assegura acessibilidade mas não unicidade

//melhor maneira é assegurar que a classe assegura a unicidade interceptando as mensagens de criação

