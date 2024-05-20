class Solution(object):
    def longestPalindrome(self, s):
        letters = {} #create new dictionary which will have values that associate with each letter.
        #iterate through the string and if the letter is already in the dictionary, increment the count, or else create a new letter with a key of 1
        for char in s:
            if char not in letters:
                letters[char] = 1
            else:
                letters[char] +=1
        
        #the length of the palindrome is 0 at this point and we have 0 letters that are odd in the moment
        length = 0
        odd = 0

        #base case if letters only has one unique character return that lenght
        if len(letters)==1:
            return(letters[s[0]])

        #for all the values that are in the dictionary    
        for i in letters.values():
            #if there are more than one of those letters in the string we do a check
            if i >1:
                #the check is to see if it is even, and if it is that means that we can just add it to the palindrome bc there will be a way to make it equal on both sides
                if i % 2 ==0:
                    length +=i
                #if the number of letters is odd, then we can add an even number of that odd amount of letters and then we can say that there is one odd letter reminaing that is not being used
                else:
                    length+=i-1
                    odd+=1
            #if i is not greater than one, then we know that there must be only one element so we can just add one to odd anyways
            else:
                odd+=1
        #this is a final check to see after the while loop if there are any odd singular elements that are not used, and if there is we can add it to the center of the string to make a palindrome so we add one to the length
        if odd>0:
            length+=1
        #return the final length
        return length


        