
public class Polynomial {

	public static void main(String[] args){
		String function = args[0];
		String xValue = args[1];
		int x = Integer.parseInt(xValue);
		if (x > 10) {
			System.err.println("Enter a function of <= 10 exponents!");
		}
		else {
		String subFunction = function.replaceAll("x", xValue);
		
		int [] num = new int[(subFunction.length())];
		for (int i=0; i<subFunction.length(); i++) {
			if (subFunction.charAt(i) != '*') {
				if(subFunction.charAt(i) != '^') {
					if(subFunction.charAt(i) != '+') {
						num[i] = subFunction.charAt(i) - '0';
					}
				}
			}
		}
		if(subFunction.length() < 6) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4])));
			System.out.println("Final result is: " + finalResult);
		}
		else if(subFunction.length() > 6  && subFunction.length() < 12) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))
					+(num[6]*(Math.pow(num[8], num[10]))));
			System.out.println("Final result is: " + finalResult);
		}
		else if(subFunction.length() > 12 && subFunction.length() < 18) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))+
					(num[6]*(Math.pow(num[8], num[10]))+(num[12]*(Math.pow(num[14], num[16])))));
			System.out.println("Final result is: " + finalResult);
		}
		else if ( subFunction.length() > 18 && subFunction.length() < 24) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))
					+(num[6]*(Math.pow(num[8], num[10]))+(num[12]*(Math.pow(num[14], num[16]))
							+(num[18]*(Math.pow(num[20], num[22]))))));
			System.out.println("Final result is: " + finalResult);
		}
		else if (subFunction.length() > 24 && subFunction.length() < 30) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))
					+(num[6]*(Math.pow(num[8], num[10]))+(num[12]*(Math.pow(num[14], num[16]))
						+(num[18]*(Math.pow(num[20], num[22]))
								+(num[24]* (Math.pow(num[26], num[28])))))));
			System.out.println("Final result is: " + finalResult);
		}
		else if (subFunction.length() > 30 && subFunction.length() < 36) {
			int finalResult = num[0]*num[2]^num[4]+num[6]*num[8]^num[10]+num[12]*num[14]^num[16]+num[18]
					*num[20]^num[22]+num[24]*num[26]^num[28]+num[30]*num[32]^num[34];
			System.out.println("Final result is: " + finalResult);
		}
		else if (subFunction.length() >36 && subFunction.length() < 42) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))
					+(num[6]*(Math.pow(num[8], num[10]))+(num[12]*(Math.pow(num[14], num[16]))
						+(num[18]*(Math.pow(num[20], num[22]))+(num[24]* (Math.pow(num[26], num[28])) 
							+(num[30]*(Math.pow(num[32], num[34]))
									+(num[36]*(Math.pow(num[38], num[40])))))))));
			System.out.println("Final result is: " + finalResult);
		}
		else if (subFunction.length() > 42 && subFunction.length() < 48) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))
					+(num[6]*(Math.pow(num[8], num[10]))+(num[12]*(Math.pow(num[14], num[16]))
						+(num[18]*(Math.pow(num[20], num[22]))+(num[24]* (Math.pow(num[26], num[28])) 
							+(num[30]*(Math.pow(num[32], num[34]))+(num[36]*(Math.pow(num[38], num[40]))
									+(num[42]*(Math.pow(num[44], num[46]))))))))));
			System.out.println("Final result is: " + finalResult);
		}
		else if (subFunction.length() >48 && subFunction.length() <54) {
			int finalResult = (int) (num[0]*(Math.pow(num[2], num[4]))
					+(num[6]*(Math.pow(num[8], num[10]))+(num[12]*(Math.pow(num[14], num[16]))
						+(num[18]*(Math.pow(num[20], num[22]))+(num[24]* (Math.pow(num[26], num[28])) 
							+(num[30]*(Math.pow(num[32], num[34]))+(num[36]*(Math.pow(num[38], num[40]))
									+(num[42]*(Math.pow(num[44], num[46]))
											+(num[48]*(Math.pow(num[50], num[52])))))))))));
		System.out.println("Final result is: " + finalResult);
		}	
	}
	}
}
