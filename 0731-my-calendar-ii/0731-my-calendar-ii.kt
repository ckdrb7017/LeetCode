class MyCalendarTwo() {

         val calendar = TreeMap<Int, Int>()

        fun book(start: Int, end: Int): Boolean {
            calendar.put(start, calendar.getOrDefault(start, 0) + 1)
            calendar.put(end, calendar.getOrDefault(end, 0) - 1)
            var sum = 0
            for (count in calendar.values) {
                sum += count
                if (sum > 2) {
                    calendar.put(start, calendar.getOrDefault(start, 0) - 1)
                    calendar.put(end, calendar.getOrDefault(end, 0) + 1)
                    return false
                }
            }

            return true
        }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * var obj = MyCalendarTwo()
 * var param_1 = obj.book(start,end)
 */