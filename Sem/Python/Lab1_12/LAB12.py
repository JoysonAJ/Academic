'''------------------------------------------------------------------
LAB12.py
12.Write a function called attendance_check. attendance_check should have two
parameters: roster and present. Both roster and present will be lists of strings. Return
a list (sorted alphabetically) of all strings in the list roster that are not in the list present.
In other words, if roster is a list of students enrolled in a class and present is a list of
students in class today, return a list of students that are absent.
You may assume that every item in each list will be a string. You may also assume
that every name in the list present will be in the list roster. If no students are absent,
return an empty list.
RegNo: 2117010
12-02-2022
------------------------------------------------------------------'''
def attendance_check(roster, present):
    list = []
    for i in roster:
        if i not in present:
            list.append(i)

    list.sort()
    return list


roster = ['Winson', 'Prathamesh', 'Ashil', 'Gladson', 'Likith', 'Anoop', 'Chethan', 'Listen', 'Anston', 'Koushik',
          'Deepak', 'Hancil']
present = ['Prathamesh', 'Ashil', 'Gladson', 'Anoop', 'Chethan', 'Koushik', 'Deepak',]
absent = []

absent = attendance_check(roster, present)

print(absent)

