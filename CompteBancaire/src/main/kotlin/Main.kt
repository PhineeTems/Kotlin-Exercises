fun main(args: Array<String>) {
   val c1: CompteCourant = CompteCourant(1,10000, 1000, 0.05, 22)
    val c2: CompteEpargne = CompteEpargne(2,50000,1000,0.05,50)

    println("Solde de compte 1 : ${c1.consulterSolde()}")
    println("Solde de compte 2 : ${c2.consulterSolde()}")

    c1.crediterCompte(10000)
    c2.crediterCompte(10000)

    println("Solde de compte 1 : ${c1.consulterSolde()}")
    println("Solde de compte 2 : ${c2.consulterSolde()}")

    println("Debiter : ${c1.debiterCompte(10000)} Nouveau solde : ${c1.consulterSolde()}")
    println("Debiter : ${c2.debiterCompte(10000)} Nouveau solde : ${c2.consulterSolde()}")




}