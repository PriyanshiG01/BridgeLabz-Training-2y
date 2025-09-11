package java_method;
	class palindromechecker {
	    String text;
	    public boolean checkPalindrome() {
	        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // optional: clean up text
	        int left = 0;
	        int right = cleanedText.length() - 1;

	        while (left < right) {
	            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	    public void displayResult() {
	        if (checkPalindrome()) {
	            System.out.println("\"" + text + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + text + "\" is not a palindrome.");
	        }
	    }

	    public static void main(String[] args) {
	    	palindromechecker pc = new palindromechecker();
	        pc.text = "Madam"; 
	        pc.displayResult();
	    }
	}
