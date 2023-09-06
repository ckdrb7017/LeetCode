class MyCalendarThree() {

        val map = TreeMap<Int, Int>()

        fun book(startTime: Int, endTime: Int): Int {
            map.put(startTime, map.getOrDefault(startTime, 0)+1)
            map.put(endTime, map.getOrDefault(endTime, 0)-1)

            var maxCount = 0
            var sum = 0
            for(count in map.values){
                sum += count
                maxCount = Math.max(sum, maxCount)
            }

            return maxCount
        }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * var obj = MyCalendarThree()
 * var param_1 = obj.book(startTime,endTime)
 */