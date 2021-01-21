package week_two_j_beginner;




public class Records {

	int physics;
	int chemistry;
	int biology;
	int total;
	int percentage;
	String name;
	
	

	public Records(int physics, int chemistry, int biology, String name) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.name = name;
		this.total = physics + chemistry + biology;
		this.percentage = total / 350;
	}

	

	
}
