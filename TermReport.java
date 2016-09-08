import java.util.Scanner;

class TermReport{

   LineUsageData[] masterArray;

  public TermReport(){
    masterArray = new LineUsageData[500];
    for (int i = 0; i < masterArray.length; i++){
        masterArray[i] =  new LineUsageData();
    }
  }

  public LineUsageData[] getMasterArray() {
    return masterArray;
  }

  public void setMasterArray(LineUsageData[] masterArray) {
    this.masterArray = masterArray;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    TermReport termReport = new TermReport();
//    while(scanner.hasNextLine()){
    for(int i = 0; i < 5; i++){

      System.out.println("User");
      String user = scanner.next();
      System.out.println("node");
      int node = scanner.nextInt();
      termReport.getMasterArray()[node].addObservation(user);
    }

    //report moment
    for(int i = 0; i < 8 ; i++){ //termReport.getMasterArray().length

      String print = String.format("%d \t %s",
              termReport.getMasterArray()[i].findMaxUsage().getCount(),
              termReport.getMasterArray()[i].findMaxUsage().getUsername()
              );
      System.out.println(print);
    }

  }

}
