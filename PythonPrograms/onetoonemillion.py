

OutFile2 = open('ascending.txt', 'w')
num=0
while num<=100000:
  OutFile2.write(str(num))
  OutFile2.write('\n')
  num+=1