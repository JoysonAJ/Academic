'''------------------------------------------------------------------
LAB19.py
19.Write a python program to perform
i) Reverse in descending order, union in ascending order, intersection in ascending order using the input present in the file.
ii) Print the output as well as save the file in the new file with file name as ‘output_program_<<programnumber>>_ <registernumber>>_<<year>>_<<month>>_<<date>>.txt’
iii) Output of reverse, union, intersection should be printed in newline.
iv) Copy the program file from existing file destination to location where your input and out file is present.
RegNo: 2117010
05-03-2022
------------------------------------------------------------------'''
from datetime import datetime as dd

today = dd.now()
programnumber = 19
regisetr_no = 2117031

date_today = dd.strftime(today,"%d-%B-%Y")

result_file = f"output program_{programnumber}{regisetr_no}{date_today}"

open(f"{result_file}.txt",'w').close()

def write_file(content,message=None):
    res = open(f"{result_file}.txt",'a')
    if message is not None:
        print(f"\n{message}\n")
        res.write(f"\n{message}\n\n")
    for ele in content:
        res.write(f"{ele} \t ")
        print(f"{ele}",end=" ")
    res.write("\n")
    print()

file = open('input.txt','r')
line1 = file.readline()
line2 = file.readline()
file.close()

line1_list = line1.strip('\n').split(' ')
line2_list = line2.split(' ')

line2_list_reversed = line2_list[::-1]
line1_list_reversed = line1_list[::-1]

write_file(line1_list_reversed,"Reverse: ")
write_file(line2_list_reversed)

union_set = set(line1_list).union(set(line2_list))
write_file(union_set,"Union: ")

intersection_set = set(line1_list).intersection(set(line2_list))
write_file(intersection_set,"Intersection: ")
