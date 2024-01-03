fun main(args: Array<String>) {
    print("Enter an integer number: ")
    var n = Integer.valueOf(readLine())
    var c = 0
    print("Divisors: ")
    for(i in 1..n){
        if(n % i == 0){
            print("$i ")
            c += 1
        }
    }
    print("\nNumber of divisors: $c")
}