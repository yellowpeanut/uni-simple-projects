class good(goodname:String, goodprice:Int){
    var name = goodname
    var price =  goodprice
}

class shopkeeper(list:MutableList<good>){
    private var list:MutableList<good> = list
    fun showAll(){
        for(i in 0..list.size-1){
            println("Index: $i\nName: ${list[i].name}\nPrice: ${list[i].price}\n")
        }
    }
    fun getGood(id:Int):good{ return list[id] }
}

class person(money:Int){
    var list:MutableList<good> = mutableListOf()
    var money = money
    fun buy(shopkeeper:shopkeeper, id: Int){
        if(money >= shopkeeper.getGood(id).price){
            list.add(shopkeeper.getGood(id))
            money -= shopkeeper.getGood(id).price
        } else {
            print("Not enough money!\n")
        }
    }
    fun showAll(){
        for(i in 0..list.size-1){
            println("Index: $i\nName: ${list[i].name}\nPrice: ${list[i].price}\n")
        }
    }
}


fun main(args: Array<String>) {
    var g1 = good("Bread", 20)
    var g2 = good("Milk", 80)
    var g3 = good("Cheese", 180)
    var goodlist:MutableList<good> = mutableListOf(g1,g2,g3)
    var sk = shopkeeper(goodlist)
    var person = person(350)
    sk.showAll()
    person.buy(sk, 0)
    person.buy(sk, 1)
    person.buy(sk, 2)
    person.buy(sk, 0)
    person.buy(sk, 2)
    person.showAll()
}