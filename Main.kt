fun main(args: Array<String>) {
    println("Hello World!")
    var menor = 0
    var media = 5
    var maior = 10
    print("digite um numero para fazermos a soma de 0 até ele.")
    menor = readLine()!!.toInt()

        media++
        maior += media
    while(media <= menor)
        println("a soma de todos os numeros de 0 até $menor é $maior") }