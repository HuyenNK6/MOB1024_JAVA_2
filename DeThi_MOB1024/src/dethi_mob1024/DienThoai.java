/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethi_mob1024;

import java.io.Serializable;

/**
 *
 * @author Huyen
 */
public class DienThoai implements Serializable{
    private String ten;
    private int hang;
    private float gia;

    public DienThoai() {
    }

    public DienThoai(String ten, int hang, float gia) {
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHang() {
        return hang;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getStatus(){
        if(gia >= 10000){
            return "Tốt";
        }
        return "Bình thường";
    }
    @Override
    public String toString() {
        return "DienThoai{" + "ten=" + ten + ", hang=" + hang + ", gia=" + gia + '}';
    }
    
}
