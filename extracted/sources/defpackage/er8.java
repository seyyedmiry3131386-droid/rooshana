package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er8 implements dr8 {
    public final Object a;
    public final Object b;

    public er8(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.dr8
    public final boolean a(Enum r2, Enum r3) {
        return r2.equals(b()) && r3.equals(c());
    }

    @Override // defpackage.dr8
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.dr8
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dr8)) {
            return false;
        }
        dr8 dr8Var = (dr8) obj;
        return js3.i(this.a, dr8Var.b()) && js3.i(this.b, dr8Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
