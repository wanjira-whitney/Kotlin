fun main(){
    reminder(37,19)
    stmt("Wanjira","19")
    count("Kimney")
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
