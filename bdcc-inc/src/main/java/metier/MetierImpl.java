package metier;

import dao.Idao;

public class MetierImpl implements IMetier {
    //implementation faible
    private Idao dao;
    public double calcul(){
        double t = dao.getData();
        double res = t*23;
        return res;
    }

    public void setDao(Idao dao){
        this.dao=dao;
    }

}
