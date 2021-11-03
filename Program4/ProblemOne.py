#========================================================================#
#                                                                        #
# Author - Ethan Coyle                                                   #
# Inst.  - Dr. Saikat                                                    #
# Class  - CMPS 4143(Java/Python)                                        #
# Assin  - Program 4 Problem One                                         #
#                                                                        #
# About-                                                                 #
#. (35 points) Write a Python program using file operation.              #
#  You will open an input file “students.dat” that will contain a list of#
#  student names, classification, and grade in the class. (All student   #
# info is completely made up) You should read through the entire input   #
# file.  After reading in all information, do operations (No built-in    #
# functions like Average, min, max, count, etc.), close the input file   #
#  and write that following information with labels to an output file    #
#  “student_statistics.txt”                                              #
# •	Highest grade in the class                                           #
# •	Lowest grade in the class                                            #
# •	Class average grade (rounded to one decimal place)                   #
# •	Number of freshmen students                                          #
# •	Number of sophomore students                                         #
# •	Number of junior students                                            #
# •	Number of senior students                                            #
#========================================================================#

# definition main function
def main():
    # initialize each variable for reading in
    LowestGrade = 0
    HighestGrade = 0
    total_grades = 0
    NumLines = 0
    freshman_cnt = 0
    sophomore_cnt = 0
    senior_cnt = 0
    junior_cnt = 0
    
    flag = True #flag is true 
    
    # with the opening of the infile called students.dat
    with (open('Program4\Students.dat', 'r')) as InFile:
       
       # reading each line of the infile
       for line in InFile: #read line 
           each_element = line.strip().split(' ') # extract the elements on whitespace
           # after reading each line, the last element is the grade
           name= str(each_element[1])
           grade = int(each_element[-1])
           if flag:
               LowestGrade = grade
               HighestGrade = grade
               flag = False
           else:
               if grade < LowestGrade: #if present grade is less than LowestGrade then update 
             
                   LowestGrade = grade
               if grade > HighestGrade: #if present grade is greater than highestGrade then update 
                   
                   HighestGrade = grade
           
           total_grades = total_grades + grade #find total 
       
           NumLines = NumLines + 1 #number of lines

           if each_element[-2].lower() == 'sophomore':
               sophomore_cnt += 1
           elif each_element[-2].lower() == 'freshman':
               freshman_cnt += 1
           elif each_element[-2].lower() == 'senior':
               senior_cnt += 1
           elif each_element[-2].lower() == 'junior':
               junior_cnt += 1
              
    # write to output file 
    OutFile = open('Program4\student.txt', 'w')
    # Writing results
    OutFile.write('Persons Name is :'+ str(name))
    OutFile.write('\rHighest grade: ' + str(HighestGrade))
    OutFile.write('\rLowest grade: ' + str(LowestGrade))
    OutFile.write('\rClass average: %.1f'%(total_grades/NumLines))
    OutFile.write('\rFreshman: ' + str(freshman_cnt))
    OutFile.write('\rSophomores: ' + str(sophomore_cnt))
    OutFile.write('\rJuniors: ' + str(junior_cnt))
    OutFile.write('\rSeniors: ' + str(senior_cnt) + '\r\n')
    # Closing file
    OutFile.close()
    

#driver code 
main()