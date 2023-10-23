fun main(args: Array<String>) {
    val c1: Complexe = Complexe(2.0,3.0)
    val c2: Complexe = Complexe(4.0,-5.0)

    println("Complexe 1 : ${c1.toString()}")
    println("Complexe 2 : ${c2.toString()}")
    println("L'addition est : ${c1.add(c2)}")
    println("Le produit est : ${c1.mult(c2)}")

    val table: MutableList<Complexe> = arrayListOf(c1,c2)
    Complexe.autoAddImage(table)
    println("Complexe 1 : ${c1.toString()}")
    println("Complexe 2 : ${c2.toString()}")

}