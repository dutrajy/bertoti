package com.dutrajy.FinancasPessoais;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class GerenciadorFinanceiroPessoal {
    private List<Lancamento> receitas;
    private List<Lancamento> despesas;
    private List<Categoria> categorias;

    public GerenciadorFinanceiroPessoal() {
        receitas = new ArrayList<>();
        despesas = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public List<Lancamento> getReceitas() {
        return this.receitas;
    }

    public void adicionarReceita(Lancamento receita) {
        receitas.add(receita);
    }

    public void removerReceita(int indice) {
        if (indice >= 0 && indice < receitas.size()) {
            receitas.remove(indice);
        }
    }

    public List<Lancamento> getDespesas() {
        return this.despesas;
    }

    public void adicionarDespesa(Lancamento despesa) {
        despesas.add(despesa);
    }

    public void removerDespesa(int indice) {
        if (indice >= 0 && indice < despesas.size()) {
            despesas.remove(indice);
        }
    }

    public List<Categoria> getCategorias() {
        return this.categorias;
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(int indice) {
        if (indice >= 0 && indice < categorias.size()) {
            categorias.remove(indice);
        }
    }

    public void removerDespesasDaCategoria(Categoria categoria) {
        ArrayList<Lancamento> despesasFiltradas = new ArrayList<>();

        for (Lancamento despesa: despesas) {
            if (!despesa.getCategoria().equals(categoria)) {
                despesasFiltradas.add(despesa);
            }
        }

        this.despesas = despesasFiltradas;
    }

    public void removerReceitasDaCategoria(Categoria categoria) {
        ArrayList<Lancamento> receitasFiltradas = new ArrayList<>();

        for (Lancamento receita: receitas) {
            if (!receita.getCategoria().equals(categoria)) {
                receitasFiltradas.add(receita);
            }
        }

        this.receitas = receitasFiltradas;
    }

    public String getRelatorio(Date inicio, Date fim) {
        List<Lancamento> todoOsLancamentos = new ArrayList<>();

        for (Lancamento despesa: despesas) {
            if (
                despesa.getData().compareTo(inicio) >= 0
                && despesa.getData().compareTo(fim) <= 0
            ) {
                todoOsLancamentos.add(despesa);
            }
        }

        for (Lancamento receita: receitas) {
            if (
                receita.getData().compareTo(inicio) >= 0
                && receita.getData().compareTo(fim) <= 0
            ) {
                todoOsLancamentos.add(receita);
            }
        }

        todoOsLancamentos.sort((l1, l2) -> {
            return l1.getData().compareTo(l2.getData());
        });

        StringBuilder csv = new StringBuilder("Nome,Categoria,Valor,Data");

        for(Lancamento lancamento: todoOsLancamentos) {
            String nomeDoLancamento = lancamento.getNome();
            String nomeDaCategoria = lancamento.getCategoria().getNome();
            float valorComSinal = lancamento.getTipo().equals("despesa") ? - lancamento.getValor() : lancamento.getValor();
            String valorDoLancamento = String.format("%.2f", valorComSinal);
            String dataDoLancamento = (new SimpleDateFormat("yyyy-MM-dd")).format(lancamento.getData());

            csv.append(
                "\n" + nomeDoLancamento
                + "," + nomeDaCategoria
                + "," + valorDoLancamento
                + "," + dataDoLancamento
            );
        }

        return csv.toString();
    }

    public float getSaldoEm(Date data) {
        float saldo = 0;
        for (Lancamento receita : receitas) {
            if (receita.getData().compareTo(data) <= 0) {
                saldo += receita.getValor();
            }
        }
        for (Lancamento despesa : despesas) {
            if (despesa.getData().compareTo(data) <= 0) {
                saldo -= despesa.getValor();
            }
        }
        return saldo;
    }
}