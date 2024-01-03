import java.lang.Math.abs
fun main(args: Array<String>) {
    println("Print coordinates of the first point: ")
    var x1 = readLine()!!.toDouble()
    var y1 = readLine()!!.toDouble()
    println("Print coordinates of the second point: ")
    var x2 = readLine()!!.toDouble()
    var y2 = readLine()!!.toDouble()
    println("Print coordinates of the third point: ")
    var x3 = readLine()!!.toDouble()
    var y3 = readLine()!!.toDouble()
    println("Area of the triangle: " + (0.5*(abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)))).toString())
}