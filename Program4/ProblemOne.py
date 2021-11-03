# Variable to hold counts
sumGrades = 0
cnt = 0
freshman = 0
sophomore = 0
senior = 0
junior = 0
lowGrade = 0
highGrade = 0

# Variable that indicates first line of input, to update high and low grades
firstLine = True

# Opening file for reading
with (open('Program4\Students.dat', 'r')) as InFile:
   # Reading line by line
   for line in InFile:
       # Stripping and splitting on space
       fields = line.strip().split(' ')
       # Fetching grade
       grade = int(fields[-1])
       # Checking line
       if firstLine:
           # Set low and high grades
           lowGrade = grade
           highGrade = grade
           # Set firstLine to false
           firstLine = False
       else:
           # Comparing grades
           if grade < lowGrade:
               # Updating grade
               lowGrade = grade
           if grade > highGrade:
               # Updating grade
               highGrade = grade
       # Accumulating grade
       sumGrades = sumGrades + grade
       # Incrementing count
       cnt = cnt + 1
       # Checking Category
       if fields[-2].lower() == 'sophomore':
           sophomore += 1
       elif fields[-2].lower() == 'freshman':
           freshman += 1
       elif fields[-2].lower() == 'senior':
           senior += 1
       elif fields[-2].lower() == 'junior':
           junior += 1
          
# Opening output file for writing
OutPut = open('Program4\student.txt', 'w')
# Writing results
OutPut.write('Highest grade: ' + str(highGrade))
OutPut.write('\r\nLowest grade: ' + str(lowGrade))
OutPut.write('\r\nClass average: %.1f'%(sumGrades/cnt))
OutPut.write('\r\nFreshman: ' + str(freshman))
OutPut.write('\r\nSophomores: ' + str(sophomore))
OutPut.write('\r\nJuniors: ' + str(junior))
OutPut.write('\r\nSeniors: ' + str(senior) + '\r\n')
# Closing file
OutPut.close()