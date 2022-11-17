package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean twelve;

	/**
	 * @param hour
	 * @param minute
	 */
	public Time(int hour, int minute, boolean twelve) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.twelve = twelve;
	}

	@Override
	public String toString() {
		if (!twelve) {
			if (hour <= 9 && minute <= 9) {
				return "0" + hour + "0" + minute;
			} else if (hour <= 9 && minute > 9) {
				return "0" + hour + minute;
			} else if (hour > 9 && minute <= 9) {
				return hour + "0" + minute;
			} else {
				return hour + "" + minute;
			}
		} else {
			if (hour < 12) {
				return hour + ":" + minute + " AM";
			} else {
				int actualHour = hour - 12;
				return actualHour + ":" + minute + " PM";
			}
		}
	}

	public static void main(String[] args) {
		Time t1 = new Time(14, 12, true);
		Time t2 = new Time(14, 5, false);
		Time t3 = new Time(2, 5, true);
		Time t4 = new Time(14, 5, false);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		System.out.println(t4.equals(t3));


	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		Time other = (Time) obj;
		if (this.twelve == other.twelve) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			return hour == other.hour && minute == other.minute;
		} else if (this.twelve) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			return hour == (other.hour - 12) && minute == other.minute;
		} else {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			return hour - 12 == other.hour && minute == other.minute;
		}
	}

}