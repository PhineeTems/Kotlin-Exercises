package adn

enum class Nucleids(val code: String){
    Adenine("A"){
        override fun ComplementFibre(): Nucleids{
            return Nucleids.Uracile
        }
        override fun toString(): String {
            return Nucleids.Adenine.code
        }
    },
    Uracile("U"){
        override fun ComplementFibre(): Nucleids {
            return Nucleids.Adenine
        }

        override fun toString(): String {
            return Nucleids.Uracile.code
        }
    },
    Cytosine("C"){
        override fun ComplementFibre(): Nucleids {
            return Nucleids.Guanine
        }
        override fun toString(): String {
            return Nucleids.Cytosine.code
        }
    },
    Guanine("G"){
        override fun ComplementFibre(): Nucleids {
            return Nucleids.Cytosine
        }

        override fun toString(): String {
            return Nucleids.Guanine.code
        }
    };
    abstract fun ComplementFibre():Nucleids
}