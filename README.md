# Spring Boot Basic REST API.
## What you can do with this api: 
* Use host 8989. You can change it in application.properties.
1. ### Create books using POST Request.
```
POST localhost:8989/api/addBook
Content-Type: application/json
{
  "author": "TestAuthor",
  "name": "BookTestName",
  "pages": 222
}
```
3. ### Get list of books, find by name and author using GET request.
```
GET http://localhost:8989/api/findAllBooks
GET http://localhost:8989/api/findBookByAuthor/{author}
GET http://localhost:8989/api/findBookByName/{name}
```
4. ### /api/ shows what API can do

#### TODO: 
```
- add books deleting.
- BookServiceImpl findBookByAuthor must be changed to findBooksByAuthor and show all books which author wrote.
  stream.collect, return List<Books>
- add exception handling
-- add validation before add
- add database
```
