package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ua6 {
    public static final ua6 d = new ua6(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = j29.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public ua6(float f2) {
        this(f2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ua6.class == obj.getClass()) {
            ua6 ua6Var = (ua6) obj;
            if (this.a == ua6Var.a && this.b == ua6Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = j29.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public ua6(float f2, float f3) {
        vy2.j(f2 > 0.0f);
        vy2.j(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
