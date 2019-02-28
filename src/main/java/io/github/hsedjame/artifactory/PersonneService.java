package io.github.hsedjame.artifactory;

import java.util.function.Consumer;

/**
 * @Project ARTIFACTORY_TEST
 * @Author Henri Joel SEDJAME
 * @Date 23/02/2019
 * @Class purposes : .......
 */
public class PersonneService {

    public void presenter(Personne personne, Consumer<Personne> presentationconsumer){

        presentationconsumer.accept(personne);
    }


}
