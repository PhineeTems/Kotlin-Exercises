class CompteEpargne(num:Int, solde:Int, plancher:Int, tauxInteret: Double, nbJour:Int):Compte(num, solde,plancher) {
    var tauxInteret: Double = tauxInteret
    var nbJour: Int = nbJour

    fun calculInteret(): Double{
        var duree: Int = 90 * (nbJour/90)
        return (this.consulterSolde() * duree * tauxInteret)/365
    }
    fun afficher(): Unit{
        println("""
            Compte Courant
                Solde: ${this.consulterSolde()}
                Interet: ${calculInteret()}
        """.trimIndent())

    }
}