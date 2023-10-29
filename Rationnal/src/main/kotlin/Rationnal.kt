class Rationnal(num:Int, den:Int){
   var num: Int = num
    var den: Int = den

    constructor(num: Int): this(num,1)

    fun pgcd(a: Int, b:Int):Int{
        if (a==0){
            return b;
        }else if (b==0){
            return a
        }else if (a==b){
            return a
        }else if (a < b){
            return pgcd(a, b-a)
        }else{
            return pgcd(a-b,b)
        }
    }
    fun normaliser(r: Rationnal):Rationnal{
        val pgcdValue: Int = pgcd(r.num,r.den)
        val n: Int = r.num / pgcdValue
        val d: Int = r.den / pgcdValue

        return Rationnal(n,d)
    }
    fun add(r: Rationnal):Rationnal{
        val n: Int = (this.num * r.den) + (r.num * this.den)
        val d: Int = this.den * r.den

        val result: Rationnal = Rationnal(n,d)
        return normaliser(result)
    }

}