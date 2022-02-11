package ua.sheliepov.serhii.learningspring.data.repository;

import ua.sheliepov.serhii.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}