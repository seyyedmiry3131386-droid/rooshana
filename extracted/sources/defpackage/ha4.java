package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha4 extends ja4 {
    public static final ha4 b = new ha4(false);

    public final boolean equals(Object obj) {
        if (obj instanceof ha4) {
            return this.a == ((ha4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.A(new StringBuilder("Loading(endOfPaginationReached="), this.a, ')');
    }
}
