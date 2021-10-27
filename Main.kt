fun main(args: Array<String>) {
    print("digite um valor para calcularmos sua tabuada:")
    var num = readLine()!!.toInt()
    for (i in 1 downTo 10) {
        println("$num x $i =${num * i}")
    }
     }