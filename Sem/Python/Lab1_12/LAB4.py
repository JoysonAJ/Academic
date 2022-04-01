'''------------------------------------------------------------------
LAB4.py
4.Write a Python program to check for palindrome. Input a string from the keyboard.
The string can have alphabets, spaces, question marks, periods and apostrophes
only. Check whether the string is a palindrome
RegNo: 2117010
15-01-2022
------------------------------------------------------------------'''

Str1 = str(input(" Enter the String : "))

special_characters = '''!{}[]():;,<>/\|!@#$%^&*-~'''

RevStr1 = ''
for i in special_characters:
    if Str1 in i:
        print("String Contains Spceial Character")
        break
    else:
        RevStr1 = Str1[::-1]

if Str1 == RevStr1:
    print(" Strings are Equal \n so it's palindrome")
else:
    print(" String are not equal \n so it's not Palindrome")
