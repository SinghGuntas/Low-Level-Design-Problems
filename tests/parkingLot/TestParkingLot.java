package parkingLot;


import com.parkinglot.enums.VehicleType;
import com.parkinglot.exceptions.ParkingSpotUnavailableException;
import com.parkinglot.exceptions.VehichleNotSupportedException;
import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehichle;
import com.parkinglot.service.ParkingServiceImpl;
import org.testng.annotations.Test;

public class TestParkingLot {

    @Test
    public void testParkingLot() throws VehichleNotSupportedException, ParkingSpotUnavailableException {
        ParkingLot parkingLot = new ParkingLot("Guntas parking lot");
        ParkingServiceImpl parkingService = new ParkingServiceImpl(parkingLot);
        Ticket ticket = parkingService.entry(new Vehichle("PB1234", VehicleType.BIKE));

    }

}
