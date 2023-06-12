package com.dutrajy.FinancasPessoais;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GerenciadorFinanceiroPessoalTest {

    private GerenciadorFinanceiroPessoal gerenciador;

    @Before
    public void setUp() {
        gerenciador = new GerenciadorFinanceiroPessoal();
    }

    @Test
    public void testAdicionarReceita() {
        Lancamento receita = new Lancamento("Salário", new Categoria("Recebimentos"), 2000, "receita", new Date());
        gerenciador.adicionarReceita(receita);
        Assert.assertEquals(1, gerenciador.getReceitas().size());
    }

    @Test
    public void testRemoverReceita() {
        Lancamento receita = new Lancamento("Salário", new Categoria("Recebimentos"), 2000, "receita", new Date());
        gerenciador.adicionarReceita(receita);
        gerenciador.removerReceita(0);
        Assert.assertEquals(0, gerenciador.getReceitas().size());
    }

    @Test
    public void testAdicionarDespesa() {
        Lancamento despesa = new Lancamento("Aluguel", new Categoria("Moradia"), 800, "despesa", new Date());
        gerenciador.adicionarDespesa(despesa);
        Assert.assertEquals(1, gerenciador.getDespesas().size());
    }

    @Test
    public void testRemoverDespesa() {
        Lancamento despesa = new Lancamento("Aluguel", new Categoria("Moradia"), 800, "despesa", new Date());
        gerenciador.adicionarDespesa(despesa);
        gerenciador.removerDespesa(0);
        Assert.assertEquals(0, gerenciador.getDespesas().size());
    }

    @Test
    public void testAdicionarCategoria() {
        Categoria categoria = new Categoria("Transporte");
        gerenciador.adicionarCategoria(categoria);
        Assert.assertEquals(1, gerenciador.getCategorias().size());
    }

    @Test
    public void testRemoverCategoria() {
        Categoria categoria = new Categoria("Transporte");
        gerenciador.adicionarCategoria(categoria);
        gerenciador.removerCategoria(0);
        Assert.assertEquals(0, gerenciador.getCategorias().size());
    }

    @Test
    public void testRemoverDespesasDaCategoria() {
        Categoria categoria = new Categoria("Alimentação");
        Lancamento despesa1 = new Lancamento("Supermercado", categoria, 150, "despesa", new Date());
        Lancamento despesa2 = new Lancamento("Restaurante", categoria, 50, "despesa", new Date());
        gerenciador.adicionarDespesa(despesa1);
        gerenciador.adicionarDespesa(despesa2);
        gerenciador.removerDespesasDaCategoria(categoria);
        Assert.assertEquals(0, gerenciador.getDespesas().size());
    }

    @Test
    public void testRemoverReceitasDaCategoria() {
        Categoria categoria = new Categoria("Salário");
        Lancamento receita1 = new Lancamento("Salário Mensal", categoria, 2000, "receita", new Date());
        Lancamento receita2 = new Lancamento("Bônus", categoria, 500, "receita", new Date());
        gerenciador.adicionarReceita(receita1);
        gerenciador.adicionarReceita(receita2);
        gerenciador.removerReceitasDaCategoria(categoria);
        Assert.assertEquals(0, gerenciador.getReceitas().size());
    }

    @Test
    public void testGetRelatorio() {
        Lancamento despesa1 = new Lancamento("Supermercado", new Categoria("Alimentação"), 150, "despesa", new Date());
        Lancamento receita1 = new Lancamento("Salário", new Categoria("Recebimentos"), 2000, "receita", new Date());
        gerenciador.adicionarDespesa(despesa1);
        gerenciador.adicionarReceita(receita1);
        String relatorio = gerenciador.getRelatorio(new Date(2023 - 1900, 5, 1), new Date(2023 - 1900, 5, 31));
        Assert.assertNotNull(relatorio);
        Assert.assertNotEquals(relatorio, "");
    }

    @Test
    public void testGetRelatorioCSV() {
        Lancamento despesa1 = new Lancamento("Supermercado", new Categoria("Alimentação"), 150, "despesa", new Date(2023 - 1900, 5, 15));
        Lancamento receita1 = new Lancamento("Salário", new Categoria("Recebimentos"), 2000, "receita", new Date(2023 - 1900, 5, 5));
        gerenciador.adicionarDespesa(despesa1);
        gerenciador.adicionarReceita(receita1);

        String relatorio = gerenciador.getRelatorio(new Date(2023 - 1900, 5, 1), new Date(2023 - 1900, 5, 31));

        String csvEsperado = "Nome,Categoria,Valor,Data\n" +
                "Salário,Recebimentos,2000.00,2023-06-05\n" +
                "Supermercado,Alimentação,-150.00,2023-06-15";

        Assert.assertEquals(csvEsperado, relatorio);
    }

    @Test
    public void testGetSaldoEm() {
        Lancamento receita1 = new Lancamento("Salário", new Categoria("Recebimentos"), 2000, "receita", new Date());
        Lancamento despesa1 = new Lancamento("Aluguel", new Categoria("Moradia"), 800, "despesa", new Date());
        gerenciador.adicionarReceita(receita1);
        gerenciador.adicionarDespesa(despesa1);
        float saldo = gerenciador.getSaldoEm(new Date());
        Assert.assertEquals(1200, saldo, 0);
    }
}