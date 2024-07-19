class Solution(object):
    def isValid(self, s):
        #maintain a dictionary for braceket pairs
        pairs = {'(':')','{':'}','[':']'}
        stack = []
        
        for bracket in s:
            if bracket in pairs:
                stack.append(bracket)
            else:
                if not stack:
                    return False
                openingBracket = stack.pop()
                if pairs[openingBracket] != bracket:
                    return False
        return not stack
        """
        :type s: str
        :rtype: bool
        """
        