package `5`

class stack{
    private var list: MutableList<Double> = mutableListOf()
    fun add(n:Double){
        list.add(n)
    }
    fun free(){
        while(list.size > 0){
            print(list[list.size-1])
            print(" ")
            list.removeAt(list.size-1)
        }
    }
}

fun main() {
    val s = stack()
    while(true){
        print("Добавьте число в стэк или введите не число, чтобы освободить очередь:\n")
        val word = readLine()!!
        if(word.toDoubleOrNull() != null) s.add(word.toDouble())
        else s.free()
    }
}