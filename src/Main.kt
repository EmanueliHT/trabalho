import java.lang.Thread.sleep

fun main (){
//SEMÁFARO
    var semafaroAberto =true
    val t1 =Thread{
        while(true){
            semafaroAberto =true
            println("Semáforo Aberto")
            sleep(5000)
            semafaroAberto = false
            println("Semáfaro Fechado")
            sleep (10000)
        }
    }
    val t2 = Thread{
        for (i in 1..10){
            if(semafaroAberto){
                println("Carro $i passou")
            }else {
                println("Carro $i esperou")
            }
            sleep(2000)
        }
    }
    t1.start()
    t2.start()
}
