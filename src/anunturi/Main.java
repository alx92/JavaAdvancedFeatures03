package anunturi;

import java.util.List;
import java.util.Scanner;

public class Main {

    /**Site de anunturi .
     Modelati un site de anunturi.
     Site-ul are un nume , si o lista de anunturi.
     Anunturile pot fi de 2 feluri: Anunturi imobiliare dar si Anunturi de Vanzare Produse.
     Un anunt are nume, descriere si pret.
     Un anunt imobiliar are si locatie si suprafata  , si daca este de tip Intravilan sau Extravilan(Enum);
     Un anunt de Vanzare produs are detalii produs, stare produs (BUN / DETERIORAT / EXCELEN )(ENUM).
     Creati un program in care putem creea un obiect Site ii punem un nume de la tastatura.
     In Site putem adauga anunturi imobiliare noi(Prin a creea de la tastatura un anunt nou) dar si putem adauga
     anunturi de vanzari produse.
     Afisam toate anunturile de pe site.
     *Anuntul trebuie sa fie clasa de baza si abstracta.
     *AnuntulImobiliar trebuie sa fie o clasa copil
     *AnuntulDeVanzare trebuie sa fie clasa copil
     *Site-ul trebuie sa fie o clasa care sa aiba nume si, o lista de anunturi**/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Site site = new Site();
        List<Announcement> announcements = site.getAnnouncements();
        System.out.println("Enter site name: ");
        String siteName = scanner.nextLine();
        site.setName(siteName);

        int option = -1;

        while (option != 0) {
            System.out.println("Site management");
            System.out.println("1. Add announcement: ");
            System.out.println("2. View announcements: ");
            System.out.println("0. Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Select announcement type: ");
                System.out.println("1. Real estate announcement");
                System.out.println("2. Product sales announcement");

                int announcementOption = scanner.nextInt();
                scanner.nextLine();

                if (announcementOption == 1) {
                    System.out.println("Enter announcement name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter announcement description: ");
                    String description = scanner.nextLine();
                    System.out.println("Enter announcement price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter announcement location: ");
                    String location = scanner.nextLine();
                    System.out.println("Enter announcement area: ");
                    double area = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Choose real estate type: (INTRAVILAN / EXTRAVILAN)");
                    RealEstateAnnouncement.RealEstateType realEstateType = RealEstateAnnouncement.RealEstateType.valueOf(scanner.nextLine().toUpperCase());
                    RealEstateAnnouncement realEstateAnnouncement = new RealEstateAnnouncement(name, description, price, realEstateType,
                            location, area);
                    announcements.add(realEstateAnnouncement);
                }

                else if (announcementOption == 2) {
                    System.out.println("Enter announcement name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter announcement description: ");
                    String description = scanner.nextLine();
                    System.out.println("Enter announcement price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product details: ");
                    String productDetails = scanner.nextLine();
                    System.out.println("Product condition: (BUN/ DETERIORAT/ EXCELENT)");
                    ProductSalesAnnouncement.ProductState productState = ProductSalesAnnouncement.ProductState.valueOf(scanner.nextLine().toUpperCase());
                    ProductSalesAnnouncement productSalesAnnouncement = new ProductSalesAnnouncement(name, description, price, productState, productDetails);
                    announcements.add(productSalesAnnouncement);
                }
            }
            else if (option == 2) {
                for (Announcement announcement : announcements) {
                    System.out.println(announcement.getDetails());
                }
            }
        }
    }
}
