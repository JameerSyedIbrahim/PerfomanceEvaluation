import java.lang.Exception
import java.util.Scanner

data class User(
    var name: String,
    var empId: Int,
    var dateofjoin: String,
    var goalWeitage: ArrayList<Int>,
    var projectWeitage: ArrayList<Int>,
    var taskWeitage: ArrayList<Int>
) {


    constructor() : this("", 0, "", ArrayList(), ArrayList(), ArrayList()) {

    }


    val sysinput = Scanner(System.`in`)


    // displays self rating user
    fun showSelf(arlist: ArrayList<User>) {

        for (i in 0 until 1) {
            println("Employee Name : " + " " + arlist[i].name)

        }

    }

    // displays peer rating users
    fun showOtherUserName(arlist: ArrayList<User>) {
        var j = 1
        for (i in 1..arlist.size - 1) {
            println("$j. ${arlist[i].name}")
            j++
        }
    }

    // selecting individual user
    fun showIndivudualUser(userList: ArrayList<User>): User {
        println("Exit press 0")
        println("Which User you want to Rate :")

        var convertInput = -1

        var bool = true

        inner@ while (bool) {
            var input = sysinput.nextLine()

            try {
                convertInput = input.toInt()
            } catch (e: Exception) {
                println("Alphabets and Special characters are not allowed")
                println("Enter the valid option : ")
                continue@inner
            }


            when (convertInput) {

                0 -> Perfomance.start()
                1 -> {
                    println(userList[convertInput].name)
                    return userList[convertInput]
                }

                2 -> {
                    println(userList[convertInput].name)
                    return userList[convertInput]
                }

                3 -> {
                    println(userList[convertInput].name)
                    return userList[convertInput]
                }

                else -> {
                    println("Enter a valid option")
                    showIndivudualUser(userList)

                }
            }
        }
        return User()
    }
}





