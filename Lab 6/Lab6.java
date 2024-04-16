public class Lab6 {

    //initialize a hashmap which has the course as an integer as the key mapped to lists of prerequisite courses to take
    private Map<Integer,List<Integer>> prerequisiteMap = new HashMap<> () ;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //go through each distinct course one by one
        for (int i = 0; i < numCourses; i++) {
        //map each course to an empty list
            prerequisiteMap.put (i, new ArrayList<> ()) ;
    }
        //use a for each loop to find each pair of course to prereq combos
        for (int[] pair : prerequisites) {
            //from the hashmap it gets the key of that value of the course and adds the paired prerequisite into the hashmap
            prerequisiteMap.get(pair[0]).add(pair[1]) ;
    }
    
    //loop over every course in numCourses using dfs
    for (int j = 0; j < numCourses; j++) {
        //if dfs doesn't work for the particular course, that means that we know we cannot finish that course and so it returns false and we know that all the courses cannot be completed
        if (!dfs (j)){ 
            return false; 
        }  
    }
    //if dfs works for each course then we get to this stage so we can return true that each course can be completed  
    return true;
}
    
    //create a hash set that will keep track of the courses that have been visited during dfs
    private Set<Integer> visitedCourses = new HashSet<>() ;

    //this is for the dfs that we call in the canFinish part
    private boolean dfs(int course) {
        //if the current course has been visited, that means that there is a cycle and so we know that we cannot complete this course so we return false
        if (visitedCourses.contains(course)){
            return false;
        }
        //if there are no prerequisites for the course, that means that we can complete the course so we return true
        if (prerequisiteMap.get(course).isEmpty()){
            return true;
        }
        //add the current course to the visited hash set
        visitedCourses.add(course);
        //goes through each of the prerequisites of the current course
        for (int prereq : prerequisiteMap.get(course)) {
            //if any of the prerequisite courses returns a cycle that means that it cannot be done and we return false
            if (!dfs(prereq)){
                return false;
            } 
        }
        //if dfs works for all prereqs of the course, then we can remove the course from visited courses bc it can be completed
        visitedCourses.remove(course) ;
        prerequisiteMap.put(course, new ArrayList<>()) ;
        return true;
    }

}