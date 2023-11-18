public class NestedSwitch {
    public static void main(String[] args) {
        //cse - C,ECE - E,ME - M
        char branch = 'E';
        int year = 3;
        switch(year){
            case 1:{
                System.out.println("Maths,Physics,Chemistry,C Language");
                break;
            }
            case 2:{
                switch(branch){
                case 'C':{
                    System.out.println("Os , COA, Python");
                    break;
                }
                case 'E':{
                    System.out.println("Microprocessor ,Logic theory");
                    break;
                }
                case 'M':{
                    System.out.println("Manufacturing machines..");
                    break;
                }
             }
             break;
            }
            case 3:{
                switch(branch){
                case 'C':{
                    System.out.println("Computer networks, DAA");
                    break;
                }
                case 'E':{
                    System.out.println("MicroElectronics");
                    break;
                }
                case 'M':{
                    System.out.println("Mechanical vibration");
                    break;
                }
             }
             break;
            }
            case 4:{
                switch(branch){
                case 'C':{
                    System.out.println("Data Communication ,MultiMedia");
                    break;
                }
                case 'E':{
                    System.out.println("Image processing");
                    break;
                }
                case 'M':{
                    System.out.println("Thermal En.");
                    break;
                }
             }
             break;
            }
             default:{
                System.out.println("Invalid year...");
                break;
             }
        }
    }
}
