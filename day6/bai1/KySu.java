package day6.bai1;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void inputKS(){
        super.input();
        System.out.print("nhap nganh dao tao: ");
        nganhDaoTao = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%10s\n", nganhDaoTao);
    }
}
