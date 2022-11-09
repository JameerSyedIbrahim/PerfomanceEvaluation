import java.util.*
import kotlin.collections.*
import kotlin.system.exitProcess

object UserDetails {


    // map and Array list for goals
    val goal: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()

    val usergoal_jameer: ArrayList<String> = ArrayList<String>()
    val usergoal_jaffiri: ArrayList<String> = ArrayList<String>()
    val usergoal_surya: ArrayList<String> = ArrayList<String>()
    val usergoal_raja: ArrayList<String> = ArrayList<String>()

    // map and Arraylist for project
    val project: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()

    val userproject_jameer: ArrayList<String> = ArrayList<String>()
    val userproject_jaffiri: ArrayList<String> = ArrayList<String>()
    val userproject_surya: ArrayList<String> = ArrayList<String>()
    val userproject_raja: ArrayList<String> = ArrayList<String>()

    // map and Arraylist for task
    val task: MutableMap<Int, ArrayList<String>> = mutableMapOf<Int, ArrayList<String>>()

    val usertask_jameer: ArrayList<String> = ArrayList<String>()
    val usertask_jaffiri: ArrayList<String> = ArrayList<String>()
    val usertask_surya: ArrayList<String> = ArrayList<String>()
    val usertask_raja: ArrayList<String> = ArrayList<String>()

    @JvmStatic
    fun add() {

        // creating arraylist and map for all users
        ////// First User Jameer //////////////////
        usergoal_jameer.add("Learn Kotlin")
        usergoal_jameer.add("Learn Automation Tool")
        usergoal_jameer.add("Learn Swift")
        usergoal_jameer.add("Learn Leave Tracker Module")
        usergoal_jameer.add("Learn java")

        goal[101] = usergoal_jameer

        userproject_jameer.add("Performance Evaluation")
        userproject_jameer.add("Time Tracker")
        userproject_jameer.add("Work Drive")
        userproject_jameer.add("People App")
        userproject_jameer.add("Calender App")

        project[101] = userproject_jameer


        usertask_jameer.add("Assignment-1")
        usertask_jameer.add("Assignment-2")
        usertask_jameer.add("Assignment-3")
        usertask_jameer.add("Assignment-4")
        usertask_jameer.add("Assignment-5")

        task[101] = usertask_jameer

        //////////////////////////////////////////////////

        /////////////// Second User ////////////////////

        usergoal_jaffiri.add("Learn Kotlin")
        usergoal_jaffiri.add("Learn Python")
        usergoal_jaffiri.add("Learn C")
        usergoal_jaffiri.add("Learn Java")

        goal[102] = usergoal_jaffiri


        userproject_jaffiri.add("Leave Tracker")
        userproject_jaffiri.add("Work Drive")
        userproject_jaffiri.add("Zoho mail")
        userproject_jaffiri.add("Zoho Books")

        project[102] = userproject_jaffiri


        usertask_jaffiri.add("Assignment-1")
        usertask_jaffiri.add("Assignment-2")
        usertask_jaffiri.add("Assignment-3")
        usertask_jaffiri.add("Assignment-4")

        task[102] = usertask_jaffiri

        //////////////////////////////////////////////////

        ///////////////// User 3 Surya ///////////////////

        usergoal_surya.add("Learn Kotlin")
        usergoal_surya.add("Learn Python")
        usergoal_surya.add("Learn C")

        goal[103] = usergoal_surya


        userproject_surya.add("Leave Tracker")
        userproject_surya.add("Work Drive")

        project[103] = userproject_surya


        usertask_surya.add("Assignment-1")

        task[103] = usertask_surya


        //////////////////////////////////////////////////

        /////////////// User 4 Raja //////////////////

        usergoal_raja.add("Learn Kotlin")
        goal[104] = usergoal_raja


        userproject_raja.add("Leave Tracker")
        project[104] = userproject_raja


        usertask_raja.add("Assignment-1")
        task[104] = usertask_raja

        //////////////////////////////////////////////

    }

    // object for cycle class
    var cycle = Cycle()
    var user = User()


    // for getting input
    var inputForRating = Scanner(System.`in`)


