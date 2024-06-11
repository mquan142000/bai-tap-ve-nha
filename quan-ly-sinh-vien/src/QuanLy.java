class QuanLySinhVien {
    private SinhVien[] sinhVienArray;
    private int size;
    private int limit;

    public QuanLySinhVien(int limit) {
        this.limit = limit;
        this.sinhVienArray = new SinhVien[limit];
        this.size = 0;
    }

    public void themSinhVien(SinhVien sinhVien) {
        if (this.size < this.limit) {
            this.sinhVienArray[this.size] = sinhVien;
            this.size++;
            System.out.println("Sinh viên đã được thêm");
        } else {
            System.out.println("Danh sách sinh viên đã đầy");
        }
    }

    public void hienThiSinhVien() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.sinhVienArray[i]);
        }
    }

    public void suaSinhVien(int maSV, String newTenSV, String newEmail, String newSdt, double newGpa) {
        for (int i = 0; i < this.size; i++) {
            if (this.sinhVienArray[i].getMaSV() == maSV) {
                this.sinhVienArray[i].setTenSV(newTenSV);
                this.sinhVienArray[i].setEmail(newEmail);
                this.sinhVienArray[i].setSdt(newSdt);
                this.sinhVienArray[i].setGpa(newGpa);
                return;
            }
        }
    }

    public void xoaSinhVien(int maSV) {
        for (int i = 0; i < this.size; i++) {
            if (this.sinhVienArray[i].getMaSV() == maSV) {
                for (int j = i; j < this.size - 1; j++) {
                    this.sinhVienArray[j] = this.sinhVienArray[j + 1];
                }
                this.sinhVienArray[this.size - 1] = null;
                this.size--;
                return;
            }
        }
    }
}
