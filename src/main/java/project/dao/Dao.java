package project.dao;



import project.model.User;

import java.util.List;

public interface Dao<T>  {
    public void add(T t);

    public void update(T t);

    public void remove(int id);

    public T getById(int id);

    public List<T> list();

    public boolean getEn(T t);
}
