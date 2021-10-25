fun main(args: Array<String>) {
    var nome = ""
    var idade = 0
    var cargo = ""
    var nacionalidade =""
    var tipo_sanguineo = ""
    print("Qual nome do usuário?")
    nome = readLine()!!.toString()
    print("Qual a idade?")
    idade = readLine()!!.toInt()
    print("Qual sua preferência de emprego?")
    cargo = readLine()!!.toString()
    print("Qual seu tipo sanguíneo?")
    tipo_sanguineo = readLine()!!.toString()
    idade = (2021-idade)
    println("Nome: $nome , \nIdade: $idade anos, \nPreferência de Emprego:$cargo , \nNacionalidade:$nacionalidade , \nTipo Sanguíneo:$tipo_sanguineo")



}