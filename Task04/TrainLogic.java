package by.htp.SimpleClass.Task04;

public class TrainLogic {

    public void sortById(Train[] trains) {
	boolean oneMore = true;

	while (oneMore) {
	    oneMore = false;
	    for (int i = 0; i < trains.length - 1; i++) {
		if (trains[i].getId() > trains[i + 1].getId()) {
		    Train temp = trains[i];
		    trains[i] = trains[i + 1];
		    trains[i + 1] = temp;

		    oneMore = true;
		}
	    }
	}
    }

    public Train findTrainById(Train[] trains, int id) {
	for (Train train : trains) {
	    if (train.getId() == id) {
		return train;
	    }
	}

	return null;
    }

    public void sortByDestination(Train[] trains) {
	boolean oneMore = true;

	while (oneMore) {
	    oneMore = false;

	    for (int i = 0; i < trains.length - 1; i++) {
		int compareResult = trains[i].getDestination().compareTo(trains[i + 1].getDestination());
		if (compareResult > 0) {
		    Train temp = trains[i];
		    trains[i] = trains[i + 1];
		    trains[i + 1] = temp;

		    oneMore = true;
		} else if (compareResult == 0) {
		    if (trains[i].getDepartureTime().compareTo(trains[i + 1].getDepartureTime()) > 0) {
			Train temp = trains[i];
			trains[i] = trains[i + 1];
			trains[i + 1] = temp;

			oneMore = true;
		    }
		}
	    }
	}
    }
}