    fun showGoalRating(id: Int, cycleObj: Cycle) {
        val userPrimaryId = id
        var goalRatingVariable: Float
        var goal = 0f


        goalRatingVariable = showGoalRatingWeightageandNA(userPrimaryId, cycleObj, Perfomance.arList, project)
        goal = goalRatingVariable


        if (cycleObj.project) {
            showProjectRating(userPrimaryId, cycleObj, goalRatingVariable, goal)

        } else if (cycleObj.task) {
            // println("overall Rating is : ${goalRatingVariable}")
            showTaskRating(userPrimaryId, cycleObj, goalRatingVariable, goal)
        } else {
            println("overall Rating is : ${"%.1f".format(goalRatingVariable)}")
            println("-------------------------")
            finalGrade(goalRatingVariable)
            //repeatCycle(userPrimaryId)
            println("You Rated Successfully")


        }

    }

    fun showProjectRating(id: Int, cycleObj: Cycle, overallratingvariable: Float = 0f, goal: Float = 0f) {

        val userPrimaryId = id
        var projectRatingVariable: Float = 0f
        var overallRatingVariable = overallratingvariable

        var goal = goal
        var projects = 0f


        projectRatingVariable =
            showProjectRatingWeightageandNA(userPrimaryId, cycleObj, overallRatingVariable, Perfomance.arList, project)
        overallRatingVariable += projectRatingVariable

        if (goal > 0) {
            projectRatingVariable = overallRatingVariable / 2
            println("overall Rating is : ${"%.1f".format(projectRatingVariable)} ")
            projects = 1f

            if (!(cycleObj.task))
                finalGrade(projectRatingVariable)

        } else {
            println("overall Rating is : ${"%.1f".format(projectRatingVariable)}")
            println("-------------------------")
            projects = 1f
            finalGrade(projectRatingVariable)
        }


        // check for task
        if (cycleObj.task) {
            showTaskRating(userPrimaryId, cycleObj, overallRatingVariable, goal, projects)
        } else {
            println("You Rated Successfully")
        }


    }


    fun showTaskRating(id: Int, cycleObj: Cycle, temp: Float = 0f, goal: Float = 0f, projects: Float = 0f) {
        val userPrimaryId = id
        var taskRatingVariable = 0f
        var overallRatingVariable = temp

        var goal = goal
        var projects = projects



        taskRatingVariable = showtaskRatingWeightageandNA(userPrimaryId, cycleObj, temp, Perfomance.arList, project)
        // taskRatingVariable += overallRatingVariable
        overallRatingVariable += taskRatingVariable

        if ((overallRatingVariable > 0) && (goal > 0) && (projects > 0)) {
            overallRatingVariable /= 3
            println("Overall Rating : ${"%.1f".format(overallRatingVariable)}")
            finalGrade(overallRatingVariable)

        } else if ((overallRatingVariable > 0) && ((goal > 0) || (projects > 0))) {

            taskRatingVariable = overallRatingVariable / 2
            println("Overall Rating : ${"%.1f".format(taskRatingVariable)}")
            finalGrade(taskRatingVariable)
        } else {
            // println("overall for single is  ${taskRatingVariable}")
            println("Overall Rating : ${"%.1f".format(taskRatingVariable)}")
            finalGrade(taskRatingVariable)

        }

        println("you Rated Successfully ")
    }


