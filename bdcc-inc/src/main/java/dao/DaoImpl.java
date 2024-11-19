package dao;

public class DaoImpl implements Idao {
    @Override
    public double getData(){
        System.out.println("Version base de donnee");
        double temp=23;
        return temp;
    }
}
