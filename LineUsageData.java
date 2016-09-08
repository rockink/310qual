

public class LineUsageData {
  private SinglyLinkedList<Usage> lineUsageData;

  public LineUsageData(){
    lineUsageData = new SinglyLinkedList<Usage>();

  }

  public void addObservation(String username){
    //need to put the counter in that username in that computer...so!
    boolean stored = false;
    for(int i = 0; i < lineUsageData.size(); i++){
      if(lineUsageData.get(i).getUsername().equals(username)){
        lineUsageData.get(i).count++;
        stored = true;
        break;
      }
    }

    if(stored == false){
      lineUsageData.add(new Usage(username, 1));
    }

  }

  public Usage findMaxUsage(){
    Usage maxCount = new Usage("foo", 0);
    for(int i = 0; i < lineUsageData.size(); i++){
      if(lineUsageData.get(i).getCount() > maxCount.getCount()){
        maxCount = lineUsageData.get(i);
      }
    }

    return maxCount;
  }

}
