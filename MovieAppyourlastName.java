import java.util.Objects;

public class MovieAppOcarol
{
  //no code goes here
}
class Movie implements Comparable
{
   private String title;
   private String genre;
   private String rating;
   private int watchCount;

   public Movie(String movieName, String genre, String rating, int watchCount){
      this.title = movieName;
      this.genre = genre;
      this.rating = rating;
      this.watchCount = watchCount;
   }

   public int getWatchCount() {
      return watchCount;
   }

   public String getGenre() {
      return genre;
   }

   public String getRating() {
      return rating;
   }

   public String getTitle() {
      return title;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public void setRating(String rating) {
      this.rating = rating;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setWatchCount(int watchCount) {
      this.watchCount = watchCount;
   }

   @Override
   public int compareTo(Object o) {
      return 0;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Movie movie = (Movie) o;
      return Objects.equals(title, movie.title);
   }

   @Override
   public int hashCode() {
      return Objects.hash(title);
   }

   @Override
   public String toString() {
      return
              "title='" + title + '\'' +
              ", genre='" + genre + '\'' +
              ", rating='" + rating + '\'' +
              ", watchCount=" + watchCount +
              '}';
   }
}
class ListNode
{
}
interface List
{
}
class MovieList
{
}
 /*
once you implement all the classes uncommnet the following code to test your program*/
class Driver
{
   public static void main (String [] args)
   {
     /* MovieList list = new MovieList();
      list.add("Sunny Day", "Action",5, 20000);
      list.add("Airplane", "Comedy", 3, 1200);
      list.add("Doctor Zhivago","comedy", 4,23000);
      list.add("The Deer Hunter", "Family", 3, 2345);
      System.out.println("Here is the list of the movies\n");
      System.out.println(list);
      System.out.println("\nhere is the the movie that was most watched");
      System.out.println(list.mostWatched());
      System.out.println("Here is the list of 5 stars ratings");
      System.out.println(list.getMovie(5));
      System.out.println("removing Reservoir movie");
      list.remove("Reservior Dogs");
      System.out.println(list);
      System.out.println("Displaying the second movie in the list");
      System.out.println(list.get(1));
      System.out.println("adding a movie at position 2");
      list.add(2, "Up", "Carton",3,4500);
      System.out.println(list);
      int i = list.indexOf("Up"); 
      System.out.println("The movie up is in the position " + i); */
   }
} 
/*To get the full credit you must create the following driver */
/*the following driver should be similar to the provided driver*/
class myDriver
{
   public static void main(String[] args)
   {
     //create a movie list
     //add 5 of your favoraite movie to it
     //display all the movies
     //display the most watched movie
     //display the movie with the highest rating
     //display the index of one of the movies
     //remove one of the movies from the lis
     //display the list
     //display the movie at the index 1
   }
}
