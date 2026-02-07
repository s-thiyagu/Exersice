package topExceptions;

import topExceptions.excep.DiscountNotAvailable;
import topExceptions.excep.HotelUnAvailableExceptions;
import topExceptions.excep.OrdernotAvailableException;

public class Hotel {
    static void main(String[] args) {
        hotelAvailability();
        orderAvailability();
        discountNotAvailable();
    }

    static void discountNotAvailable() {
        try {
            throw new DiscountNotAvailable();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    static void orderAvailability() {
        try {
            throw new OrdernotAvailableException("the");
        } catch (Exception object) {
            object.printStackTrace();
        }
    }

    static void hotelAvailability() {
        try {
            throw new HotelUnAvailableExceptions();
        } catch (Exception object) {
            object.printStackTrace();
        }
    }
}