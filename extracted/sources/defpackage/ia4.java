package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia4 extends ja4 {
    public static final ia4 b = new ia4(true);
    public static final ia4 c = new ia4(false);

    public final boolean equals(Object obj) {
        if (obj instanceof ia4) {
            return this.a == ((ia4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.A(new StringBuilder("NotLoading(endOfPaginationReached="), this.a, ')');
    }
}
