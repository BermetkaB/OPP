package homeworkPractic

class Programmer(var languageOfProgramming:String, name:String,  age:Int):Worker(name, age ) {
    override fun work(){
        println("I'm writing code")
    }
}