    fun showGoalRatingWeightageandNA(
        userPrimaryId: Int,
        cycleObj: Cycle,
        userList: ArrayList<User>,
        project: MutableMap<Int, ArrayList<String>>
    ): Float {


        //  variables for overall score
        var goal_Rating_Variable = 0f


        var totalweightage_Sum = 0f
        var weightage_Size = 0

        var Na_Count = 0

        // variables to store userWeightage and project list
        var userWeightage: ArrayList<Int>? = null
        var goalList: ArrayList<String>? = null


        var current_Value = 0f
        var total_Value = 0f
        var goalSize = 0


        //// Calculating user project weightage and size

        for (i in userList) {
            if (userPrimaryId == i.empId) {
                for (j in i.goalWeitage) {
                    totalweightage_Sum += j
                    weightage_Size++
                }
            }
        }

        // to Store projectlist in variable
        for (key in goal.keys) {
            if (key == userPrimaryId) {
                goalList = goal[key]!!
            }
        }

        // Variable for count the elements in project list
        goalSize = goalList!!.size

        // to Store Userlist in variable

        for (weightage in userList) {
            if (weightage.empId == userPrimaryId) {
                userWeightage = weightage.goalWeitage
            }
        }

        if (userWeightage != null) {
            if (goalList != null) {
                if (userWeightage.size == goalList.size) {

                    if (cycleObj.goalWeitage && cycleObj.NA) {
                        println("---------------------------------------")
                        println("Rating for Goal ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(goalList[i])
                            println("---------------------------------------")

                            var bool = true
                            var convertInput = -1


                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()

                                } catch (e: Exception) {

                                    println("Alphabets and Special characters are not allowed")
                                }


                                if (convertInput == 0) {
                                    totalweightage_Sum -= userWeightage[i]
                                    bool = false
                                } else if (convertInput in 1..5) {
                                    current_Value += (convertInput * userWeightage[i])
                                    total_Value = current_Value
                                    bool = false
                                } else {

                                    println("Enter the Range between 1 to 5 or N/A(0) ")
                                    println(goalList[i])

                                }

                            }

                        }
                        goal_Rating_Variable = (total_Value / totalweightage_Sum)

                        return goal_Rating_Variable

                    }// if block for weightage and NA finished
                    else if (cycleObj.goalWeitage) {
                        println("---------------------------------------")
                        println("Rating for Goal ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(goalList[i])
                            println("---------------------------------------")


                            // weightgae and NA

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                } catch (e: Exception) {
                                    println("Alphabets and Special characters are not allowed")
                                }


                                if (convertInput in 1..5) {
                                    current_Value += (convertInput * userWeightage[i])
                                    total_Value = current_Value
                                    bool = false
                                    // continue@inn
                                } else {

                                    println("Enter the Range between 1 to 5 ")
                                    println(goalList[i])
                                }

                            }
                        }
                        goal_Rating_Variable = (total_Value / totalweightage_Sum)

                        return goal_Rating_Variable
                    } else if (cycleObj.NA) {
                        println("---------------------------------------")
                        println("Rating for Goal ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(goalList[i])
                            println("---------------------------------------")

                            var bool = true

                            var convertInput = -1
                            inner@ while (bool) {

                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                    println("convert input value")
                                    println(convertInput)

                                } catch (e: Exception) {

                                    println("Alphabets and Special characters are not allowed")
                                }


                                if (convertInput == 0) {

                                    Na_Count++
                                    bool = false

                                } else if (convertInput in 1..5) {
                                    current_Value += convertInput
                                    total_Value = current_Value
                                    bool = false
                                } else {

                                    println("Enter the Range between 1 to 5 or N/A(0) ")
                                    println(goalList[i])
                                }

                            }

                        }

                        goal_Rating_Variable = (total_Value / (goalSize - Na_Count))

