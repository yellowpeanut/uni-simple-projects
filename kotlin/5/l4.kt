package `5`

fun showAll(l1: List<String>, l2: List<String>){
    println("Товары первого пользователя:")
    for(i in l1){ println(i) }
    println("Товары второго пользователя:")
    for(i in l2){ println(i) }
}

fun showUnique1(l1: List<String>, l2: List<String>){
    var l = mutableListOf<String>()
    for(i in l1){
        if(i in l2) continue
        else l.add(i)
    }
    println("Уникальные товары первого пользователя:")
    for(i in l){ println(i) }
}

fun showUnique2(l1: List<String>, l2: List<String>){
    var l = mutableListOf<String>()
    for(i in l2){
        if(i in l1) continue
        else l.add(i)
    }
    println("Уникальные товары второго пользователя:")
    for(i in l){ println(i) }
}

fun showSame(l1: List<String>, l2: List<String>){
    var l = mutableListOf<String>()
    for(i in l1){
        if(i in l2) l.add(i)
    }
    println("Одинаковые товары первого и второго пользователей:")
    for(i in l){ println(i) }
}

fun main(args: Array<String>) {
    var l1 = mutableListOf<String>()
    var l2 = mutableListOf<String>()
    println("Введите товары первого пользователя или 0 для остановки:")
    var k = readLine()
    while(k!="0"){
        l1.add(k.toString())
        k = readLine()
    }
    println("Введите товары второго пользователя или 0 для остановки:")
    k = readLine()
    while(k!="0"){
        l2.add(k.toString())
        k = readLine()
    }
    showAll(l1,l2);showUnique1(l1,l2);showUnique2(l1,l2);showSame(l1,l2)
}
