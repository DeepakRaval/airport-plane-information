package Hiberanate.airport_plane_information;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = getSessionFactory();

	public static SessionFactory getSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sessionFactory;
	}

	public static void close() {
		getSessionFactory().close();
	}

}
