fun digitsum(n: Int, sum: Int = 0): Int{
    var nn = n
    var s = sum
    if(nn != 0){
        s += nn%10
        nn/=10
        return digitsum(nn,s)
    } else {
        return s
    }
}

fun main(args: Array<String>) {
    println("Enter an integer number:")
    var n = readLine()!!.toInt()
    print("Sum of the digits in the number: " + digitsum(n).toString())
}