                        return goal_Rating_Variable

                    } else {
                        println("---------------------------------------")
                        println("Rating for Goal ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(goalList[i])
                            println("---------------------------------------")


                            // weightgae and NA

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                } catch (e: Exception) {

                                    println("Alphabets and Special characters are not allowed")
                                }

                                if (convertInput in 1..5) {
                                    current_Value += convertInput
                                    total_Value = current_Value
                                    bool = false
                                } else {
                                    println("Enter the Range between 1 to 5 ")
                                    println(goalList[i])
                                }

                            }
                            // println("----------------------")

                        }
                        goal_Rating_Variable = (total_Value / goalSize)

                        // println("Current Total : ${current_Value}")
                        //println("Overall Rating : ${total_Value}")
                        println()
                        return goal_Rating_Variable

                    }

                } else {
                    println("Size not matched .....")
                }
            }
        }
        return 0f
    }


    fun showProjectRatingWeightageandNA(
        userPrimaryId: Int,
        cycleObj: Cycle,
        temp: Float = 0f,
        userList: ArrayList<User>,
        project: MutableMap<Int, ArrayList<String>>
    ): Float {


        // general variables for overall score
        var project_Rating_Variable = 0f


        // weightage
        var totalweightage_Sum = 0f
        var weightage_Size = 0

        // N/A count
        var Na_Count = 0

        // variables to store userWeightage and project list
        var userWeightage: ArrayList<Int>? = null
        var projectList: ArrayList<String>? = null


        // normal variables
        var current_Value = 0f
        var total_Value = temp
        var projectListSize = 0


        //// Calculating user project weightage and size

        for (i in userList) {
            if (i.empId == userPrimaryId) {
                for (j in i.projectWeitage) {
                    totalweightage_Sum += j
                    weightage_Size++
                }
            }
        }

        // map the emp Id and project

        // to Store projectlist in variable
        for (key in project.keys) {
            if (key == userPrimaryId) {
                projectList = project[key]!!
            }
        }

        // Variable for count the elements in project list
        projectListSize = projectList!!.size


        // to Store Userlist in variable

        for (weightage in userList) {
            if (weightage.empId == userPrimaryId) {
                userWeightage = weightage.projectWeitage
            }
        }

        if (userWeightage != null) {
            if (projectList != null) {
                if (userWeightage.size == projectList.size) {
                    if (cycleObj.projectWeitage && cycleObj.NA) {
                        println("---------------------------------------")
                        println("Rating for project ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(projectList[i])
                            println("---------------------------------------")
                            // weightgae and NA

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()

                                } catch (e: Exception) {

                                    println("String Not Allowed ")
                                }

                                if (convertInput == 0) {
                                    totalweightage_Sum -= userWeightage[i]
                                    bool = false
                                } else if (convertInput in 1..5) {
                                    current_Value += (convertInput * userWeightage[i])
                                    total_Value += (convertInput * userWeightage[i])
                                    bool = false
                                } else {
                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
                                    println(projectList[i])

                                }

                            }

                        }
                        project_Rating_Variable = (current_Value / totalweightage_Sum)

//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
                        return project_Rating_Variable

                    }// if block for weightage and NA finished
                    else if (cycleObj.projectWeitage) {
                        println("---------------------------------------")
                        println("Rating for project ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(projectList[i])
                            println("---------------------------------------")

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                } catch (e: Exception) {
                                    println("String Not Allowed")
                                }


                                if (convertInput in 1..5) {
                                    current_Value += (convertInput * userWeightage[i])
                                    //   total_Value = current_Value
                                    total_Value += (convertInput * userWeightage[i])
                                    bool = false
                                    // continue@inn
                                } else {

                                    println("Enter the Range between 1 to 5 ")
                                    println(projectList[i])
                                }

                            }

                        }
                        project_Rating_Variable = (current_Value / totalweightage_Sum)
//                        println("Current Total : ${current_Value}")
//                        println("overall Total : ${total_Value} ")

                        return project_Rating_Variable
                    } else if (cycleObj.NA) {
                        println("---------------------------------------")
                        println("Rating for project ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(projectList[i])
                            println("---------------------------------------")


                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()

                                } catch (e: Exception) {

                                    println("String Not Allowed")
                                }

                                if (convertInput == 0) {

                                    Na_Count++

                                    bool = false
                                } else if (convertInput in 1..5) {
                                    current_Value += convertInput
                                    // total_Value = current_Value
                                    total_Value += convertInput

                                    bool = false
                                } else {
                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
                                    println(projectList[i])
                                }

                            }

                        }
                        project_Rating_Variable = (current_Value / (projectListSize - Na_Count))
//                        println("Current Total : ${current_Value}")
//                        println("overall Total : ${total_Value} ")

                        return project_Rating_Variable

                    } else {
                        println("---------------------------------------")
                        println("Rating for project ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(projectList[i])
                            println("---------------------------------------")

                            // weightgae and NA

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                } catch (e: Exception) {

                                    println("String Not Allowed")
                                }

                                if (convertInput in 1..5) {
                                    current_Value += convertInput
                                    total_Value += convertInput
                                    bool = false
                                } else {
                                    println("Enter the Range between 1 to 5")
                                    println(projectList[i])
                                }

                            }

                        }
                        project_Rating_Variable = current_Value / projectListSize

