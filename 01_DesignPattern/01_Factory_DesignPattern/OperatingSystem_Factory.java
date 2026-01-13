public class OperatingSystem_Factory {

    public Os getInstance(String str){

        if(str.equals("Windows")) { return new Windows(); }
        else if(str.equals("IOS")) { return new IOS(); }
        else return new Andorid();
    
    }    
}
