package Hiberanate.airport_plane_information;

import java.sql.Time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DatabaseOperationDAO {

	public StringBuilder getPlaneDetails(SessionFactory sf, int planeId) {
		Session session = sf.openSession();
		session.beginTransaction();

		PlaneDetails pd = (PlaneDetails) session.get(PlaneDetails.class, planeId);
		session.close();
		StringBuilder sb = getTotalTimeOfFlight(pd.getPlaneTakeOffTime(), pd.getPlaneLandingTime());
		StringBuilder planeInfo = new StringBuilder(pd.toString() + sb);
		return planeInfo;
	}

	public StringBuilder getTotalTimeOfFlight(Time ptt, Time plt) {

		long diff = Math.abs(ptt.getTime() - plt.getTime());
		long diffSeconds = diff / 1000;
		long diffMinutes = diff / (60 * 1000);
		long diffHourse = diff / (60 * 60 * 1000);

		return new StringBuilder("\n\n Estimated to time complete journey : " + (diffHourse % 24) + " hours, "
				+ (diffMinutes % 60) + " minuts, " + (diffSeconds % 60) + " seconds.");

	}

}
