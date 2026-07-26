package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xa6 implements v59 {
    public ImmutableList a;
    public b b;
    public long c;
    public long d;
    public Executor e;
    public final /* synthetic */ bb6 f;

    public xa6(bb6 bb6Var, Context context) {
        this.f = bb6Var;
        j29.R(context);
        this.a = ImmutableList.q();
        this.d = -9223372036854775807L;
        this.e = bb6.o;
    }

    @Override // defpackage.v59
    public final void a() {
        bb6 bb6Var = this.f;
        if (bb6Var.l == 2) {
            return;
        }
        wd8 wd8Var = bb6Var.i;
        if (wd8Var != null) {
            wd8Var.a.removeCallbacksAndMessages(null);
        }
        bb6Var.j = null;
        bb6Var.l = 2;
    }

    @Override // defpackage.v59
    public final Surface b() {
        vy2.s(false);
        throw null;
    }

    @Override // defpackage.v59
    public final boolean c() {
        return false;
    }

    @Override // defpackage.v59
    public final void d() {
        bb6 bb6Var = this.f;
        if (bb6Var.d) {
            bb6Var.e.d();
        }
    }

    @Override // defpackage.v59
    public final void e() {
        bb6 bb6Var = this.f;
        if (bb6Var.d) {
            bb6Var.e.e();
        }
    }

    @Override // defpackage.v59
    public final void f(long j) {
        this.c = j;
    }

    @Override // defpackage.v59
    public final void g() {
        long j = this.d;
        bb6 bb6Var = this.f;
        if (bb6Var.m >= j) {
            bb6Var.e.g();
        }
    }

    @Override // defpackage.v59
    public final void h(int i) {
        this.f.e.h(i);
    }

    @Override // defpackage.v59
    public final void i(float f) {
        this.f.e.i(f);
    }

    @Override // defpackage.v59
    public final boolean isInitialized() {
        return false;
    }

    @Override // defpackage.v59
    public final void j() {
        int i = cy7.c.a;
        this.f.j = null;
    }

    @Override // defpackage.v59
    public final boolean k(long j, zm4 zm4Var) {
        vy2.s(false);
        int i = this.f.n;
        if (i == -1 || i != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.v59
    public final void l(b bVar, long j, int i, List list) {
        vy2.s(false);
        this.a = ImmutableList.n(list);
        this.b = bVar;
        rj2 rj2VarA = bVar.a();
        cv0 cv0Var = bVar.D;
        if (cv0Var == null || !cv0Var.d()) {
            cv0Var = cv0.h;
        }
        rj2VarA.C = cv0Var;
        rj2VarA.a();
        throw null;
    }

    @Override // defpackage.v59
    public final void m(boolean z) {
        this.d = -9223372036854775807L;
        bb6 bb6Var = this.f;
        ii1 ii1Var = bb6Var.e;
        if (bb6Var.l == 1) {
            bb6Var.k++;
            ii1Var.m(z);
            while (bb6Var.h.y() > 1) {
                bb6Var.h.s();
            }
            if (bb6Var.h.y() == 1) {
                ((ab6) bb6Var.h.s()).getClass();
                throw null;
            }
            bb6Var.m = -9223372036854775807L;
            wd8 wd8Var = bb6Var.i;
            vy2.t(wd8Var);
            wd8Var.c(new u03(15, bb6Var));
        }
    }

    @Override // defpackage.v59
    public final void n(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = ImmutableList.n(list);
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        rj2 rj2VarA = bVar.a();
        cv0 cv0Var = bVar.D;
        if (cv0Var == null || !cv0Var.d()) {
            cv0Var = cv0.h;
        }
        rj2VarA.C = cv0Var;
        rj2VarA.a();
        throw null;
    }

    @Override // defpackage.v59
    public final void o(pj9 pj9Var, Executor executor) {
        this.e = executor;
    }

    @Override // defpackage.v59
    public final void p(long j, long j2) {
        this.f.e.p(j + this.c, j2);
    }

    @Override // defpackage.v59
    public final void q(boolean z) {
        bb6 bb6Var = this.f;
        if (bb6Var.d) {
            bb6Var.e.q(z);
        }
    }

    @Override // defpackage.v59
    public final boolean r(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.v59
    public final void s(f59 f59Var) {
        this.f.e.i = f59Var;
    }

    @Override // defpackage.v59
    public final void u(Surface surface, cy7 cy7Var) {
        bb6 bb6Var = this.f;
        Pair pair = bb6Var.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((cy7) bb6Var.j.second).equals(cy7Var)) {
            return;
        }
        bb6Var.j = Pair.create(surface, cy7Var);
        int i = cy7Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042 A[Catch: GlUtil$GlException -> 0x0036, TryCatch #1 {GlUtil$GlException -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:39:0x005f, B:35:0x0051), top: B:51:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // defpackage.v59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(androidx.media3.common.b r11) throws androidx.media3.exoplayer.video.VideoSink$VideoSinkException {
        /*
            r10 = this;
            java.lang.String r0 = "Color transfer "
            bb6 r1 = r10.f
            int r2 = r1.l
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Lc
            r2 = r3
            goto Ld
        Lc:
            r2 = r4
        Ld:
            defpackage.vy2.s(r2)
            cv0 r2 = r11.D
            if (r2 == 0) goto L1b
            boolean r5 = r2.d()
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            cv0 r2 = defpackage.cv0.h
        L1d:
            int r2 = r2.c
            java.lang.String r5 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r6 = 33
            r7 = 7
            if (r2 != r7) goto L3f
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r9 = 34
            if (r8 >= r9) goto L3f
            if (r8 < r6) goto L38
            boolean r8 = defpackage.is3.y(r5)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            if (r8 == 0) goto L38
            r8 = r3
            goto L39
        L36:
            r0 = move-exception
            goto L7a
        L38:
            r8 = r4
        L39:
            if (r8 != 0) goto L3c
            goto L3f
        L3c:
            cv0 r0 = new cv0     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            goto L80
        L3f:
            r8 = 6
            if (r2 != r8) goto L4f
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            if (r7 < r6) goto L4d
            boolean r5 = defpackage.is3.y(r5)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            if (r5 == 0) goto L4d
            goto L57
        L4d:
            r3 = r4
            goto L57
        L4f:
            if (r2 != r7) goto L57
            java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r3 = defpackage.is3.y(r3)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
        L57:
            if (r3 != 0) goto L80
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r4 = 29
            if (r3 < r4) goto L80
            java.lang.String r3 = "PlaybackVidGraphWrapper"
            java.util.Locale r4 = java.util.Locale.US     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r4.<init>(r0)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            r4.append(r2)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r4.append(r0)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            java.lang.String r0 = r4.toString()     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            defpackage.wn5.k0(r3, r0)     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            cv0 r0 = defpackage.cv0.h     // Catch: androidx.media3.common.util.GlUtil$GlException -> L36
            goto L80
        L7a:
            androidx.media3.exoplayer.video.VideoSink$VideoSinkException r1 = new androidx.media3.exoplayer.video.VideoSink$VideoSinkException
            r1.<init>(r0, r11)
            throw r1
        L80:
            td8 r0 = r1.f
            android.os.Looper r2 = android.os.Looper.myLooper()
            defpackage.vy2.t(r2)
            r3 = 0
            wd8 r0 = r0.a(r2, r3)
            r1.i = r0
            za6 r0 = r1.b     // Catch: androidx.media3.common.VideoFrameProcessingException -> L96
            r0.a()     // Catch: androidx.media3.common.VideoFrameProcessingException -> L96
            throw r3
        L96:
            r0 = move-exception
            androidx.media3.exoplayer.video.VideoSink$VideoSinkException r1 = new androidx.media3.exoplayer.video.VideoSink$VideoSinkException
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa6.v(androidx.media3.common.b):boolean");
    }

    @Override // defpackage.v59
    public final void w() {
        bb6 bb6Var = this.f;
        if (bb6Var.h.y() == 0) {
            bb6Var.e.w();
            return;
        }
        aj0 aj0Var = new aj0(10, (byte) 0);
        if (bb6Var.h.y() <= 0) {
            bb6Var.h = aj0Var;
        } else {
            ((ab6) bb6Var.h.s()).getClass();
            throw null;
        }
    }

    @Override // defpackage.v59
    public final void t() {
    }
}
