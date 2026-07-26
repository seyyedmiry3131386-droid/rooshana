package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class gb {
    public static final fb Companion = new fb();
    public final Boolean a;
    public final Boolean b;
    public final String c;
    public final Integer d;

    public /* synthetic */ gb(int i, Boolean bool, Boolean bool2, String str, Integer num) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, eb.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = bool2;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return js3.i(this.a, gbVar.a) && js3.i(this.b, gbVar.b) && js3.i(this.c, gbVar.c) && js3.i(this.d, gbVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AdProgressBarConfigDto(showProgressBar=" + this.a + ", showProgressSeconds=" + this.b + ", progressBarTitle=" + this.c + ", hideProgressBarDelay=" + this.d + ")";
    }
}
