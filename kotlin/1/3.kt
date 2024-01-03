fun main(args: Array<String>) {
    print("Enter number of day: ")
    val day = Integer.valueOf(readLine())
    if(day%7 == 1){
        print("Monday")
    } else if(day%7 == 2){
        print("Tuesday")
    } else if(day%7 == 3){
        print("Wednesday")
    } else if(day%7 == 4){
        print("Thursday")
    } else if(day%7 == 5){
        print("Friday")
    } else if(day%7 == 6){
        print("Saturday")
    } else if(day%7 == 0){
        print("Sunday")
    }
}