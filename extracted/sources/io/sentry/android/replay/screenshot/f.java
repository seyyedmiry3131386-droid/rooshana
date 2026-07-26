package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import defpackage.bp2;
import defpackage.js3;
import defpackage.kb8;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.l;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.r;
import io.sentry.android.replay.x;
import io.sentry.b6;
import io.sentry.f2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {
    public final ReplayIntegration a;
    public final b6 b;
    public final r c;
    public final bp2 d;
    public final ScheduledExecutorService e;
    public final f2 f;
    public final Bitmap g;
    public final Object h;
    public final AtomicBoolean i;
    public final io.sentry.android.replay.util.c j;
    public final AtomicBoolean k;
    public final AtomicInteger l;
    public final AtomicBoolean m;
    public final Object n;
    public final Object o;
    public final Rect p;
    public final RectF q;
    public final int[] r;
    public final int[] s;

    public f(x xVar, ReplayIntegration replayIntegration, b6 b6Var, r rVar, io.sentry.android.replay.util.a aVar, bp2 bp2Var) {
        js3.p(xVar, "executorProvider");
        this.a = replayIntegration;
        this.b = b6Var;
        this.c = rVar;
        this.d = bp2Var;
        this.e = xVar.e;
        this.f = xVar.d;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rVar.a, rVar.b, Bitmap.Config.ARGB_8888);
        js3.o(bitmapCreateBitmap, "createBitmap(...)");
        this.g = bitmapCreateBitmap;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        this.h = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$prescaledMatrix$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                Matrix matrix = new Matrix();
                r rVar2 = this.g.c;
                matrix.preScale(rVar2.c, rVar2.d);
                return matrix;
            }
        });
        this.i = new AtomicBoolean(false);
        this.j = new io.sentry.android.replay.util.c();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicInteger(0);
        this.m = new AtomicBoolean(false);
        this.n = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$dstOverPaint$2
            @Override // defpackage.bp2
            public final Object invoke() {
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                return paint;
            }
        });
        this.o = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$screenshotCanvas$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return new Canvas(this.g.g);
            }
        });
        this.p = new Rect();
        this.q = new RectF();
        this.r = new int[2];
        this.s = new int[2];
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(io.sentry.android.replay.screenshot.f r20, final android.view.View r21, int r22) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.screenshot.f.d(io.sentry.android.replay.screenshot.f, android.view.View, int):void");
    }

    public static final void f(AtomicInteger atomicInteger, final f fVar, final View view, final io.sentry.android.core.internal.threaddump.b[] bVarArr, final io.sentry.android.replay.viewhierarchy.f fVar2, final int i, final int i2, final boolean z) {
        if (atomicInteger.decrementAndGet() == 0) {
            fVar.e.submit(new io.sentry.android.replay.util.e(new Runnable() { // from class: io.sentry.android.replay.screenshot.e
                /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
                /* JADX WARN: Type inference failed for: r8v1, types: [c24, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v0, types: [c24, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r17 = this;
                        r0 = r17
                        io.sentry.android.replay.screenshot.f r1 = r0.a
                        java.util.concurrent.atomic.AtomicBoolean r2 = r1.m
                        boolean r2 = r2.get()
                        io.sentry.android.core.internal.threaddump.b[] r3 = r2
                        r4 = 0
                        if (r2 != 0) goto L9d
                        android.graphics.Bitmap r2 = r1.g
                        boolean r2 = r2.isRecycled()
                        if (r2 == 0) goto L19
                        goto L9d
                    L19:
                        int r2 = r3.length
                        r5 = r4
                    L1b:
                        if (r5 >= r2) goto L93
                        r6 = r3[r5]
                        if (r6 == 0) goto L8c
                        java.lang.Object r7 = r6.c
                        android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                        boolean r8 = r7.isRecycled()
                        if (r8 != 0) goto L8c
                        java.lang.Object r8 = r1.o
                        java.lang.Object r8 = r8.getValue()
                        android.graphics.Canvas r8 = (android.graphics.Canvas) r8
                        java.lang.Object r9 = r1.n
                        java.lang.Object r9 = r9.getValue()
                        android.graphics.Paint r9 = (android.graphics.Paint) r9
                        android.graphics.Rect r10 = r1.p
                        android.graphics.RectF r11 = r1.q
                        int r12 = r6.a
                        int r6 = r6.b
                        io.sentry.android.replay.r r13 = r1.c
                        float r14 = r13.c
                        float r13 = r13.d
                        java.lang.String r15 = "destCanvas"
                        defpackage.js3.p(r8, r15)
                        java.lang.String r15 = "destPaint"
                        defpackage.js3.p(r9, r15)
                        java.lang.String r15 = "tmpSrc"
                        defpackage.js3.p(r10, r15)
                        java.lang.String r15 = "tmpDst"
                        defpackage.js3.p(r11, r15)
                        int r15 = r3
                        int r12 = r12 - r15
                        float r12 = (float) r12
                        float r12 = r12 * r14
                        int r15 = r4
                        int r6 = r6 - r15
                        float r6 = (float) r6
                        float r6 = r6 * r13
                        int r15 = r7.getWidth()
                        r16 = r2
                        int r2 = r7.getHeight()
                        r10.set(r4, r4, r15, r2)
                        int r2 = r7.getWidth()
                        float r2 = (float) r2
                        float r2 = r2 * r14
                        float r2 = r2 + r12
                        int r14 = r7.getHeight()
                        float r14 = (float) r14
                        float r14 = r14 * r13
                        float r14 = r14 + r6
                        r11.set(r12, r6, r2, r14)
                        r8.drawBitmap(r7, r10, r11, r9)
                        r7.recycle()
                        goto L8e
                    L8c:
                        r16 = r2
                    L8e:
                        int r5 = r5 + 1
                        r2 = r16
                        goto L1b
                    L93:
                        android.view.View r2 = r5
                        io.sentry.android.replay.viewhierarchy.f r3 = r6
                        boolean r4 = r7
                        r1.e(r2, r3, r4)
                        return
                    L9d:
                        io.sentry.b6 r1 = r1.b
                        io.sentry.u0 r1 = r1.getLogger()
                        io.sentry.SentryLevel r2 = io.sentry.SentryLevel.DEBUG
                        java.lang.String r5 = "PixelCopyStrategy is closed, skipping compositing"
                        java.lang.Object[] r6 = new java.lang.Object[r4]
                        r1.i(r2, r5, r6)
                        int r1 = r3.length
                    Lad:
                        if (r4 >= r1) goto Lc3
                        r2 = r3[r4]
                        if (r2 == 0) goto Lc0
                        java.lang.Object r2 = r2.c
                        android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                        boolean r5 = r2.isRecycled()
                        if (r5 != 0) goto Lc0
                        r2.recycle()
                    Lc0:
                        int r4 = r4 + 1
                        goto Lad
                    Lc3:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.screenshot.e.run():void");
                }
            }, "screenshot_recorder.composite"));
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void b(View view) throws IllegalAccessException {
        Window windowF = io.sentry.config.a.F(view);
        b6 b6Var = this.b;
        if (windowF == null) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.m.get()) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.k.set(false);
            PixelCopy.request(windowF, this.g, new l(this, view, 1), (Handler) this.f.b);
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.WARNING, "Failed to capture replay recording", th);
            this.l.set(0);
            this.i.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void c() throws Exception {
        if (this.i.get()) {
            Bitmap bitmap = this.g;
            if (bitmap.isRecycled()) {
                return;
            }
            this.a.k0(bitmap);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void close() {
        this.m.set(true);
        this.l.set(0);
        this.e.submit(new io.sentry.android.replay.util.e(new kb8(19, this), "PixelCopyStrategy.close"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c24, java.lang.Object] */
    public final void e(View view, io.sentry.android.replay.viewhierarchy.f fVar, boolean z) {
        boolean z2 = this.m.get();
        b6 b6Var = this.b;
        if (!z2) {
            Bitmap bitmap = this.g;
            if (!bitmap.isRecycled()) {
                this.j.b(bitmap, fVar, (Matrix) this.h.getValue());
                b6Var.getReplayController().getClass();
                this.a.k0(bitmap);
                this.i.set(true);
                this.k.set(false);
                if (z) {
                    this.l.set(0);
                    return;
                }
                return;
            }
        }
        b6Var.getLogger().i(SentryLevel.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void onContentChanged() {
        this.k.set(true);
    }
}
