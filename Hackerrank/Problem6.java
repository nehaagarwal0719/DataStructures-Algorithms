class Student extends Person{
	private int[] testScores;
    Student(String firstName, String lastName ,int id, int scores[])
    {
        super(firstName,lastName,id);
        testScores=scores;
    }
    char calculate(){
        int s=0;
        for(int i=0;i<testScores.length;i++){
            s=s+testScores[i];
        }
        float avg=s/testScores.length;
         return avg >= 90? 'O'
        : avg >= 80? 'E'
        : avg >= 70? 'A'
        : avg >= 55? 'P'
        : avg >= 40? 'D'
        : 'T';     
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
