package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class aa {
    public static final z9 Companion = new z9();
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ aa(int i, String str, Integer num, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            wq2.S(i, 31, y9.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return js3.i(this.a, aaVar.a) && js3.i(this.b, aaVar.b) && js3.i(this.c, aaVar.c) && js3.i(this.d, aaVar.d) && js3.i(this.e, aaVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdEndCardDto(backgroundUrl=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", viewCallback=");
        o40.I(this.c, ", clickCallback=", this.d, ", dismissCallback=", sb);
        return dw1.s(sb, this.e, ")");
    }
}
