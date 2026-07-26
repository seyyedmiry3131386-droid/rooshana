package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gc6 implements qc6 {
    public final float a;

    public gc6(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc6)) {
            return false;
        }
        float f = ((gc6) obj).a;
        List list = wa6.b;
        return Float.compare(this.a, f) == 0;
    }

    public final int hashCode() {
        List list = wa6.b;
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return o40.y("UpdatePlaybackSpeed(playbackSpeed=", wa6.b(this.a), ")");
    }
}
