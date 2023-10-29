class Complexe(r:Double, i:Double) {
    var r: Double = r
    var i: Double = i

    override fun toString(): String {
         if (i < 0)
             return "$r $i i"
        else
            return "$r + $i i"
    }
    fun add(c: Complexe):Complexe{

        return Complexe(this.r + c.r, this.i + c.i)
    }
    fun mult(c: Complexe):Complexe{
        val re: Double = (this.r * c.r) - (this.i * c.i)
        val im: Double = (this.r * c.i) + (this.i * c.i)

        return Complexe(re,im)
    }
    companion object{
        fun autoAddImage(table: MutableList<Complexe>):Unit{
            for (c in table){
                c.i += 1
            }
        }
    }
}