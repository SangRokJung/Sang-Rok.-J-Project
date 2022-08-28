# A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
# it reads the same forward and backward. 
# Alphanumeric characters include letters and numbers.
# Given a string s, return true if it is a palindrome, or false otherwise.

# Example 1:
# Input: s = "A man, a plan, a canal: Panama"
# Output: true
# Explanation: "amanaplanacanalpanama" is a palindrome.


# Example 2:
# Input: s = "race a car"
# Output: false
# Explanation: "raceacar" is not a palindrome.


# Example 3:
# Input: s = " "
# Output: true
# Explanation: s is an empty string "" after removing non-alphanumeric characters.
# Since an empty string reads the same forward and backward, it is a palindrome.


s1 = input("Enter the sentence")

# s2 = s1.lower().replace(" ", "")[::-1]

s2 = str(list(filter(str.isalpha(), s1.lower().replace(" ", "")[::-1])))

if s1 == s2 :
    print(" ""%s"" is a palindrome. " % s2)
elif s1 != s2 :
    print(" ""%s"" is not a palindrome. " % s2)

