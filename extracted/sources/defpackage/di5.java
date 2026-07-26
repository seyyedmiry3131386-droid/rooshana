package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di5 {
    public final sj5 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public di5(sj5 sj5Var, boolean z, Object obj, boolean z2) {
        if (!sj5Var.a && z) {
            throw new IllegalArgumentException(sj5Var.b().concat(" does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + sj5Var.b() + " has null value but is not nullable.").toString());
        }
        this.a = sj5Var;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && di5.class == obj.getClass()) {
            di5 di5Var = (di5) obj;
            Object obj2 = di5Var.d;
            if (this.b != di5Var.b || this.c != di5Var.c || !js3.i(this.a, di5Var.a)) {
                return false;
            }
            Object obj3 = this.d;
            if (obj3 != null) {
                return js3.i(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(g27.a(di5.class).d());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
