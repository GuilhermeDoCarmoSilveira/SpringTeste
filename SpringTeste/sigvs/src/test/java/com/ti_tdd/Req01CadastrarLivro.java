package com.ti_model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Req01CadastrarLivro {
    
    Biblioteca biblioteca;

    @Test
    public void CadastrarLivroComSucesso(){
        //dado que o dados do livro foi inserido pelo usuario 
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("Eng. software", "Pressman");
        //quando o usuario confirma a alteração
        biblioteca.save(livro);
        //entaão o livro fica disponivel para consulta
        assertEquals(1, biblioteca.size());
    }
}
