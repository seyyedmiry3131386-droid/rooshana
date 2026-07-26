package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class gn4 implements gb6 {
    public final am8 a;
    public boolean b;
    public final fn4 c;
    public final en4 d;
    public final Handler e;
    public final long f;
    public boolean g;
    public final qn4 h;

    public gn4(Context context, eq7 eq7Var, Bundle bundle, en4 en4Var, Looper looper, qn4 qn4Var, do3 do3Var) {
        gn4 gn4Var;
        fn4 go4Var;
        vy2.o(eq7Var, "token must not be null");
        wn5.Q("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + j29.a + "]");
        this.a = new am8();
        this.f = -9223372036854775807L;
        this.d = en4Var;
        this.e = new Handler(looper);
        this.h = qn4Var;
        if (eq7Var.a.d()) {
            do3Var.getClass();
            go4Var = new a(context, this, eq7Var, bundle, looper, do3Var);
            gn4Var = this;
        } else {
            gn4Var = this;
            go4Var = new go4(context, gn4Var, eq7Var, bundle, looper);
        }
        gn4Var.c = go4Var;
        go4Var.i0();
    }

    public static void i0(qn4 qn4Var) {
        if (qn4Var.cancel(false)) {
            return;
        }
        try {
            ((gn4) ja1.t(qn4Var)).a();
        } catch (CancellationException | ExecutionException e) {
            wn5.l0("MediaController", "MediaController future failed (so we couldn't release it)", e);
        }
    }

    @Override // defpackage.gb6
    public final void A(List list, int i, long j) {
        k0();
        vy2.o(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            vy2.i("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.A(list, i, j);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.gb6
    public final PlaybackException B() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.B();
        }
        return null;
    }

    @Override // defpackage.gb6
    public final void C(boolean z) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.C(z);
        }
    }

    @Override // defpackage.gb6
    public final long D() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.D();
        }
        return 0L;
    }

    @Override // defpackage.gb6
    public final jp4 E() {
        bm8 bm8VarS = S();
        if (bm8VarS.p()) {
            return null;
        }
        return bm8VarS.m(M(), this.a, 0L).c;
    }

    @Override // defpackage.gb6
    public final long F() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.F();
        }
        return 0L;
    }

    @Override // defpackage.gb6
    public final rp8 G() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() ? fn4Var.G() : rp8.b;
    }

    @Override // defpackage.gb6
    public final boolean H() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() && fn4Var.H();
    }

    @Override // defpackage.gb6
    public final m81 I() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() ? fn4Var.I() : m81.d;
    }

    @Override // defpackage.gb6
    public final void J(jp4 jp4Var) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.J(jp4Var);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring addMediaItem().");
        }
    }

    @Override // defpackage.gb6
    public final void K() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.K();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.gb6
    public final int L() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.L();
        }
        return -1;
    }

    @Override // defpackage.gb6
    public final int M() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.M();
        }
        return -1;
    }

    @Override // defpackage.gb6
    public final void N(int i) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.N(i);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.gb6
    public final void O(eb6 eb6Var) {
        k0();
        vy2.o(eb6Var, "listener must not be null");
        this.c.O(eb6Var);
    }

    @Override // defpackage.gb6
    public final void P(jp4 jp4Var) {
        k0();
        vy2.o(jp4Var, "mediaItems must not be null");
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.P(jp4Var);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.gb6
    public final void Q(SurfaceView surfaceView) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.Q(surfaceView);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override // defpackage.gb6
    public final int R() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.R();
        }
        return 0;
    }

    @Override // defpackage.gb6
    public final bm8 S() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() ? fn4Var.S() : bm8.a;
    }

    @Override // defpackage.gb6
    public final void T(int i, jp4 jp4Var) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.T(i, jp4Var);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // defpackage.gb6
    public final boolean U() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() && fn4Var.U();
    }

    @Override // defpackage.gb6
    public final hp8 V() {
        k0();
        fn4 fn4Var = this.c;
        return !fn4Var.E() ? hp8.F : fn4Var.V();
    }

    @Override // defpackage.gb6
    public final long W() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.W();
        }
        return 0L;
    }

    @Override // defpackage.gb6
    public final void X() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.X();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.gb6
    public final void Y() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.Y();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.gb6
    public final void Z(TextureView textureView) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.Z(textureView);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override // defpackage.gb6
    public final void a() {
        Handler handler = this.e;
        k0();
        if (this.b) {
            return;
        }
        wn5.Q("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + j29.a + "] [" + lp4.b() + "]");
        this.b = true;
        handler.removeCallbacksAndMessages(null);
        try {
            this.c.a();
        } catch (Exception e) {
            synchronized (wn5.b) {
                wn5.a("Exception while releasing impl", e);
            }
        }
        if (this.g) {
            vy2.s(Looper.myLooper() == handler.getLooper());
            this.d.b();
        } else {
            this.g = true;
            qn4 qn4Var = this.h;
            qn4Var.getClass();
            qn4Var.l(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.gb6
    public final void a0() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.a0();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.gb6
    public final void b() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.b();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // defpackage.gb6
    public final qp4 b0() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() ? fn4Var.b0() : qp4.K;
    }

    @Override // defpackage.gb6
    public final void c() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.c();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.gb6
    public final void c0(List list) {
        k0();
        vy2.o(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            vy2.i("items must not contain null, index=" + i, list.get(i) != null);
        }
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.c0(list);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.gb6
    public final void d(ua6 ua6Var) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.d(ua6Var);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.gb6
    public final long d0() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.d0();
        }
        return 0L;
    }

    @Override // defpackage.gb6
    public final int e() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.e();
        }
        return 1;
    }

    @Override // defpackage.gb6
    public final long e0() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.e0();
        }
        return 0L;
    }

    @Override // defpackage.gb6
    public final int f() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.f();
        }
        return 0;
    }

    @Override // defpackage.gb6
    public final boolean f0(int i) {
        k0();
        fn4 fn4Var = this.c;
        return (!fn4Var.E() ? cb6.b : fn4Var.f0()).a(i);
    }

    @Override // defpackage.gb6
    public final ua6 g() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() ? fn4Var.g() : ua6.d;
    }

    @Override // defpackage.gb6
    public final Looper g0() {
        return this.e.getLooper();
    }

    @Override // defpackage.gb6
    public final long getDuration() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gb6
    public final boolean h() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() && fn4Var.h();
    }

    public final void h0() {
        vy2.s(Looper.myLooper() == this.e.getLooper());
        vy2.s(!this.g);
        this.g = true;
        qn4 qn4Var = this.h;
        qn4Var.j = true;
        gn4 gn4Var = qn4Var.i;
        if (gn4Var != null) {
            qn4Var.k(gn4Var);
        }
    }

    @Override // defpackage.gb6
    public final long i() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.i();
        }
        return 0L;
    }

    @Override // defpackage.gb6
    public final void j(int i, long j) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.j(i, j);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    public final void j0(Runnable runnable) {
        j29.a0(this.e, runnable);
    }

    @Override // defpackage.gb6
    public final void k(jp4 jp4Var, long j) {
        k0();
        vy2.o(jp4Var, "mediaItems must not be null");
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.k(jp4Var, j);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    public final void k0() {
        vy2.r("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.e.getLooper());
    }

    @Override // defpackage.gb6
    public final boolean l() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() && fn4Var.l();
    }

    @Override // defpackage.gb6
    public final void m(boolean z) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.m(z);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.gb6
    public final void n(eb6 eb6Var) {
        vy2.o(eb6Var, "listener must not be null");
        this.c.n(eb6Var);
    }

    @Override // defpackage.gb6
    public final long o() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.o();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gb6
    public final int p() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.p();
        }
        return -1;
    }

    @Override // defpackage.gb6
    public final void q(TextureView textureView) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.q(textureView);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    @Override // defpackage.gb6
    public final w59 r() {
        k0();
        fn4 fn4Var = this.c;
        return fn4Var.E() ? fn4Var.r() : w59.d;
    }

    @Override // defpackage.gb6
    public final float s() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.s();
        }
        return 1.0f;
    }

    @Override // defpackage.gb6
    public final void stop() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.stop();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.gb6
    public final void t() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.t();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.gb6
    public final int u() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            return fn4Var.u();
        }
        return -1;
    }

    @Override // defpackage.gb6
    public final void v(SurfaceView surfaceView) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.v(surfaceView);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override // defpackage.gb6
    public final void w(hp8 hp8Var) {
        k0();
        fn4 fn4Var = this.c;
        if (!fn4Var.E()) {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        fn4Var.w(hp8Var);
    }

    @Override // defpackage.gb6
    public final void x(long j) {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.x(j);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.gb6
    public final void y(float f) {
        k0();
        vy2.i("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.y(f);
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.gb6
    public final void z() {
        k0();
        fn4 fn4Var = this.c;
        if (fn4Var.E()) {
            fn4Var.z();
        } else {
            wn5.k0("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }
}
