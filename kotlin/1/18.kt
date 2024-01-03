import javax.management.Query.or
fun main(args: Array<String>) {
    var m31 = arrayOf(1,3,5,7,8,10,12)
    var m30 = arrayOf(4,6,9,11)
    print("Enter the day: ")
    val day = Integer.valueOf(readLine())
    print("Enter the month: ")
    val month = Integer.valueOf(readLine())
    if (month in m31) {
        if ((day < 32) and (day > 0))
            print("Date is correct")
        else {
            print("Date is incorrect")
        }
    }
    else if (month in m30){
        if ((day < 31) and (day > 0))
            print("Date is correct")
        else {
            print("Date is incorrect")
        }
    }
    else if (month == 2) {
        if ((day < 30) and(day > 0))
            print("Date is correct")
        else {
            print("Date is incorrect")
        }
    }
}
