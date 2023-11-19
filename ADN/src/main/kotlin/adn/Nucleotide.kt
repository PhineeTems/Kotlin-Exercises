package adn

enum class Nucleotide(val code:String) {
    Adenine("A"){
        override fun ComplementFibre(): Nucleotide{
            return Nucleotide.Thymine
        }
        override fun toString(): String {
            return Nucleotide.Adenine.code
        }
    },
    Thymine("T"){
        override fun ComplementFibre(): Nucleotide {
            return Nucleotide.Adenine
        }

        override fun toString(): String {
            return Nucleotide.Thymine.code
        }
    },
    Cytosine("C"){
        override fun ComplementFibre(): Nucleotide {
            return Nucleotide.Guanine
        }
        override fun toString(): String {
            return Nucleotide.Cytosine.code
        }
    },
    Guanine("G"){
        override fun ComplementFibre(): Nucleotide {
            return Nucleotide.Cytosine
        }

        override fun toString(): String {
            return Nucleotide.Guanine.code
        }
    };
    abstract fun ComplementFibre():Nucleotide
}