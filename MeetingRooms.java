import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.lang.String;


public class MeetingRooms{
    public static void main(String[] args){
        String file = args[0];
        ArrayList<Long> start_array = new ArrayList<Long>();      
        ArrayList<Long> end_array = new ArrayList<Long>();    
        try{
            
            Scanner inFile = new Scanner(new File(file));    
            String[] test;
            while(inFile.hasNextLine()){
                String str = inFile.nextLine();
                test = str.split("-");
                start_array.add(Long.parseLong(test[0].strip().replace(":","")));
                end_array.add(Long.parseLong(test[1].strip().replace(":","")));
            }        
        }
        catch (NumberFormatException | IOException  e) 
            {
                e.printStackTrace();
            } 
        
    long[] start = start_array.stream().mapToLong(l -> l).toArray();
    long[] end = end_array.stream().mapToLong(l -> l).toArray();
    
    int resp = minMeetingRoomReq(start, end);
    System.out.println("Minimum Number of Meeting Rooms Required: "+resp);
}

public static int minMeetingRoomReq(long[] startArray, long[] endArray) {
    Arrays.sort(startArray);
    Arrays.sort(endArray);
    
    for(int i=0; i<endArray.length;i++){
        if(endArray[i]>2359L){
            endArray[i] = 2359L;
        }
    }

    int l = startArray.length;
    int i = 1;
    int j = 0;

    int minMeetingRoomsNeeded = 1;
    int currentMeetingsCount = 1;

    while (i < l && j < l) {
      if (endArray[j] > startArray[i]) {
        currentMeetingsCount++;
        if (minMeetingRoomsNeeded < currentMeetingsCount) {
            minMeetingRoomsNeeded = currentMeetingsCount;
        }
        i++;
      } else {
        currentMeetingsCount--;
        j++;
      }
    }

    return minMeetingRoomsNeeded;
  }
}