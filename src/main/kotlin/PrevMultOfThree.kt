class PrevMultOfThree {

    fun prevIntMultOfThree(n: Int): Int? {
        // 123324
        // if digit multiply of three 3 return this
        // else return null or -1
        val nToString = n.toString()
        var totalChar = ""
        for (char in nToString) {
            if (char == '3' || char == '6' || char == '9')
                totalChar = char.toString()
        }
        return null

    }

}