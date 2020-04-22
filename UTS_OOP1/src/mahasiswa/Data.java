/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Tiseka
 */
public class Data {
    private String nim;
    private String nama;
    private String kelas;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        alamat = "";
    }

    public Data(String nim, String nama, String kelas, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnim() {
        return nim;
    }

    public String getnama() {
        return nama;
    }

    public String getkelas() {
        return kelas;
    }

    public String getalamat() {
        return alamat;
    }
}
