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

