
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
			response = getRandomResponse();
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		}
		if (statement.indexOf("ball") >= 0){
			response = "You must be sporty!!!";
		}
		if (statement.indexOf("lunch") >= 0){
			response = "I am so hungry!!!";
		}
		if (statement.indexOf("teacher") >= 0){
			response = "He sounds like a good teacher.";
		}
		if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		}		
		if (statement.length() == 0){
			response = "Say something, please.";
		}

		
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}else if (whichResponse == 4){
			response = "What are you talking about?";
		}else if (whichResponse == 5){
			response = "No comment!!";
		}
		

		return response;
	}
}
