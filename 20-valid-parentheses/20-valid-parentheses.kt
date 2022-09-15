class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false
        
        val stack: Stack<Char> = Stack()
        for (i in s.indices) {
            if (stack.isEmpty() && (s[i] == ')' || s[i] == '}' || s[i] == ']')) {
                return false
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() === '(' && s[i] == ')') {
                        stack.pop()
                    } else if (stack.peek() === '{' && s[i] == '}') {
                        stack.pop()
                    } else if (stack.peek() === '[' && s[i] == ']') {
                        stack.pop()
                    } else stack.add(s[i])
                } else stack.add(s[i])
            }
        }
        return stack.isEmpty()
    }
}