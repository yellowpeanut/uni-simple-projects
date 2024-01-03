fun main(args: Array<String>) {
    print("Enter numerator: ")
    var num = Integer.valueOf(readLine())
    print("Enter denominator: ")
    var denum = Integer.valueOf(readLine())
    if (num >= denum) {
        print("The fraction is proper")
    }
    else {
        print("The fraction is improper")
    }
}