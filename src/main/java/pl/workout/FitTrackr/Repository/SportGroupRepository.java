package pl.workout.FitTrackr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.workout.FitTrackr.Model.SportGroup;

public interface SportGroupRepository extends JpaRepository<SportGroup, Long> {
}
