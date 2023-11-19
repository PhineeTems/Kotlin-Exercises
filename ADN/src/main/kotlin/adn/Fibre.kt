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
        if (this.nucleoTable.size == f.nucleoTable.size){
            for (i in 0 until nucleoTable.size){
                if (this.nucleoTable[i] != f.nucleoTable[i].ComplementFibre()){
                    return false
                }
            }
            return true
        }
        return false
    }
    fun simpleCompareFibre(f: Fibre): Boolean{
        return this.nucleoTable.equals(f.duplicateFibre().nucleoTable)
    }
    fun hamming(f: Fibre): Int{
        var result: Int = 0
        if (this.nucleoTable.size == f.nucleoTable.size){
            for (i in 0 until nucleoTable.size){
                if (this.nucleoTable[i] != f.nucleoTable[i]){
                    result ++
                }
            }
            return result
        }
        else
            return -1
    }
    fun simpleHamming(f: Fibre):Int{
        var result:Int = 0
        try {
            if (this.nucleoTable.size != f.nucleoTable.size){
                throw Exception()
            }
            else{
                for (i in 0 until this.nucleoTable.size){
                    if (this.nucleoTable[i] != f.nucleoTable[i])
                        result ++
                }
            }
        }catch (e:Exception){
            println("les taille ne correspond pas !!")
        }
        return result
    }
}