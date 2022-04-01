'''------------------------------------------------------------------
LAB3.py
3.Write python program to remove all punctuation from the string provided by the user.
RegNo: 2117010
20-12-2021
------------------------------------------------------------------'''

UserString = str(input("Enter the String with punctuation "))

special_characters = ''' !{}[]()'":;.,<> /? \ | !@#$%^&*_- ~ '''
res = ""
for i in UserString:
    if i not in special_characters:
        res += i
print("USER INPUT",UserString)
print("THE PUNCTUATION REMOVER RESULT",res)
