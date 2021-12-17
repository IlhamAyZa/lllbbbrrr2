# IMPORTANT: Lab-8

For each lab assignment, **you must include and sign (by writing your name and student id number) the following Pledge of Honor statement at the beginning of your main method source code file. After including this statement, make sure that you do the commit and push operation on GitHub. Otherwise, your lab solution will not be graded.**
```
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Name Surname, Student id>
********************************************************************************/
```
# Lab-8 Assignment


In this programming lab, you are responsible for implementing a Java application that involves strings and sentence generation. We provide you a list of strings in which each string corresponds to a name and an adjective separated by “,” delimiter (check Main.java file). You will extract the names, adjectives, manipulate the words, construct sentences and perform the tasks as described in this document. You need to implement the following classes and interface based on the given instructions.

*Note*: The file Main.java includes codes for testing and validating your project for the pre-lab part. 

 
# Words class (implements WordOperations)

**Attributes:**
```java
·        List<String> names: will keep the names extracted from the given information
·        List<String> adjectives: will keep the adjectives extracted from the given information
```
**Constructor**
```java
public Words(List <String> pairList) 

where each element in the list represents a string consisting of name and adjective separated by a comma.

Use addNames() and addAdjectives() methods to extract & insert the names and adjectives from the list to the fields.
```

**Write required Getters/setters**
**Write the following methods**

```java
void addNames(List <String> pairList): 
This method will extract names from the given list and add them to the names attribute.  
pairList contains a list of pairs i.e. names and adjectives separated by a comma. 
For example, pairList might be (“Ali,intelligent”, “Roz,overthinker”, “Nomi,strong”). 
You are expected to insert “Ali”, “Roz” and “Nomi” to the names attribute.

```

```java
void addAdjectives(List <String> pairList): 
This method will extract Adjectives from the given list and add them to the adjectives attribute. 
pairList contains a list of pairs i.e. names and adjectives separated by a comma. 
For example, pairList might be (“Ali, intelligent”, “Roz,overthinker”, “Nomi,strong”). 
You are expected to insert “intelligent”, “overthinker” and “strong” to the adjectives attribute.
```

```java
String removeName(String name): 
This method removes a given name from the list. If removal was successful, return the removed name. 
In case the name does not exist in the list it will return “The name does not exist in the list.”
```

```java
String removeAdjective(String adjective): 
This method removes a given adjective from the list. If removal was successful, return the removed adjective. 
In case the adjective does not exist in the list, it will return “The adjective does not exist in the list.”
```

```java
String generateSentence(): gets a random name and a random adjective from the lists and return a sentence. 
For example: “Ali is clever.”
```

**Note: Implement the methods of the WordOperations interface.**

# VowelWords class (extends from Words)

**Attributes**
```java
·        List<String> vowNames: keeps the names that start by a vowel
·        List<String> vowAdjectives: keeps the adjectives that start by a vowel
```

**Constructor**
```java
public VowelWords(List <String> pairList) 
where each element in the list represents a string consisting of name and adjective separated by a comma. 
Use the constructor of the super class.
```
Call addVowNames and addVowAdjectives to insert elements that start by a vowel into vowNames and vowAdjectives

**Note: Use the benefits of the class hierarchy, don’t implement from scratch.**

Write required getters/setters

Implement the following methods:

```java
void addVowNames(List <String> nameList) : Add names in the nameList that start with a vowel to vowNames.
```
```java
void addVowAdjectives(List <String> adjectiveList) : Add adjectives in the adjectiveList that start with a vowel to vowAdjectives.
```


```java
String removeVowName(String name): 
This method removes a given name from the list. If removal was successful, return the removed name. 
In case the name does not exist in the list it will return “The name does not exist in the list.”
```
```java
String removeVowAdjective(String adjective):
This method removes a given adjective from the list. If removal was successful, return the removed adjective. 
In case the adjective does not exist in the list it will return “The adjective does not exist in the list.”
```
```java
String generateSentence(int n): 
Make a sentence by combining a random name with n random adjectives. 
For example: if n = 5, the sentence should include five adjectives. 
If the size of the adjective list is smaller than n, just use all the adjectives. 
For instance:
“Ali is interesting, adventurous, amiable, ambitious, and clever.”
```
**Note: There can be duplicate adjectives because of the random selection. You can ensure uniqueness, but it is not a must. Ex: Ali is interesting, adventurous, and interesting.**
```java
String pluralAdj(String adjective): gets an adjective and returns the plural form of it. In implementing this method, you should consider the following rules:
·        If the noun ends in "y", remove the "y" and add "ies".
·        If the noun ends in "s", or "x", or "ch", or "sh", add "es".
·        In all other cases, just add "s".
```
**Note: Implement the modifications using Class StringBuilder.**

**Note: The plural versions of Adjectives might not make sense, it doesn’t matter. For instance, clever -> clevers.**

# WordOperations interface

This is an interface which will be implemented by the Words class. 

Do not implement the methods within this interface, just declare them. 

The methods of the interface: 

```java
String encryptAdj(): gets a random adjective from the list of adjectives as an input. 
Then encrypts it based on the following explanation:
Consider the following encryption scheme to encode words. 
Create a matrix with the letters of the alphabet as follows:

     0   1   2   3   4
0    A   B   C   D   E
1    F   G   H   I   J
2    K   L   M   N   O
3    P   Q/Z R   S   T
4    U   V   W   X   Y
```
Then to encode any letter, create a string consisting of the row number followed by the column number. 
For example, the letter "M" becomes "22" and the letter "O" becomes "24".
To encrypt a word, convert each letter to its corresponding two-digit string. 
For example:
“Happy” becomes: 1200303044


**Note: You should consider both lower, and upper case conditions of characters.**
```java
String upperLower(): gets a random name from the name list and changes the uppercase characters to lower and vice versa.
```
```java
void exists(String word): 
gets an adjective or a name from the user and checks whether the entered adjective/name exists in the 
list (list of adjectives or names) or not and prints either “The word exists” or “The word is new”. 
In case the given word exists, this method also should print its reverse, the number of characters, 
and three different combinations of its characters.

For example: consider the given word “happy” which exists in the list. The output should be as follows:
The word exists.
The reverse of “happy” is “yppah”. It includes 5 characters.
Apyph, Pahpy, and Yaphp are three words that can be written by these characters.
Note: The generated words should start with a capital letter.
```

 

