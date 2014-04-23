Library-Application
===================
1. Creating GUI.
 All interface with the Library (queries, updates, deletes, etc.) must be done from a graphical user interface of your original design. 
 Your GUI application will interface with the Library database via an appropriate MySQL connector.
 Initial database creation and population may be done from command line or other admin tool.
2. Book Search and Availability.
 Using your GUI, be able to search for a book, given any combination of book_id, title,author.
  Your query should support substring matching. You should then display:

 book_id
 title
 author(s) 
 branch_id
 Number of copies at each branch
 Number of available copies at each branch
3. Book Loans
 Checking Out Books
  Using your GUI, be able to check out a book, given the combination of BOOK_COPIES(book_id, branch_id) 
  and BORROWER(Card_no),i.e. create a new tuple in BOOK_LOANS.The due_date should be 14 days after the date_out. 
  Each BORROWER is permitted a maximum of 3 BOOK_LOANS. If a BORROWER already has 3 BOOK_LOANS, 
  then the checkout (i.e. create new BOOK_LOANS tuple) should fail and return a useful error message.
 Checking In Books
  Using your GUI, be able to check in a book. Be able to locate BOOK_LOANS tuples by searching on any of book_id, Card_no,
  and/or any part of BORROWER name.
  Once located, provide a button (or menu item) to check in (i.e. enter a value for date_in in corresponding BOOK_LOANS
  tuple).
4.  Borrower Management
 Using your GUI, be able to create new borrowers in the system.
 All name and address attributes are required to create a new account (i.e. value must be not null).
 You must devise a way to automatically generate new card_no primary keys for each new tuple that uses 
 a compatible format with the existing borrower IDs.
