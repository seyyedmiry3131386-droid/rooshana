package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q36 extends s36 {
    public final float c;

    public q36(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q36) && Float.compare(this.c, ((q36) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return t61.k(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
    }
}
