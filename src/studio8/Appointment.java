package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	@Override
	public int hashCode() {
		return Objects.hash(Date, Time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Appointment other = (Appointment) obj;
		return Objects.equals(Date, other.Date) && Objects.equals(Time, other.Time);
	}


	private Date Date;
	private Time Time;


	/**
	 * @param date
	 * @param time
	 */
	public Appointment(Date date, Time time) {
		super();
		Date = date;
		Time = time;
	}


	public static void main(String[] args) {
		Time t1 = new Time(14, 12, true);
		Time t2 = new Time(14, 5, false);
		Date d1= new Date ("January", 100, 2);
		Date d2= new Date ("January", 100, 2);
		Appointment a1= new Appointment(d1,t1);
		Appointment a2= new Appointment(d2,t2);
		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(a1);
		set.add(a2);
		System.out.println(set);

		// TODO Auto-generated method stub

	}

}
