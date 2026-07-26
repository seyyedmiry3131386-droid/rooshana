package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w46 extends fv6 {
    public static final String c;
    public final float b;

    static {
        String str = j29.a;
        c = Integer.toString(1, 36);
    }

    public w46() {
        this.b = -1.0f;
    }

    @Override // defpackage.fv6
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.fv6
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fv6.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w46) {
            return this.b == ((w46) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public w46(float f) {
        vy2.i("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }
}
