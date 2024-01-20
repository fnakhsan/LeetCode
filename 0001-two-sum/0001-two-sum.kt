class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, i ->
            var iterator = if (index != nums.lastIndex) index + 1 else index
            while (i + nums[iterator] != target && iterator != index) {
                if (iterator < nums.lastIndex) {
                    iterator += 1
                } else {
                    break
                }
            }
            if (i + nums[iterator] == target) return intArrayOf(index, iterator)
        }
        return intArrayOf()
    }
}