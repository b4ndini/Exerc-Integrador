fun main(){

    var l1 = Livro(1, "Fome", "Knut Hamsun", 1930, 30.0, 5.0, "Disponivel")
    var l2 = Livro(2, "V for Vendetta", "Alan Moore", 1990, 35.0, 5.0, "Disponivel")
    var l3 = Livro(3, "Swamp Thing", "Alan Moore", 1980, 40.0, 7.0, "Disponivel")
    var l4 = Colecao(4, "Coleção Alan Moore", "Alan Moore", 2000, 100.0, 15.0, "Disponivel")

    var livraria = Livraria("Livraria X", "23/09/2020")

    l4.addLivro(l3)
    l4.addLivro(l2)
    livraria.cadastrar(l1)
    livraria.cadastrar(l4)

    println("=========================")

    println(l4.imprime())
    println(l1.imprimir())
    println("=========================")
    livraria.consultar("Fome")
    livraria.verificar()
    livraria.venda(1)
    println("=========================")
    livraria.verificar()











}