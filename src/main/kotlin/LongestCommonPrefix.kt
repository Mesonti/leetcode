//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {

        // найти способ находить префиксы элементов и записывать их
        val prefix: Char
        val newString = strs.map { it.commonPrefixWith(prefix.toString()) }

        // беру строку,
        // сохраняю префикс,
        // сравниваю префикс с префиксом следующей строки:
            // если префикс совпадает > 2 раз, то иду дальше,
            // если префикс не совпадает, то останавливаюсь и возвращаю пустую строку — ""
        return newString.toString()

    }
}