package com.dutrajy.FinancasPessoais;

public class App
{
    public static void main( String[] args )
    {
        GerenciadorFinanceiroPessoal gerenciador = new GerenciadorFinanceiroPessoal();

        Categoria limpeza = new Categoria("Limpeza");
        Categoria alimentacao = new Categoria("Alimentação");
        Categoria transporte = new Categoria("Transporte");
        Categoria educacao = new Categoria("Educação");

        Categoria salario = new Categoria("Salário");
        Categoria freelances = new Categoria("Freelances");

        gerenciador.adicionarCategoria(limpeza);
        gerenciador.adicionarCategoria(alimentacao);
        gerenciador.adicionarCategoria(transporte);
        gerenciador.adicionarCategoria(educacao);
        gerenciador.adicionarCategoria(salario);
        gerenciador.adicionarCategoria(freelances);


    }
}
