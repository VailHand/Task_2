/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *  NIM = 1301150035
 *  Nama = Kukuh Rahingga Permadi
 */
public class Mahasiswa 
{
    private String NIM;
    private String Nama;
    private String Status;
    char ary[];
    int i;

    // constructor
    public Mahasiswa() 
    {
        Status = "Tidak Lulus";
        i = 0;
        ary = new char[10];
    }
    
    public Mahasiswa (String a, String b)
    {
        NIM = a;
        Nama = b;
        Status = "Tidak Lulus";
        i = 0;
        ary = new char[10];
    }
    
    // setter and getter
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    //----------------------------------
    public void addNilai(char nilai)
    {
        if (i <= 10)
            ary[i] = nilai;
        i += 1;
    }
    
    public char getNilai(int i)
    {
        return ary[i];
    }
    
    public String toString()
    {
        String p =  NIM + ", " + Nama + ", " + Status + ", nilai = ";
        for (int z = 0; z < i; z++)
        {
            p = p + ary[z] + ",";
        }
        return p;
    }
    
    public char cekNilai(Mahasiswa m)
    {
        char q = 0;
        for (char x = 'A'; x <= 'E'; x++)
        {
            for (int coun = 0; coun < i; coun++)
            {
                if (ary[coun] == x)
                {
                    for (int y = 0; y < m.i; y++)
                    {
                        if (m.ary[y] == x)
                        {
                            return x;
                        }
                    }
                }
            }
        }
        return q;
    }
}