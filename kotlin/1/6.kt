import java.lang.Math.pow
fun main(args: Array<String>) {
    println("Enter an integer number: ")
    var num = Integer.valueOf(readLine())
    var c = 0
    var num2 = 0
    while(num > pow(10.0,c.toDouble())){
        c+=1
    }
    c -= 1
    while(c>=0){
        num2 += num%10*pow(10.0,c.toDouble()).toInt()
        num /= 10
        c -= 1
    }
    print("Number read right to left : " + num2.toString())
}