# Web Overview - Servlet & JSP

## Resources 

- Eng/ Hany session [Part 1](https://drive.google.com/file/d/15v7tlEScnicnBVqqWwkg6RSotjbA3OIU/view?usp=drive_link) & [Part 2](https://drive.google.com/file/d/1TuPs-zrWYvlxMNs549sWKcgv38DF8Bg3/view?usp=drive_link)

## Tasks
- Create a web project using JEE
- It should have a front controller for Managing products (add product, list products, remove product)
- You should have a page that lists products, beside each product a delete button (when pressing on it a request should be sent to the front controller to delete this product).
- Above the products list an add button that redirects to a new page for adding product.

- control flow should be as the following:
    - ProductServlet --> ProductService --> ProductRepository
    - ProductServlet: (The front controller) receives requests and displays pages
    - ProductService: execute validations
    - ProductRepository: fetch/insert data (CRUD)

attached the project we work on it in the session, Please use these classes from it: Product and ProductRepository

**BONUS**
Use a real ProductRepository That inserts and fetches data into database using JPA

> [!NOTE]
> Task solution would be added soon.
