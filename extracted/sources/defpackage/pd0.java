package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pd0 {
    public final boolean a;

    public pd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd0) && this.a == ((pd0) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("BookmarkInfo(isBookmarked=", ")", this.a);
    }
}
