package tugastentangclassobject;

/**
 *
 * @author fikripraja
 * 5160411326
 */
public class data {
    
    private String nim;
    private String nama;    
    private float ipk;
    
    public data (String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    
    @Override
    public String toString() {
        return "data{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + '}';
    }
  
}
