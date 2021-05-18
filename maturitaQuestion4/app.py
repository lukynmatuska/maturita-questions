kladna = []
zaporna = []
cislo = 0

def vstup():
    global cislo
    cislo = int(input("Zadej cisilko: "))
    return cislo

# print(vstup())
while vstup() != 0:
    if cislo > 0:
        kladna.append(cislo)
    else:
        zaporna.append(cislo)

print("Kladna cisilka: ", kladna)
print("Zaporna cisilka: ", zaporna)