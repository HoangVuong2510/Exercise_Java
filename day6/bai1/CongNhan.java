package day6.bai1;

public class CongNhan extends CanBo {
    private int bac;

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void inputCN(){
        super.input();
        do {
            System.out.print("nhap vao bac: ");
            bac = scanner.nextInt();
            scanner.nextLine();
            if(bac <= 0 || bac > 7)
                System.out.println("bac tu 1 den 7. Nhap lai!");
        }while (bac <= 0 || bac > 7);
    }

    @Override
    public void output(){
        super.output();
        System.out.printf("%10d\n", bac);
    }
}
