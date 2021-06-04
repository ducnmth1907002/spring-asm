package t1908e.springasm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import t1908e.springasm.entity.Street;
import t1908e.springasm.repository.StreetRepository;

import java.util.List;

@Service
@Configurable
public class StreetService {
    @Autowired
    StreetRepository streetRepository;
    public Street create(Street street){
        return streetRepository.save(street);
    }

    public List<Street> list() {
        return streetRepository.findAll();
    }

    public List<Street> findStreetByNameContainsAndDistrictId( String nameStreet,int districtId){
        return streetRepository.findStreetByNameContainsAndDistrictId(nameStreet,districtId);
    }
    public List<Street> findStreetByNameContains( String nameStreet){
        return streetRepository.findStreetByNameContains(nameStreet);
    }
    public List<Street> findStreetByDistrictId(int districtId){
        return streetRepository.findStreetByDistrictId(districtId);
    }
}
