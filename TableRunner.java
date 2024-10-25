public class TableRunner{

	public static void main(String args[]){


	    Table table1 = new Table("Costco", 75, true, "Glossy");
        Table table2 = new Table("Ikea", 60, false, "Matte");
        Table table3 = new Table("Walmart", 72, true, "Wooden");
        Table table4 = new Table("Home Depot", 68, false, "Glass");
        Table table5 = new Table("Ashley", 80, true, "Natural");


        table1.tableDetails();
        table2.tableDetails();
        table3.tableDetails();
        table4.tableDetails();
        table5.tableDetails();


}

}