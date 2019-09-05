# Strategy Design Pattern 

#What is Strategy Design Pattern
Strategy is a behaviour design pattern that encapsulates behaviour/algorithm into Objects and makes them interchangeable
inside Original Context Object

#When is Strategy Design Pattern Used

Use the pattern to isolate the business logic of a class from the implementation details of algorithms
that may not be as important in the context of that logic.

Strategy Pattern can be recognised by a method that lets nested object do the actual work, as well as the setter that allows
replacing that object with a different one.

#Where is it used in JAVA 8

1.Lamda java.util.Comparator#compare() called from Collections#sort.
2.Servlet  service() method ,plus all the do***() methods that accept HttpServletRequest and HttpServletResponse Objects as arguments
3.javax.servlet.Filter#doFilter()

Examples in Real world :

Payment Gateway having 2 or more Payment modes 1.CreditCard 2.Paypal 3. NetBanking
Evaluate Expression a+b*c , here there are 2 separate behaviours or algorithms * + 

# Pros 

 You can swap algorithms used inside an object at runtime.
 You can isolate the implementation details of an algorithm from the code that uses it.
 You can replace inheritance with composition.
 Open/Closed Principle. You can introduce new strategies without having to change the context.
 
# Con
 
 If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes 
 and interfaces that come along with the pattern.
 Clients must be aware of the differences between strategies to be able to select a proper one.
 A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm 
 inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without 
 bloating your code with extra classes and interfaces.

