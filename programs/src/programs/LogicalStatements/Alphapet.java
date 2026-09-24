package programs.LogicalStatements;

import java.util.Scanner;

public class Alphapet {

	public static void main(String[] args) {
		for(char ch = 'A';ch<='Z';ch++) {
			int postion = ch - 'A'+1;
			if(postion%2==0) {
				System.out.println(postion + "-> " + ch);
			}
		}

	}

}
