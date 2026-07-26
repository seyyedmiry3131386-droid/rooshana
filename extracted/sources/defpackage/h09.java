package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h09 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public h09(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h09) && js3.i(((h09) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
