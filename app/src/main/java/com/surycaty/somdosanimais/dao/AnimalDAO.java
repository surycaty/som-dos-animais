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

        animals.add(new Animal("cachorro", R.raw.cachorro, R.drawable.cachorro));
        animals.add(new Animal("elefante", R.raw.elefante, R.drawable.elefante));
        animals.add(new Animal("galinha", R.raw.galinha, R.drawable.galinha));
        animals.add(new Animal("gato", R.raw.gato, R.drawable.gato));
        //animals.add(new Animal("ovelha", R.raw.ovelha, R.drawable.ovelha));
        animals.add(new Animal("pato", R.raw.pato, R.drawable.pato));
        animals.add(new Animal("porco", R.raw.porco, R.drawable.porco));
        animals.add(new Animal("sapo", R.raw.sapo, R.drawable.sapo));
        animals.add(new Animal("vaca", R.raw.vaca, R.drawable.vaca));

        return animals;
    }
}
