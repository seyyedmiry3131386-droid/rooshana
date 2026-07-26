package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o38 implements sc2 {
    public final float a;
    public final float b;
    public final Object c;

    public o38(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        Object obj = this.c;
        return new ck4(this.a, this.b, obj == null ? null : (dl) mt8Var.b().invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o38) {
            o38 o38Var = (o38) obj;
            if (o38Var.a == this.a && o38Var.b == this.b && js3.i(o38Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.floatToIntBits(this.b) + dw1.g(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ o38(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
