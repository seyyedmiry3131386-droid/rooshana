package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import defpackage.i96;
import defpackage.is3;
import defpackage.wn5;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final i96 b;
    public boolean c;

    public PlaceholderSurface(i96 i96Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = i96Var;
        this.a = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 24 && (i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? is3.y("EGL_EXT_protected_content") : false) {
                return is3.y("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (GlUtil$GlException e2) {
            wn5.F("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!e) {
                d = a(context);
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    i96 i96Var = this.b;
                    i96Var.b.getClass();
                    i96Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
