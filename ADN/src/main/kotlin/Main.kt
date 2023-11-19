import adn.Fibre
import adn.Nucleotide

fun main(args: Array<String>) {
    val f:Fibre = Fibre(mutableListOf<Nucleotide>(Nucleotide.Adenine,Nucleotide.Thymine,Nucleotide.Thymine,Nucleotide.Cytosine))
    val f2:Fibre = Fibre(mutableListOf<Nucleotide>(Nucleotide.Thymine,Nucleotide.Adenine,Nucleotide.Adenine,Nucleotide.Guanine))
    println(f.nucleoTable)

    println(f.duplicateFibre().nucleoTable)
    println(f.simpleCompareFibre(f2))
}