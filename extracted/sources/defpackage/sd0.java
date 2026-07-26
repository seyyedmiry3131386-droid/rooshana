package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class sd0 {
    public static final rd0 Companion = new rd0();
    public final boolean a;

    public /* synthetic */ sd0(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            wq2.S(i, 1, qd0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd0) && this.a == ((sd0) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("BookmarkInfoDto(isBookmarked=", ")", this.a);
    }
}
