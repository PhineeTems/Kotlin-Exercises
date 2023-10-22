class Rational(num: Int, denom: Int) {
    var num: Int = num
    var denom: Int = denom

    constructor(num: Int) : this(num, 1)

    fun normaliser(): Unit {
        val pgcdValue: Int = pgcd(this.num, this.denom)
        num /= pgcdValue
        denom /= pgcdValue
    }

    fun pgcd(a: Int, b: Int): Int {

        var result: Int = 0
        if (a == 0 || b == 0) {
            result = 1
        } else if (a == b) {
            result = a
        } else if (a < b) {
            result = pgcd(a, b - a)
        } else {
            result = pgcd(a - b, b)
        }

        return result
    }

    fun add(r: Rational): Rational {
        val n: Int = this.num * r.denom + this.denom * r.num
        val d: Int = this.denom * r.denom
        val result: Rational = Rational(n, d)

        result.normaliser()
        return result
    }

    fun mult(r: Rational): Rational {
        val result = Rational(this.num * r.num, this.denom * r.denom)
        result.normaliser()
        return result
    }

    fun div(r: Rational): Rational {
        return this.mult(Rational(r.denom, r.num))
    }

    override fun toString(): String {
        return "$num/$denom"
    }

    companion object{
        fun plusPetitRational(table: MutableList<Rational>): Rational {
            var result: Rational = table[0]
            for (c in table) {
                if (result.num / result.denom.toDouble() > c.num / c.denom.toDouble()) {

                    result = c
                }
            }
            return result
        }
    }
}