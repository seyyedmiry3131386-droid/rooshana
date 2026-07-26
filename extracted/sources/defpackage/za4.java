package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
public final class za4 {
    public static final ra7[] d = {hk4.d(hk4.g, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hk4.d(hk4.f, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hk4.d(hk4.c, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hk4.d(hk4.b, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hk4.d(hk4.d, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hk4.d(hk4.e, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hk4.d(hk4.a, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
    public static final ay2[] e = new ay2[7];
    public final LoadingIndicatorSpec a;
    public final Path b = new Path();
    public final Matrix c = new Matrix();

    static {
        int i = 0;
        while (true) {
            ra7[] ra7VarArr = d;
            if (i >= ra7VarArr.length) {
                return;
            }
            int i2 = i + 1;
            e[i] = new ay2(ra7VarArr[i], ra7VarArr[i2 % ra7VarArr.length]);
            i = i2;
        }
    }

    public za4(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.a = loadingIndicatorSpec;
    }
}
