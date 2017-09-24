
## COMP 271 F17 002 Lab 2

##### Completed by: Linda Ho

### What is the complexity of each of the four search methods in terms of array or list size n?

1.  findTeamPosition - O(n) grows linearly and in direct proportion to the size of the array

2. findTeamPosition - O(n) grows linearly and in direct proportion to the size of the array

3. findTeamMinFunding - O(n) grows linearly and in direct proportion to the size of the array

4. findTeamMinFundingFast - O(log n) because we are not searching through every element of the array. We are dividing the number of elements in half each time we search until we can't do it any more. The growth is peaks at the beginning and flattens out as the size of the data set grows.


### What happens in the case of binary search if the array is not sorted?

It would not work. Binary search works by splitting the number of elements in an array in half and comparing the "middle value". In an unsorted array, we would not be able to know with certainty which half of the array to search. 

### What is the purpose of constructor argument validity checking?

Validity checking will make the program fail quickly and can provide detailed exceptions and error messages. If invalid parameters are not caught in the constructor early on, they can cause errors that are much harder to detect and debug later in the program.


### What is the purpose of using the keyword final with variables and arguments?

If you have no reason to modify variables, it is good practice to use the keyword final so the compiler can easily check for undesirable/illegal assignments and throw exceptions and errors. By doing this, the code writer is explicitly saying the variable should not be modified after its initial assignment.


### What are alternatives to using Optional and how do they compare?

Traditionally programmers use conditional statements to check whether or not a value is null. These null checks are important because if a program tries to reference a null value, it will get a NullPointerException and stop running. Optional allows the code to account for an absence of a value and create scenarios where it is ok for the value to be null/missing. Optional also clarifies the programmer's intent and can decrease the amount of null values that can cause problems later. One disadvantage to using Optional is that is can degrade performance when working with large amount of values.