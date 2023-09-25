package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Livro livro = new Livro("Livro ABC", "Autor XYZ", new Editora("Editora Z", "(22)2222-2222"), 2023);

        Livro livroClone = livro.clone();
        livroClone.setTitulo("Livro DEF");
        livroClone.getEditora().setNome("Editora Y");
        livroClone.getEditora().setTelefone("(33)3333-3333");

        assertEquals("Livro{titulo='Livro ABC', autor='Autor XYZ', editora=Editora{nome='Editora Z', telefone='(22)2222-2222'}, ano=2023}", livro.toString());
        assertEquals("Livro{titulo='Livro DEF', autor='Autor XYZ', editora=Editora{nome='Editora Y', telefone='(33)3333-3333'}, ano=2023}", livroClone.toString());
    }
}