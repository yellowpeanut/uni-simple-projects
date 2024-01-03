fun pali(n:Int):Boolean{
    var nn = n
    var poly = nn%10
    nn /= 10
    while(nn > 0){
        poly = poly*10 + nn%10
        nn /= 10
    }
    if(poly == n){
        return true
    } else {
        return false
    }
}

fun main(args: Array<String>) {
    println("Enter two integer numbers:")
    var n1 = readLine()!!.toInt()
    var n2 = readLine()!!.toInt()
    if(pali(n1)==true){
        print("First number is a palindrome\n")
    } else {
        print("First number isn't a palindrome\n")
    }
    if(pali(n2)==true){
        print("Second number is a palindrome")
    } else {
        print("Second number isn't a palindrome")
    }
}