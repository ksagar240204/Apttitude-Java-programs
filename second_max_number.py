arr=[10,20,30,40,45,50]
max1=arr[0]
max2=arr[1]
for i in range(len(arr)-1):
    if(arr[i]>max1):
        max1=arr[i]
    if(arr[i]>max2 and arr[i]!=max1):
        max2=arr[i]
print("Second maximum number:",max2)