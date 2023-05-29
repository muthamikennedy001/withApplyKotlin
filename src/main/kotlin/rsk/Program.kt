package rsk

import java.util.*
class Meeting{
    var Title:String=""
    var When:Date=Date()
    var Who= mutableListOf<String>()
    fun create (){
    }
}
fun main(args:Array<String>){
    val m= Meeting()
    m.Title="Board Meeting"
    m.When=Date(2017,1,1)
    m.Who.add("Kennedy")
    with(m){
        Title="Board Meeting"
        When=Date(2017,1,1)
        Who.add("Kennedy")
    }

    m.apply {
        Title="Board Meeting"
        When=Date(2017,1,1)
        Who.add("Kennedy")
    }.create()
}
