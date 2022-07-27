package lelang;
import java.util.ArrayList;
public class Petugas implements /*mewariskan user (enkapsulasi)*/ User{
    private ArrayList<String> namaPetugas = new ArrayList<String>(); //variable
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    //contruktor
    public Petugas(){
        this.namaPetugas.add("Ardina Kirazli Suryandra");
        this.alamat.add("Lamongan");
        this.telepon.add("089530469342");
}
    public int getJumlahPetugas(){ //method
        return this.namaPetugas.size();
    }
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelephone(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int id){
        return this.namaPetugas.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelephone(int id){
        return this.telepon.get(id);
    }
}