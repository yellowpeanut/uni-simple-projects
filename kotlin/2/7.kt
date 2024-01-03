fun digroot(n: Int):Int{
    var nn = n
    var s = 0
    if(n > 10){
        while(nn > 0){
            s += nn%10
            nn/=10
        }
        return digroot(s)
    } else {
        return n
    }
}

fun main(args: Array<String>) {
    println("Enter an integer number:")
    var n = readLine()!!.toInt()
    print("Digit root of the number: " + digroot(n).toString())
}