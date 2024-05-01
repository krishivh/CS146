class Solution(object):
    def firstBadVersion(self, n):
        low = 0
        high = n
        answer = -1
        while low <= high:
            mid = low + (high-low)/2
            if(isBadVersion(mid)):
                answer = mid
                high = mid-1
            if(not(isBadVersion(mid))):
                low = mid+1
        return answer