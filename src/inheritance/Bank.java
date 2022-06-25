package inheritance;

public class Bank {
    int bankNo;
    String ifsCode;
}

class sbiBank extends Bank {
    String address;
    String branchCode;
    String contactNo;

    void display() {
        System.out.println("Bank No." + bankNo);
        System.out.println("ifscode" + ifsCode);
        System.out.println("adress" + address);
        System.out.println("Branchcode" + branchCode);
        System.out.println("contact NO" + contactNo);
    }
}

class BankImpl {
    public static void main(String[] args) {
        sbiBank sbiBank = new sbiBank();
        sbiBank.address = "kothrud pune";
        sbiBank.branchCode = "SBI10025";
        sbiBank.bankNo = 8555;
        sbiBank.ifsCode = "SBI000015397";
        sbiBank.contactNo = "820811500";
        sbiBank.display();
    }
}