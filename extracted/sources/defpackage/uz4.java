package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class uz4 {
    public static final tz4 Companion = new tz4();
    public final Integer a;
    public final String b;
    public final t8 c;
    public final aa d;
    public final gb e;
    public final l8 f;
    public final za g;

    public /* synthetic */ uz4(int i, Integer num, String str, t8 t8Var, aa aaVar, gb gbVar, l8 l8Var, za zaVar) {
        if (127 != (i & 127)) {
            wq2.S(i, 127, sz4.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = str;
        this.c = t8Var;
        this.d = aaVar;
        this.e = gbVar;
        this.f = l8Var;
        this.g = zaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz4)) {
            return false;
        }
        uz4 uz4Var = (uz4) obj;
        return js3.i(this.a, uz4Var.a) && js3.i(this.b, uz4Var.b) && js3.i(this.c, uz4Var.c) && js3.i(this.d, uz4Var.d) && js3.i(this.e, uz4Var.e) && js3.i(this.f, uz4Var.f) && js3.i(this.g, uz4Var.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        aa aaVar = this.d;
        int iHashCode3 = (iHashCode2 + (aaVar == null ? 0 : aaVar.hashCode())) * 31;
        gb gbVar = this.e;
        int iHashCode4 = (iHashCode3 + (gbVar == null ? 0 : gbVar.hashCode())) * 31;
        l8 l8Var = this.f;
        int iHashCode5 = (iHashCode4 + (l8Var == null ? 0 : l8Var.hashCode())) * 31;
        za zaVar = this.g;
        return iHashCode5 + (zaVar != null ? zaVar.hashCode() : 0);
    }

    public final String toString() {
        return "MovieAdDto(sequenceNumber=" + this.a + ", type=" + this.b + ", content=" + this.c + ", endCard=" + this.d + ", progressBarConfig=" + this.e + ", appInfo=" + this.f + ", linkInfo=" + this.g + ")";
    }
}
