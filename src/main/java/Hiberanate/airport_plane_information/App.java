package Hiberanate.airport_plane_information;

import java.util.Scanner;

import org.hibernate.SessionFactory;

/**
 * 
 * @author Raval
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Available planes with Id, country and Company " + "\n1002 | india | air india  "
				+ "\n1102 | china | GoIndiaGo " + "\n9202 | Malesiya  Pan Asia " + "\n45011 | India | Kingfisher "
				+ "\nEnter Id of Plane -->");
		int id = scan.nextInt();

		if (!(0 >= id)) {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			StringBuilder sb = new DatabaseOperationDAO().getPlaneDetails(factory, id);
			factory.close();
			scan.close();
			System.out.println("\n\n######### Welcome to Indian Air Traffic Commision ##########\n\n");
			System.out.println(sb);

		} else {
			System.out.println("Enter valid Plane Id");
		}
		System.out.println("\n***************** Thank For using our servise **************");
	}

}
