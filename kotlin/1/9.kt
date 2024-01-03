fun main(args: Array<String>) {
    var ameoba = 1
    var t = 0
    while(t<=24){
        print("After " + t.toString() + " hours there will be " + ameoba.toString() + " ameobes\n")
        ameoba *= 2
        t += 3
    }
}