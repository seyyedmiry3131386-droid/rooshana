package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zh8 {
    public final ll a;
    public final long b;
    public final zi8 c;

    public zh8(ll llVar, long j, zi8 zi8Var) {
        zi8 zi8Var2;
        this.a = llVar;
        this.b = uy6.d(llVar.b.length(), j);
        if (zi8Var != null) {
            zi8Var2 = new zi8(uy6.d(llVar.b.length(), zi8Var.a));
        } else {
            zi8Var2 = null;
        }
        this.c = zi8Var2;
    }

    public static zh8 a(zh8 zh8Var, ll llVar, long j, int i) {
        if ((i & 1) != 0) {
            llVar = zh8Var.a;
        }
        if ((i & 2) != 0) {
            j = zh8Var.b;
        }
        zi8 zi8Var = (i & 4) != 0 ? zh8Var.c : null;
        zh8Var.getClass();
        return new zh8(llVar, j, zi8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh8)) {
            return false;
        }
        zh8 zh8Var = (zh8) obj;
        return zi8.c(this.b, zh8Var.b) && js3.i(this.c, zh8Var.c) && js3.i(this.a, zh8Var.a);
    }

    public final int hashCode() {
        int i = (zi8.i(this.b) + (this.a.hashCode() * 31)) * 31;
        zi8 zi8Var = this.c;
        return i + (zi8Var != null ? zi8.i(zi8Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) zi8.j(this.b)) + ", composition=" + this.c + ')';
    }

    public zh8(String str, long j, int i) {
        this(new ll((i & 1) != 0 ? "" : str), (i & 2) != 0 ? zi8.b : j, (zi8) null);
    }
}
