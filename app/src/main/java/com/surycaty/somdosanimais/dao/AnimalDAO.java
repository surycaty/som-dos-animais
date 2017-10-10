package com.surycaty.somdosanimais.dao;

import com.surycaty.somdosanimais.R;
import com.surycaty.somdosanimais.entidade.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by negus on 10/10/17.
 */

public class AnimalDAO {

    public static List<Animal> getListaAnimais() {

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("Cachorro", 0, R.drawable.cachorro));

        animals.add(new Animal("Elefante", 0, R.drawable.elefante));

        animals.add(new Animal("Galinha", 0, R.drawable.galinha));

        animals.add(new Animal("Gato", 0, R.drawable.gato));

        animals.add(new Animal("Macaco", 0, R.drawable.macaco));

        animals.add(new Animal("Pato", 0, R.drawable.pato));

        animals.add(new Animal("Pintinho", 0, R.drawable.pintinho));

        animals.add(new Animal("Porco", 0, R.drawable.porco));

        animals.add(new Animal("Sapo", 0, R.drawable.sapo));

        animals.add(new Animal("Vaca", 0, R.drawable.vaca));

        return animals;
    }
}
