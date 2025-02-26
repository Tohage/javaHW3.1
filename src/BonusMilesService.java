public class BonusMilesService {
    public int calculate(int price) {
        int byeTickets = 1;
        int priceOneMile = 20;
        int miles = (price / priceOneMile) * byeTickets;
        return miles;
    }
}
