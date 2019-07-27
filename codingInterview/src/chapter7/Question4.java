package chapter7;

import java.util.ArrayList;

public class Question4 {
/*
 * geography not concerned
 * 
 * parking spot
 * 		length
 * 		state(full/empty)
 * 		park in vehicle...
 * 		move out vehicle...
 * vehicle
 * 		size(length)
 * type
 * 		motorcycle
 * 		car
 * 		bus
 * 
 * 
 * 
 * 
 * */
}
class ParkingLot{
	ArrayList<ParkingSpot> spots;
	ArrayList<vehicle> parkedVehicleList;
	int availableBigSpots = 0;
	int availableNormalSpots = 0;
	public ParkingLot(int bigSpotNum, int normalSpotNum) {
		this.spots = new ArrayList<ParkingSpot>();
		this.parkedVehicleList = new ArrayList<vehicle>();
		for(int n=1; n <= bigSpotNum; n++) {
			ParkingSpot tmpSpot = new ParkingSpot(spotSizeEnum.big);
			spots.add(tmpSpot);
		}
		for(int n=1; n <= normalSpotNum; n++) {
			ParkingSpot tmpSpot = new ParkingSpot(spotSizeEnum.normal);
			spots.add(tmpSpot);
		}
		this.availableBigSpots = bigSpotNum;
		this.availableNormalSpots = normalSpotNum;
	}
	
	boolean parkIn(vehicle v) {
		for(int n=1; n<=spots.size(); n++) {
			if((spots.get(n).spotStatus == spotStatusEnum.empty)
					&& spots.get(n).length>=v.vehicleSize) {
				spots.get(n).parkedVehicle = v;
				spots.get(n).spotStatus = spotStatusEnum.full;
				parkedVehicleList.add(n, v);;
				return true;
			}
		}
		return false;
	}
	boolean moveOut(vehicle v) {
		if(!parkedVehicleList.contains(v)) {
			return false;
		}
		int index = parkedVehicleList.indexOf(v);
		spots.get(index).spotStatus = spotStatusEnum.empty;
		spots.get(index).parkedVehicle = null;
		return true;
	}
}
class ParkingSpot{
	int length;
	spotStatusEnum spotStatus;
	vehicle parkedVehicle;
	public ParkingSpot(spotSizeEnum size) {
		if(size == spotSizeEnum.big) {
			this.length = 10;
		}else if(size == spotSizeEnum.normal) {
			this.length = 5;
		}
		this.spotStatus = spotStatusEnum.empty;
		vehicle parkedVehicle = null;
	}
	
}
abstract class vehicle{
	int vehicleSize;
}
class motorcycle extends vehicle{
	int vehicleSize = 1;
}
class car extends vehicle{
	int vehicleSize = 5;
	
}
class bus extends vehicle{
	int vehicleSize = 10;
}
enum spotSizeEnum{
	big, normal;
}
enum spotStatusEnum{
	full, empty;
}
