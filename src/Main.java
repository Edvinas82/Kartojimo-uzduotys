public class Main {
    public static void main(String[] args) {

        isvestiPasisveikinimaIKonsole();
        isvestiPasisveikinimaIKonsole();
        isvestiPasisveikinimaIKonsole();
        isvestiPasisveikinimaSuVardu("Audrius");
        isvestiPasisveikinimaSuVardu("Edvinas");
        isvestiPasisveikinimaSuVardu("Edita");
        isvestiPasisveikinimąSuVarduIrMetais("Edvinas", 40);
        isvestiPasisveikinimąSuVarduIrMetais("Andrius", 42);

    }
    public static void isvestiPasisveikinimaIKonsole (){
        System.out.println("Sveikas pasauli");
    }


    public static void isvestiPasisveikinimaSuVardu (String vardas)  {
        System.out.println("Sveikas "+vardas);

    }

    public static void isvestiPasisveikinimąSuVarduIrMetais(String vardas, int metai) {
        System.out.println("Sveikas "+vardas);
        System.out.println("Man yra "+metai+ " metų");

    }
}

