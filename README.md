IntroSoftwareDevelopment1Lab5A

Create a class called Person that has instance variables for the following data members:
-First name
-Last name
-Birth year
-Sex
-Weight in pounds
-Highest education level("high level","undergraduate","graduate")

Create several overloaded constructors, as follows:
1.One constructor takes all six values (above) as parameters
2.Another constructor takes five values as parameters, but sets the birth year automatically to 2018.
3.A third constructor takes three values as parameters, but sets the birth year automatically to 2018, the sex to female, and the highest education level to "high school".

In the first two constructors, use a switch statement to ensure that the highest education level is only one of the three specified, and use another switch statement to ensure tha tthe sex is either "male" or "female". Note: to compare Strings you cannot use ==. Use a switch statmeent instead. NOTES: soon we will learn that instead we can use the .equal() method also:

if(sex=="male") // WRONG
if(sex.equals("male"))//RIGHT
switch(sex){
case "male": //ALSO RIGHT
}

create overloaded method for:
printDetails()
printDetails(boolean kilograms)
printDetails(boolean kilograms, boolean uppercase)

All three methods print senetences in teh exact format of:

"Tiger Woods was born in 1975. He weighs 200 pounds and he has an undergraduate degree."

NOTE: use "She" instead of he for females.

NOTE: convert to kilograms for the second overloaded method if ture is passed in.

NOTE: print the names out in UPPERCASE in teh third overlaoded method if ture is passed in; otherwise use all lowercase.

"TIGER WOODS was born in 1975. He weighs 200 pounds and he has an undergraduate degree" or

"tiger woods was born in 1975. He weighs 200 pounds and he has an undergraduate degree" or

"TIGER woods was born in 1975. He weighs 90.9 kilograms and he has an undergraduate degree" or

"tiger woods was born in 1975. He weighs 90.9 kilograms and he has an undergraduate degree."

Create another method with signature public void displayAges() which uses a while loop to print the Peron's age in every year of thier life, as follows:

In 1975 Tiger Woods was 0 years old.

In 1976 Tiger Woods was 1 year old. (NOTE: print "year" instead of "years")

In 1977 Tiger Woods was 2 years old.

..

In 2017 Tiger Woods was 42 years old.

In 2018 Tiger Woods is 43 years old (NOTE: print "is" instead of "was")
