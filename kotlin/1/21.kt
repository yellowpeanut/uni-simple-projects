fun main(args: Array<String>) {
    print("Enter the fibonacci's number order: ")
    var num = Integer.valueOf(readLine())
    var t1 = 0
    var t2 = 1
    var res = 0
    for (i in 2..num) {
        res = t1 + t2
        t1 = t2
        t2 = res
    }
    print(t1)
}