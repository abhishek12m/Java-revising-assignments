package collections.hastable;

public class BirthDate {
	private int day;
	private int month;
	private int year;

	public BirthDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "BirthDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (this == null || getClass() != obj.getClass())
			return false;
		BirthDate birthDate = (BirthDate) obj;
		return day == birthDate.day && month == birthDate.month;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31 * day + month;
	}

}
