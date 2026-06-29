s = "Hello Python"

vowels = filter(lambda ch: ch.lower() in "aeiou", s)

print("".join(vowels))