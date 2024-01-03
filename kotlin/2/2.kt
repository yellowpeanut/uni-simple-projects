import kotlin.math.sqrt

fun length(x: Double, y: Double): Double{
    return sqrt(x*x+y*y)
}

fun main(args: Array<String>) {
    println("Enter coordinates of the first point:")
    var x1 = readLine()!!.toDouble()
    var y1 = readLine()!!.toDouble()
    println("Enter coordinates of the second point:")
    var x2 = readLine()!!.toDouble()
    var y2 = readLine()!!.toDouble()
    println("Enter coordinates of the third point:")
    var x3 = readLine()!!.toDouble()
    var y3 = readLine()!!.toDouble()
    var p = length(x1,y1)+length(x2,y2)+length(x3,y3)
    print("Perimeter is $p")
}