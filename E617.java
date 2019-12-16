package practiceproblemsforfinal;

public class E617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multiplicationTable = 10;
        
        for(int i = 1; i<=multiplicationTable;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("----------------------------------------------");
         
        for(int i = 1 ;i<=multiplicationTable;i++) {
           
            System.out.format("%4d |",i);
            for(int j=1;j<=multiplicationTable;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
	}

}
}
