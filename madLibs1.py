'''
Created on Mar. 26, 2021

@author: Viggy
'''
import random
import time


print("Welcome to Random Libs!")

# maybe make an input list to reduce clutter
print("Please enter 10 words, numbers, letters... Whatever you want! ")
w1 = input("1. ")
w2 = input("2. ")
w3 = input("3. ")
w4 = input("4. ")
w5 = input("5. ")
w6 = input("6. ")
w7 = input("7. ")
w8 = input("8. ")
w9 = input("9. ")
w10 = input("10. ")


def countdown(t):

    while t:
        mins, secs = divmod(t, 60)
        timer = '{:02d}:{:02d}'.format(mins, secs)
        print(timer, end="\r")
        time.sleep(1)
        t -= 1


def madLibsUser(w1, w2, w3, w4, w5, w6, w7, w8, w9, w10):

    words = [w1, w2, w3, w4, w5, w6, w7, w8, w9, w10]
    random.shuffle(words)
    return(words)


print("Thanks for the input (badum tshhh)")

print("Okay, here comes the fun part... (generating libs....) ")

t = 3
countdown(t)

print(madLibsUser(w1, w2, w3, w4, w5, w6, w7, w8, w9, w10))

