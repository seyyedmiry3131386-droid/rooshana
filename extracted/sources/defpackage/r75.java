package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class r75 {
    public static final q75 Companion = new q75();
    public final String a;

    public /* synthetic */ r75(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            wq2.S(i, 1, p75.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r75) && js3.i(this.a, ((r75) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o40.y("MovieSummaryTitleDto(title=", this.a, ")");
    }
}
