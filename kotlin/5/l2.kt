package `5`

class queue{
    private var list: MutableList<Double> = mutableListOf()
    fun add(n:Double){
        list.add(n)
    }
    fun free(){
        while(list.size > 0){
            print(list[0])
            print(" ")
            list.removeAt(0)
        }
    }
}

fun main() {
    val q = queue()
    while(true){
        print("Добавьте число в очередь или введите не число, чтобы освободить очередь:\n")
        val word = readLine()!!
        if(word.toDoubleOrNull() != null) q.add(word.toDouble())
        else q.free()
    }
}