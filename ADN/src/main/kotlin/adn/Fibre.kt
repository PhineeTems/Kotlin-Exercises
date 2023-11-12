package adn

class Fibre(var nucleoTable:MutableList<Nucleotide>){


    fun emptyFibre(f1: Fibre): Boolean{

       return this.nucleoTable.isEmpty()
    }

    fun duplicateFibre(): Fibre{
        var result: Fibre = Fibre(mutableListOf<Nucleotide>())

        for (fibre in this.nucleoTable){
            result.nucleoTable.add(complementFibre(fibre))
        }
        return result
    }
    fun complementFibre(n: Nucleotide):Nucleotide{
       return when(n){
            Nucleotide.Adenine ->  Nucleotide.Thymine
            Nucleotide.Thymine ->  Nucleotide.Adenine
            Nucleotide.Guanine ->  Nucleotide.Cytosine
            else ->  Nucleotide.Guanine
        }
    }

    fun compareFibre(f: Fibre):Boolean{
        if (this.nucleoTable.size !== f.nucleoTable.size) {
            return false
        }
        else{
            for (i in 0 until this.nucleoTable.size){
                if (this.nucleoTable[i] != complementFibre(f.nucleoTable[i]))
                    return false
            }
        }
        return true
    }
    fun hamming(f: Fibre): Int{
        var result: Int = 0
            for (i in 0 until this.nucleoTable.size){
                if (this.nucleoTable[i] != f.nucleoTable[i])
                    result ++
            }

       return result
    }

}