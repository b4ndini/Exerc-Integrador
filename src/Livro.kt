/*
Uma classe Livro com código, título, autor, ano de lançamento, preço de
venda, preço de aluguel (por dia) e estado atual (disponível, alugado ou
vendido)
*/

open class Livro (var cod: Int, var titulo: String, var autor: String, var anoLanc: Int, var preco: Double, var aluguel: Double, var estado: String){

    fun imprimir():String{
        var imprime = "\nCódigo: $cod, Título: $titulo, Autor:$autor, Ano lançamento: $anoLanc, Preço: $preco, Valor do Aluguel: $aluguel, Estado: $estado"
        return imprime
    }


}