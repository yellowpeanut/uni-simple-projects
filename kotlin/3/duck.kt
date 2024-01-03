class Duck{
    private var duckname: String = ""
    private var duckgender: String = ""
    private var duckcolor: String = ""
    private var duckquack: String = ""
    private var duckage: Int = 0
    private var duckweight: Int = 0
    private var duckhappieness: Int = 0

    constructor(name: String, gender: String, color: String, quack: String, age: Int, weight: Int, happieness: Int){
        this.duckname = name
        this.duckgender = gender
        this.duckcolor = color
        this.duckquack = quack
        this.duckage = age
        this.duckweight = weight
        this.duckhappieness = happieness
    }

    fun getName():String{ return duckname}
    fun getGender():String{ return duckgender}
    fun getColor():String{ return duckcolor}
    fun getQuack():String{ return duckquack}
    fun getAge():Int{ return duckage}
    fun getWeight():Int{ return duckweight}
    fun getHappieness():Int{ return duckhappieness}

    fun setName(name:String){ duckname = name}
    fun setGender(gender:String){duckgender = gender}
    fun setColor(color:String){ duckcolor = color}
    fun setQuack(quack:String){ duckquack = quack}
    fun setAge(age:Int){ duckage = age}
    fun setWeight(weight:Int){ duckweight = weight}
    fun setHappieness(happieness:Int){ duckhappieness = happieness}

    fun printAllInfo(){
        print("Name: $duckname\nGender: $duckgender\nColor: $duckcolor\nQuack: $duckquack\nAge: $duckage\nWeight: $duckweight\nHappieness: $duckhappieness\n")
    }
    fun feed(){ duckhappieness += 20; duckweight += 5 }
    fun isMature():Boolean { if(duckage >= 3){return true} else{ return false}}
    fun play(){ duckhappieness += 10}
    fun isOverweight(): Boolean{ if((duckweight >= duckage*10)or(duckage > 100)){return true} else{ return false}}
}


fun main(args: Array<String>) {
    var duck1 = Duck("Richard", "M", "yellow","quaack ...", 3, 24, 56)
    var duck2 = Duck("Mary", "F", "brown","Quack Quack!", 5, 42, 78)
    var duck3 = Duck("Jack", "M", "oat","Quuuaaaack", 4,53, 47)

    duck1.printAllInfo()
    if(duck2.isMature() == true){ print(duck2.getName() + " is mature\n")}
    if(duck3.isOverweight() == false){
        duck3.feed()
    } else {
        duck3.play()
    }
}