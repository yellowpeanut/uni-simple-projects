fun main(args: Array<String>) {
    val a = Array(10, {(-100 until 100).random()} )
    println("Array: ")
    for(i in a){
        println(i.toString() + " ")
    }
    var c = 0
    for(i in a){
        if(i>0){
            c+=1
        }
    }
    if(c>=5){
        println("Quantity of positive numbers in array >= 5")
    } else {
        println("Quantity of positive numbers in array < 5")
    }
}
