
class aviary(name:String, quantity:Int, gender:String, sound:String){
    private var name = name
    private var quantity = quantity
    private var gender = gender
    private var sound = sound
    fun showAll(){
        println("\nAviary name: ${name}\nQauntity of species: ${quantity}\nGender: ${gender}\nSounds: ${sound}\n")
    }
}

fun main(args: Array<String>) {
    var a1 = aviary("Savannah lions",2, "male", "Roar")
    var a2 = aviary("Arctic penguins",4, "male", "Peep")
    var a3 = aviary("Borean wolves",3, "female", "Growl")
    var a4 = aviary("Ethiopian camels",5, "male", "Nuzz")
    while(true) {
        print("Choose an aviary from 1 to 4: ")
        var ch = readLine()!!.toInt()
        if(ch == 1){a1.showAll()}
        else if(ch == 2){a2.showAll()}
        else if(ch == 3){a3.showAll()}
        else if(ch == 4){a4.showAll()}
        else{break}
    }
}