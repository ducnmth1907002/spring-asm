package t1908e.springasm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1908e.springasm.entity.Street;

import java.util.List;

public interface StreetRepository extends JpaRepository<Street, Integer> {
    public List<Street> findStreetByNameContainsAndDistrictId(String streetNamme, int districtId);

    public List<Street> findStreetByNameContains(String streetNamme);

    public List<Street> findStreetByDistrictId(int districtId);
}
