
def BubbleSort(a):
    si=len(a)
    for i in range(0,si):
        for j in range(0,si-i-1):
            if a[j] < a[j+1]:
                temp = a[j+1]
                a[j+1] = a[j]
                a[j] = temp

def Display(li):
    print(li)

