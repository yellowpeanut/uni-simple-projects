fun main(args: Array<String>) {
    print("Enter the numbers range:\n")
    var K = Integer.valueOf(readLine())
    var M = Integer.valueOf(readLine())
    var f = 1
    if(M < 1) {
        print("The range is incorrect")
        f = 0
    }
    if(f == 1){
        print("Integers in range:\n")
        if(K < 1) {
            K = 1
        }
        for(i in K..M){
            print(i.toString() + " ")
        }
    }
}