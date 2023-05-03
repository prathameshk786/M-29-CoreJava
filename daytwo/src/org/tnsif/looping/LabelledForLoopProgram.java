package org.tnsif.looping;

public class LabelledForLoopProgram {

	public static void main(String[] args) {
		
		outer:
			for(int i = 1; i<=5; i++) {
				inner:
					for(int j = 1; j<=5; j++) {
						if(j==4)
							//it will skip 4
							continue;
						System.out.print(j + " ");
					}
				System.out.println("");
			}
	}

}
