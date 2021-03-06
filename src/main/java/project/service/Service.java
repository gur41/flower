package project.service;


import project.model.User;

import java.util.List;

public interface Service<T> {
    public void add(T t);

    public void update(T t);

    public void remove(int id);

    public T getById(int id);

    public boolean getEn(T t);

    public List<T> list();
}
