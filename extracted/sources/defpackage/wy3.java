package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class wy3 {
    public static m28 b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final nc2 c = nc2.w("t", "s", ByteArrayResult.AppInfo.IMG_SERIALISED_NAME, "o", "i", "h", "to", "ti");
    public static final nc2 d = nc2.w("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = aw4.b(pointF.x, -1.0f, 1.0f);
        pointF.y = aw4.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = aw4.b(pointF2.x, -1.0f, 1.0f);
        float fB = aw4.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = n29.a;
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (wy3.class) {
            if (b == null) {
                b = new m28(0);
            }
            weakReference = (WeakReference) b.c(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            c(i, new WeakReference(pathInterpolator));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.uy3 b(com.airbnb.lottie.parser.moshi.a r24, defpackage.gf4 r25, float r26, defpackage.c39 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy3.b(com.airbnb.lottie.parser.moshi.a, gf4, float, c39, boolean, boolean):uy3");
    }

    public static void c(int i, WeakReference weakReference) {
        synchronized (wy3.class) {
            b.e(i, weakReference);
        }
    }
}
