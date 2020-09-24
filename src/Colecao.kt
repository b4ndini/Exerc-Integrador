class Colecao(cod: Int, titulo: String, autor: String, anoLanc: Int, preco: Double, aluguel: Double, estado: String): Livro(cod ,titulo , autor, anoLanc, preco, aluguel, estado){

    val colecaoLivros = mutableListOf<Livro>()

    fun addLivro(livro : Livro) {
        if (livro is Colecao) {
            println("Não foi possível adicionar")
        } else {
            colecaoLivros.add(livro)
        }
    }

    fun imprimeListaLivros(): String{
        var lista = ""
        colecaoLivros.forEach(){
            lista += it.imprimir()
        }
    return lista
    }


        fun imprime(): String{
        var imprimir = super.imprimir() + imprimeListaLivros()
        return imprimir
    }







}