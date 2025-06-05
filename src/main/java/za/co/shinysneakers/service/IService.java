package za.co.shinysneakers.service;

public interface IService <Type, IDType> {
    Type create(Type t);

    Type read(IDType id);

    Type update(Type t);

    boolean delete(IDType id);

    // if the passed id parameter of an object is deleted return true, else false
    // using an identifier to delete an object
}
