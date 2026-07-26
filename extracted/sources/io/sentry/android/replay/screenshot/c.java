package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import defpackage.bg1;
import defpackage.bp2;
import defpackage.js3;
import defpackage.m91;
import defpackage.rm7;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.r;
import io.sentry.android.replay.x;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {
    public final x a;
    public final ReplayIntegration b;
    public final b6 c;
    public final r d;
    public volatile Bitmap e;
    public final AtomicReference f;
    public final AutoClosableReentrantLock g;
    public final Object h;
    public final AtomicBoolean i;
    public final h j;
    public final AtomicBoolean k;
    public final SurfaceTexture l;
    public final Surface m;
    public final a n;

    public c(b6 b6Var, ReplayIntegration replayIntegration, r rVar, x xVar) {
        js3.p(xVar, "executor");
        this.a = xVar;
        this.b = replayIntegration;
        this.c = b6Var;
        this.d = rVar;
        this.f = new AtomicReference(null);
        this.g = new AutoClosableReentrantLock();
        this.h = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: io.sentry.android.replay.screenshot.CanvasStrategy$prescaledMatrix$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                Matrix matrix = new Matrix();
                r rVar2 = this.g.d;
                matrix.preScale(rVar2.c, rVar2.d);
                return matrix;
            }
        });
        this.i = new AtomicBoolean(false);
        this.j = new h();
        this.k = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureA = bg1.a();
        surfaceTextureA.setDefaultBufferSize(rVar.a, rVar.b);
        this.l = surfaceTextureA;
        this.m = new Surface(surfaceTextureA);
        io.sentry.config.a.a("ReplayCanvasStrategy");
        this.n = new a(this, 0);
    }

    public static void d(final c cVar) {
        if (cVar.k.get()) {
            cVar.c.getLogger().i(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) cVar.f.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = cVar.m.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                picture.draw(canvasLockHardwareCanvas);
                cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (cVar.e == null) {
                    io.sentry.r rVarA = cVar.g.a();
                    try {
                        if (cVar.e == null) {
                            r rVar = cVar.d;
                            cVar.e = Bitmap.createBitmap(rVar.a, rVar.b, Bitmap.Config.ARGB_8888);
                        }
                        m91.i(rVarA, null);
                    } finally {
                    }
                }
                if (cVar.k.get()) {
                    cVar.c.getLogger().i(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = cVar.m;
                Bitmap bitmap = cVar.e;
                js3.m(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) throws Exception {
                        c cVar2 = this.a;
                        if (cVar2.k.get()) {
                            cVar2.c.getLogger().i(SentryLevel.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                            return;
                        }
                        if (i != 0) {
                            cVar2.c.getLogger().i(SentryLevel.ERROR, rm7.n(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                            cVar2.i.set(false);
                            return;
                        }
                        cVar2.i.set(true);
                        Bitmap bitmap2 = cVar2.e;
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            return;
                        }
                        cVar2.b.k0(bitmap2);
                    }
                }, cVar.a.g());
            } catch (Throwable th) {
                cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c.getLogger().f(SentryLevel.ERROR, "Canvas Strategy: picture render failed", th2);
            cVar.i.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final boolean a() {
        return this.i.get();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [c24, java.lang.Object] */
    @Override // io.sentry.android.replay.screenshot.g
    public final void b(View view) {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        r rVar = this.d;
        Canvas canvasBeginRecording = picture.beginRecording(rVar.a, rVar.b);
        js3.o(canvasBeginRecording, "beginRecording(...)");
        h hVar = this.j;
        hVar.getClass();
        hVar.a = canvasBeginRecording;
        hVar.setMatrix((Matrix) this.h.getValue());
        view.draw(hVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f.set(picture);
        e(this.a.g(), new io.sentry.android.replay.util.e(this.n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void c() throws Exception {
        Bitmap bitmap;
        if (!this.i.get() || (bitmap = this.e) == null || bitmap.isRecycled()) {
            return;
        }
        this.b.k0(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void close() {
        this.k.set(true);
        e(this.a.g(), new io.sentry.android.replay.util.e(new a(this, 1), "CanvasStrategy.close"));
        this.f.getAndSet(null);
    }

    public final void e(Handler handler, io.sentry.android.replay.util.e eVar) {
        try {
            handler.post(eVar);
        } catch (Throwable th) {
            this.c.getLogger().f(SentryLevel.ERROR, "Canvas Strategy: failed to post runnable " + eVar.a, th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.g
    public final void onContentChanged() {
    }
}
