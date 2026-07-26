package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class d76 {
    public static final c76 Companion = new c76();
    public final String a;

    public /* synthetic */ d76(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            wq2.S(i, 1, b76.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d76) && js3.i(this.a, ((d76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("PersonDto(name=", this.a, ")");
    }
}
