S="Ram is @ 123g boy"
alp,dg,spc,sy,up,lw,vw,co=0,0,0,0,0,0,0,0
for i in S:
	if i.isalpha():
		alp=alp+1
		if i.isupper():
			up=up+1
		else:
			lw=lw+1
		if i in"aeiouAEIOU":
			vw=vw+1
		else:
			co=co+1
	elif i.isdigit():
		dg=dg+1
	elif i.isspace():
		spc=spc+1
	else:
		sy=sy+1
print("no of alph",alp)
print("no of digit",dg)
print("no of space",spc)
print("no of sy",sy)
print("no of upper",up)
print("no of loweer",lw)
print("no of vowel",vw)
print("no of consonants",co)

