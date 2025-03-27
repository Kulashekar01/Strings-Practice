import math
num = int(input("Enter the range:"))
counter = 0
prime = []
if num <=1:
    print("no prime numbers found")
else:
    for i in range(2,num+1):
        is_prime = True
        for j in range(2,int(math.sqrt(i)) + 1):
            if i%j == 0:
                is_prime = False
                break
        if is_prime:
            prime.append(i)
            
    print(prime)
        
