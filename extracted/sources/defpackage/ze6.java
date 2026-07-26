package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ze6 implements kj5 {
    public final xc6 a;

    public ze6(xc6 xc6Var) {
        js3.p(xc6Var, "playerConfig");
        this.a = xc6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze6) && js3.i(this.a, ((ze6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerOtherErrorBottomSheetNavKey(playerConfig=" + this.a + ")";
    }
}