//                      
                        return project_Rating_Variable

                    }

                } else {
                    println("Size not matched .....")
                }
            }
        }
        return 0f
    }


    fun showtaskRatingWeightageandNA(
        userPrimaryId: Int,
        cycleObj: Cycle,
        temp: Float,
        userList: ArrayList<User>,
        project: MutableMap<Int, ArrayList<String>>
    ): Float {


        // general variables
        var task_Rating_Variable = 0f


        // weightage
        var totalweightage_Sum = 0f
        var weightage_Size = 0

        // N/A count
        var Na_Count = 0

        // variables to store userWeitage and project list
        var userWeightage: ArrayList<Int>? = null
        var taskList: ArrayList<String>? = null


        // normal variables
        var current_Value = 0f
        var total_Value = temp
        var taskListSize = 0


        //// Calculating user project weightage and size

        for (i in userList) {
            if (userPrimaryId == i.empId) {
                for (j in i.taskWeitage) {
                    totalweightage_Sum += j
                    weightage_Size++
                }
            }
        }

        // map the emp Id and project

        // to Store projectlist in variable
        for (key in task.keys) {
            if (key == userPrimaryId) {
                taskList = task[key]!!
            }
        }

        // Variable for count the elements in project list
        taskListSize = taskList!!.size


        // to Store Userlist in variable

        for (weightage in userList) {
            if (weightage.empId == userPrimaryId) {
                userWeightage = weightage.taskWeitage
            }
        }

        if (userWeightage != null) {
            if (taskList != null) {
                if (userWeightage.size == taskList.size) {
                    if (cycleObj.taskWeitage && cycleObj.NA) {
                        println("---------------------------------------")
                        println("Rating for Task ")
                        println("---------------------------------------")
                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(taskList[i])
                            println("---------------------------------------")


                            // weightgae and NA


                            var bool = true
                            var convertInput = -1


                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()

                                } catch (e: Exception) {

                                    println("String Not Allowed ")
                                }

                                if (convertInput == 0) {
                                    totalweightage_Sum -= userWeightage[i]
                                    bool = false
                                } else if (convertInput in 1..5) {
                                    current_Value += (convertInput * userWeightage[i])
                                    // total_Value = current_Value

                                    total_Value += (convertInput * userWeightage[i])
                                    bool = false
                                } else {

                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
                                    println(taskList[i])

                                }

                            }

                        }
                        //println("Current Total : ${current_Value}")
                        //  println("Overall Total : ${total_Value}")
                        task_Rating_Variable = (current_Value / totalweightage_Sum)

                        return task_Rating_Variable

                    } else if (cycleObj.taskWeitage) {
                        println("---------------------------------------")
                        println("Rating for Task ")
                        println("---------------------------------------")
                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(taskList[i])
                            println("---------------------------------------")

                            // weightgae and NA

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                } catch (e: Exception) {
                                    println("String Not Allowed")
                                }


                                if (convertInput in 1..5) {
                                    current_Value += (convertInput * userWeightage[i])
                                    // total_Value = current_Value

                                    total_Value += (convertInput * userWeightage[i])
                                    bool = false
                                    // continue@inn
                                } else {

                                    println("Enter the Range between 1 to 5 ")
                                    println(taskList[i])
                                }

                            }

                        }
                        task_Rating_Variable = (current_Value / totalweightage_Sum)
                        return task_Rating_Variable
                    } else if (cycleObj.NA) {
                        println("---------------------------------------")
                        println("Rating for Task ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {

                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(taskList[i])
                            println("---------------------------------------")


                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()

                                } catch (e: Exception) {

                                    println("String Not Allowed")
                                }

                                if (convertInput == 0) {

                                    Na_Count++

                                    bool = false
                                } else if (convertInput in 1..5) {
                                    current_Value += convertInput
                                    // total_Value = current_Value
                                    total_Value += convertInput.toFloat()
                                    bool = false
                                } else {
                                    println("Enter the Range between 1 to 5 ....N/A(0) ")
                                    println(taskList[i])
                                }

                            }

                        }
                        task_Rating_Variable = (current_Value / (taskListSize - Na_Count))

//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")
                        return task_Rating_Variable

                    } else {

                        println("---------------------------------------")
                        println("Rating for Task ")
                        println("---------------------------------------")

                        inn@ for (i in 0..(userWeightage?.size?.minus(1) ?: -1)) {
                            println("Current Total : ${current_Value}")
                            println("Overall Total : ${total_Value}")
                            println("---------------------------------------")
                            println(taskList[i])
                            println("---------------------------------------")

                            println(taskList[i])


                            // weightgae and NA

                            var bool = true
                            var convertInput = -1

                            inner@ while (bool) {
                                var input = inputForRating.nextLine()

                                try {
                                    convertInput = input.toInt()
                                } catch (e: Exception) {

                                    println("String Not Allowed")
                                }

                                if (convertInput in 1..5) {
                                    current_Value += convertInput
                                    total_Value += convertInput.toFloat()
                                    bool = false
                                } else {
                                    println("Enter the Range between 1 to 5 ")
                                    println(taskList[i])
                                }

                            }
                        }
                        task_Rating_Variable = (current_Value / taskListSize)

//                        println("Current Total : ${current_Value}")
//                        println("Overall Total : ${total_Value}")

                        return task_Rating_Variable

                    }

                } else {
                    println("Size not matched .....")
                }
            }
        }
        return 0f
    }


    fun finalGrade(grade: Float) {

        when (grade) {
            in 4.1..5.0 -> println("Outstanding")
            in 3.1..4.0 -> println("Excellent")
            in 2.1..3.0 -> println("Satisfactory")
            in 1.1..2.0 -> println("Needs Improvement")
            else -> println("Unsatisfactory")
        }
    }

}













