package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eu extends mx4 implements fx4 {
    public final boolean b;
    public final dp2 c;

    public eu(dp2 dp2Var, boolean z) {
        this.b = z;
        this.c = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        return this.b == euVar.b && this.c == euVar.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        s51 s51Var = new s51();
        s51Var.o = this.b;
        s51Var.p = this.c;
        return s51Var;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b ? 1231 : 1237) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        s51 s51Var = (s51) gx4Var;
        s51Var.o = this.b;
        s51Var.p = this.c;
    }

    public final en7 k() {
        en7 en7Var = new en7();
        en7Var.c = this.b;
        this.c.invoke(en7Var);
        return en7Var;
    }
}
