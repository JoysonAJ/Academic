'''------------------------------------------------------------------
LAB20.py
20.There is a file with several text messages. Each message is in its own line. Write a Python program to count the number of lines in the file and the total number of words contained in those messages. Assume the messages contain only alphabets, and numbers
RegNo: 2117010
05-02-2022
------------------------------------------------------------------'''
def FileCount():
    file_readLines = file1.readlines()
    Lines_File = len(file_readLines)
    print("The Line Present in File \t:", Lines_File)
    word_count = 0

    for list1 in file_readLines:
        word_count += len(list1.split(" "))
    print("The Number of word in file ", word_count)

file1 = open("input1.txt", 'r')
FileCount()
file1.close()
