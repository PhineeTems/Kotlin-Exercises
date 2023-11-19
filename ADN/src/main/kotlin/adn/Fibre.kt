package adn

class Fibre<T>(var nucleoTable:MutableList<T>){
    constructor():this(mutableListOf<T>())

    fun emptyFibre(): Boolean{
        return nucleoTable.isEmpty()
    }

    fun duplicateFibre(): Fibre<T>{
        var result: Fibre<T> = Fibre()

        for (nucl in nucleoTable){
            result.nucleoTable.add(nucl.ComplementFibre())
        }
        return result
    }
    fun compareFibre(f: Fibre<T>):Boolean{
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
    fun simpleCompareFibre(f: Fibre<T>): Boolean{
        return this.nucleoTable.equals(f.duplicateFibre().nucleoTable)
    }
    fun hamming(f: Fibre<T>): Int{
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
    fun simpleHamming(f: Fibre<T>):Int{
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