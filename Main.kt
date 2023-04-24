fun main() {

    val arr: IntArray = intArrayOf(1, 3, 3, 6)
    println(runningSum(arr))
}


fun runningSum(nums: IntArray): IntArray {
    var result = 0
    for (item in nums) {
        result += item
        println(result)
    }
    return nums


}

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/