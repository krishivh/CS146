class lab6(object):
    prerequisiteDict = {}
    
    def canFinish(self, numCourses, prerequisites):
        self.visitedCourses = set()
        for i in range(numCourses):
            self.prerequisiteDict[i] = []
        for pair in prerequisites:
            self.prerequisiteDict[pair[0]].append(pair[1])
        for j in range(numCourses):
            if not self.dfs(j, self.visitedCourses):
                return False
        return True
    
    visitedCourses = set() 

    def dfs(self, course, visitedCourses):  
        if course in visitedCourses:
            return False
        if not self.prerequisiteDict[course]:
            return True  
        visitedCourses.add(course)
        for prereq in self.prerequisiteDict[course]:
            if not self.dfs(prereq, visitedCourses):
                return False
        visitedCourses.remove(course)
        self.prerequisiteDict[course] = []
        return True
    
     

        


        
        
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: bool
        """
        