import java.util.*;
public class BookOcarol
{
}
class Book implements Comparable
{
    private String title;
    private String author;
    private String ISBN;
    private double price;
    public Book(String title, String author, String ISBN, double price)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public double getPrice()
    {
        return price;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public void setIsbn(String sb)
    {
        ISBN = sb;
    }
    public String toString()
    {
        return title+ ", " + author+", "+price+", "+ISBN;
    }
    public boolean equals(Book other)
    {
        return this.ISBN.equals(other.ISBN);
    }

    /* compares the book objects based on the title of the book
    This compareTo method is called in the selection sort*/
    // #1
    public int compareTo(Object o)
    {

   /*compares objects of type book based on their author
   This comapreTo method is called in the insertion sort
   the paramter for this method is of type Book and the author of the book b
   needed to be compared with the author of the Book object called this*/
        return ((String) o).compareTo(this.getTitle());

    }
    // #2
    public int compareTo(Book b)
    {
        return (((Book) b).getTitle().compareTo(this.getTitle()));//need to modify the code in here
    }
    /*compares the Book object based on the author, if the author is the same then compares the
    Book  objects based on the price
    this compareTo method is used in the bubbleSort method
    conditional statemnet needs to be used in this method
    if the authors of the book b is the same as the author of the Book object this
         return this.price - b.price
    else
       return   return author.compareTo(b.author)
     */
    // #3
    public double compare(Book b)
    {
        return b.getPrice() - this.getPrice();
    }
}
class BookStore {
    private ArrayList<Book> books;

    public BookStore() {
        books = new ArrayList<Book>();
    }

    public void add(String title, String author, double price, String isbn) {
        books.add(new Book(title, author, isbn, price));
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < books.size(); i++) {
            s = s + books.get(i).toString() + "\n";
        }
        return s;
    }

    public boolean delete(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(isbn)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }
   /*sorts the books based on the title of the book
   call the compareTo #1 in this method
   remember the name of the ArrayList is books and it is not list
   refer to the given selectionSort code in the modules*/
//   public void selectionSort(int[] num)
//   {
//      int min = 0;
//      int minIndex = 1;
//      Book placeholder;
//      for (int j = 0; j < this.books.size() - 1; j++){
//         for (int i = j; i < this.books.size() - 1; i++){
//            if (this.books.get(i).getTitle().compareTo(this.books.get(minIndex).getTitle()) < 0){
//               minIndex = i;
//
//            }
//            System.out.println(this.books.get(i).compareTo(this.books.get(minIndex)));
//            placeholder = this.books.get(j);
//            this.books.set(j, this.books.get(minIndex));
//            this.books.set(minIndex, placeholder);
//            minIndex = j + 1;
//         }
//
//      }
//
//
//
//    }

    public void selectionSort() {

        for (int i = 0; i < this.books.size() - 1; i++) {
            int index = -1;
            String min = this.books.get(i).getTitle();
            boolean swap = false;
            for (int j = i + 1; j < this.books.size(); j++) {
                //find the smallest value in the list
                if (this.books.get(j).compareTo(min) > 0) {
                    index = j; //index of the next smallest element in the list
                    min = this.books.get(j).getTitle();
                    swap = true;  //to check if there is any min value found
                }

            }
            //swapping the values
            if (swap) {
                String temp = this.books.get(i).getTitle();
                this.books.get(i).setTitle(this.books.get(index).getTitle());
                this.books.get(index).setTitle(temp);
            }
        }
    }

    /*sorts the book objects based on the author of the book
    remember the name of the ArrayList is books and it is not list
    call compare method  #2 in this method
    refer to the provided insertionSort code in the modules*/
    public void insertionSort() {
        for (int i = 0; i < this.books.size() - 1; i++) {
            int j = i + 1;
            Book n = this.books.get(j);
            while (j > 0 && n.getAuthor().compareTo(this.books.get(j - 1).getAuthor()) < 0) {
                this.books.set(j, this.books.get(j - 1));
                j--;
            }
            this.books.set(j, n);

        }
    }

    /*sorts the book objcts based on the author,
    if the author is the same then sorts it based on the price
    call comapre #3 method in this method
    refer to the provided bubbleSort code for in the modules
    */
    public void bubbleSort() {
        for (int i = 0; i < this.books.size(); i++) {
            for (int j = 0; j < this.books.size() - 1 - i; j++) {
                //swap
                if (this.books.get(j + 1).compare(this.books.get(j)) < 0)// < list[j])
                {
                    Book temp = this.books.get(j);
                    this.books.set(j, this.books.get(j + 1));
                    this.books.set(j + 1, temp);
                } else if (this.books.get(j + 1).compare(this.books.get(j)) == 0
                        && this.books.get(j + 1).getAuthor().compareTo(this.books.get(j).getAuthor()) < 0) {
                    Book temp = this.books.get(j);
                    this.books.set(j, this.books.get(j + 1));
                    this.books.set(j + 1, temp);
                }
            }
        }

    }
   /*the following search method searches the book based on the title of the book
   therfore the first line of code should be a call to the selection sort to sort the books
   based on the title of the books
   refer to the binarySearch code provided in the modules*/

    public Book binarySearch(String target) {
        int first = 0;
        int last = this.books.size() - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            mid = (first + last) / 2;
            if (this.books.get(mid).getTitle().compareTo(target) == 0) {
                return this.books.get(mid);
            } else if (target.compareTo(this.books.get(mid).getTitle()) > 0)
                first = mid + 1;
            else
                last = mid - 1;
        }
        return this.books.get(mid);


    }

    class Driver {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            BookStore myStore = new BookStore();
            myStore.add("Java", "Zoie", 23.56, "12345678");
            myStore.add("Python", "Elina", 23.56, "2");

            myStore.add("Advance Java", "Stewart", 98, "767676576");
            myStore.add("Build Java", "Liang", 45, "56786565y76");
            myStore.add("Zip lining", "Stewart", 12, "1234566576");
            myStore.add("C++", "Elina", 23.56, "2645556");
            myStore.add("Programming Java", "Stewart", 124, "75465666");
            myStore.add("Humanity", "Smith", 100.56, "234545657");
            boolean b = true;
            while (b) {
                System.out.println("Enter 1 to sort based on the title");
                System.out.println("Enter 2 to sort based on the author");
                System.out.println("Enter 3 to sort based on the author, and the price");
                System.out.print("Enter your choice: ");
                int option = kb.nextInt();
                System.out.println("\n*************");
                if (option == 1) {
                    System.out.println("Sorted based on the title\n");
                    myStore.selectionSort();
                } else if (option == 2) {
                    System.out.println("Sorted based on the author\n");
                    myStore.insertionSort();
                } else {
                    System.out.println("Sorted based on the author and price\n");
                    myStore.bubbleSort();
                }
                System.out.println(myStore);
                System.out.println("\n     **************     ");
                System.out.println("Enter the title of the book to search for it: ");
                kb.nextLine();
                String t = kb.nextLine();

                Book book = myStore.binarySearch(t);
                if (book != null)
                    System.out.println(book);
                else
                    System.out.println("Book not found");
                System.out.println("\n");

            }

        }
    }

    class YourDriver {
        public static void main(String[] args) {
            //your code should be similar to the given driver.
            //create an object of BookStore
            //add 6 books of your choice to your BookStore object
            //display the menu
            //call the sorting method based on the user's choice
            //display the list
        }
    }
}
