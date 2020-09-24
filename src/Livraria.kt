/*
A biblioteca/livraria deve ter os seguintes métodos:

A. Cadastrar Livro - Deve incluir um novo livro com todas as
informações necessárias.

B. Cadastrar Coleção - Deve incluir uma nova coleção com todas as
informações necessárias, incluindo a lista de livros.

C. Consultar Livro/Coleção por código ou por nome - Exibe as
informações sobre o livro/coleção com o código digitado. Se não
existir nenhum livro/coleção com esse código, exibir a mensagem
“Livro/coleção não encontrado”

D. Alugar Livro/Coleção - Altere o estado do livro/coleção para
alugado

E. Efetuar venda (por código) - Se o usuário selecionar esta opção,
ele deve informar o código do livro ou da coleção que será vendido.

F. Verificar estoque - O sistema deve retornar o número de livros
disponíveis, alugados e vendidos e também somar o valor dos livros
* */


class Livraria (var nome: String, var criacao: String){


    var estoque = mutableListOf<Livro>()



    fun cadastrar(livro: Livro){
        estoque.add(livro)
        println("Cadastrado com sucesso!")
    }

    fun consultar(cod: Int){
        estoque.forEach() {
            if (it.cod ==  cod) {
                if (it is Colecao) {
                    println("Colecao encontrada")
                } else {
                    println("Livro encontrado")
                }
            } else {
                println("Não foi encontrado")
            }
        }
    }

    fun consultar(nome: String) {
        estoque.forEach() {
            if (it.titulo.equals(nome)) {
                if (it is Colecao) {
                    println("Colecao encontrada")
                } else {
                    println("Livro encontrado")
                }
            } else {
                println("Não foi encontrado")
            }
        }
    }

    fun alugar(livro: Livro) {

        if (livro.estado != "Alugado") {
            livro.estado = "Alugado"
            println("Livro alugado com sucesso!")
        } else {
            println("Livro indisponivel")
        }
    }

    fun venda(cod: Int){
        estoque.forEach(){
            if(it.cod == cod){
                it.estado = "Vendido"
                println("Vendido")
            }else{ println("Código não encontrado")}
        }
    }


    fun verificar(){
        var soma = 0.0
        var alugados = 0;
        var vendidos = 0;
        var disponiveis = 0;

        estoque.forEach(){
        soma += it.preco
        }

        estoque.forEach(){
            if(it.estado.equals("Alugado")){
                alugados++;
            }else if(it.estado.equals("Disponivel")){
                disponiveis++
            }else{ vendidos++;}

        }

        println("Há $disponiveis livros/coleções disponíveis, $alugados livros/coleções alugados, $vendidos livros/coleções vendidos e o valor total de todos os livros é: $soma")
    }











}