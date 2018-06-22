package ch.ethz.matsim.location_assignment.algorithms.discretizer.simple;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import ch.ethz.matsim.location_assignment.algorithms.discretizer.DefaultDiscretizationResult;
import ch.ethz.matsim.location_assignment.algorithms.discretizer.Discretizer;
import ch.ethz.matsim.location_assignment.algorithms.discretizer.DiscretizerResult;

public class SimpleDiscretizer implements Discretizer {
	@Override
	public DiscretizerResult discretize(Vector2D location) {
		return new DefaultDiscretizationResult(new SimpleLocation(location));
	}
}
