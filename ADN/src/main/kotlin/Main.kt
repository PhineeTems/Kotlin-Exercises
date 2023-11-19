import adn.Fibre
import adn.Nucleotide

fun main(args: Array<String>) {
    val f:Fibre = Fibre(mutableListOf<Nucleotide>(Nucleotide.Adenine,Nucleotide.Thymine,Nucleotide.Thymine,Nucleotide.Cytosine))

    println(f.nucleoTable)

    println(f.duplicateFibre().nucleoTable)
}