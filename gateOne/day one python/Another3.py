sum = 0
average = 0;

for scores in range(1,11):

	scores = int(input("Enter a scores: " ))

sum = sum + scores
average = sum / scores


print("The sum of the scores is "  + (sum))
print("Average of the scores is " + (average))