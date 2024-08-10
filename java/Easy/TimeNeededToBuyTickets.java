package Easy;

public class TimeNeededToBuyTickets {
    public static void main(String[] args){
        int[] tickets = {5,1,1,1};
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int s = 0;
        for(int i = 0; i <= k; i++){
            if(tickets[i] > tickets[k]){
                s = s + tickets[k];
            } else {
                s = s + tickets[i];
            }
        }
        for(int i = k + 1; i < tickets.length; i++){
            if(tickets[i] > tickets[k] - 1){
                s = s + tickets[k] - 1;
            } else {
                s = s + tickets[i];
            }
        }
        return s;
    }
}
