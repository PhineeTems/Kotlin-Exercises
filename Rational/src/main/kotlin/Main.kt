fun main(args: Array<String>) {
    val r1:Rational = Rational(10,5)
    val r2:Rational = Rational(30, 8)
    var table: MutableList<Rational> = arrayListOf(r1,r2)
    table.add(Rational(1,2))
    table.add(Rational(1,8))

    println("R1 = ${r1.toString()}")
    println("R2 = ${r2.toString()}")
    println("R1 + R2 = ${r1.add(r2)}")
    println("R1 * R2 = ${r1.mult(r2)}")
    println("le plus petit est ${Rational.plusPetitRational(table)}")

}