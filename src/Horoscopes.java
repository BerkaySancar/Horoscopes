import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        /*

        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart

         */

        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("Kaçıncı ayda doğdunuz: ");
        month = input.nextInt();
        System.out.print("Ayın hangi gününde doğdunuz: ");
        day = input.nextInt();
        String horoscope = "";
        boolean isError = false;

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "Oğlak";
                } else {
                    horoscope = "Kova";
                }
            } else {
                isError = true;
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 19) {
                    horoscope = "Kova";
                } else {
                    horoscope = "Balık";
                }
            } else {
                isError = true;
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    horoscope = "Balık";
                } else {
                    horoscope = "Koç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 20) {
                    horoscope = "Koç";
                } else {
                    horoscope = "Boğa";
                }
            } else {
                isError = true;
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "Boğa";
                } else {
                    horoscope = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "İkizler";
                } else {
                    horoscope = "Yengeç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Yengeç";
                } else {
                    horoscope = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Aslan";
                } else {
                    horoscope = "Başak";
                }
            } else {
                isError = true;
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "Başak";
                } else {
                    horoscope = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        if (month == 10) {
            if (day >= 1 && day < 31) {
                if (day < 22) {
                    horoscope = "Terazi";
                } else {
                    horoscope = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    horoscope = "Akrep";
                } else {
                    horoscope = "Yay";
                }
            } else {
                isError = true;
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "Yay";
                } else {
                    horoscope = "Oğlak";
                }
            } else {
                isError = true;
            }
        }
        if (isError || month > 12) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Burcunuz: " + horoscope + ".");
        }
    }
}
