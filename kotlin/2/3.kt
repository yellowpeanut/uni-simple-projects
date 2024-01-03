fun pow5(n: Int):Boolean{
    var p = 1
    while(n >= p){
        if(n==p){
            return true
        }
        p *= 5
    }
    return false
}

fun main(args: Array<String>) {
    println("Enter the size of the array:")
    var n = readLine()!!.toInt()
    var arr = Array(n, {i -> (1..255).random()})
    var c = 0
    for(i in 0..n-1){
        if(pow5(arr[i])==true){
            c += 1
        }
    }
    print("Array:\n")
    for(i in 0..n-1) {
        print(arr[i].toString() + " ")
    }
    print("\nQuantity of numbers that are power of 5: $c")
}