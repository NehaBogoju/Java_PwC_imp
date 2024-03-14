/*Raghu's tutor provides him a simple sentence and asks him to count the number of words in the sentence. The words are separated by space.

Example, if the tutor provides the sentence as "Welcome to Java", the output should be

Number of words 3

The words are 

Welcome

to

Java

Fill the space in the below code so that the code fulfills his requirement. 

Code :*/

    Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();

		String words[ ]  = str.split(" ");

		int count=words.length;  //count holds the number of words in the sentence

		System.out.println("Number of words "+count);

		System.out.println("The words are ");

		for(String x:words) //for each loop


			 System.out.println(x);
