fun main(args: Array<String>) {
    print("Enter the type of gas ( 92, 95, 98, 90 if diesel ): ")
    var type = Integer.valueOf(readLine())
    print("Enter the size in litres: ")
    var size = Integer.valueOf(readLine())
    if(type == 90)
        print("Your check is " +  (size * 53).toString() + " р")
    else if(type == 92)
        print("Your check is " +  (size * 48).toString() + " р")
    else if(type == 95)
        print("Your check is " +  (size * 51).toString() + " р")
    else if(type == 98)
        print("Your check is " +  (size * 57).toString() + " р")
    else {
        print("Incorrect type")
    }
}