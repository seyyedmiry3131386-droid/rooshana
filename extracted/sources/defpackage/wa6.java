package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wa6 {
    public static final List b = br9.C(Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(3.0f));
    public final float a;

    public /* synthetic */ wa6(float f) {
        this.a = f;
    }

    public static final String a(float f, Context context) {
        js3.p(context, "context");
        if (f != 1.0f) {
            return f88.u0(String.valueOf(f), ".0").concat("x");
        }
        String string = context.getString(ts6.player_playback_speed_normal);
        js3.m(string);
        return string;
    }

    public static String b(float f) {
        return "PlaybackSpeed(speed=" + f + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wa6) {
            return Float.compare(this.a, ((wa6) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
