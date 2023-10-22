fun helloWord(): String{
    return "Hello World!!!!"
}
fun add(a: Int,b: Int): Int{

    return a + b
}
fun pair(a: Int): Boolean{
    if (a % 2 == 0){
        return true
    }else
        return false
}
fun sommeChiffre(a: Int): Int{
    var s: Int = 0
    var n: Int = a
    while (n>0){
        s += n % 10
        n = n/10

    }
    return s
}
fun premier(a: Int):Boolean{

}

fun main(args: Array<String>) {
    var t: Int = 2583
    println("la somme des chiffre = ${sommeChiffre(t)}")
}