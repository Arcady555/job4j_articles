package ru.job4j.articles.store;

import java.util.List;

public interface Store<T> {
    void save(T model);
    List<T> findAll();
}