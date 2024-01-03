fun main(args: Array<String>) {
    println("Enter the quantity of numbers: ")
    val m = Integer.valueOf(readLine())
    var c = 0
    println("Enter numbers: ")
    for(i in 1..m){
        val n = Integer.valueOf(readLine())
        if(n>0){
            c+=1
        }
    }
    println("Quantity of positive numbers: " + c.toString())
}