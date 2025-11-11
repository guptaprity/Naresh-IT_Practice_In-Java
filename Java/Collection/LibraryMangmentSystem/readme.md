

## 🧾 Description
This project simulates a **Library Management System** using the **Java Collections Framework (Vector)**.  
It allows the user to:
- Display available books  
- Search a book by title or author  
- Issue (remove) a book by ID  

All operations are done using **Vector<Book>** and a **menu-driven program** with **Scanner** input.

---

## 🧩 Classes
### 1. `Book`
A record class that represents a book entity with:
- `id` (Integer)
- `title` (String)
- `author` (String)

### 2. `Library`
Contains the core library functions:
- `displayAvailableBooks(Vector<Book>)`
- `issueBook(Vector<Book>, Scanner)`
- `searchBook(Vector<Book>, Scanner)`

### 3. `LibraryManagement`
Main class that:
- Initializes the book list  
- Displays the interactive menu  
- Calls library operations using switch-case  

---

## 🧪 Sample Output


Test Cases 1:

-------------

Please Enter your Choice :

1
Available Books in the Library :

  Book[id=101, title=Core Java, author=Mr James]
  
  Book[id=102, title=Adv Java, author=Mr Robert]
  
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  
  Book[id=104, title=Programming in C , author=Mr Denis]
  
Please Enter your Choice :
2

Enter keyword to search by title or author: Python
No matching books found.
   

Test Cases 2:
-------------
Please Enter your Choice :
1
Available Books in the Library :

  Book[id=101, title=Core Java, author=Mr James]

  Book[id=102, title=Adv Java, author=Mr Robert]

  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  
  Book[id=104, title=Programming in C , author=Mr Denis]
  
Please Enter your Choice :
3

 Enter Book id which for Book issue :109
 
 Please Enter your Choice :
 
 Book with ID 109 not found.




---

## 🧰 Technologies Used

- **Java (JDK 17+)**
  
- **Eclipse IDE**
  
- **Collections Framework (Vector)**

---

ent-System-Java.

Description → “Java Library Management System using Collections Framework (Vector).”

Keep it Public → Click Create Repository.


🪜 Step 4: Upload from Eclipse (Simple Method)
Option 1: Use GitHub Desktop (Easiest)

Download GitHub Desktop → https://desktop.github.com/

Open GitHub Desktop → click File → Add Local Repository → select your LibraryManagementSystem folder.

Click Publish to GitHub → done ✅

Option 2: Upload Manually

In your GitHub repo page → click “Upload files”.

Drag and drop your src/ folder and README.md file.

Click Commit changes.

🌟 Bonus Tip

Add a short project description at the top of your repo:

“This Java project demonstrates how to use Collections (Vector) to manage books in a library. It supports book display, search, and issue operations using a simple console-based interface.”

## Assignment- Question 
Assignment :
----------------------
Develop a scenario based program by using Collections Framework for processing the Library Management System
using different available options like Display books in the Library, Issue a book, search a particular book in the library.

Create a record called Book.

Components :
 id : Integer
 title : String
 author : String



Create another BLC class Library which contains following non static 
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 argument of type Vector<Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the Library.[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 arguments [Vector<Book>, Scanner sc]
Return Type        : void
Access modifier    : public
In this method issueBook from the Library based on the id of the Book, If Book is available (based on the id) then remove() the Book from the Library otherwise give an error message  "Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 arguments [Vector<Book>, Scanner sc]
Return Type        : void
Access modifier    : public
In this method search a Book from the Library by using title OR author, If Book is available either by title OR Author then give a message "Book Found", If not available then give an error message "No matching books found."


Create an ELC class called LibraryManagement which contains main method.
Inside main method Create Vector class object to add books available in the library. [See the Test cases for Library Books] 

Inside main method display the following details as a Menu.
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :

Write Switch case with Scanner class to perform Various operation with
Library System.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select from the Menu :


	 1) Display Books Available in the Library :
   
	 2) Search a Book in the Library :
   
	 3) Issue a Book from the Library :
   
	 4) Exit from the application :
Please Enter your Choice :
1
Available Books in the Library :


  Book[id=101, title=Core Java, author=Mr James]
  
  
  Book[id=102, title=Adv Java, author=Mr Robert]
  
  
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  
  Book[id=104, title=Programming in C , author=Mr Denis]
  
Please Enter your Choice :




Test Case 2 :
-------------
Select from the Menu :

	 1) Display Books Available in the Library :
   
	 2) Search a Book in the Library :
   
	 3) Issue a Book from the Library :
   
	 4) Exit from the application :

Please Enter your Choice :
2

Enter keyword to search by title or author: Core Java

Found: Book[id=101, title=Core Java, author=Mr James]

Please Enter your Choice :



Test Case 3 :
-------------
3

 Enter Book id which for Book issue :102
 
 Issued: Book[id=102, title=Adv Java, author=Mr Robert]
 
Please Enter your Choice :
1
Available Books in the Library :

  Book[id=101, title=Core Java, author=Mr James]
  
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  
  Book[id=104, title=Programming in C , author=Mr Denis]


Test Cases 4 :
--------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
4
Thank you for Visiting..


Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  
  Book[id=102, title=Adv Java, author=Mr Robert]
  
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  
  Book[id=104, title=Programming in C , author=Mr Denis]
  
Please Enter your Choice :
2

Enter keyword to search by title or author: Python
No matching books found.
   

Test Cases 2:
-------------
Please Enter your Choice :
1
Available Books in the Library :

  Book[id=101, title=Core Java, author=Mr James]
  
  Book[id=102, title=Adv Java, author=Mr Robert]
  
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  
  Book[id=104, title=Programming in C , author=Mr Denis]
  
Please Enter your Choice :

3


 Enter Book id which for Book issue :109
 
 Please Enter your Choice :
 
 Book with ID 109 not found.




