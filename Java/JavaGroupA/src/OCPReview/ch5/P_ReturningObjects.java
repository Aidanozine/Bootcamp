package OCPReview.ch5;

public class P_ReturningObjects {
}

class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2; // tickets = 2
        String guests = "abc"; // guests = abc
        addTickets(tickets); // tickets = 2
        guests = addGuests(guests); // guests = abcd
        System.out.println(tickets + guests); // 2abcd
    }

    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}