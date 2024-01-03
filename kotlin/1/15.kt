import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Print coordinates of the first point: ")
    var x1 = readLine()!!.toDouble()
    var y1 = readLine()!!.toDouble()
    println("Print coordinates of the second point: ")
    var x2 = readLine()!!.toDouble()
    var y2 = readLine()!!.toDouble()
    var chord1 = sqrt((x1*x1)+y1*y1)
    var chord2 = sqrt((x2*x2)+y2*y2)
    if(chord1 > chord2){
        println("The first point is closer to the original point")
    } else if(chord1 > chord2) {
        println("The second point is closer to the original point")
    } else {
        println("The points are identical")
    }
}