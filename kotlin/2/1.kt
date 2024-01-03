fun min(x: Double, y: Double): Double{
    if(x < y){
        return x
    } else {
        return y
    }
}

fun main(args: Array<String>) {
    println("Enter a: ")
    var a = readLine()!!.toDouble()
    println("Enter b: ")
    var b = readLine()!!.toDouble()
    var z = min(a, 3*b) * min(2*a-b, 2*b)
    print("z = " + z.toString())
}