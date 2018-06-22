package ch.ethz.matsim.location_assignment.assignment;

import ch.ethz.matsim.location_assignment.assignment.discretization.DiscreteLocationResult;
import ch.ethz.matsim.location_assignment.assignment.distance.FeasibleDistanceResult;
import ch.ethz.matsim.location_assignment.assignment.objective.LocationAssignmentObjective;
import ch.ethz.matsim.location_assignment.assignment.relaxation.RelaxedLocationResult;

public class LocationAssignmentResult {
	final private FeasibleDistanceResult feasibleDistanceResult;
	final private RelaxedLocationResult relaxedLocationResult;
	final private DiscreteLocationResult discreteLocationResult;
	final private LocationAssignmentObjective objective;

	public LocationAssignmentResult(FeasibleDistanceResult feasibleDistanceResult,
			RelaxedLocationResult relaxedLocationResult, DiscreteLocationResult discreteLocationResult,
			LocationAssignmentObjective objective) {
		this.feasibleDistanceResult = feasibleDistanceResult;
		this.relaxedLocationResult = relaxedLocationResult;
		this.discreteLocationResult = discreteLocationResult;
		this.objective = objective;
	}

	public FeasibleDistanceResult getFeasibleDistanceResult() {
		return feasibleDistanceResult;
	}

	public RelaxedLocationResult getRelaxedLocationResult() {
		return relaxedLocationResult;
	}

	public DiscreteLocationResult getDiscreteLocationResult() {
		return discreteLocationResult;
	}

	public LocationAssignmentObjective getObjective() {
		return objective;
	}
}
