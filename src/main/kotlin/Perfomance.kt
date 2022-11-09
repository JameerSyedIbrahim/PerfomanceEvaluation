import  java.util.*;
import kotlin.collections.*
import kotlin.system.exitProcess


object Perfomance {
    // @JvmStatic
    var user = User()
    var cycle = Cycle()

    // ArrayList for storing user and cycle data
    var arList: ArrayList<User> = ArrayList<User>()
    var cycleAr: ArrayList<Cycle> = ArrayList<Cycle>()
    var sc = Scanner(System.`in`)


    fun start() {

        println("who you want to Rate")
        println("1. Self Rating")
        println("2. Peer Rating")
        println("press 1 to Self / press 2 to Peer / press 0 to Exit ")

        var choice = -1

        var bool = true
        inner@ while (bool) {
            var choice1 = sc.nextLine()
            try {
                choice = choice1.toInt()
                //  bool = false
            } catch (e: Exception) {
                println("Alphabets and Special Characters are not allowed")
                println("Please Enter the valid option :")
                continue@inner
            }

            when (choice) {

                0 -> exitProcess(0)
                1 -> {
                    println()
                    user.showSelf(arList)
                    var self: String = arList[0].dateofjoin
                    cycle.datecompare(self, cycleAr)
                    cycle.selectCycle(arList[0].empId, cycle.cycleList)
                    cycle.cycleList.clear()
                    bool = false
                }

                2 -> {
                    user.showOtherUserName(arList)
                    var otherUser: User = user.showIndivudualUser(arList)
                    val empDateOfJoin = otherUser.dateofjoin
                    val employeeId = otherUser.empId


                    cycle.datecompare(empDateOfJoin, cycleAr)
                    cycle.selectCycle(employeeId, cycle.cycleList)
                    cycle.cycleList.clear()
                    bool = false

                }

                else -> {
                    println("Please Enter a valid option : ")
                }
            }
        }

    }

}


fun main() {

    var goalWeitage_user_1: ArrayList<Int> = ArrayList()
    var projectWeitage_User_1: ArrayList<Int> = ArrayList()
    var taskWeitage_user_1: ArrayList<Int> = ArrayList()

    var goalWeitage_user_2: ArrayList<Int> = ArrayList()
    var projectWeitage_User_2: ArrayList<Int> = ArrayList()
    var taskWeitage_user_2: ArrayList<Int> = ArrayList()


    var goalWeitage_user_3: ArrayList<Int> = ArrayList()
    var projectWeitage_User_3: ArrayList<Int> = ArrayList()
    var taskWeitage_user_3: ArrayList<Int> = ArrayList()


    var goalWeitage_user_4: ArrayList<Int> = ArrayList()
    var projectWeitage_User_4: ArrayList<Int> = ArrayList()
    var taskWeitage_user_4: ArrayList<Int> = ArrayList()


    fun addWeitage() {
        goalWeitage_user_1.add(10)
        goalWeitage_user_1.add(20)
        goalWeitage_user_1.add(30)
        goalWeitage_user_1.add(40)
        goalWeitage_user_1.add(50)


        projectWeitage_User_1.add(10)
        projectWeitage_User_1.add(20)
        projectWeitage_User_1.add(30)
        projectWeitage_User_1.add(40)
        projectWeitage_User_1.add(50)


        taskWeitage_user_1.add(10)
        taskWeitage_user_1.add(20)
        taskWeitage_user_1.add(30)
        taskWeitage_user_1.add(40)
        taskWeitage_user_1.add(50)




        goalWeitage_user_2.add(10)
        goalWeitage_user_2.add(20)
        goalWeitage_user_2.add(30)
        goalWeitage_user_2.add(40)



        projectWeitage_User_2.add(20)
        projectWeitage_User_2.add(30)
        projectWeitage_User_2.add(40)
        projectWeitage_User_2.add(50)



        taskWeitage_user_2.add(30)
        taskWeitage_user_2.add(40)
        taskWeitage_user_2.add(50)
        taskWeitage_user_2.add(60)



        goalWeitage_user_3.add(10)
        goalWeitage_user_3.add(20)
        goalWeitage_user_3.add(30)



        projectWeitage_User_3.add(20)
        projectWeitage_User_3.add(30)



        taskWeitage_user_3.add(30)




        goalWeitage_user_4.add(10)


        projectWeitage_User_4.add(20)


        taskWeitage_user_4.add(30)


    }


    // creating user objects
    Perfomance.arList.add(
        User(
            "jameer",
            101,
            "01-09-2022",
            goalWeitage_user_1,
            projectWeitage_User_1,
            taskWeitage_user_1
        )
    )
    Perfomance.arList.add(
        User(
            "jaffiri",
            102,
            "04-09-2022",
            goalWeitage_user_2,
            projectWeitage_User_2,
            taskWeitage_user_2
        )
    )
    Perfomance.arList.add(
        User(
            "Surya",
            103,
            "09-09-2022",
            goalWeitage_user_3,
            projectWeitage_User_3,
            taskWeitage_user_3
        )
    )
    Perfomance.arList.add(
        User(
            "Raja",
            104,
            "14-09-2022",
            goalWeitage_user_4,
            projectWeitage_User_4,
            taskWeitage_user_4
        )
    )

    // creating Cycle object
    Perfomance.cycleAr.add(Cycle("cycle-1", "05-09-2022", "5-10-2022", true, true, true, false, false, false, true))
    Perfomance.cycleAr.add(Cycle("cycle-2", "10-09-2022", "10-10-2022", true, false, false, false, false, false, true))
    Perfomance.cycleAr.add(Cycle("cycle-3", "15-09-2022", "15-10-2022", true, true, false, true, true, true, true))
    Perfomance.cycleAr.add(Cycle("cycle-4", "20-09-2022", "20-10-2022", false, false, false, true, true, true, true))


    addWeitage()
    UserDetails.add()
    Perfomance.start()


}

