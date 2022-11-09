///// user details class start
//
//import java.util.*
//import kotlin.collections.*
//import kotlin.system.exitProcess
//
//object UserDetails {
//
//
//    // map and Array list for goals
//    val goal: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()
//
//    val usergoal_jameer: ArrayList<String> = ArrayList<String>()
//    val usergoal_jaffiri: ArrayList<String> = ArrayList<String>()
//    val usergoal_surya: ArrayList<String> = ArrayList<String>()
//    val usergoal_raja: ArrayList<String> = ArrayList<String>()
//
//    // map and Arraylist for project
//    val project: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()
//
//    val userproject_jameer: ArrayList<String> = ArrayList<String>()
//    val userproject_jaffiri: ArrayList<String> = ArrayList<String>()
//    val userproject_surya: ArrayList<String> = ArrayList<String>()
//    val userproject_raja: ArrayList<String> = ArrayList<String>()
//
//    // map and Arraylist for task
//    val task: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()
//
//    val usertask_jameer: ArrayList<String> = ArrayList<String>()
//    val usertask_jaffiri: ArrayList<String> = ArrayList<String>()
//    val usertask_surya: ArrayList<String> = ArrayList<String>()
//    val usertask_raja: ArrayList<String> = ArrayList<String>()
//
//    @JvmStatic
//    fun add() {
//
//        // creating arraylist and map for all users
//        ////// First User Jameer //////////////////
//        usergoal_jameer.add("Learn Kotlin")
//        usergoal_jameer.add("Learn Automation Tool")
//        usergoal_jameer.add("Learn Swift")
//        usergoal_jameer.add("Learn Leave Tracker Module")
//        usergoal_jameer.add("Learn java")
//
//        goal[101] = usergoal_jameer
//
//        userproject_jameer.add("Performance Evaluation")
//        userproject_jameer.add("Time Tracker")
//        userproject_jameer.add("Work Drive")
//        userproject_jameer.add("People App")
//        userproject_jameer.add("Calender App")
//
//        project[101] = userproject_jameer
//
//
//        usertask_jameer.add("Assignment-1")
//        usertask_jameer.add("Assignment-2")
//        usertask_jameer.add("Assignment-3")
//        usertask_jameer.add("Assignment-4")
//        usertask_jameer.add("Assignment-5")
//
//        task[101] = usertask_jameer
//
//        //////////////////////////////////////////////////
//
//        /////////////// Second User ////////////////////
//
//        usergoal_jaffiri.add("Learn Kotlin")
//        usergoal_jaffiri.add("Learn Python")
//        usergoal_jaffiri.add("Learn C")
//        usergoal_jaffiri.add("Learn Java")
//
//        goal[102] = usergoal_jaffiri
//
//
//        userproject_jaffiri.add("Leave Tracker")
//        userproject_jaffiri.add("Work Drive")
//        userproject_jaffiri.add("Zoho mail")
//        userproject_jaffiri.add("Zoho Books")
//
//        project[102] = userproject_jaffiri
//
//
//        usertask_jaffiri.add("Assignment-1")
//        usertask_jaffiri.add("Assignment-2")
//        usertask_jaffiri.add("Assignment-3")
//        usertask_jaffiri.add("Assignment-4")
//
//        task[102] = usertask_jaffiri
//
//        //////////////////////////////////////////////////
//
//        ///////////////// User 3 Surya ///////////////////
//
//        usergoal_surya.add("Learn Kotlin")
//        usergoal_surya.add("Learn Python")
//        usergoal_surya.add("Learn C")
//
//        goal[103] = usergoal_surya
//
//
//        userproject_surya.add("Leave Tracker")
//        userproject_surya.add("Work Drive")
//
//        project[103] = userproject_surya
//
//
//        usertask_surya.add("Assignment-1")
//
//        task[103] = usertask_surya
//
//
//        //////////////////////////////////////////////////
//
//        /////////////// User 4 Raja //////////////////
//
//        usergoal_raja.add("Learn Kotlin")
//        goal[104] = usergoal_raja
//
//
//        userproject_raja.add("Leave Tracker")
//        project[104] = userproject_raja
//
//
//        usertask_raja.add("Assignment-1")
//        task[104] = usertask_raja
//
//        //////////////////////////////////////////////
//
//    }
//
//    var inputForRating = Scanner(System.`in`)
//
//    // variable for overAll Rating score, note: don't forgot to make it zero for end of the program
//    // var overAllTotalFortheUser: Int = 0
//
//    fun showGoalRating(id: Int, cycleObj: Cycle) {
//        val userPrimaryId = id
//        var goalRatingVariable : Int
//
//        // temp variable to stoore goal weightage total
////        var overAllGoalRating = 0
//
//        goalRatingVariable = showGoalRatingWeightageandNA(userPrimaryId, cycleObj, Perfomance.arList, project)
//
//
//
//        if (cycleObj.project) {
//            // println("overall Rating is : ${goalRatingVariable}")
//            showProjectRating(userPrimaryId, cycleObj, goalRatingVariable)
//        } else if (cycleObj.task) {
//            println("overall Rating is : ${goalRatingVariable}")
//            showTaskRating(userPrimaryId, cycleObj, goalRatingVariable)
//        } else {
//            println("overall Rating is : ${goalRatingVariable}")
//            println("You Rated Successfully for till goal")
//            println()
//        }
//
//    }
//
//    fun showProjectRating(id: Int, cycleObj: Cycle, temp: Int = 0) {
//
//        val userPrimaryId = id
//        var projectRatingVariable = 0
//        var overallRatingVariable = temp
//
//        println("project called.......")
//
//        projectRatingVariable = showProjectRatingWeightageandNA(userPrimaryId, cycleObj, temp, Perfomance.arList, project)
//
//        projectRatingVariable += overallRatingVariable
//
//
//        // check for task
//        if (cycleObj.task) {
//            showTaskRating(userPrimaryId, cycleObj, projectRatingVariable)
//        } else {
//            println("overall Rating ${projectRatingVariable}")
//            println("You Rated Successfully for till project")
//        }
//
//
//    }
//
//
//    fun showTaskRating(id: Int, cycleObj: Cycle, temp: Int = 0) {
//        //println("hello")
//        val userPrimaryId = id
//        var taskRatingVariable = 0
//        var overallRatingVariable = temp
//
//        taskRatingVariable = showtaskRatingWeightageandNA(userPrimaryId, cycleObj, temp, Perfomance.arList, project)
//        taskRatingVariable += overallRatingVariable
//
//
//        println("Overall Rating : ${taskRatingVariable}")
//        println("you Rated Successfully for till task")
//    }
//
//
//    ////////////// Rating functions for goal ////////////////////
//
//    fun showGoalRatingWeightageandNA(
//        userPrimaryId: Int,
//        cycleObj: Cycle,
//        userList: ArrayList<User>,
//        project: MutableMap<Int, ArrayList<String>>
//    ): Int {
//
//
//        // general variables for overall score
//        var goal_Rating_Variable = 0
//
//
//        // weightage
//        var totalweightage_Sum = 0
//        var weightage_Size = 0
//
//        // N/A count
//        var Na_Count = 0
//
//        // variables to store userWeitage and project list
//        var userWeightage: ArrayList<Int>? = null
//        var goalList: ArrayList<String>? = null
//
//
//        // normal variables
//        var current_Value = 0
//        var total_Value = 0
//        var goalSize = 0
//
//
//        //// Calculating user project weightage and size
//
//        for (i in userList) {
//            if(userPrimaryId == i.empId)
//            {
//                for (j in i.goalWeitage) {
//                    totalweightage_Sum += j
//                    weightage_Size++
//                }
//            }
//        }
//
//        // map the emp Id and project
//
//        // to Store projectlist in variable
//        for (key in goal.keys) {
//            if (key == userPrimaryId) {
//                goalList = goal[key]!!
//            }
//        }
//
//        // Variable for count the elements in project list
//        goalSize = goalList!!.size
//
//
//
//
//        // to Store Userlist in variable
//
//        for (weightage in userList) {
//            if (weightage.empId == userPrimaryId) {
//                userWeightage = weightage.goalWeitage
//            }
//        }
//
//        if (userWeightage != null) {
//            if (goalList != null) {
//                if (userWeightage.size == goalList.size)
//                {
//                    if (cycleObj.goalWeitage && cycleObj.NA)
//                    {
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(goalList[i])
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed ")
//                                }
//
//                                if(convertInput == 0)
//                                {
//                                    totalweightage_Sum -= userWeightage[i]
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(goalList[i])
//
//                                }
//
//                            }
//
//                        }
//                        goal_Rating_Variable = (total_Value / totalweightage_Sum)
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//                        println()
//                        return goal_Rating_Variable
//
//                    }// if block for weightage and NA finished
//                    else if(cycleObj.goalWeitage)
//                    {
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(goalList[i])
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception)
//                                {
//                                    println("String Not Allowed")
//                                }
//
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                    // continue@inn
//                                }
//                                else {
//
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(goalList[i])
//                                }
//
//                            }
//                        }
//                        goal_Rating_Variable = (total_Value / totalweightage_Sum)
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//
//                        return goal_Rating_Variable
//                    }
//
//                    else if(cycleObj.NA)
//                    {
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(goalList[i])
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    var convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput == 0)
//                                {
//
//                                    Na_Count++
//
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(goalList[i])
//                                }
//
//                            }
//
//                        }
//
//                        goal_Rating_Variable = (total_Value / (goalSize-Na_Count))
//
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//                        return goal_Rating_Variable
//
//                    }
//                    else{
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(goalList[i])
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@while(bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(goalList[i])
//                                }
//
//                            }
//
//                        }
//                        goal_Rating_Variable = (total_Value / goalSize)
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//                        return goal_Rating_Variable
//
//                    }
//
//                }
//                else{
//                    println("Size not matched .....")
//                }
//            }
//        }
//        return 0
//    }
//
//    //////////////  Rating function for goal end /////////////////
//
//    ////////////////// Rating function for Project ////////////////////
//
//    fun showProjectRatingWeightageandNA(
//        userPrimaryId: Int,
//        cycleObj: Cycle,
//        temp: Int,
//        userList: ArrayList<User>,
//        project: MutableMap<Int, ArrayList<String>>
//    ): Int {
//
//
//        // general variables for overall score
//        var project_Rating_Variable = 0
//
//
//        // weightage
//        var totalweightage_Sum = 0
//        var weightage_Size = 0
//
//        // N/A count
//        var Na_Count = 0
//
//        // variables to store userWeitage and project list
//        var userWeightage: ArrayList<Int>? = null
//        var projectList: ArrayList<String>? = null
//
//
//        // normal variables
//        var current_Value = 0
//        var total_Value = 0
//        var projectListSize = 0
//
//
//        //// Calculating user project weightage and size
//
//        for (i in userList)
//        {
//            if(i.empId == userPrimaryId) {
//                for (j in i.projectWeitage) {
//                    totalweightage_Sum += j
//                    weightage_Size++
//                }
//            }
//        }
//
//        // map the emp Id and project
//
//        // to Store projectlist in variable
//        for (key in project.keys) {
//            if (key == userPrimaryId) {
//                projectList = project[key]!!
//            }
//        }
//
//        // Variable for count the elements in project list
//        projectListSize = projectList!!.size
//
//
//
//
//        // to Store Userlist in variable
//
//        for (weightage in userList) {
//            if (weightage.empId == userPrimaryId) {
//                userWeightage = weightage.projectWeitage
//            }
//        }
//
//        if (userWeightage != null) {
//            if (projectList != null) {
//                if (userWeightage.size == projectList.size)
//                {
//                    if (cycleObj.projectWeitage && cycleObj.NA)
//                    {
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(projectList[i])
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed ")
//                                }
//
//                                if(convertInput == 0)
//                                {
//                                    totalweightage_Sum -= userWeightage[i]
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(projectList[i])
//
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = (total_Value / totalweightage_Sum)
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//                        return project_Rating_Variable
//
//                    }// if block for weightage and NA finished
//                    else if(cycleObj.projectWeitage)
//                    {
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("overall Total : ${total_Value} ")
//                            println()
//                            println(projectList[i])
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception)
//                                {
//                                    println("String Not Allowed")
//                                }
//
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                    // continue@inn
//                                }
//                                else {
//
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(projectList[i])
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = (total_Value / totalweightage_Sum)
//                        println("Current Total : ${current_Value}")
//                        println("overall Total : ${total_Value} ")
//
//                        return project_Rating_Variable
//                    }
//
//                    else if(cycleObj.NA)
//                    {
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("overall Total : ${total_Value} ")
//                            println()
//                            println(projectList[i])
//
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    var convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput == 0)
//                                {
//
//                                    Na_Count++
//
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(projectList[i])
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = (total_Value / (projectListSize-Na_Count))
//                        println("Current Total : ${current_Value}")
//                        println("overall Total : ${total_Value} ")
//
//                        return project_Rating_Variable
//
//                    }
//                    else{
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("overall Total : ${total_Value} ")
//                            println()
//                            println(projectList[i])
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@while(bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5")
//                                    println(projectList[i])
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = total_Value / projectListSize
//
//                        println("Current Total : ${current_Value}")
//                        println("overall Total : ${total_Value} ")
//                        return project_Rating_Variable
//
//                    }
//
//                }
//                else{
//                    println("Size not matched .....")
//                }
//            }
//        }
//        return 0
//    }
//
//    ///////////////// Rating function for project End //////////////////////
//
//
//
//    ///////////////// Rating function for Task //////////////////////////////
//
//    fun showtaskRatingWeightageandNA(
//        userPrimaryId: Int,
//        cycleObj: Cycle,
//        temp: Int,
//        userList: ArrayList<User>,
//        project: MutableMap<Int, ArrayList<String>>
//    ): Int {
//
//
//        // general variables
//        var task_Rating_Variable = 0
//
//
//        // weightage
//        var totalweightage_Sum = 0
//        var weightage_Size = 0
//
//        // N/A count
//        var Na_Count = 0
//
//        // variables to store userWeitage and project list
//        var userWeightage: ArrayList<Int>? = null
//        var taskList: ArrayList<String>? = null
//
//
//        // normal variables
//        var current_Value = 0
//        var total_Value = 0
//        var taskListSize = 0
//
//
//        //// Calculating user project weightage and size
//
//        for (i in userList) {
//            if(userPrimaryId == i.empId)
//            {
//                for (j in i.taskWeitage) {
//                    totalweightage_Sum += j
//                    weightage_Size++
//                }
//            }
//        }
//
//        // map the emp Id and project
//
//        // to Store projectlist in variable
//        for (key in task.keys) {
//            if (key == userPrimaryId) {
//                taskList = task[key]!!
//            }
//        }
//
//        // Variable for count the elements in project list
//        taskListSize = taskList!!.size
//
//
//
//
//        // to Store Userlist in variable
//
//        for (weightage in userList) {
//            if (weightage.empId == userPrimaryId) {
//                userWeightage = weightage.taskWeitage
//            }
//        }
//
//        if (userWeightage != null) {
//            if (taskList != null) {
//                if (userWeightage.size == taskList.size)
//                {
//                    if (cycleObj.taskWeitage && cycleObj.NA)
//                    {
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(taskList[i])
//
//
//                            // weightgae and NA
//
//
//                            var bool = true
//                            var convertInput = -1
//
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed ")
//                                }
//
//                                if(convertInput == 0)
//                                {
//                                    totalweightage_Sum -= userWeightage[i]
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(taskList[i])
//
//                                }
//
//                            }
//
//                        }
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//                        task_Rating_Variable = (total_Value / totalweightage_Sum)
//
//                        return task_Rating_Variable
//
//                    }
//                    else if(cycleObj.taskWeitage)
//                    {
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(taskList[i])
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception)
//                                {
//                                    println("String Not Allowed")
//                                }
//
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                    // continue@inn
//                                }
//                                else {
//
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(taskList[i])
//                                }
//
//                            }
//
//                        }
//                        task_Rating_Variable = (total_Value / totalweightage_Sum)
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//
//                        return task_Rating_Variable
//                    }
//                    else if(cycleObj.NA)
//                    {
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//                            println(taskList[i])
//
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    var convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput == 0)
//                                {
//
//                                    Na_Count++
//
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(taskList[i])
//                                }
//
//                            }
//
//                        }
//                        task_Rating_Variable = (total_Value / (taskListSize-Na_Count))
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//                        return task_Rating_Variable
//
//                    }
//                    else{
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println()
//
//                            println(taskList[i])
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@while(bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(taskList[i])
//                                }
//
//                            }
//                        }
//                        task_Rating_Variable = (total_Value / taskListSize)
//
//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
//
//                        return task_Rating_Variable
//
//                    }
//
//                }
//                else{
//                    println("Size not matched .....")
//                }
//            }
//        }
//        return 0
//    }
//
//
//    ////////////////// Rating function for task end ///////////////////////////
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
///// user details class end


//// cycle class start
//
//import java.text.SimpleDateFormat
//import java.util.*
//import kotlin.collections.ArrayList
//
//data class Cycle(var cycleName: String ,var start : String, var end : String,
//                 var goal: Boolean , var project: Boolean, var task: Boolean, var goalWeitage: Boolean, var projectWeitage: Boolean, var taskWeitage: Boolean, var NA: Boolean) {
//
//    constructor() : this("","","",true,true,true, true, true,true,true)
//
//    // object creation for classes
//
//    //  var endUser = Perfomance()
//
//    //var userDetails = UserDetails()
//    //var perfomance = Perfomance()
//
//    var ip = Scanner(System.`in`)
//
//
//    val cycleList : ArrayList<Cycle> = ArrayList<Cycle>()
//
//
//
//
//    // function for check available cycles for the employee(date comparison)
//    fun datecompare(emp :String , cycleAr: ArrayList<Cycle>)
//    {
//
//
//        println("Available cycles for the employee is ")
//
//        var dateOfJoin =  emp
//        var serialNumber = 1
//
//        for(i in 0.. cycleAr.size-1)
//        {
//            var date1 = dateOfJoin
//            var date2 = cycleAr[i].start
//
//            val sdf = SimpleDateFormat("dd-MM-yyyy")
//
//            val firstDate : Date = sdf.parse(date1)
//            val secondDate : Date = sdf.parse(date2)
//
//            var cmp = firstDate.compareTo(secondDate)
//
//            if(cmp < 0)
//            {
//
//                println("${serialNumber} . ${cycleAr[i].cycleName}")
//                cycleList.add(cycleAr[i])
//                serialNumber++
//            }
//        }
//    }
//
//
//
//    fun selectCycle(id: Int, cycleAr: ArrayList<Cycle>) {
//        println("Which cycle you want to Rate :")
//
//        var choice = -1
//
//        var bool = true
//
//        while(bool)
//        {
//            var choice1 = ip.nextLine()
//            try {
//                choice = choice1.toInt()
//                bool = false
//            } catch (e: Exception) {
//                println("String Not Allowed")
//                println("Enter the Valid option")
//            }
//        }
//
//        var user_id = id
//
//        //println(cycleAr.size)
//
//
//        if( (choice > 0) && (choice <= cycleAr.size))
//        {
//
//            var cycleObj = cycleList[choice - 1]
//
//            //  println(cycleObj)
//
//
//            if ((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4))
//            {
//                // var selectCycleName = cycleList[choice - 1]
//
//                if ((cycleObj.cycleName.equals("cycle-1")) || (cycleObj.cycleName.equals("cycle-2"))
//                    || (cycleObj.cycleName.equals("cycle-3"))|| (cycleObj.cycleName.equals("cycle-4")))
//                {
//
//                    if (cycleObj.goal ) {
//                        UserDetails.showGoalRating(user_id,cycleObj)
//                    }
//                    else if(cycleObj.project )
//                    {
//                        UserDetails.showProjectRating(user_id , cycleObj)
//                    }
//                    else if(cycleObj.task)
//                    {
//                        UserDetails.showTaskRating(user_id, cycleObj)
//                    }
//                    else{
//                        println("You don't Rate for the cycle")
//                    }
//                }
//
//            }
//        }
//        else{
//            println("Enter valid option")
//            selectCycle(id, cycleAr)
//
//        }
//
//
//    }
//}
//




/*

* 1
*   println(user.showSelf(arList, 0))
                var emp2: User = arList[0].copy()
                cycle.datecompare(emp2, cycleAr)
*
* 2
* println("who you want to rate ")

                user.showOtherUserName(arList)

                println("press 1 to rate jaffiri / press 2 to rate Surya / press 3 to rate Raja / press 0 to exit")
*
*
*
* */

/// cycle class end


/// performance calss start



//import  java.util.*;
//import kotlin.collections.*
//
//
//object Perfomance {
//    // @JvmStatic
//    var user = User()
//    var cycle = Cycle()
//
//    // ArrayList for storing user and cycle data
//    var arList: ArrayList<User> = ArrayList<User>()
//    var cycleAr: ArrayList<Cycle> = ArrayList<Cycle>()
//    var sc = Scanner(System.`in`)
//
//
//    fun start() {
//
//        println("who you want to Rate")
//        println("1. Self Rating")
//        println("2. Peer Rating")
//        println("press 1 to Self / press 2 to Peer / press 0 to Exit ")
//
//        var choice = -1
//
//        var bool = true
//        while(bool)
//        {
//            var choice1 = sc.nextLine()
//            try {
//                choice = choice1.toInt()
//                bool = false
//            } catch (e: Exception)
//            {
//                println("String Not Allowed")
//                println("Enetr the option 1 or 2 ")
//
//            }
//        }
//
//        when (choice)
//        {
//
//            1 -> {
//                println()
//                user.showSelf(arList)
//                var self: String = arList[0].dateofjoin
//                cycle.datecompare(self, cycleAr)
//                cycle.selectCycle(arList[0].empId, cycle.cycleList)
//                cycle.cycleList.clear()
//            }
//
//            2 -> {
//                user.showOtherUserName(arList)
//                var otherUser: User = user.showIndivudualUser(arList)
//                //println(otherUser)
//                val empDateOfJoin = otherUser.dateofjoin
//                val employeeId = otherUser.empId
//
//
//                cycle.datecompare(empDateOfJoin, cycleAr)
//                cycle.selectCycle(employeeId, cycle.cycleList)
//                cycle.cycleList.clear()
//                // println(cycle.cycleList.size)
//
//            }
//            else ->{
//                println(" Invalid Option ")
//            }
//        }
//
//    }
//
//}
//
//
//fun main() {
//////////////////////////////////////////////////
//    // var p = Perfomance()
//    //var cyc = Cycle()
////            var users = User()
//    // var userDetails = UserDetails()
//    var goalWeitage_user_1: ArrayList<Int> = ArrayList()
//    var projectWeitage_User_1: ArrayList<Int> = ArrayList()
//    var taskWeitage_user_1: ArrayList<Int> = ArrayList()
//
//    var goalWeitage_user_2: ArrayList<Int> = ArrayList()
//    var projectWeitage_User_2: ArrayList<Int> = ArrayList()
//    var taskWeitage_user_2: ArrayList<Int> = ArrayList()
//
//
//    var goalWeitage_user_3: ArrayList<Int> = ArrayList()
//    var projectWeitage_User_3: ArrayList<Int> = ArrayList()
//    var taskWeitage_user_3: ArrayList<Int> = ArrayList()
//
//
//    var goalWeitage_user_4: ArrayList<Int> = ArrayList()
//    var projectWeitage_User_4: ArrayList<Int> = ArrayList()
//    var taskWeitage_user_4: ArrayList<Int> = ArrayList()
//
//
//
//    fun addWeitage() {
//        goalWeitage_user_1.add(10)
//        goalWeitage_user_1.add(20)
//        goalWeitage_user_1.add(30)
//        goalWeitage_user_1.add(40)
//        goalWeitage_user_1.add(50)
//
//
//        projectWeitage_User_1.add(10)
//        projectWeitage_User_1.add(20)
//        projectWeitage_User_1.add(30)
//        projectWeitage_User_1.add(40)
//        projectWeitage_User_1.add(50)
//
//
//        taskWeitage_user_1.add(10)
//        taskWeitage_user_1.add(20)
//        taskWeitage_user_1.add(30)
//        taskWeitage_user_1.add(40)
//        taskWeitage_user_1.add(50)
//
//        /////////////////////
//
//
//        goalWeitage_user_2.add(10)
//        goalWeitage_user_2.add(20)
//        goalWeitage_user_2.add(30)
//        goalWeitage_user_2.add(40)
//
//
//
//        projectWeitage_User_2.add(20)
//        projectWeitage_User_2.add(30)
//        projectWeitage_User_2.add(40)
//        projectWeitage_User_2.add(50)
//
//
//
//        taskWeitage_user_2.add(30)
//        taskWeitage_user_2.add(40)
//        taskWeitage_user_2.add(50)
//        taskWeitage_user_2.add(60)
//        //////////////////////////////////////////
//
//
//        goalWeitage_user_3.add(10)
//        goalWeitage_user_3.add(20)
//        goalWeitage_user_3.add(30)
//
//
//
//        projectWeitage_User_3.add(20)
//        projectWeitage_User_3.add(30)
//
//
//
//        taskWeitage_user_3.add(30)
//
//        /////////////////////////////
//
//
//        goalWeitage_user_4.add(10)
//
//
//        projectWeitage_User_4.add(20)
//
//
//        taskWeitage_user_4.add(30)
//
//
//    }
//
//
//    // creating user objects
//    Perfomance.arList.add(User("jameer", 101, "01-09-2022", goalWeitage_user_1, projectWeitage_User_1,taskWeitage_user_1))
//    Perfomance.arList.add(User("jaffiri", 102, "04-09-2022", goalWeitage_user_2, projectWeitage_User_2,taskWeitage_user_2))
//    Perfomance.arList.add(User("Surya", 103, "09-09-2022", goalWeitage_user_3, projectWeitage_User_3,taskWeitage_user_3))
//    Perfomance.arList.add(User("Raja", 104, "14-09-2022", goalWeitage_user_4, projectWeitage_User_4,taskWeitage_user_4))
//
//    // creating Cycle object
//    Perfomance.cycleAr.add(Cycle("cycle-1", "05-09-2022", "5-10-2022", true, false, false,true,false,false,false))
//    Perfomance.cycleAr.add(Cycle("cycle-2", "10-09-2022", "10-10-2022", false, true, false,false,true,false,true))
//    Perfomance.cycleAr.add(Cycle("cycle-3", "15-09-2022", "15-10-2022", true, true, false,true,true,true,true))
//    Perfomance.cycleAr.add(Cycle("cycle-4", "20-09-2022", "20-10-2022", false, false, false,true,true,true,true))
//
//
//    addWeitage()
//    UserDetails.add()
//    Perfomance.start()
//
//
//}



/// performance class end

//// user small class start

//import java.util.Scanner
//
//data class User(var name: String, var empId: Int, var dateofjoin: String, var goalWeitage: ArrayList<Int>, var projectWeitage: ArrayList<Int>,var taskWeitage: ArrayList<Int>) {
//
//
//    constructor() : this("",0,"", ArrayList(), ArrayList(),ArrayList()) {
//
//    }
//
//
//    val sysinput = Scanner(System.`in`)
//
//
//
//
//    // displays self rating user
//    fun showSelf(arlist : ArrayList<User>)
//    {
//
//        for(i in 0 until 1 )
//        {
//            println("Employee Name : "+" "+arlist[i].name)
//
//        }
//
//    }
//
//    // displays peer rating users
//    fun showOtherUserName(arlist: ArrayList<User>)
//    {
//        var j = 1
//        for(i in 1.. arlist.size-1)
//        {
//            println("$j. ${arlist[i].name}")
//            j++
//        }
//    }
//
//    // selecting indivudual user
//    fun showIndivudualUser(userList: ArrayList<User>): User
//    {
//        println("Which User you want to Rate :")
//        var input = sysinput.nextInt()
//
//        when (input)
//        {
//
//            1 ->
//            {
//                println(userList[input].name)
//                return userList[input]
//            }
//
//            2 ->
//            {
//                println(userList[input].name)
//                return userList[input]
//            }
//
//            3 ->
//            {
//                println(userList[input].name)
//                return userList[input]
//            }
//
//            else ->
//            {
//                println("Enter a valid option")
//                showIndivudualUser(userList)
//
//            }
//        }
//        return User()
//    }
//}
//






////// user small class end

//////
/////////////

//
//fun goalWeightageandNa(userWeightage : ArrayList<Int>, goalList: ArrayList<String>,totalweightage_Sum : Float):Float
//{
//
//    println(" one Alien method called ")
//    var current_Value = 0f
//    var total_Value = 0f
//    var totalweightage_Sum = totalweightage_Sum
//    var goal_Rating_Variable = 0f
//
//    inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//    {
//
//        println("Current Total : ${current_Value}")
//        println("Overall Total : ${total_Value}")
//        println()
//        println(goalList[i])
//
//
//        // weightgae and NA
//
//        var bool = true
//        var convertInput = -1
//
//
//        inner@ while (bool)
//        {
//            var input = inputForRating.nextLine()
//
//            try
//            {
//                convertInput = input.toInt()
//
//            } catch (e: Exception) {
//
//                println("String Not Allowed ")
//            }
//
//            if(convertInput == 0)
//            {
//                totalweightage_Sum -= userWeightage[i]
//                bool = false
//            } else if (convertInput in 1..5)
//            {
//                current_Value += (convertInput * userWeightage[i])
//                total_Value = current_Value
//                bool = false
//            }
//            else
//            {
//
//                println("Enter the Range between 1 to 5 ....N/A(0) ")
//                println(goalList[i])
//
//            }
//
//        }
//
//    }
//    goal_Rating_Variable = (total_Value / totalweightage_Sum)
//
//    println("Current Total : ${current_Value}")
//    println("Overall Total : ${total_Value}")
//    println()
//    return goal_Rating_Variable
//
//}


// second main :

//import java.util.*
//import kotlin.collections.*
//
//object UserDetails {
//
//
//    // map and Array list for goals
//    val goal: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()
//
//    val usergoal_jameer: ArrayList<String> = ArrayList<String>()
//    val usergoal_jaffiri: ArrayList<String> = ArrayList<String>()
//    val usergoal_surya: ArrayList<String> = ArrayList<String>()
//    val usergoal_raja: ArrayList<String> = ArrayList<String>()
//
//    // map and Arraylist for project
//    val project: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()
//
//    val userproject_jameer: ArrayList<String> = ArrayList<String>()
//    val userproject_jaffiri: ArrayList<String> = ArrayList<String>()
//    val userproject_surya: ArrayList<String> = ArrayList<String>()
//    val userproject_raja: ArrayList<String> = ArrayList<String>()
//
//    // map and Arraylist for task
//    val task: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()
//
//    val usertask_jameer: ArrayList<String> = ArrayList<String>()
//    val usertask_jaffiri: ArrayList<String> = ArrayList<String>()
//    val usertask_surya: ArrayList<String> = ArrayList<String>()
//    val usertask_raja: ArrayList<String> = ArrayList<String>()
//
//    @JvmStatic
//    fun add() {
//
//        // creating arraylist and map for all users
//        ////// First User Jameer //////////////////
//        usergoal_jameer.add("Learn Kotlin")
//        usergoal_jameer.add("Learn Automation Tool")
//        usergoal_jameer.add("Learn Swift")
//        usergoal_jameer.add("Learn Leave Tracker Module")
//        usergoal_jameer.add("Learn java")
//
//        goal[101] = usergoal_jameer
//
//        userproject_jameer.add("Performance Evaluation")
//        userproject_jameer.add("Time Tracker")
//        userproject_jameer.add("Work Drive")
//        userproject_jameer.add("People App")
//        userproject_jameer.add("Calender App")
//
//        project[101] = userproject_jameer
//
//
//        usertask_jameer.add("Assignment-1")
//        usertask_jameer.add("Assignment-2")
//        usertask_jameer.add("Assignment-3")
//        usertask_jameer.add("Assignment-4")
//        usertask_jameer.add("Assignment-5")
//
//        task[101] = usertask_jameer
//
//        //////////////////////////////////////////////////
//
//        /////////////// Second User ////////////////////
//
//        usergoal_jaffiri.add("Learn Kotlin")
//        usergoal_jaffiri.add("Learn Python")
//        usergoal_jaffiri.add("Learn C")
//        usergoal_jaffiri.add("Learn Java")
//
//        goal[102] = usergoal_jaffiri
//
//
//        userproject_jaffiri.add("Leave Tracker")
//        userproject_jaffiri.add("Work Drive")
//        userproject_jaffiri.add("Zoho mail")
//        userproject_jaffiri.add("Zoho Books")
//
//        project[102] = userproject_jaffiri
//
//
//        usertask_jaffiri.add("Assignment-1")
//        usertask_jaffiri.add("Assignment-2")
//        usertask_jaffiri.add("Assignment-3")
//        usertask_jaffiri.add("Assignment-4")
//
//        task[102] = usertask_jaffiri
//
//        //////////////////////////////////////////////////
//
//        ///////////////// User 3 Surya ///////////////////
//
//        usergoal_surya.add("Learn Kotlin")
//        usergoal_surya.add("Learn Python")
//        usergoal_surya.add("Learn C")
//
//        goal[103] = usergoal_surya
//
//
//        userproject_surya.add("Leave Tracker")
//        userproject_surya.add("Work Drive")
//
//        project[103] = userproject_surya
//
//
//        usertask_surya.add("Assignment-1")
//
//        task[103] = usertask_surya
//
//
//        //////////////////////////////////////////////////
//
//        /////////////// User 4 Raja //////////////////
//
//        usergoal_raja.add("Learn Kotlin")
//        goal[104] = usergoal_raja
//
//
//        userproject_raja.add("Leave Tracker")
//        project[104] = userproject_raja
//
//
//        usertask_raja.add("Assignment-1")
//        task[104] = usertask_raja
//
//        //////////////////////////////////////////////
//
//    }
//    // for getting input
//    var inputForRating = Scanner(System.`in`)
//
//
//    fun showGoalRating(id: Int, cycleObj: Cycle) {
//        val userPrimaryId = id
//        var goalRatingVariable : Float
//        var goal = 0f
//
//
//        goalRatingVariable = showGoalRatingWeightageandNA(userPrimaryId, cycleObj, Perfomance.arList, project)
//        goal = goalRatingVariable
//
//
//        if (cycleObj.project) {
//            showProjectRating(userPrimaryId, cycleObj, goalRatingVariable, goal)
//
//        } else if (cycleObj.task) {
//            // println("overall Rating is : ${goalRatingVariable}")
//            showTaskRating(userPrimaryId, cycleObj, goalRatingVariable, goal)
//        } else {
//            println("overall Rating is : ${"%.1f".format(goalRatingVariable)}")
//            println("-------------------------")
//            finalGrade(goalRatingVariable)
//            println("You Rated Successfully")
//
//
//        }
//
//    }
//
//    fun showProjectRating(id: Int, cycleObj: Cycle, overallratingvariable: Float = 0f, goal : Float = 0f) {
//
//        val userPrimaryId = id
//        var projectRatingVariable:Float = 0f
//        var overallRatingVariable = overallratingvariable
//
//        var goal = goal
//        var projects = 0f
//
//
//        projectRatingVariable = showProjectRatingWeightageandNA(userPrimaryId, cycleObj, overallRatingVariable , Perfomance.arList, project)
//        overallRatingVariable += projectRatingVariable
//
//        if(goal > 0) {
//            projectRatingVariable = overallRatingVariable / 2
//            println("overall Rating is : ${"%.1f".format(projectRatingVariable)} ")
//            projects = 1f
//
//            finalGrade(projectRatingVariable)
//
//        }
//        else{
//            println("overall Rating is : ${ "%.1f".format(projectRatingVariable)}")
//            println("-------------------------")
//            projects = 1f
//            finalGrade(projectRatingVariable)
//        }
//
//
//        // check for task
//        if (cycleObj.task) {
//            showTaskRating(userPrimaryId, cycleObj, overallRatingVariable,goal,projects)
//        } else {
//            println("You Rated Successfully")
//        }
//
//
//    }
//
//
//    fun showTaskRating(id: Int, cycleObj: Cycle, temp: Float = 0f,goal: Float = 0f, projects: Float = 0f) {
//        val userPrimaryId = id
//        var taskRatingVariable = 0f
//        var overallRatingVariable = temp
//
//        var goal = goal
//        var projects = projects
//
//
//
//        taskRatingVariable = showtaskRatingWeightageandNA(userPrimaryId, cycleObj, temp, Perfomance.arList, project)
//        // taskRatingVariable += overallRatingVariable
//        overallRatingVariable += taskRatingVariable
//
//        if((overallRatingVariable > 0 ) && (goal > 0) && (projects > 0))
//        {
//            println("Overall Rating : ${"%.1f".format(overallRatingVariable / 3)}")
//            finalGrade(overallRatingVariable)
//
//        }else if((overallRatingVariable > 0) && ((goal > 0 )||(projects > 0 )))
//        {
//
//            taskRatingVariable = overallRatingVariable / 2
//            println("Overall Rating : ${"%.1f".format(taskRatingVariable)}")
//            finalGrade(taskRatingVariable)
//        }
//        else
//        {
//            // println("overall for single is  ${taskRatingVariable}")
//            println("Overall Rating : ${"%.1f".format(taskRatingVariable)}")
//            finalGrade(taskRatingVariable)
//
//        }
//
//        println("you Rated Successfully ")
//    }
//
//
//    ////////////// Rating functions for goal ////////////////////
//
//    fun showGoalRatingWeightageandNA(
//        userPrimaryId: Int,
//        cycleObj: Cycle,
//        userList: ArrayList<User>,
//        project: MutableMap<Int, ArrayList<String>>
//    ): Float {
//
//
//        // general variables for overall score
//        var goal_Rating_Variable = 0f
//
//
//        // weightage
//        var totalweightage_Sum = 0f
//        var weightage_Size = 0
//
//        // N/A count
//        var Na_Count = 0
//
//        // variables to store userWeitage and project list
//        var userWeightage: ArrayList<Int>? = null
//        var goalList: ArrayList<String>? = null
//
//
//        // normal variables
//        var current_Value = 0f
//        var total_Value = 0f
//        var goalSize = 0
//
//
//        //// Calculating user project weightage and size
//
//        for (i in userList) {
//            if(userPrimaryId == i.empId)
//            {
//                for (j in i.goalWeitage) {
//                    totalweightage_Sum += j
//                    weightage_Size++
//                }
//            }
//        }
//
//        // map the emp Id and project
//
//        // to Store projectlist in variable
//        for (key in goal.keys) {
//            if (key == userPrimaryId) {
//                goalList = goal[key]!!
//            }
//        }
//
//        // Variable for count the elements in project list
//        goalSize = goalList!!.size
//
//        // to Store Userlist in variable
//
//        for (weightage in userList) {
//            if (weightage.empId == userPrimaryId) {
//                userWeightage = weightage.goalWeitage
//            }
//        }
//
//        if (userWeightage != null) {
//            if (goalList != null) {
//                if (userWeightage.size == goalList.size)
//                {
//                    if (cycleObj.goalWeitage && cycleObj.NA)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for Goal ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(goalList[i])
//                            println("---------------------------------------")
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed ")
//                                }
//
//                                if(convertInput == 0)
//                                {
//                                    totalweightage_Sum -= userWeightage[i]
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//
//                                    println("Enter the Range between 1 to 5 or N/A(0) ")
//                                    println(goalList[i])
//
//                                }
//
//                            }
//
//                        }
//                        goal_Rating_Variable = (total_Value / totalweightage_Sum)
//
//                        // println("Current Total : ${current_Value}")
//                        //println("Overall Rating : ${total_Value}")
//                        // println()
//                        return goal_Rating_Variable
//
//                    }// if block for weightage and NA finished
//                    else if(cycleObj.goalWeitage)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for Goal ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(goalList[i])
//                            println("---------------------------------------")
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception)
//                                {
//                                    println("String Not Allowed")
//                                }
//
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    total_Value = current_Value
//                                    bool = false
//                                    // continue@inn
//                                }
//                                else {
//
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(goalList[i])
//                                }
//
//                            }
//                        }
//                        goal_Rating_Variable = (total_Value / totalweightage_Sum)
//
//                        // println("Current Total : ${current_Value}")
//                        // println("Overall Rating : ${goal_Rating_Variable}")
//
//                        return goal_Rating_Variable
//                    }
//
//                    else if(cycleObj.NA)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for Goal ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(goalList[i])
//                            println("---------------------------------------")
//
//                            var bool = true
//
//                            var convertInput = -1
//                            inner@ while (bool)
//                            {
//
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                    println("convert input value")
//                                    println(convertInput)
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//
//                                if(convertInput == 0)
//                                {
//
//                                    Na_Count++
//                                    println("conform")
//                                    bool = false
//
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//
//                                    println("Enter the Range between 1 to 5 or N/A(0) ")
//                                    println(goalList[i])
//                                }
//
//                            }
//
//                        }
//
//                        goal_Rating_Variable = (total_Value / (goalSize-Na_Count))
//
//
//                        // println("Current Total : ${current_Value}")
//                        // println("Overall Rating : ${total_Value}")
//                        return goal_Rating_Variable
//
//                    }
//                    else{
//                        println("---------------------------------------")
//                        println("Rating for Goal ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(goalList[i])
//                            println("---------------------------------------")
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@while(bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value = current_Value
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(goalList[i])
//                                }
//
//                            }
//                            // println("----------------------")
//
//                        }
//                        goal_Rating_Variable = (total_Value / goalSize)
//
//                        // println("Current Total : ${current_Value}")
//                        //println("Overall Rating : ${total_Value}")
//                        println()
//                        return goal_Rating_Variable
//
//                    }
//
//                }
//                else{
//                    println("Size not matched .....")
//                }
//            }
//        }
//        return 0f
//    }
//
//    //////////////  Rating function for goal end /////////////////
//
//    ////////////////// Rating function for Project ////////////////////
//
//    fun showProjectRatingWeightageandNA(
//        userPrimaryId: Int,
//        cycleObj: Cycle,
//        temp: Float = 0f,
//        userList: ArrayList<User>,
//        project: MutableMap<Int, ArrayList<String>>
//    ): Float {
//
//
//        // general variables for overall score
//        var project_Rating_Variable = 0f
//
//
//        // weightage
//        var totalweightage_Sum = 0f
//        var weightage_Size = 0
//
//        // N/A count
//        var Na_Count = 0
//
//        // variables to store userWeitage and project list
//        var userWeightage: ArrayList<Int>? = null
//        var projectList: ArrayList<String>? = null
//
//
//        // normal variables
//        var current_Value = 0f
//        var total_Value = temp
//        var projectListSize = 0
//
//
//        //// Calculating user project weightage and size
//
//        for (i in userList)
//        {
//            if(i.empId == userPrimaryId) {
//                for (j in i.projectWeitage) {
//                    totalweightage_Sum += j
//                    weightage_Size++
//                }
//            }
//        }
//
//        // map the emp Id and project
//
//        // to Store projectlist in variable
//        for (key in project.keys) {
//            if (key == userPrimaryId) {
//                projectList = project[key]!!
//            }
//        }
//
//        // Variable for count the elements in project list
//        projectListSize = projectList!!.size
//
//
//
//
//        // to Store Userlist in variable
//
//        for (weightage in userList) {
//            if (weightage.empId == userPrimaryId) {
//                userWeightage = weightage.projectWeitage
//            }
//        }
//
//        if (userWeightage != null) {
//            if (projectList != null) {
//                if (userWeightage.size == projectList.size)
//                {
//                    if (cycleObj.projectWeitage && cycleObj.NA)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for project ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(projectList[i])
//                            println("---------------------------------------")
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed ")
//                                }
//
//                                if(convertInput == 0)
//                                {
//                                    totalweightage_Sum -= userWeightage[i]
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
////                                    total_Value = current_Value
//                                    total_Value += (convertInput * userWeightage[i])
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(projectList[i])
//
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = (current_Value / totalweightage_Sum)
//
////                        println("Current Total : ${current_Value}")
////                        println("Overall Total : ${total_Value}")
//                        return project_Rating_Variable
//
//                    }// if block for weightage and NA finished
//                    else if(cycleObj.projectWeitage)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for project ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(projectList[i])
//                            println("---------------------------------------")
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception)
//                                {
//                                    println("String Not Allowed")
//                                }
//
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    //   total_Value = current_Value
//                                    total_Value += (convertInput * userWeightage[i])
//                                    bool = false
//                                    // continue@inn
//                                }
//                                else {
//
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(projectList[i])
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = (current_Value / totalweightage_Sum)
////                        println("Current Total : ${current_Value}")
////                        println("overall Total : ${total_Value} ")
//
//                        return project_Rating_Variable
//                    }
//
//                    else if(cycleObj.NA)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for project ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(projectList[i])
//                            println("---------------------------------------")
//
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput == 0)
//                                {
//
//                                    Na_Count++
//
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    // total_Value = current_Value
//                                    total_Value += convertInput
//
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(projectList[i])
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = (current_Value / (projectListSize-Na_Count))
////                        println("Current Total : ${current_Value}")
////                        println("overall Total : ${total_Value} ")
//
//                        return project_Rating_Variable
//
//                    }
//                    else{
//                        println("---------------------------------------")
//                        println("Rating for project ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(projectList[i])
//                            println("---------------------------------------")
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@while(bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value += convertInput
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5")
//                                    println(projectList[i])
//                                }
//
//                            }
//
//                        }
//                        project_Rating_Variable = current_Value / projectListSize
//
////
//                        return project_Rating_Variable
//
//                    }
//
//                }
//                else{
//                    println("Size not matched .....")
//                }
//            }
//        }
//        return 0f
//    }
//
//    ///////////////// Rating function for project End //////////////////////
//
//    ///////////////// Rating function for Task //////////////////////////////
//
//    fun showtaskRatingWeightageandNA(
//        userPrimaryId: Int,
//        cycleObj: Cycle,
//        temp: Float,
//        userList: ArrayList<User>,
//        project: MutableMap<Int, ArrayList<String>>
//    ): Float {
//
//
//        // general variables
//        var task_Rating_Variable = 0f
//
//
//        // weightage
//        var totalweightage_Sum = 0f
//        var weightage_Size = 0
//
//        // N/A count
//        var Na_Count = 0
//
//        // variables to store userWeitage and project list
//        var userWeightage: ArrayList<Int>? = null
//        var taskList: ArrayList<String>? = null
//
//
//        // normal variables
//        var current_Value = 0f
//        var total_Value = temp
//        var taskListSize = 0
//
//
//        //// Calculating user project weightage and size
//
//        for (i in userList) {
//            if(userPrimaryId == i.empId)
//            {
//                for (j in i.taskWeitage) {
//                    totalweightage_Sum += j
//                    weightage_Size++
//                }
//            }
//        }
//
//        // map the emp Id and project
//
//        // to Store projectlist in variable
//        for (key in task.keys) {
//            if (key == userPrimaryId) {
//                taskList = task[key]!!
//            }
//        }
//
//        // Variable for count the elements in project list
//        taskListSize = taskList!!.size
//
//
//
//
//        // to Store Userlist in variable
//
//        for (weightage in userList) {
//            if (weightage.empId == userPrimaryId) {
//                userWeightage = weightage.taskWeitage
//            }
//        }
//
//        if (userWeightage != null) {
//            if (taskList != null) {
//                if (userWeightage.size == taskList.size)
//                {
//                    if (cycleObj.taskWeitage && cycleObj.NA)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for Task ")
//                        println("---------------------------------------")
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(taskList[i])
//                            println("---------------------------------------")
//
//
//                            // weightgae and NA
//
//
//                            var bool = true
//                            var convertInput = -1
//
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed ")
//                                }
//
//                                if(convertInput == 0)
//                                {
//                                    totalweightage_Sum -= userWeightage[i]
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    // total_Value = current_Value
//
//                                    total_Value += (convertInput * userWeightage[i])
//                                    bool = false
//                                }
//                                else
//                                {
//
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(taskList[i])
//
//                                }
//
//                            }
//
//                        }
//                        //println("Current Total : ${current_Value}")
//                        //  println("Overall Total : ${total_Value}")
//                        task_Rating_Variable = (current_Value / totalweightage_Sum)
//
//                        return task_Rating_Variable
//
//                    }
//                    else if(cycleObj.taskWeitage)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for Task ")
//                        println("---------------------------------------")
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(taskList[i])
//                            println("---------------------------------------")
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception)
//                                {
//                                    println("String Not Allowed")
//                                }
//
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += (convertInput * userWeightage[i])
//                                    // total_Value = current_Value
//
//                                    total_Value += (convertInput * userWeightage[i])
//                                    bool = false
//                                    // continue@inn
//                                }
//                                else {
//
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(taskList[i])
//                                }
//
//                            }
//
//                        }
//                        task_Rating_Variable = (current_Value / totalweightage_Sum)
//                        return task_Rating_Variable
//                    }
//                    else if(cycleObj.NA)
//                    {
//                        println("---------------------------------------")
//                        println("Rating for Task ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(taskList[i])
//                            println("---------------------------------------")
//
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@ while (bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//
//                                } catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput == 0)
//                                {
//
//                                    Na_Count++
//
//                                    bool = false
//                                } else if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    // total_Value = current_Value
//                                    total_Value += convertInput.toFloat()
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
//                                    println(taskList[i])
//                                }
//
//                            }
//
//                        }
//                        task_Rating_Variable = (current_Value / (taskListSize-Na_Count))
//
////                        println("Current Total : ${current_Value}")
////                        println("Overall Total : ${total_Value}")
//                        return task_Rating_Variable
//
//                    }
//                    else{
//
//                        println("---------------------------------------")
//                        println("Rating for Task ")
//                        println("---------------------------------------")
//
//                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1))
//                        {
//                            println("Current Total : ${current_Value}")
//                            println("Overall Total : ${total_Value}")
//                            println("---------------------------------------")
//                            println(taskList[i])
//                            println("---------------------------------------")
//
//                            println(taskList[i])
//
//
//                            // weightgae and NA
//
//                            var bool = true
//                            var convertInput = -1
//
//                            inner@while(bool)
//                            {
//                                var input = inputForRating.nextLine()
//
//                                try
//                                {
//                                    convertInput = input.toInt()
//                                }
//                                catch (e: Exception) {
//
//                                    println("String Not Allowed")
//                                }
//
//                                if (convertInput in 1..5)
//                                {
//                                    current_Value += convertInput
//                                    total_Value += convertInput.toFloat()
//                                    bool = false
//                                }
//                                else
//                                {
//                                    println("Enter the Range between 1 to 5 ")
//                                    println(taskList[i])
//                                }
//
//                            }
//                        }
//                        task_Rating_Variable = (current_Value / taskListSize)
//
////                        println("Current Total : ${current_Value}")
////                        println("Overall Total : ${total_Value}")
//
//                        return task_Rating_Variable
//
//                    }
//
//                }
//                else{
//                    println("Size not matched .....")
//                }
//            }
//        }
//        return 0f
//    }
//
//
//    ////////////////// Rating function for task end ///////////////////////////
//
//    ////// Final grade function   ///////
//
//    fun finalGrade(grade : Float)
//    {
//
//        if(grade > 4 && grade <=5)
//        {
//            println("Outstanding")
//        }
//        else if(grade > 3 && grade <=4)
//        {
//            println("Excellent")
//        }
//        else if(grade > 2 && grade <= 3)
//        {
//            println("Satisfactory")
//        }
//        else if(grade >1 && grade <= 2)
//        {
//            println("Needs Improvement")
//        }
//        else
//        {
//            println("Unsatisfactory")
//        }
//    }
//
//
//
//}

//        if (grade > 4 && grade <= 5) {
//            println("Outstanding")
//        } else if (grade > 3 && grade <= 4) {
//            println("Excellent")
//        } else if (grade > 2 && grade <= 3) {
//            println("Satisfactory")
//        } else if (grade > 1 && grade <= 2) {
//            println("Needs Improvement")
//        } else {
//            println("Unsatisfactory")
//        }
// }

//
//    fun repeatCycle(userId: Int) {
//        val userId = userId
//
//        println("Do you want to Rate again ?")
//        println("press 1 to continue / press 2 to exit")
//        var convertInput = -1
//
//        var bool = true
//        while (bool) {
//            var choice = inputForRating.nextLine()
//            try {
//                convertInput = choice.toInt()
//                // bool = false
//            } catch (e: Exception) {
//                println("Enter a valid input")
//                println()
//                println("Do you want to Rate again ?")
//                println("press 1 to continue / press 2 to exit")
//            }
//
//            when (convertInput) {
//                1 -> {
//
////                    var ele = cycle.cycleList
////                    for(i in 0 until cycle.cycleList.size)
////                    {
////                        println("outer call methid call")
////                        if(cycle.cycleNameVariable?.equals(ele) == true)
////                        {
////                            println("inner call method call")
////                            cycle.cycleList.remove(cycle.cycleList[i])
////                        }
////                    }
//
////                    println("for A ")
////
////                   // var index = 0
////                    for(i in cycle.cycleList) {
////                        println("for i ")
//////                        for( j in 0 until cycle.cycleList.size) {
//////                            println("for j ")
////                        if (i.cycleName == cycle.cycleNameVariable) {
////                            println("for k")
////                            cycle.cycleList.remove(i)
////                        }
////                        // index++
////                    }
//
//                    println("hello jameer")
//                    val iterator = cycle.cycleList.iterator()
//
//                    while(iterator.hasNext())
//                    {
//                        println("hello jaff")
//                        val item = iterator.next()
//
//                        println(cycle.cycleNameVariable)
//                        println(item)
//                        if(item.cycleName == cycle.cycleNameVariable)
//                        {
//                            println("ddwdwcdcdcdd")
//                            iterator.remove()
//                        }
//                    }
//
//
//
//                    for (i in 0 until Perfomance.arList.size) {
//                        if (userId == Perfomance.arList[i].empId) {
//                            println(cycle.cycleList)
//                            cycle.datecompare(Perfomance.arList[i].dateofjoin, cycle.cycleList)
//                        }
//
//                    }
//
//                    cycle.selectCycle(userId, cycle.cycleList)
//                    bool = false
//                }
//
//                2 -> {
//                    println("Thank you for Rating ")
//                    bool = false
//                    exitProcess(0)
//                }
//
//                else -> println("Enter a valid input")
//
//            }
//
//        }
//    }















