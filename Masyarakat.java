package lelang;
import java.util.ArrayList;
    public class Masyarakat implements/*inheritens*/ User{ 
    // modifier //kelas //typedata
    private ArrayList<String> namaMasyarakat = new ArrayList<String>(); // field / attributes / vaiable
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    
    // constructor 
    public Masyarakat(){ 
        //indeks 0 
        this.namaMasyarakat.add("sasa"); 
        this.alamat.add("Malang"); 
        this.telepon.add("1234567899"); 
         
        //indeks 1 
        this.namaMasyarakat.add("Lisa"); 
        this.alamat.add("Tulungagung"); 
        this.telepon.add("9987654321"); 
         
    } 
    
    // method
    public int getJumlahMasyarakat(){ 
        return  this.namaMasyarakat.size(); 
    } 
     
    @Override 
    public void setNama(String namaMasyarakat){ 
        this.namaMasyarakat.add(namaMasyarakat); 
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
        return this.namaMasyarakat.get(id); 
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