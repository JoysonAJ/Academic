'''------------------------------------------------------------------
LAB16.py
16.Write a function called string_dict that will take as parameter a string. The string can have alphabets, spaces, question marks, periods and apostrophes only. The function returns a dictionary. The keys of the dictionary should be the words from the original string, and the values should be the frequency of that word.
RegNo: 2117010
19-02-2022
------------------------------------------------------------------'''

def StringToList(Str1):
    list1 = Str1.split(' ')
    return list1

def ResultDictionary(li):
    f = {}
    for val in li:
        flag = True
        if not val.isalnum() and '?' not in val and '.' not in val:
            flag = False

        if flag:
            if val in f.keys():
                f[val] = f[val] + 1
            else:
                f[val] = 1
        else:
            print(val,"Not added To list")

    return f

Main_string = input("Enter the Sentance ")

list1 = []
list1 = StringToList(Main_string)
print(list1)

final_Result = {}
final_Result = ResultDictionary(list1)

print(final_Result)
