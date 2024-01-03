fun main(args: Array<String>) {
    print("Enter the code one by one: ")
    var num1 = Integer.valueOf(readLine())
    var num2 = Integer.valueOf(readLine())
    var num3 = Integer.valueOf(readLine())
    var num4 = Integer.valueOf(readLine())
    if ((num1 == 1) and (num2 == 0) and (num3 ==2) and (num4 == 4))
        print("Lock is open")
    else {
        print("Code is incorrect")
    }
}