package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;



public class Date {
	private String month;
	private int year;
	private int date;


	/**
	 * @param month
	 * @param year
	 * @param date
	 * @param hour
	 * @param minute
	 */
	public Date(String month, int year, int date) {
		super();
		this.month = month;
		this.year = year;
		this.date = date;
	}

	

	@Override
	public String toString() {
		return "The date is " + month + " " + date + ", " + year;
	}



	@Override
	public int hashCode() {
		return Objects.hash(date, month, year);
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
		Date other = (Date) obj;
		return date == other.date && Objects.equals(month, other.month) && year == other.year;
	}



	public static void main(String[] args) {
		Date d1= new Date ("December", 2022, 11);
		Date d2= new Date ("October", 2011, 11);
		Date d3= new Date ("January", 100, 2);
		Date d4= new Date ("January", 100, 2);
		Date d5= new Date ("March", 31, 2);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1.equals(d2));
		System.out.println(d4.equals(d3));

		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d3);
		set.add(d4);
		System.out.println(set);


	}

}
