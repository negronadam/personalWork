#Python test
from tkinter import *
"""
window = Tk()

window.title("GUI :)")
window.configure(width = 500, height = 500)
window.configure(bg = 'lightgray')
window.mainloop()
print("Hello World")
print("This is a Python test. press any key to exit")
i = input('Any Key :)')
"""

#Keep in mind appointments have to be added in a later update. m

class Person:
    #The person class.
    name = ""
    hadAlready = False
    def __init__(self, name, hadAlready):
        name = self.name
        hadAlready = self.hadAlready
    def hadAlready(self):
        return self.hadAlready
    def get_name(self):
        return name

#Test prototype for autoScribe
persons = [Person("Peter", False),Person("Johnson", False),Person("Peter2", False)]
print("Welcome to autoScribe!")
print("Would you like to generate a new roster?") #Example_dictionary = {1: 2, 3: 4}
names_and_rooms = {1 : [persons[0], persons[1], persons[2]]}
watch_list = {"0400-0800" : [], "1600-2000" : [], "2000-0000" : [], "0000-0400" : []}
for a in names_and_rooms.keys():
    print(a)