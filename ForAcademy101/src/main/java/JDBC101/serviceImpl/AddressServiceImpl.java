package JDBC101.serviceImpl;
import JDBC101.model.Address;
import JDBC101.service.*;
import JDBC101.daoImpl.*;

import java.util.List;

public class AddressServiceImpl implements addressService  {

    private addressDaoImp addressDao;
    @Override
    public void addAddress(Address address) {

        addressDao.saveAddress(address);
    }

    @Override
    public Address fetchAddressById(long id_address) {
        return addressDao.getAddress(id_address);
    }

    @Override
    public void deleteAddressById(Address id_address) {
addressDao.deleteAddress(id_address.getId_address());
    }

    @Override
    public void updateAddressPasswordById(String newPassword, long id_address) {

    }

    @Override
    public List<Address> getAllAddresss() {
        return null;
    }
}
