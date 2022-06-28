
//OVERRIDING

public class RBI {
    float getRateInterest() {
        return 8;
    }
}

class SBI extends RBI {
    float getRateInterest() {
        return 9;
    }
}

class ICICI extends RBI {
    float getRateInterest() {
        return 10;
    }
}

class RBIImpl {
    public static void main(String[] args) {
        RBI rbi;
        rbi = new ICICI();//dynamically object can be created
        System.out.println(rbi.getRateInterest());
        rbi = new SBI();
        System.out.println(rbi.getRateInterest());
    }
}
