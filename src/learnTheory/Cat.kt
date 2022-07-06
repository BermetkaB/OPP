package learnTheory

class Cat(name:String):Animal("Kitty",3.7f,"Dry") {

    override fun run() {
        println("I don't like running")

    }
    override fun eat(){
        println("I like eating fish")
    }

    fun info(){
        println("I live in The Earth $habitat, My weight is: $weight, and my name is $name")

    }
}