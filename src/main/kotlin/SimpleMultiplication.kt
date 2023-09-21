// function is return total result of calculating enter data
class SimpleMultiplication {

    fun simpleMultiplication(n: Int): Int {

        return if ((n % 2) == 0) {
            n * 9
        }
        else {
            n * 8
        }
    }

}