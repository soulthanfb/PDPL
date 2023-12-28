package Tugas10.Builder;

public class CDBuilder {
    // Menginisialisasi objec CDType
    public CDType buildPolytronCd() {
        CDType cds = new CDType();
        cds.addItem(new Polytron());
        return cds;
    }

    public CDType buildSamsungCD() {
        CDType cds = new CDType();
        cds.addItem(new Samsung());
        return cds;
    }

    public CDType buildSonyCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Sony());  
             return cds;  
              }
}