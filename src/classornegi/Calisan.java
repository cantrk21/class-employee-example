package classornegi;

public class Calisan {

	public int no;
	public String name;
	public String surname; 
	public int experience;
	public double wage;
	
	
	
	public Calisan(int no, String name, String surname, int experience, double wage) {
	
		this.no = no;
		this.name = name;
		this.surname = surname;
		this.experience = experience;
		this.wage = wage;
	}

	public void showEmployeeInformation()
	{
		
		System.out.println("********EmployeeInformation************");
		System.out.println("no      :"+no);
		System.out.println("name    :"+name);
		System.out.println("surname :"+surname);
		System.out.println("experience :"+experience);
		System.out.println("wage :"+wage);


	}
	public void makeIncrease(int zamDegeri)
	{
		System.out.println("your wage has been increased ny "+zamDegeri+" tl ");
		System.out.println("currency wage : "+(wage+zamDegeri));
	}
	
	public void format(String isletimSistemi,String kim)
	{
		System.out.println(kim + "su anda "+ isletimSistemi +" isletim sistemine format atiyor");
	}
	
	
	
}
