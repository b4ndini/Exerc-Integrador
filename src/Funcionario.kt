/*
Uma classe Funcionário com nome, rg e histórico dos aluguéis e vendas
 */

class Funcionario(var nome: String, val rg: Long) {
    val histAluguel = mutableListOf<Livro>()
    val histVenda = mutableListOf<Livro>()
}