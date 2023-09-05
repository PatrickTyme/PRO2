package src.Opgaver.ex6;

public class opg6 {

    /**
     * Write a recursive method that implements Euclid's algorithm for finding the greatest common
     * divisor of two integers (both >= 2). The greatest common divisor is the largest integer that
     * divides both values (with no remainder).
     * Greatest common divisor gcd(b,a) is defined by:
     * gcd(a, b) = b if b <= a and b divides a
     * gcd(a, b) = gcd(b, a) if a < b
     * gcd(a, b) = gcd(b, a % b) otherwise
     */
    public static void main(String[] args) {
        System.out.println(gcd(10, 5));


    }
    /** Denne kode er en implementering af den såkaldte "Euklids algoritme" til at finde den største fælles divisor (GCD) af to heltal, a og b.
     * Her er en forklaring på, hvordan koden fungerer:

     Funktionen gcd tager to heltal, a og b, som input og returnerer deres GCD som et heltal.

     Første betingelse: if (b <= a && a % b == 0):

     Denne betingelse tjekker, om b er mindre end eller lig med a, og om a er præcist delelig med b uden nogen rest.
     Hvis dette er tilfældet, returneres b som GCD, da b er den største fælles divisor i dette tilfælde.
     Anden betingelse: else if (a % b < b):

     Denne betingelse tjekker, om resten af divisionen a % b er mindre end b.
     Dette trin hjælper med at optimere algoritmen. Hvis resten er mindre end b, udføres rekursion med b og a % b som de nye inputparametre.
     Dette er kernen i Euklids algoritme, hvor vi gentager processen med at finde GCD indtil b bliver 0.
     Hvis ingen af de ovenstående betingelser er opfyldt, udføres denne del:

     Rekursivt kaldes gcd(b, a % b). Dette trin fortsætter med at finde GCD ved at bruge b og resten af divisionen a % b som nye inputparametre,
     indtil b bliver 0. Når b er 0, returneres a som GCD.
     Så i bund og grund bruger denne kode Euklids algoritme til effektivt at finde GCD'en mellem de to indtastede heltal a og b. */
    public static int gcd(int a, int b) {
        if (b <= a && a % b == 0) {
            return b;
        } else if (a < b) {
            return gcd(b, a);
        } else {
            return gcd(b, a % b);
        }
        }
    }


