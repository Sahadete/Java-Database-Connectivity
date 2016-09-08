/***************************

© Copyright Sahadete Jashari

***************************/


import java.sql.*;


 public class Forma{
	 
	String driver ="org.postgresql.Driver";
	String dbUrl = "jdbc:postgresql://127.0.0.1:5432/VWU";
	String username = "postgres";
	String password = "postgres";


	Connection lidhja = null;
	Statement st = null;



	public boolean lidhuMeDb()
	{


		try{

			Class.forName(driver);
			lidhja = DriverManager.getConnection(dbUrl, username, password);
		}

		catch(ClassNotFoundException cn){
			System.out.println(cn.getMessage());
		}
		catch(SQLException sq){
			System.out.println(sq.getMessage());
			return false;
		}

		return  true;
	}




	public void regjistroKursin(){

		Kursi kursi = new Kursi();



		try{
			st = lidhja.createStatement();
			st.execute("INSERT into kursi VALUES( " + kursi.KURSIID + ", '" + kursi.KURSIEMRI + "' )");




		}

		catch(SQLException sq){
			System.out.println(sq.getMessage());
		}
		catch(NullPointerException n){
			System.out.println(n.getMessage());
		}



	}

	public void regjistroStudentin(){


		try{
				Studenti studenti = new Studenti();
				st = lidhja.createStatement();
				st.execute("INSERT into studenti VALUES( " + studenti.STUDENTIID + ", '" + studenti.STUDENTIEMRI + "',' " + studenti.STUDENTIMBIEMRI + "' ," + studenti.STUDENTIKURSI +" )");
				lidhja.close();
			}

		catch(SQLException sl){ 	
			System.out.println(sl.getMessage());
		}







	}












}