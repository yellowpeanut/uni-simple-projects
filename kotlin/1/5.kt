fun main(args: Array<String>) {
    println("Enter an integer number: ")
    var num = Integer.valueOf(readLine())
    var c = 0;
    while(num!=0){
        if((num%10 == 0) or (num%10 == 5)){
            c += 1
        }
        num /= 10
    }
    print("Number of 0's and 5's : " + c.toString())
}