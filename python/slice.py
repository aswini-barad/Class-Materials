#sequence[start : stop : step]
#start → Starting index (included)
#stop → Ending index (excluded)
#step → Increment/decrement (optional)
s = "Python"
print(s[0:4])
print(s[:])
print(s[::-1])
'''
Summary Table
Slice	Meaning	Output ("Python")
s[0:4]	Index 0 to 3	Pyth
s[:4]	Beginning to 3	Pyth
s[2:]	Index 2 to end	thon
s[:]	Entire string	Python
s[::2]	Every 2nd character	Pto
s[::-1]	Reverse string	nohtyP
'''