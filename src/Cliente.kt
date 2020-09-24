/*
Uma classe Cliente com nome, rg e histórico de aluguéis e compras
 */

class Cliente (var nome: String, val rg: Long){

    val histAluguel = mutableListOf<Livro>()
    val histCompra = mutableListOf<Livro>()
}