public class Address {
    String city;
    String street;
    int number;
   Address(String city, String street) {
       this.city = city;
       this.street = street;
   }
   void showAddress() {
       System.out.println("City: " + city);
       System.out.println("Street: " + street);
       System.out.println("Number: " + number);
   }
}
