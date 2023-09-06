class MyCalendar() {

        val calendar = TreeMap<Int, Int>()

        fun book(start: Int, end: Int): Boolean {
            val floorKey = calendar.floorKey(start)
            val ceilingKey = calendar.ceilingKey(start)
            if((floorKey == null || calendar[floorKey]!! <= start) && (ceilingKey == null || end <= ceilingKey)){
                calendar.put(start, end)
                return true
            }

            return false
        }

}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = MyCalendar()
 * var param_1 = obj.book(start,end)
 */