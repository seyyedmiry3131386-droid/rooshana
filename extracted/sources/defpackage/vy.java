package defpackage;

import android.os.Build;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o0;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vy {
    public static final vy d;
    public final int a;
    public final int b;
    public final ImmutableSet c;

    static {
        vy vyVar;
        if (Build.VERSION.SDK_INT >= 33) {
            o0 o0Var = new o0(4);
            for (int i = 1; i <= 10; i++) {
                o0Var.O(Integer.valueOf(j29.s(i)));
            }
            vyVar = new vy(2, o0Var.T());
        } else {
            vyVar = new vy(2, 10);
        }
        d = vyVar;
    }

    public vy(int i, Set set) {
        this.a = i;
        ImmutableSet immutableSetN = ImmutableSet.n(set);
        this.c = immutableSetN;
        zx8 it = immutableSetN.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) obj;
        return this.a == vyVar.a && this.b == vyVar.b && Objects.equals(this.c, vyVar.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        ImmutableSet immutableSet = this.c;
        return i + (immutableSet == null ? 0 : immutableSet.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public vy(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
