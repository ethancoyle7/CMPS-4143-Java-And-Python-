# Author- Ethan Coyle
# Teachr-Dr.Saikat
# in class programming october 25,2021
#CMPS 4143- Contemp Topic(Java and Python)
# we working with list anc accessing array index stuffs in here


s1='i am good frodo and i want your soul'
print(s1)


list1 = [10,20,30,40,50,60,70]
# 0 1 2 3 4 5 6 7 8 9 10
# i a m g r o o t ! ! !
print(50 in list1) # prints true or false if found or not found
print( 'P' in s1)  # if a p is found print true else false

for ch in s1:
    print(ch)# prints out characters one by one
# other way to do character by character is below iterating the string
for idx in range(len(s1)):
    print(s1[idx])


# comparing the ascii values
sorta1="abcde"
sorta2="def"
print(sorta1.upper())

if sorta1==sorta2:
    print("equal")
elif sorta1>sorta2:
    print("first bigger")
elif sorta1>sorta2:
    print("second larger")



# cannot change strings the immutable
print(s1.find('am'))# return the index that is at
s1.replace('good','bad')
print(s1)

# create another string to assign the updated sstring
# this only way to change string value in this instance
NewString=s1.replace('good','evil')

print(" out old string is :",s1)
print(" our New String is :", NewString)
#can change the value of dictionary etc 

list1[2]=500
print(list1)



greeting= "i am shargamorga destroyer of worlds!!! FEAR ME!"
print(greeting)
print(len(greeting))
counter=len(greeting)
for i in range(len(greeting)):
    print(greeting, "\t\t\t[Count :", counter,"]")
    counter-=1


for idx, val in enumerate(greeting):
    print(idx,val)
# print out multidimensional list with index and the value




def spiralPrint(m, n, a) : 
    k = 0; l = 0
  
    ''' k - starting row index 
        m - ending row index 
        l - starting column index 
        n - ending column index 
        i - iterator '''
      
  
    while (k < m and l < n) : 
          
        # Print the first row from 
        # the remaining rows  
        for i in range(l, n) : 
            print(a[k][i], end = " ") 
              
        k += 1
  
        # Print the last column from 
        # the remaining columns  
        for i in range(k, m) : 
            print(a[i][n - 1], end = " ") 
              
        n -= 1
  
        # Print the last row from 
        # the remaining rows  
        if ( k < m) : 
              
            for i in range(n - 1, (l - 1), -1) : 
                print(a[m - 1][i], end = " ") 
              
            m -= 1
          
        # Print the first column from 
        # the remaining columns  
        if (l < n) : 
            for i in range(m - 1, k - 1, -1) : 
                print(a[i][l], end = " ") 
              
            l += 1
  
# Driver Code 
a = [ [1, 2, 3, 4, 5, 6], 
      [7, 8, 9, 10, 11, 12], 
      [13, 14, 15, 16, 17, 18] ] 
        
b= [['a','b','c','d','e','f'],['g','h','i','j','k','l'],['m','n','o','p','q','r']]
R = 3; C = 6
print("============================================")
print("our original Numeric matrix is : ", a, "\n\n")
print("our spiral matrix is : \n\n")
spiralPrint( R, C, a) 
print("\n\n============================================")


print(" our result for second  String spiral matrix is below: \n\n\n")
print("============================================")
print("our original matrix is : ", b, "\n\n")
print("our spiral matrix is : \n\n")
spiralPrint( R, C, b) 
