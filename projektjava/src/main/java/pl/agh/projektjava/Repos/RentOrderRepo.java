package pl.agh.projektjava.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.agh.projektjava.Entities.RentOrder;

@Repository
public interface RentOrderRepo extends CrudRepository<RentOrder,Long>
{
    
}
