import java.lang.Math.sqrt
import java.lang.Math.PI

fun main(args: Array<String>) {
    print("Area of the square: ")
    val ss = readLine()!!.toDouble()
    print("Area of the circle: ")
    val sc = readLine()!!.toDouble()
    if(sqrt(ss) >= sqrt(sc/PI)*2){
        print("Circle will fit in a square!")
    } else {
        print("Circle won't fit in a square!")
    }
}