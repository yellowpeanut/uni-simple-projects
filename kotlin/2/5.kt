fun gcd(a: Int,b: Int):Int {
    if (a == b)
        return a
    if (a > b)
        return gcd(a-b, b)
    return gcd(a, b-a)
}

fun main(args: Array<String>) {
    println("Enter a and b:")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    print("Greatest common divisor of $a and $b is: " + (gcd(a,b)).toString())
}