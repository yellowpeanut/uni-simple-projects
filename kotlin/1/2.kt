
fun main(args: Array<String>) {
    print("Enter a two digit number: ")
    val num = Integer.valueOf(readLine())
    val d1 = num/10
    val d2 = num%10
    if(num*num == (d1*d1*d1+d2*d2*d2)*4){
        print("True")
    } else {
        print("False")
    }
}