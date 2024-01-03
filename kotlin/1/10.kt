fun main(args: Array<String>) {
    val m = 10
    val a = Array(m, {i -> i*2-1} )
    println("Array: ")
    for(i in a){
        println(i.toString() + " ")
    }
    println("Enter n: ")
    val n = Integer.valueOf(readLine())
    var c = 0
    for(i in a){
        if(i%n==0){
            c+=1
        }
    }
    println("Multiples of n: " + c.toString())
}
