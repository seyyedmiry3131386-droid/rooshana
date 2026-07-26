package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import defpackage.bp2;
import defpackage.do1;
import defpackage.fy5;
import defpackage.js3;
import defpackage.lq8;
import defpackage.o87;
import defpackage.qb5;
import defpackage.qp2;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.u26;
import defpackage.uc3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class ViewLayer extends View implements fy5 {
    public static Method f;
    public static Field g;
    public static boolean h;
    public static boolean i;
    public boolean a;
    public Rect b;
    public boolean c;
    public float d;
    public long e;

    static {
        new do1(4);
    }

    private final u26 getManualClipPath() {
        if (getClipToOutline()) {
            throw null;
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z == this.c) {
            return;
        }
        this.c = z;
        throw null;
    }

    @Override // defpackage.fy5
    public final void a(float[] fArr) {
        throw null;
    }

    @Override // defpackage.fy5
    public final void b(qb5 qb5Var, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.fy5
    public final void c(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar) {
        if (getElevation() > 0.0f) {
            tm0Var.u();
        }
        getDrawingTime();
        throw null;
    }

    @Override // defpackage.fy5
    public final boolean d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (this.a) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            throw null;
        }
        return true;
    }

    @Override // defpackage.fy5
    public final void destroy() {
        setInvalidated(false);
        throw null;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // defpackage.fy5
    public final void e(o87 o87Var) {
        Rect rect;
        uc3 uc3Var = tt3.d;
        int i2 = o87Var.a | 0;
        if ((i2 & 4096) != 0) {
            long j = o87Var.j;
            this.e = j;
            setPivotX(lq8.b(j) * getWidth());
            setPivotY(lq8.c(this.e) * getHeight());
        }
        if ((i2 & 1) != 0) {
            setScaleX(o87Var.b);
        }
        if ((i2 & 2) != 0) {
            setScaleY(o87Var.c);
        }
        if ((i2 & 4) != 0) {
            setAlpha(o87Var.d);
        }
        if ((i2 & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i2 & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i2 & 32) != 0) {
            setElevation(o87Var.e);
        }
        if ((i2 & 1024) != 0) {
            setRotation(o87Var.h);
        }
        if ((i2 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i2 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i2 & 2048) != 0) {
            setCameraDistancePx(o87Var.i);
        }
        getManualClipPath();
        boolean z = o87Var.l;
        boolean z2 = false;
        boolean z3 = z && o87Var.k != uc3Var;
        if ((i2 & 24576) != 0) {
            if (z && o87Var.k == uc3Var) {
                z2 = true;
            }
            this.a = z2;
            if (this.a) {
                Rect rect2 = this.b;
                if (rect2 == null) {
                    this.b = new Rect(0, 0, getWidth(), getHeight());
                } else {
                    js3.m(rect2);
                    rect2.set(0, 0, getWidth(), getHeight());
                }
                rect = this.b;
            } else {
                rect = null;
            }
            setClipBounds(rect);
            setClipToOutline(z3);
        }
        throw null;
    }

    @Override // defpackage.fy5
    public final long f(long j, boolean z) {
        if (z) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // defpackage.fy5
    public final void g(long j) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        if (i2 == getWidth() && i3 == getHeight()) {
            return;
        }
        setPivotX(lq8.b(this.e) * i2);
        setPivotY(lq8.c(this.e) * i3);
        throw null;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return null;
    }

    public float getFrameRate() {
        return this.d;
    }

    public long getLayerId() {
        return 0L;
    }

    public final AndroidComposeView getOwnerView() {
        return null;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        throw null;
    }

    @Override // defpackage.fy5
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo7getUnderlyingMatrixsQKQjiQ() {
        throw null;
    }

    @Override // defpackage.fy5
    public final void h(qp2 qp2Var, bp2 bp2Var) {
        throw null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // defpackage.fy5
    public final void i(float[] fArr) {
        throw null;
    }

    @Override // android.view.View, defpackage.fy5
    public final void invalidate() {
        if (this.c) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        throw null;
    }

    @Override // defpackage.fy5
    public final void j(long j) {
        int i2 = (int) (j >> 32);
        if (i2 != getLeft()) {
            offsetLeftAndRight(i2 - getLeft());
            throw null;
        }
        int i3 = (int) (j & 4294967295L);
        if (i3 == getTop()) {
            return;
        }
        offsetTopAndBottom(i3 - getTop());
        throw null;
    }

    @Override // defpackage.fy5
    public final void k() {
        if (!this.c || i) {
            return;
        }
        try {
            if (!h) {
                h = true;
                if (Build.VERSION.SDK_INT < 28) {
                    f = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    g = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    f = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    g = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = f;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = g;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = g;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = f;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            i = true;
        }
        setInvalidated(false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public final void setCameraDistancePx(float f2) {
        setCameraDistance(f2 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f2) {
        this.d = f2;
    }

    public void setFrameRateFromParent(boolean z) {
    }
}
