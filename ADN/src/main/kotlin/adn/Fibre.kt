package adn

class Fibre(var nucleoTable:MutableList<Nucleotide>){
    constructor():this(mutableListOf<Nucleotide>())

    fun emptyFibre(): Boolean{
        return nucleoTable.isEmpty()
    }

    fun duplicateFibre(): Fibre{
        var result: Fibre = Fibre()

        for (nucl in nucleoTable){
            result.nucleoTable.add(nucl.ComplementFibre())
        }
        return result
    }
    fun compareFibre(f: Fibre):Boolean{
        if (this.nucleoTable.size !== f.nucleoTable.size) {
            return false
        }
        else{
            for (i in 0 until this.nucleoTable.size){
                if (this.nucleoTable[i] != f.nucleoTable[i].ComplementFibre())
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