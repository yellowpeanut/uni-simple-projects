fun main(args: Array<String>) {
    println("Enter an integer number: ")
    var num = Integer.valueOf(readLine())
    var c = 0;
    while(num!=0){
        c += 1
        num /= 10
    }
    print("Number of digits: " + c.toString())
}