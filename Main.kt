fun main(args: Array<String>) {
    val Cassiano = Estudantes(primeiroNome = "Cassiano", ultimoNome = "Luiz", ra = 13, nota = 50.0, ano = 2)

    val Caroline = Estudantes(primeiroNome = "Caroline", ultimoNome = "Souza", ra = 14, nota = 55.0, ano = 3)

    val Carlos = Estudantes(primeiroNome = "Carlos", ultimoNome = "Luiz", ra = 15, nota = 60.0, ano = 1)

    Cassiano.primeiroNome
    Cassiano.mudarAnoSeAprovado()

    val CursoMobile = Curso("inglês", "glebildon", 1)

    CursoMobile.cadastrar(Carlos)
    CursoMobile.cadastrar(Caroline)

    CursoMobile.numEstudantesCadastrados()

    CursoMobile.removerEstudante(Cassiano)
    val Estudantes: Array<Estudantes?> = arrayOf(Caroline, Carlos)

    CursoMobile.cadastrar(Estudantes)

    CursoMobile.numEstudantesCadastrados()

    CursoMobile.melhorNota()

    CursoMobile.mostrarEstudantes()

}