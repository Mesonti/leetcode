import java.util.LinkedList

class Sol {

    // 1342 completed
    fun numberOfSteps(num: Int): Int {
        var newNum = num
        var steps = 0
        while (newNum > 0) {
            steps++
            if (newNum % 2 == 0) {
                newNum /= 2
            }
            else {
                newNum -= 1
            }
        }
        return steps
    }

    fun middleNode(head: LinkedList<Int>) {
        // найти размер списка
        // с помощью сортировки понять какой в середине
        // получить его индекс и вывести его в консоль
        for (element in head) {
            
        }
    }

    // completed
    fun isLeapYear(year: Int): Boolean {
        return if ((year % 4) == 0) return true else false
    }


    fun spinWords(sentence: String): String {
        var count: String = ""
        for (word in sentence) {
            if (word.code >= 5) {
                if (word == ' ') {

                }
                count = word.toString().reversed()
                println(count)
            }
            else false
        }
        return count
    }

}