package day6.bai1;

public class NhanVien extends CanBo{
    private String congViec;

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void inputNV(){
        super.input();
        System.out.print("nhap cong viec: ");
        congViec = scanner.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.printf("%10s\n", congViec);
    }
}
