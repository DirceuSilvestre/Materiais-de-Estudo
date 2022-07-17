from random import randint

# Jogador de D6 #

dado_d6 = randint(1, 6)

for i in range(1, 7):
    if i % 2 != 0:
        continue

    elif i % 2 == 0 and i == dado_d6:
        print(f'Acertou: {i}')
    
    else:
        print(f'Não acertou: {i}')