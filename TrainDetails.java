public class TrainDetails {
	

	public static void main(String[]args)
	{


		Train train = new Train("train101","city A to B",300,150);
		Train train1 = new Train("train102","city c to d",350,100);
		Train train2 = new Train("train103","city e to f",400,250);
		Train train3 = new Train("train104","city g to h",450,200);
		Train train4 = new Train("train105","city i to j",500,158);
		Train train5 = new Train("train106","city k to l",300,150);
		Train train6 = new Train("train107","city m to n",300,150);
            

         Train train7 = new Train();
		Train train8 = new Train();
		Train train9 = new Train();   



		train.displayTrainDetails();
		train1.displayTrainDetails();
		train2.displayTrainDetails();
		train3.displayTrainDetails();
		train4.displayTrainDetails();
		train5.displayTrainDetails();
		train6.displayTrainDetails();




	}
}