package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int index = 0;

        // Loop through the playlist starting from one position after the startIndex because if current song was select we wouldnt get the right answer
        for (int i = startIndex + 1; i < playList.length; i++) {
            // Check if current song matches the selection
            if (playList[i].equals(selection)) {
                index = i;
            }

        }
        int up = Math.abs(index - startIndex);
        // Ensure positive number with Math.abs (absolute)
        int down = Math.abs((startIndex + playList.length) - index);

        // Return the smaller of the two distances up or down
        return Math.min(up, down);


    }
}
