open class Compte(num:Int, solde:Int, plancher:Int){
    private var num: Int = num
    private var solde: Int = solde
    private var plancher: Int = plancher

     fun consulterSolde():Int{
        return this.solde
    }
     fun crediterCompte(montant: Int): Unit{
        this.solde += montant
    }
    fun debiterCompte(montant: Int): Boolean{
      if (solde - plancher - montant >=0){
          solde -= montant
          return true
    }
    return false
    }

}