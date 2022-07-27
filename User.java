package lelang;
public interface User{ //kelas interface polimor 
    public/*modifier*/ void setNama(String nama); //method
    public void setAlamat(String alamat);
    public void setTelephone(String telephone);
    
    public String getNama(int id);
    public String getAlamat(int alamat);
    public String getTelephone(int telephone);
}