package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt8 implements rx1 {
    public final int a;
    public final int b;
    public final zy1 c;

    public lt8(int i, zy1 zy1Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? az1.a : zy1Var);
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        return new xr5(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lt8) {
            lt8 lt8Var = (lt8) obj;
            if (lt8Var.a == this.a && lt8Var.b == this.b && js3.i(lt8Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.rx1, defpackage.sk
    public final z39 a(mt8 mt8Var) {
        return new xr5(this.a, this.b, this.c);
    }

    public lt8(int i, int i2, zy1 zy1Var) {
        this.a = i;
        this.b = i2;
        this.c = zy1Var;
    }
}
