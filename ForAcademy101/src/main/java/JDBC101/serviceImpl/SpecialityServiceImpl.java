package JDBC101.serviceImpl;

import JDBC101.model.Speciality;
import JDBC101.service.specialityService;

import java.util.List;
import java.util.Optional;

public class SpecialityServiceImpl implements specialityService {
    @Override
    public void addSpeciality(Speciality Speciality) {

    }

    @Override
    public Optional<Speciality> fetchSpecialityById(int id_Speciality) {
        return Optional.empty();
    }

    @Override
    public void deleteSpecialityById(Speciality id_Speciality) {

    }

    @Override
    public void updateSpecialityPasswordById(String newPassword, String[] id_Speciality) {

    }

    @Override
    public List<Speciality> getAllSpecialities() {
        return null;
    }
}