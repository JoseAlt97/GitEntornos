package EjeRefactorizacion;

class Conversor {
	
	 public static int todo(int n, String med1, String med2) {
		 if (med1.equals("m") && med2.equals("cm")) {
			 return n*100;
		 }
		 if (med1.equals("km") && med2.equals("m")) {
			 return n*1000;
		 }
		 if (med1.equals("km") && med2.equals("cm")) {
			 return n*100000;
		 }
		 return 0;
	} 
}

