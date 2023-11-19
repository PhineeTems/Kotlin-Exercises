import adn.Fibre
import adn.Nucleotide

fun main(args: Array<String>) {
    val f:Fibre = Fibre(mutableListOf<Nucleotide>(Nucleotide.Adenine,Nucleotide.Thymine,Nucleotide.Thymine,Nucleotide.Cytosine))
    val f2:Fibre = Fibre(mutableListOf<Nucleotide>(Nucleotide.Thymine,Nucleotide.Adenine,Nucleotide.Adenine))
    println(f.nucleoTable)

    println(f.duplicateFibre().nucleoTable)
    println(f.simpleHamming(f2))
}