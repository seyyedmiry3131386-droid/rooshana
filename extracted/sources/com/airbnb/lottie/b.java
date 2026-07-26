package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import defpackage.ag4;
import defpackage.aw4;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.gf4;
import defpackage.hh2;
import defpackage.hj;
import defpackage.jy3;
import defpackage.ky3;
import defpackage.l01;
import defpackage.nc2;
import defpackage.nf4;
import defpackage.ni4;
import defpackage.nm5;
import defpackage.o40;
import defpackage.of4;
import defpackage.q04;
import defpackage.qd4;
import defpackage.qj;
import defpackage.r04;
import defpackage.rb4;
import defpackage.sf4;
import defpackage.tf4;
import defpackage.uf4;
import defpackage.uz3;
import defpackage.wf4;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean S;
    public static final List T;
    public static final ThreadPoolExecutor U;
    public Canvas A;
    public Rect B;
    public RectF C;
    public uz3 D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public final float[] J;
    public Matrix K;
    public boolean L;
    public AsyncUpdates M;
    public final Semaphore N;
    public Handler O;
    public tf4 P;
    public final tf4 Q;
    public float R;
    public gf4 a;
    public final eg4 b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public LottieDrawable$OnVisibleAction f;
    public final ArrayList g;
    public wv8 h;
    public String i;
    public rb4 j;
    public Map k;
    public String l;
    public final nm5 m;
    public boolean n;
    public boolean o;
    public l01 p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public RenderMode w;
    public boolean x;
    public final Matrix y;
    public Bitmap z;

    static {
        S = Build.VERSION.SDK_INT <= 25;
        T = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        U = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new dg4());
    }

    public b() {
        eg4 eg4Var = new eg4();
        eg4Var.d = 1.0f;
        eg4Var.e = false;
        eg4Var.f = 0L;
        eg4Var.g = 0.0f;
        eg4Var.h = 0.0f;
        eg4Var.i = 0;
        eg4Var.j = -2.1474836E9f;
        eg4Var.k = 2.1474836E9f;
        eg4Var.m = false;
        eg4Var.n = false;
        this.b = eg4Var;
        this.c = true;
        this.d = false;
        this.e = false;
        this.f = LottieDrawable$OnVisibleAction.a;
        this.g = new ArrayList();
        this.m = new nm5(25);
        this.n = false;
        this.o = true;
        this.q = 255;
        this.v = false;
        this.w = RenderMode.a;
        this.x = false;
        this.y = new Matrix();
        this.J = new float[9];
        this.L = false;
        qj qjVar = new qj(9, this);
        this.N = new Semaphore(1);
        this.Q = new tf4(this, 1);
        this.R = -3.4028235E38f;
        eg4Var.addUpdateListener(qjVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean k(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void a(final jy3 jy3Var, final Object obj, final hh2 hh2Var) {
        l01 l01Var = this.p;
        if (l01Var == null) {
            this.g.add(new wf4() { // from class: rf4
                @Override // defpackage.wf4
                public final void run() {
                    this.a.a(jy3Var, obj, hh2Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (jy3Var == jy3.c) {
            l01Var.f(hh2Var, obj);
        } else {
            ky3 ky3Var = jy3Var.b;
            if (ky3Var != null) {
                ky3Var.f(hh2Var, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.p.c(jy3Var, 0, arrayList, new jy3(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((jy3) arrayList.get(i)).b.f(hh2Var, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == ag4.C) {
                y(this.b.d());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.content.Context r4) {
        /*
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto L5
            goto L27
        L5:
            boolean r0 = r3.c
            if (r0 == 0) goto L29
            com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode r0 = com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.a
            if (r4 == 0) goto L24
            android.graphics.Matrix r1 = defpackage.n29.a
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r1 = "animator_duration_scale"
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = android.provider.Settings.Global.getFloat(r4, r1, r2)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L21
            goto L24
        L21:
            com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode r4 = com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.b
            goto L25
        L24:
            r4 = r0
        L25:
            if (r4 != r0) goto L29
        L27:
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.b(android.content.Context):boolean");
    }

    public final void c() {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            return;
        }
        nc2 nc2Var = r04.a;
        Rect rect = gf4Var.k;
        List list = Collections.EMPTY_LIST;
        l01 l01Var = new l01(this, new q04(list, gf4Var, "__container", -1L, Layer$LayerType.a, -1L, null, list, new hj(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, Layer$MatteType.a, null, false, null, null, LBlendMode.a), gf4Var.j, gf4Var);
        this.p = l01Var;
        if (this.s) {
            l01Var.q(true);
        }
        this.p.L = this.o;
    }

    public final void d() {
        eg4 eg4Var = this.b;
        if (eg4Var.m) {
            eg4Var.cancel();
            if (!isVisible()) {
                this.f = LottieDrawable$OnVisibleAction.a;
            }
        }
        this.a = null;
        this.p = null;
        this.h = null;
        this.R = -3.4028235E38f;
        eg4Var.l = null;
        eg4Var.j = -2.1474836E9f;
        eg4Var.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        gf4 gf4Var;
        l01 l01Var = this.p;
        if (l01Var == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.M;
        if (asyncUpdates == null) {
            asyncUpdates = AsyncUpdates.a;
        }
        boolean z = asyncUpdates == AsyncUpdates.b;
        tf4 tf4Var = this.Q;
        ThreadPoolExecutor threadPoolExecutor = U;
        Semaphore semaphore = this.N;
        eg4 eg4Var = this.b;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (l01Var.K == eg4Var.d()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (l01Var.K != eg4Var.d()) {
                        threadPoolExecutor.execute(tf4Var);
                    }
                }
                throw th;
            }
        }
        if (z && (gf4Var = this.a) != null) {
            float f = this.R;
            float fD = eg4Var.d();
            this.R = fD;
            if (Math.abs(fD - f) * gf4Var.b() >= 50.0f) {
                y(eg4Var.d());
            }
        }
        if (this.e) {
            try {
                if (this.x) {
                    n(canvas, l01Var);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                qd4.a.getClass();
            }
        } else if (this.x) {
            n(canvas, l01Var);
        } else {
            g(canvas);
        }
        this.L = false;
        if (z) {
            semaphore.release();
            if (l01Var.K == eg4Var.d()) {
                return;
            }
            threadPoolExecutor.execute(tf4Var);
        }
    }

    public final void e() {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            return;
        }
        RenderMode renderMode = this.w;
        int i = Build.VERSION.SDK_INT;
        boolean z = gf4Var.o;
        int i2 = gf4Var.p;
        int iOrdinal = renderMode.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.x = z2;
    }

    public final void g(Canvas canvas) {
        l01 l01Var = this.p;
        gf4 gf4Var = this.a;
        if (l01Var == null || gf4Var == null) {
            return;
        }
        Matrix matrix = this.y;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / gf4Var.k.width(), r3.height() / gf4Var.k.height());
        }
        l01Var.g(canvas, matrix, this.q, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            return -1;
        }
        return gf4Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            return -1;
        }
        return gf4Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final rb4 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.j == null) {
            rb4 rb4Var = new rb4(getCallback());
            this.j = rb4Var;
            String str = this.l;
            if (str != null) {
                rb4Var.f = str;
            }
        }
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.L) {
            return;
        }
        this.L = true;
        if ((!S || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return j();
    }

    public final boolean j() {
        eg4 eg4Var = this.b;
        if (eg4Var == null) {
            return false;
        }
        return eg4Var.m;
    }

    public final void l() {
        this.g.clear();
        eg4 eg4Var = this.b;
        eg4Var.h(true);
        Iterator it = eg4Var.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eg4Var);
        }
        if (isVisible()) {
            return;
        }
        this.f = LottieDrawable$OnVisibleAction.a;
    }

    public final void m() {
        if (this.p == null) {
            this.g.add(new uf4(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = LottieDrawable$OnVisibleAction.a;
        eg4 eg4Var = this.b;
        if (zB || eg4Var.getRepeatCount() == 0) {
            if (isVisible()) {
                eg4Var.m = true;
                eg4Var.b(eg4Var.g());
                eg4Var.i((int) (eg4Var.g() ? eg4Var.e() : eg4Var.f()));
                eg4Var.f = 0L;
                eg4Var.i = 0;
                if (eg4Var.m) {
                    eg4Var.h(false);
                    Choreographer.getInstance().postFrameCallback(eg4Var);
                }
                this.f = lottieDrawable$OnVisibleAction;
            } else {
                this.f = LottieDrawable$OnVisibleAction.b;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = T.iterator();
        ni4 ni4VarD = null;
        while (it.hasNext()) {
            ni4VarD = this.a.d((String) it.next());
            if (ni4VarD != null) {
                break;
            }
        }
        if (ni4VarD != null) {
            p((int) ni4VarD.b);
        } else {
            p((int) (eg4Var.d < 0.0f ? eg4Var.f() : eg4Var.e()));
        }
        eg4Var.h(true);
        eg4Var.a(eg4Var.g());
        if (isVisible()) {
            return;
        }
        this.f = lottieDrawable$OnVisibleAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.graphics.Canvas r12, defpackage.l01 r13) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.n(android.graphics.Canvas, l01):void");
    }

    public final void o() {
        if (this.p == null) {
            this.g.add(new uf4(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = LottieDrawable$OnVisibleAction.a;
        eg4 eg4Var = this.b;
        if (zB || eg4Var.getRepeatCount() == 0) {
            if (isVisible()) {
                eg4Var.m = true;
                eg4Var.h(false);
                Choreographer.getInstance().postFrameCallback(eg4Var);
                eg4Var.f = 0L;
                if (eg4Var.g() && eg4Var.h == eg4Var.f()) {
                    eg4Var.i(eg4Var.e());
                } else if (!eg4Var.g() && eg4Var.h == eg4Var.e()) {
                    eg4Var.i(eg4Var.f());
                }
                Iterator it = eg4Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eg4Var);
                }
                this.f = lottieDrawable$OnVisibleAction;
            } else {
                this.f = LottieDrawable$OnVisibleAction.c;
            }
        }
        if (b(h())) {
            return;
        }
        p((int) (eg4Var.d < 0.0f ? eg4Var.f() : eg4Var.e()));
        eg4Var.h(true);
        eg4Var.a(eg4Var.g());
        if (isVisible()) {
            return;
        }
        this.f = lottieDrawable$OnVisibleAction;
    }

    public final void p(int i) {
        if (this.a != null) {
            this.b.i(i);
        } else {
            this.g.add(new of4(this, i, 0));
        }
    }

    public final void q(int i) {
        if (this.a == null) {
            this.g.add(new of4(this, i, 1));
        } else {
            eg4 eg4Var = this.b;
            eg4Var.j(eg4Var.j, i + 0.99f);
        }
    }

    public final void r(String str) {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            this.g.add(new nf4(this, str, 1));
        } else {
            ni4 ni4VarD = gf4Var.d(str);
            if (ni4VarD == null) {
                throw new IllegalArgumentException(o40.y("Cannot find marker with name ", str, "."));
            }
            q((int) (ni4VarD.b + ni4VarD.c));
        }
    }

    public final void s(final int i, final int i2) {
        if (this.a == null) {
            this.g.add(new wf4() { // from class: qf4
                @Override // defpackage.wf4
                public final void run() {
                    this.a.s(i, i2);
                }
            });
        } else {
            this.b.j(i, i2 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.q = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        qd4.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = LottieDrawable$OnVisibleAction.c;
        if (z) {
            LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction2 = this.f;
            if (lottieDrawable$OnVisibleAction2 == LottieDrawable$OnVisibleAction.b) {
                m();
                return visible;
            }
            if (lottieDrawable$OnVisibleAction2 == lottieDrawable$OnVisibleAction) {
                o();
                return visible;
            }
        } else {
            if (this.b.m) {
                l();
                this.f = lottieDrawable$OnVisibleAction;
                return visible;
            }
            if (zIsVisible) {
                this.f = LottieDrawable$OnVisibleAction.a;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.g.clear();
        eg4 eg4Var = this.b;
        eg4Var.h(true);
        eg4Var.a(eg4Var.g());
        if (isVisible()) {
            return;
        }
        this.f = LottieDrawable$OnVisibleAction.a;
    }

    public final void t(String str) {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            this.g.add(new nf4(this, str, 0));
            return;
        }
        ni4 ni4VarD = gf4Var.d(str);
        if (ni4VarD == null) {
            throw new IllegalArgumentException(o40.y("Cannot find marker with name ", str, "."));
        }
        int i = (int) ni4VarD.b;
        s(i, ((int) ni4VarD.c) + i);
    }

    public final void u(final String str, final String str2, final boolean z) {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            this.g.add(new wf4() { // from class: vf4
                @Override // defpackage.wf4
                public final void run() {
                    this.a.u(str, str2, z);
                }
            });
            return;
        }
        ni4 ni4VarD = gf4Var.d(str);
        if (ni4VarD == null) {
            throw new IllegalArgumentException(o40.y("Cannot find marker with name ", str, "."));
        }
        int i = (int) ni4VarD.b;
        ni4 ni4VarD2 = this.a.d(str2);
        if (ni4VarD2 == null) {
            throw new IllegalArgumentException(o40.y("Cannot find marker with name ", str2, "."));
        }
        s(i, (int) (ni4VarD2.b + (z ? 1.0f : 0.0f)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final float f, final float f2) {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            this.g.add(new wf4() { // from class: pf4
                @Override // defpackage.wf4
                public final void run() {
                    this.a.v(f, f2);
                }
            });
        } else {
            int iF = (int) aw4.f(gf4Var.l, gf4Var.m, f);
            gf4 gf4Var2 = this.a;
            s(iF, (int) aw4.f(gf4Var2.l, gf4Var2.m, f2));
        }
    }

    public final void w(int i) {
        if (this.a == null) {
            this.g.add(new of4(this, i, 2));
        } else {
            this.b.j(i, (int) r0.k);
        }
    }

    public final void x(String str) {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            this.g.add(new nf4(this, str, 2));
        } else {
            ni4 ni4VarD = gf4Var.d(str);
            if (ni4VarD == null) {
                throw new IllegalArgumentException(o40.y("Cannot find marker with name ", str, "."));
            }
            w((int) ni4VarD.b);
        }
    }

    public final void y(float f) {
        gf4 gf4Var = this.a;
        if (gf4Var == null) {
            this.g.add(new sf4(this, f, 2));
        } else {
            this.b.i(aw4.f(gf4Var.l, gf4Var.m, f));
        }
    }
}
