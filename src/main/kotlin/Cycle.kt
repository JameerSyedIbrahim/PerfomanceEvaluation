import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

data class Cycle(
    var cycleName: String,
    var start: String,
    var end: String,
    var goal: Boolean,
    var project: Boolean,
    var task: Boolean,
    var goalWeitage: Boolean,
    var projectWeitage: Boolean,
    var taskWeitage: Boolean,
    var NA: Boolean
) {

    constructor() : this("", "", "", true, true, true, true, true, true, true)


    var ip = Scanner(System.`in`)


    val cycleList: ArrayList<Cycle> = ArrayList<Cycle>()


    var cycleNameVariable: String? = null


    // function for check available cycles for the employee(date comparison)
    fun datecompare(emp: String, cycleAr: ArrayList<Cycle>) {


        println("Available cycles for the employee is ")

        var dateOfJoin = emp
        var serialNumber = 1

        for (i in 0 until cycleAr.size) {
            var date1 = dateOfJoin
            var date2 = cycleAr[i].start

            val sdf = SimpleDateFormat("dd-MM-yyyy")

            val firstDate: Date = sdf.parse(date1)
            val secondDate: Date = sdf.parse(date2)

            var cmp = firstDate.compareTo(secondDate)

            if (cmp < 0) {

                println("${serialNumber} . ${cycleAr[i].cycleName}")
                cycleList.add(cycleAr[i])

                serialNumber++
            }
        }
    }


    fun selectCycle(id: Int, cycleAr: ArrayList<Cycle>) {
        println("Exit press 0")
        println()
        println("Which cycle you want to Rate :")

        var choice = -1

        var bool = true

        while (bool) {
            var choice1 = ip.nextLine()
            try {
                choice = choice1.toInt()
                bool = false
            } catch (e: Exception) {
                println("Alphabets and Special characters are not allowed ")
                println("Enter the Valid option :")
            }
        }

        var user_id = id

        if (choice == 0) {
            Perfomance.start()
        } else if ((choice > 0) && (choice <= cycleAr.size)) {

            var cycleObj = cycleList[choice - 1]


            if ((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4)) {

                if ((cycleObj.cycleName.equals("cycle-1")) || (cycleObj.cycleName.equals("cycle-2"))
                    || (cycleObj.cycleName.equals("cycle-3")) || (cycleObj.cycleName.equals("cycle-4"))
                ) {

                    cycleNameVariable = cycleObj.cycleName

                    if (cycleObj.goal) {
                        UserDetails.showGoalRating(user_id, cycleObj)
                    } else if (cycleObj.project) {
                        UserDetails.showProjectRating(user_id, cycleObj)
                    } else if (cycleObj.task) {
                        UserDetails.showTaskRating(user_id, cycleObj)
                    } else {
                        println("You don't Rate for the cycle")
                    }
                }

            }
        } else {
            println("Enter valid option :")
            selectCycle(id, cycleAr)

        }


    }
}
