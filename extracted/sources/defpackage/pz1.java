package defpackage;

import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public pz1(Context context) {
        boolean zH = yh0.H(context, vp6.elevationOverlayEnabled, false);
        int iQ = m91.q(context, vp6.elevationOverlayColor, 0);
        int iQ2 = m91.q(context, vp6.elevationOverlayAccentColor, 0);
        int iQ3 = m91.q(context, vp6.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zH;
        this.b = iQ;
        this.c = iQ2;
        this.d = iQ3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || sv0.e(i, 255) != this.d) {
            return i;
        }
        float fMin = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iY = m91.y(fMin, sv0.e(i, 255), this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iY = sv0.c(sv0.e(i2, f), iY);
        }
        return sv0.e(iY, iAlpha);
    }
}
