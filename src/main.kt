fun main(){
    reminder(37,19)
    stmt("Wanjira","19")
    count("Kimney")

fun add(word: String): String{
    var name = "codeHive"
    var combine = (word[4].toString()+ [5]+ [6]+ [7])
    println(combine)
}
}
fun reminder(a:Int, b:Int){
    var modulus= a%b
    println(modulus)
}
fun stmt(name:String,age:String){
    var sentence = ("Hi, my name is $name"+" "+"and I am $age years old")
    println(sentence)
}
fun count(name: String){
    var length = (name.length)
    println(length)
}
