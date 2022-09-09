package Lab3;

public class Plane {
    private PlaneSeat[] seat;
    private  int numEmptySeat;

    public Plane() {
        this.seat = new PlaneSeat[12];
        for(int i =0; i<12; i++) {
            seat[i] = new PlaneSeat(i+1);
        }
        this.numEmptySeat = 12;
    }
    public PlaneSeat[] sortSeats() {
        PlaneSeat[] sortedSeatArr = this.seat.clone();
        HeapSort heapSort = new HeapSort();
        heapSort.sort(sortedSeatArr);
        return sortedSeatArr;
    }
    public void showNumEmptySeats() {
        System.out.println("Number of empty seats: "+ this.numEmptySeat);
    }
    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for(int i = 0;  i<12; i++) {
            if(!seat[i].isOccupied()) System.out.println("SeatID "+seat[i].getSeatID());
        }
    }
    public void showAssignedSeat(boolean bySeatId) {
        System.out.println("The seat assignments are as follow:");
        if(bySeatId) {
            for(int i = 0;  i<12; i++) {
                if(seat[i].isOccupied()) {
                    System.out.println("SeatID "+seat[i].getSeatID()+" assigned to CustomerID "+seat[i].getCustomerID());
                }
            }
        }
        else {
            PlaneSeat[] seatByCustomerId = sortSeats();
            for(int i = 0;  i<12; i++) {
                if(seatByCustomerId[i].isOccupied()) {
                    System.out.println("SeatID "+seatByCustomerId[i].getSeatID()+" assigned to CustomerID "+seatByCustomerId[i].getCustomerID());
                }
            }

        }
    }

    public void assignSeat(int seadId,int customerID) {
        if(seat[seadId-1].isOccupied()) {
            System.out.println("Seat already assigned to a customer");
            return;
        }
        seat[seadId-1].assign(customerID);
        this.numEmptySeat--;
        System.out.println("Seat Assigned");
    }

    public void unAssignSeat(int seatId) {
        if(seat[seatId-1].isOccupied()) {
            seat[seatId-1].unAssign();
            this.numEmptySeat++;
        }
    }

}
