package adn

enum class Nucleid(val code: String){
    Adenine("A"){
        override fun ComplementFibre(): Nucleid{
            return Nucleid.Uracile
        }
        override fun toString(): String {
            return Nucleid.Adenine.code
        }
    },
    Uracile("U"){
        override fun ComplementFibre(): Nucleid {
            return Nucleid.Adenine
        }

        override fun toString(): String {
            return Nucleid.Uracile.code
        }
    },
    Cytosine("C"){
        override fun ComplementFibre(): Nucleid {
            return Nucleid.Guanine
        }
        override fun toString(): String {
            return Nucleid.Cytosine.code
        }
    },
    Guanine("G"){
        override fun ComplementFibre(): Nucleid {
            return Nucleid.Cytosine
        }

        override fun toString(): String {
            return Nucleid.Guanine.code
        }
    };
    abstract fun ComplementFibre():Nucleid
}