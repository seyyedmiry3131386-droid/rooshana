package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class db {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d;

    public db(int i, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.a == dbVar.a && this.b == dbVar.b && js3.i(this.c, dbVar.c) && this.d == dbVar.d;
    }

    public final int hashCode() {
        int i = (((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        return "AdProgressBarConfig(showProgressBar=" + this.a + ", showProgressSeconds=" + this.b + ", progressBarTitle=" + this.c + ", hideProgressBarDelay=" + this.d + ")";
    }
}
