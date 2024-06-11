class SinhVien {
    private int maSV;
    private String tenSV;
    private String email;
    private String sdt;
    private double gpa;

    public SinhVien(int maSV, String tenSV, String email, String sdt, double gpa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.email = email;
        this.sdt = sdt;
        this.gpa = gpa;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Mã SV:  " + this.maSV + ", Tên SV: " + this.tenSV + ", Email: " + this.email + ", SDT: " + this.sdt + ", Điểm: " + this.gpa;
    }
}

