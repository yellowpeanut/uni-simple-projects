fun main(args: Array<String>) {
    var result = 0
    print("Enter the number of packages: ")
    var num1 = Integer.valueOf(readLine())
    print("Enter the mass of each package in kg:\n")
    while (num1!=0){
        val num2 = Integer.valueOf(readLine())
        result += num2
        num1 -= 1
    }
    print("Overall mass: " + result.toString() + " kg")
}