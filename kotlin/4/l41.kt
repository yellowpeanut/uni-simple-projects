class book(bookname:String, bookauthor:String, bookrelease:String){
    var name = bookname
    var author =  bookauthor
    var release = bookrelease
}

class storage(){
    private var list:MutableList<book> = mutableListOf()
    fun add(name:String, author:String, release:String){
        var b = book(name, author, release)
        list.add(b)
    }
    fun delete(index:Int){
        if(list.size > index){ list.removeAt(index) }
    }
    fun showAll(){
        for(i in 0..list.size-1){
            println("Index: $i\nName: ${list[i].name}\nAuthor: ${list[i].author}\nRelease year: ${list[i].release}\n")
        }
    }
    fun showByName(index:Int){
        println("Index: $index\nName: ${list[index].name}\nAuthor: ${list[index].author}\nRelease year: ${list[index].release}\n")
    }
    fun showByAuthor(name:String){
        for(i in 0..list.size-1){
            if(list[i].name == name) {
                println("Index: $i\nName: ${list[i].name}\nAuthor: ${list[i].author}\nRelease year: ${list[i].release}\n")
            }
        }
    }
    fun showByReleaseYear(release:String){
        for(i in 0..list.size-1){
            if(list[i].release == release) {
                println("Index: $i\nName: ${list[i].name}\nAuthor: ${list[i].author}\nRelease year: ${list[i].release}\n")
            }
        }
    }
}


fun main(args: Array<String>) {
    var stor = storage()
    stor.add("Евгений Онегин", "Пушкин", "1874")
    stor.add("Мы", "Замятин", "1983")
    stor.add("Портрет Дориана Грея", "Уайлд", "1995")
    stor.showAll()
    stor.showByAuthor("Уайлд")
    stor.delete(1)
    stor.showAll()
}