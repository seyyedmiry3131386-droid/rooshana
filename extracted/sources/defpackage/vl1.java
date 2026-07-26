package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl1 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public Object e;

    public /* synthetic */ vl1() {
    }

    public wm7 a(int i) {
        return new wm7(w07.f((ri8) this.e, i), i, 1L);
    }

    public wl1 b() {
        vy2.j(this.c <= this.d);
        return new wl1(this);
    }

    public int c() {
        return this.d - this.c;
    }

    public int d(int i) {
        return ((mv5) this.e).i[this.c + i];
    }

    public Object e(int i) {
        return ((mv5) this.e).k[this.d + i];
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "";
            case 2:
            default:
                return super.toString();
            case 3:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                ri8 ri8Var = (ri8) this.e;
                sb.append(w07.f(ri8Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(w07.f(ri8Var, i2));
                sb.append("), prevOffset=");
                return dw1.q(sb, this.d, ')');
        }
    }

    public vl1(int i) {
        this.b = i;
    }

    public vl1(mv5 mv5Var) {
        this.e = mv5Var;
    }

    public vl1(int i, int i2, int i3, ri8 ri8Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ri8Var;
    }
}
