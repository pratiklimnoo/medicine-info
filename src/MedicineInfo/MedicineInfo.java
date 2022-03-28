 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicineInfo;

/**
 *
 * @author Pratik
 */
class MedicineInfo {


    
        private String serialnumber, name, Manufacture, medicinetype, catagory,discount;
        private int price;
        public MedicineInfo(String serialnumber, String name, String medicinetype, String catagory, int price, String discount, String manufacture ){
            this.serialnumber = serialnumber;
            this.name = name;
            this.Manufacture = manufacture;
            this.medicinetype =  medicinetype;
            this.catagory = catagory;
            this.price = price;
            this.discount = discount;
        }
        
public String getSerialNumber(){
   return serialnumber;
}
public String getname(){
    return name;
}
public String getManufacture(){
    return Manufacture;
}
public String getmedicinetype(){
    return medicinetype;
}
public String getcatagory(){
    return catagory;
} 
public String getDiscount(){
    return discount;
}
public int getprice(){
    return price;
}
}