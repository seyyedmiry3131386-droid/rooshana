package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p25 extends u25 {
    public final Integer a;

    public p25(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p25) && js3.i(this.a, ((p25) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Downloadable(progressPercentage=" + this.a + ")";
    }
}
