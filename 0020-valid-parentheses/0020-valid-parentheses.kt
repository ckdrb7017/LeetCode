class Solution {
    fun isValid(s: String): Boolean {
        val arrayDeque = ArrayDeque<Char>()
        s.forEach {
            if (arrayDeque.isEmpty()) {
                arrayDeque.add(it)
            } else {
                if (it == '(' || it == '[' || it == '{') {
                    arrayDeque.add(it)
                } else {
                    when (it) {
                        ')' -> {
                            if (arrayDeque.last() == '(') arrayDeque.removeLast()
                            else return false
                        }

                        ']' -> {
                            if (arrayDeque.last() == '[') arrayDeque.removeLast()
                            else return false
                        }

                        '}' -> {
                            if (arrayDeque.last() == '{') arrayDeque.removeLast()
                            else return false
                        }
                    }
                }
            }
        }
        return arrayDeque.isEmpty()
    }
    }