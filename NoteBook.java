import java.util.Set;

public class NoteBook {
/* 
    private String brand;
    private String processor;
    private int hd_space;
    private int ram_size;
    private String hd_type;
    private String op_system;
    private String color;
*/ 

    String brand;
    String processor;
    int hd_space;
    int ram_size;
    String hd_type;
    String op_system;
    String color;

    public NoteBook() {
    }

    public NoteBook(String brand, String processor, int hd_space, int ram_size, String hd_type,
    String op_system, String color) {

        this.brand = brand;
        this.processor = processor;
        this.hd_space = hd_space;
        this.ram_size = ram_size;
        this.hd_type = hd_type;
        this.op_system = op_system;
        this.color = color;
    }
/* 
    public String getBrand(){
        return brand;
    }
    public String getProcessor(){
        return processor;
    }  
    public int getHD_space(){
        return hd_space;
    }
    public int getRAM_size(){
        return ram_size;
    }
    public String getHD_type(){
        return hd_type;
    }
    public String getOP_system(){
        return op_system;
    }
    public String getColor(){
        return color;
    }
*/
    @Override
    public String toString() {
        return "\nНоутбук " + brand 
        + "...\n   процессор......................... " + processor 
        + "\n   объем встроенной памяти........... " + hd_space 
        + "\n   объем оперативной памяти.......... " + ram_size 
        + "\n   тип встроенного накопителя........ " + hd_type 
        + "\n   использует операционную систему... " + op_system 
        + "\n   цвет.............................. " + color 
        + "\n\n";
    }

}