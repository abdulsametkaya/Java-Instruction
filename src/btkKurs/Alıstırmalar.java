package btkKurs;

public class Alıstırmalar {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "ali";
        ogrenciler[1] = "bli";
        ogrenciler[2] = "cli";
        ogrenciler[3] = "dli";
        System.out.println(ogrenciler[1]);

        for (int i = 0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        String[] deliler = {"al","bel","cel","del"};
        System.out.println(deliler[2]);

        for (String deli:deliler){
            System.out.println(deli);
        }

        String [][] sehirler = {{"istanbul", "ankara", "maras"}, {"berlin","frankfurt","stuttgard"}, {"paris","napoli", "roma"}};

        for (int i = 0; i<3; i++){
            for (int j = 0; j< 3; j++){
                System.out.println(sehirler[i][j]);
            }
        }

        String name = "samet";
        char [] newName = new char[name.length()];
        name.getChars(0,name.length(),newName,0);

        System.out.println(newName);

        int num = 29;
        int count = 0;

        for (int i = 2;  i<num; i++){
            if (num%i == 0){
                count ++;
            }
        }
        if (count != 0){
            System.out.println("sayı asal değildir");
        }else {
            System.out.println("asaldır");
        }


    }
}
