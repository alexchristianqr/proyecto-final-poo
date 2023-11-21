package controllers;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseController<T> {

    public List<T> lista = new ArrayList<>();

    public int idAutoincrementado() {
        return lista.size() + 1;
    }
}
