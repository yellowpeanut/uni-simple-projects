fun main(args: Array<String>) {
    print("Enter the monthly overall phone call length: ")
    var num1 = Integer.valueOf(readLine())
    if (num1 > 500)
        print(("Your check is: ") + ((num1 - 500) * 2 + 350) + ("р"))
    else {
        print("Your check is 350р")

    }
}

