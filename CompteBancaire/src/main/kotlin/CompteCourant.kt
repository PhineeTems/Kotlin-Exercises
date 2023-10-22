class CompteCourant(num:Int, solde:Int, plancher:Int, tauxAgios: Double, nbJour: Int):Compte(num,solde,plancher) {

    private var tauxAgios: Double = tauxAgios
    private var nbJour: Int = nbJour

    fun calculAgios(): Double{

        var duree: Int = 14 * (nbJour/14)
        return (this.consulterSolde() * duree * tauxAgios)/365
    }
    fun afficher(): Unit{
        println("""
            Compte Courant
                Solde: ${this.consulterSolde()}
                Agios: ${calculAgios()}
        """.trimIndent())
    }
}