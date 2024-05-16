import random

n = random.random()
random_number = 0;

for i in range (10):

	random_Number = random.randint(1,10)
	second_Number = random.randint(0,17)
	answer = random_Number + second_Number
	
	question = int(input(f'the random is { random_Number} +{second_ranom} ?'))
	
	if question == answer:
		correct_Answer = correct_Answer+1
		
	else:
		wrong_Answer = wrong_Answer + 1 

		
	
print(f'You got{correct_Answer} corectly')
print(f' You got{worng_Answer} wrong')