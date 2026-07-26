package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q97 {
    public final long a = zu0.h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q97) {
            return zu0.c(this.a, ((q97) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) zu0.i(this.a)) + ", rippleAlpha=null)";
    }
}
