package Hiberanate.airport_plane_information;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PlaneDetails")
@Table(name = "plane_detailing_table")
public class PlaneDetails {

	@Id
	@GeneratedValue
	@Column(name = "plane_id")
	int planeId;

	@Column(name = "plane_country")
	String planeCountry;

	@Column(name = "plane_companyName")
	String planeCompanyName;

	@Column(name = "plane_source")
	String planeSource;

	@Column(name = "plane_destination")
	String planeDestination;

	@Column(name = "plane_takeOff_time")
	Time planeTakeOffTime;

	@Column(name = "plane_landing_time")
	Time planeLandingTime;

	@Column(name = "plane_ideal_time")
	Time planeIdealTime;

	public PlaneDetails() {
		super();
	}

	public int getPlaneId() {
		return planeId;
	}

	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}

	public String getPlaneCountry() {
		return planeCountry;
	}

	public void setPlaneCountry(String planeCountry) {
		this.planeCountry = planeCountry;
	}

	public String getPlaneCompanyName() {
		return planeCompanyName;
	}

	public void setPlaneCompanyName(String planeCompanyName) {
		this.planeCompanyName = planeCompanyName;
	}

	public String getPlaneSource() {
		return planeSource;
	}

	public void setPlaneSource(String planeSource) {
		this.planeSource = planeSource;
	}

	public String getPlaneDestination() {
		return planeDestination;
	}

	public void setPlaneDestination(String planeDestination) {
		this.planeDestination = planeDestination;
	}

	public Time getPlaneTakeOffTime() {
		return planeTakeOffTime;
	}

	public void setPlaneTakeOffTime(Time planeTakeOffTime) {
		this.planeTakeOffTime = planeTakeOffTime;
	}

	public Time getPlaneLandingTime() {
		return planeLandingTime;
	}

	public void setPlaneLandingTime(Time planeLandingTime) {
		this.planeLandingTime = planeLandingTime;
	}

	public Time getPlaneIdealTime() {
		return planeIdealTime;
	}

	public void setPlaneIdealTime(Time planeIdealTime) {
		this.planeIdealTime = planeIdealTime;
	}

	@Override
	public String toString() {
		return " Your Plane Details For >>> " + ": Plane Id :-> " + planeId
				+ " <-: is as follows \n Company Location = " + planeCountry + "\n Company Name = " + planeCompanyName
				+ "\n Plane Travels : from >->-> " + planeSource + " To >->-> " + planeDestination
				+ "\n TakeOff Time = " + planeTakeOffTime + " and Estimated Arrival time = " + planeLandingTime
				+ "\n Boarding Time = " + planeIdealTime + "";
	}

}
