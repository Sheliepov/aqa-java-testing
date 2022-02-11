package ua.sheliepov.serhii.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.sheliepov.serhii.learningspring.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}