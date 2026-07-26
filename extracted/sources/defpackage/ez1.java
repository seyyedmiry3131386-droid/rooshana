package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public final class ez1 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public ez1(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? zc.j(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect edgeEffectB = i >= 31 ? zc.b(context) : new yt2(context);
        edgeEffectB.setColor(this.b);
        if (!zq3.b(this.c, 0L)) {
            if (orientation == Orientation.a) {
                long j = this.c;
                edgeEffectB.setSize((int) (j >> 32), (int) (4294967295L & j));
                return edgeEffectB;
            }
            long j2 = this.c;
            edgeEffectB.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
        return edgeEffectB;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.a);
        this.e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.b);
        this.f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.b);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.a);
        this.d = edgeEffectA;
        return edgeEffectA;
    }
}
