package example;

public class switchtry {

	public void likeGenderIs() {
         String title = "sir";
		String likelyGender;

		switch(title.toLowerCase()) {

		case "sir":	
			likelyGender = "M";
			break;
		case "mr":
			likelyGender = "M";
			break;
		case "master":
			likelyGender= "M";
			break;
		default:
			likelyGender="F";
			break;
		}

		System.out.println(likelyGender);

	}

}


