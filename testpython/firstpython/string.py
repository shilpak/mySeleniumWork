'''
Created on Feb 25, 2018

@author: Shilpa
'''
print("This line will be printed.")

x = 1
if x==1:
    # indent four spaces
    print("x is 1.")
    
myint = 7
print(myint)

myfloat = 7.0
print(myfloat)
myfloat = float(7)
print(myfloat)

mystring = "Don't worry about apostrophes"
print(mystring)

one = 1
two = 2
three = one + two
print(three)

hello = "hello"
world = "world"
helloworld = hello + " " + world
print(helloworld)

one = 1
two = 2
hello = "hello"

print(str(one) + " " + str(two) + " " + hello)

# change this code
mystring ="hello"
myfloat = 10.0
myint = 20

# testing code
if mystring == "hello":
    print("String: %s" % mystring)
if isinstance(myfloat, float) and myfloat == 10.0:
    print("Float: %f" % myfloat)
if isinstance(myint, int) and myint == 20:
    print("Integer: %d" % myint)

data = ("John", "Doe", 53.44)
format_string = "Hello %s %s. Your current balance is $%s."    
print(format_string % data)

astring = "Hello world!"
print(astring[-3:])
print(astring[3:7:1])#start: stop: step
print(astring[3:7])
#revere string 
print(astring[::-1])

print(astring.upper())
print(astring.lower())

print(astring.startswith("Hello"))
print(astring.endswith("asdfasdfasdf"))

afewwords = astring.split(" ")
print(afewwords)










    
    