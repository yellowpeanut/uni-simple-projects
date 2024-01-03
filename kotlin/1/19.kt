fun main(args: Array<String>) {
    print("Enter the age: ")
    var num1 = Integer.valueOf(readLine())
    if ((num1 >= 0) and (num1 < 6))
        print("It is a preschool age")
    else if ((num1 > 7) and (num1 < 18))
        print("It is a school age")
    else if ((num1 > 19) and (num1 < 59))
        print("It is a workman age")
    else if ((num1 > 60) and (num1 < 130))
        print("It is a retiree age")
    else {
        print("The age is incorrect")
    }
}
