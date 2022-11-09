import java.util.*;
import kotlin.system.exitProcess

class Start {


    // beginng function
    fun begin()
    {
        var start = Start()

        var sc = Scanner(System.`in`)
        println("Who you Want to Rate : ")

        println("1. Self Rating ")
        println("2. Peer Rating ")

        println("press 1 to self / press 2 to peir")

        // input for get choice
        var choice = sc.nextInt()

        if(choice == 1)
        {
            //user1()

        }
        else if(choice == 2 )
        {
          //  otherUser()
        }
        else{
            start.begin()
        }
    }

    // user selection function






}

