package androidx.media3.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import defpackage.am8;
import defpackage.aq7;
import defpackage.bm8;
import defpackage.bq7;
import defpackage.cb6;
import defpackage.dp6;
import defpackage.eb6;
import defpackage.eq7;
import defpackage.fb6;
import defpackage.fn4;
import defpackage.g7;
import defpackage.gn4;
import defpackage.gp4;
import defpackage.he6;
import defpackage.hp8;
import defpackage.io4;
import defpackage.j29;
import defpackage.ja1;
import defpackage.jo4;
import defpackage.jp4;
import defpackage.ko4;
import defpackage.lj3;
import defpackage.m81;
import defpackage.ml4;
import defpackage.mn4;
import defpackage.n94;
import defpackage.nc2;
import defpackage.nn4;
import defpackage.no4;
import defpackage.o40;
import defpackage.oc0;
import defpackage.od1;
import defpackage.on;
import defpackage.oo4;
import defpackage.py;
import defpackage.ql4;
import defpackage.qm5;
import defpackage.qp4;
import defpackage.r44;
import defpackage.rp8;
import defpackage.rq7;
import defpackage.t94;
import defpackage.td8;
import defpackage.ua6;
import defpackage.vy2;
import defpackage.w59;
import defpackage.wn5;
import defpackage.wp7;
import defpackage.wv;
import defpackage.xp7;
import defpackage.y97;
import defpackage.yf3;
import defpackage.yh0;
import defpackage.yp7;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements fn4 {
    public final Context a;
    public final gn4 b;
    public final eq7 c;
    public final t94 d;
    public final no4 e;
    public final oc0 f;
    public final Bundle g;
    public nc2 i;
    public ql4 j;
    public boolean k;
    public boolean l;
    public boolean o;
    public oo4 m = new oo4();
    public oo4 n = new oo4();
    public on p = new on(11);
    public final long h = 100;
    public long q = -9223372036854775807L;
    public long r = -9223372036854775807L;

    public a(Context context, gn4 gn4Var, eq7 eq7Var, Bundle bundle, Looper looper, oc0 oc0Var) {
        this.d = new t94(looper, td8.a, new io4(this));
        this.a = context;
        this.b = gn4Var;
        this.e = new no4(this, looper);
        this.c = eq7Var;
        this.g = bundle;
        this.f = oc0Var;
        ImmutableList.q();
    }

    public static List n0(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        qm5 qm5Var = y97.j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static PlaybackStateCompat o0(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return null;
        }
        if (playbackStateCompat.d > 0.0f) {
            return playbackStateCompat;
        }
        wn5.k0("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = playbackStateCompat.c;
        long j2 = playbackStateCompat.e;
        int i = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.g;
        AbstractCollection abstractCollection = playbackStateCompat.i;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, playbackStateCompat.b, j, 1.0f, j2, i, charSequence, playbackStateCompat.h, arrayList, playbackStateCompat.j, playbackStateCompat.k);
    }

    public static fb6 p0(int i, jp4 jp4Var, long j, boolean z) {
        return new fb6(null, i, jp4Var, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    @Override // defpackage.fn4
    public final void A(List list, int i, long j) {
        if (list.isEmpty()) {
            v0(0, Integer.MAX_VALUE);
            return;
        }
        he6 he6VarK = ((he6) this.p.a).k(dp6.g.q(0, list), new aq7(p0(i, (jp4) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        on onVar = this.p;
        y0(new on(he6VarK, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        if (t0()) {
            s0();
        }
    }

    @Override // defpackage.fn4
    public final PlaybackException B() {
        return ((he6) this.p.a).a;
    }

    @Override // defpackage.fn4
    public final void C(boolean z) {
        he6 he6Var = (he6) this.p.a;
        if (he6Var.t == z) {
            return;
        }
        this.q = y97.F(he6Var, this.q, this.r, this.b.f);
        this.r = SystemClock.elapsedRealtime();
        he6 he6VarB = ((he6) this.p.a).b(1, 0, z);
        on onVar = this.p;
        y0(new on(he6VarB, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        if (!t0() || ((he6) this.p.a).j.p()) {
            return;
        }
        if (z) {
            this.i.u().a.play();
        } else {
            this.i.u().a.pause();
        }
    }

    @Override // defpackage.fn4
    public final long D() {
        return ((he6) this.p.a).B;
    }

    @Override // defpackage.fn4
    public final boolean E() {
        return this.l;
    }

    @Override // defpackage.fn4
    public final long F() {
        return d0();
    }

    @Override // defpackage.fn4
    public final rp8 G() {
        return rp8.b;
    }

    @Override // defpackage.fn4
    public final boolean H() {
        return ((he6) this.p.a).v;
    }

    @Override // defpackage.fn4
    public final m81 I() {
        wn5.k0("MCImplLegacy", "Session doesn't support getting Cue");
        return m81.d;
    }

    @Override // defpackage.fn4
    public final void J(jp4 jp4Var) {
        l0(Integer.MAX_VALUE, Collections.singletonList(jp4Var));
    }

    @Override // defpackage.fn4
    public final void K() {
        C(true);
    }

    @Override // defpackage.fn4
    public final int L() {
        return -1;
    }

    @Override // defpackage.fn4
    public final int M() {
        return ((he6) this.p.a).c.a.b;
    }

    @Override // defpackage.fn4
    public final void N(int i) {
        if (i != f()) {
            he6 he6VarF = ((he6) this.p.a).f(i);
            on onVar = this.p;
            y0(new on(he6VarF, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        }
        nn4 nn4VarU = this.i.u();
        int iN = r44.n(i);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", iN);
        nn4VarU.e(bundle, "android.support.v4.media.session.action.SET_REPEAT_MODE");
    }

    @Override // defpackage.fn4
    public final void O(eb6 eb6Var) {
        this.d.e(eb6Var);
    }

    @Override // defpackage.fn4
    public final void P(jp4 jp4Var) {
        k(jp4Var, -9223372036854775807L);
    }

    @Override // defpackage.fn4
    public final void Q(SurfaceView surfaceView) {
        wn5.k0("MCImplLegacy", "Session doesn't support clearing SurfaceView");
    }

    @Override // defpackage.fn4
    public final int R() {
        return 0;
    }

    @Override // defpackage.fn4
    public final bm8 S() {
        return ((he6) this.p.a).j;
    }

    @Override // defpackage.fn4
    public final void T(int i, jp4 jp4Var) {
        int i2 = i + 1;
        ImmutableList immutableListS = ImmutableList.s(jp4Var);
        vy2.j(i >= 0 && i <= i2);
        int iO = ((dp6) ((he6) this.p.a).j).o();
        if (i > iO) {
            return;
        }
        int iMin = Math.min(i2, iO);
        l0(iMin, immutableListS);
        v0(i, iMin);
    }

    @Override // defpackage.fn4
    public final boolean U() {
        return ((he6) this.p.a).i;
    }

    @Override // defpackage.fn4
    public final hp8 V() {
        return hp8.F;
    }

    @Override // defpackage.fn4
    public final long W() {
        return q0();
    }

    @Override // defpackage.fn4
    public final void X() {
        this.i.u().a.skipToNext();
    }

    @Override // defpackage.fn4
    public final void Y() {
        this.i.u().a.fastForward();
    }

    @Override // defpackage.fn4
    public final void Z(TextureView textureView) {
        wn5.k0("MCImplLegacy", "Session doesn't support setting TextureView");
    }

    @Override // defpackage.fn4
    public final void a() {
        Messenger messenger;
        if (this.k) {
            return;
        }
        this.k = true;
        ql4 ql4Var = this.j;
        if (ql4Var != null) {
            ml4 ml4Var = (ml4) ql4Var.b;
            nc2 nc2Var = ml4Var.f;
            if (nc2Var != null && (messenger = ml4Var.g) != null) {
                try {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 7;
                    messageObtain.arg1 = 1;
                    messageObtain.replyTo = messenger;
                    ((Messenger) nc2Var.b).send(messageObtain);
                } catch (RemoteException unused) {
                }
            }
            ml4Var.b.disconnect();
            this.j = null;
        }
        nc2 nc2Var2 = this.i;
        if (nc2Var2 != null) {
            Set set = (Set) nc2Var2.c;
            no4 no4Var = this.e;
            if (set.remove(no4Var)) {
                try {
                    ((androidx.media3.session.legacy.a) nc2Var2.b).b(no4Var);
                } finally {
                    no4Var.j(null);
                }
            } else {
                t0.m("MediaControllerCompat", "the callback has never been registered");
            }
            no4Var.d.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.l = false;
        this.d.d();
    }

    @Override // defpackage.fn4
    public final void a0() {
        this.i.u().a.rewind();
    }

    @Override // defpackage.fn4
    public final void b() {
        C(false);
    }

    @Override // defpackage.fn4
    public final qp4 b0() {
        jp4 jp4VarP = ((he6) this.p.a).p();
        return jp4VarP == null ? qp4.K : jp4VarP.d;
    }

    @Override // defpackage.fn4
    public final void c() {
        he6 he6Var = (he6) this.p.a;
        if (he6Var.y != 1) {
            return;
        }
        he6 he6VarD = he6Var.d(he6Var.j.p() ? 4 : 2, null);
        on onVar = this.p;
        y0(new on(he6VarD, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        if (((he6) this.p.a).j.p()) {
            return;
        }
        s0();
    }

    @Override // defpackage.fn4
    public final void c0(List list) {
        A(list, 0, -9223372036854775807L);
    }

    @Override // defpackage.fn4
    public final void d(ua6 ua6Var) {
        if (!ua6Var.equals(g())) {
            he6 he6VarC = ((he6) this.p.a).c(ua6Var);
            on onVar = this.p;
            y0(new on(he6VarC, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        }
        this.i.u().f(ua6Var.a);
    }

    @Override // defpackage.fn4
    public final long d0() {
        long jF = y97.F((he6) this.p.a, this.q, this.r, this.b.f);
        this.q = jF;
        return jF;
    }

    @Override // defpackage.fn4
    public final int e() {
        return ((he6) this.p.a).y;
    }

    @Override // defpackage.fn4
    public final long e0() {
        return ((he6) this.p.a).A;
    }

    @Override // defpackage.fn4
    public final int f() {
        return ((he6) this.p.a).h;
    }

    @Override // defpackage.fn4
    public final cb6 f0() {
        return (cb6) this.p.c;
    }

    @Override // defpackage.fn4
    public final ua6 g() {
        return ((he6) this.p.a).g;
    }

    @Override // defpackage.fn4
    public final xp7 g0() {
        return (xp7) this.p.b;
    }

    @Override // defpackage.fn4
    public final long getDuration() {
        return ((he6) this.p.a).c.d;
    }

    @Override // defpackage.fn4
    public final boolean h() {
        return ((he6) this.p.a).c.b;
    }

    @Override // defpackage.fn4
    public final ImmutableList h0() {
        return (ImmutableList) this.p.d;
    }

    @Override // defpackage.fn4
    public final long i() {
        return ((he6) this.p.a).c.g;
    }

    @Override // defpackage.fn4
    public final void i0() {
        eq7 eq7Var = this.c;
        int type = eq7Var.a.getType();
        gn4 gn4Var = this.b;
        if (type != 0) {
            gn4Var.j0(new jo4(this, 1));
            return;
        }
        Object binder = eq7Var.a.getBinder();
        vy2.t(binder);
        gn4Var.j0(new g7(this, (MediaSessionCompat$Token) binder, 29));
        gn4Var.e.postDelayed(new jo4(this, 0), 500L);
    }

    @Override // defpackage.fn4
    public final void j(int i, long j) {
        w0(i, j);
    }

    @Override // defpackage.fn4
    public final Bundle j0() {
        return this.g;
    }

    @Override // defpackage.fn4
    public final void k(jp4 jp4Var, long j) {
        A(ImmutableList.s(jp4Var), 0, j);
    }

    @Override // defpackage.fn4
    public final n94 k0(wp7 wp7Var) {
        Bundle bundle = Bundle.EMPTY;
        boolean zContains = ((xp7) this.p.b).a.contains(wp7Var);
        String str = wp7Var.b;
        if (zContains) {
            this.i.u().e(bundle, str);
            return ja1.y(new bq7(0));
        }
        final rq7 rq7Var = new rq7();
        final Handler handler = this.b.e;
        ResultReceiver resultReceiver = new ResultReceiver(handler) { // from class: androidx.media3.session.MediaControllerImplLegacy$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle2) {
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                rq7Var.k(new bq7(i, bundle2));
            }
        };
        nc2 nc2Var = this.i;
        nc2Var.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        ((androidx.media3.session.legacy.a) nc2Var.b).a.sendCommand(str, bundle, resultReceiver);
        return rq7Var;
    }

    @Override // defpackage.fn4
    public final boolean l() {
        return ((he6) this.p.a).t;
    }

    public final void l0(int i, List list) {
        vy2.j(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        dp6 dp6Var = (dp6) ((he6) this.p.a).j;
        if (dp6Var.p()) {
            A(list, 0, -9223372036854775807L);
            return;
        }
        int iMin = Math.min(i, S().o());
        dp6 dp6VarQ = dp6Var.q(iMin, list);
        int iM = M();
        int size = list.size();
        if (iM >= iMin) {
            iM += size;
        }
        he6 he6VarJ = ((he6) this.p.a).j(dp6VarQ, iM);
        on onVar = this.p;
        y0(new on(he6VarJ, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        if (t0()) {
            m0(iMin, list);
        }
    }

    @Override // defpackage.fn4
    public final void m(boolean z) {
        if (z != U()) {
            he6 he6VarH = ((he6) this.p.a).h(z);
            on onVar = this.p;
            y0(new on(he6VarH, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        }
        nn4 nn4VarU = this.i.u();
        ImmutableSet immutableSet = r44.a;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z ? 1 : 0);
        nn4VarU.e(bundle, "android.support.v4.media.session.action.SET_SHUFFLE_MODE");
    }

    public final void m0(int i, List list) {
        ArrayList arrayList = new ArrayList();
        ko4 ko4Var = new ko4(this, new AtomicInteger(0), list, arrayList, i, 0);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((jp4) list.get(i2)).d.k;
            if (bArr == null) {
                arrayList.add(null);
                ko4Var.run();
            } else {
                n94 n94VarF = this.f.f(bArr);
                arrayList.add(n94VarF);
                Handler handler = this.b.e;
                Objects.requireNonNull(handler);
                n94VarF.e(ko4Var, new od1(0, handler));
            }
        }
    }

    @Override // defpackage.fn4
    public final void n(eb6 eb6Var) {
        this.d.a(eb6Var);
    }

    @Override // defpackage.fn4
    public final long o() {
        return getDuration();
    }

    @Override // defpackage.fn4
    public final int p() {
        return M();
    }

    @Override // defpackage.fn4
    public final void q(TextureView textureView) {
        wn5.k0("MCImplLegacy", "Session doesn't support clearing TextureView");
    }

    public final long q0() {
        return ((he6) this.p.a).c.e;
    }

    @Override // defpackage.fn4
    public final w59 r() {
        wn5.k0("MCImplLegacy", "Session doesn't support getting VideoSize");
        return w59.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x043f A[LOOP:2: B:212:0x0439->B:214:0x043f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0618 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0772 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x061a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5 A[PHI: r10
      0x01e5: PHI (r10v11 dp6) = (r10v6 dp6), (r10v13 dp6) binds: [B:96:0x01e9, B:93:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(boolean r81, defpackage.oo4 r82) {
        /*
            Method dump skipped, instruction units count: 2194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.a.r0(boolean, oo4):void");
    }

    @Override // defpackage.fn4
    public final float s() {
        return 1.0f;
    }

    public final void s0() {
        am8 am8Var = new am8();
        vy2.s(t0() && !((he6) this.p.a).j.p());
        he6 he6Var = (he6) this.p.a;
        dp6 dp6Var = (dp6) he6Var.j;
        int i = he6Var.c.a.b;
        dp6Var.m(i, am8Var, 0L);
        jp4 jp4Var = am8Var.c;
        if (dp6Var.r(i) == -1) {
            gp4 gp4Var = jp4Var.f;
            String str = jp4Var.a;
            if (gp4Var.a != null) {
                if (((he6) this.p.a).t) {
                    nn4 nn4VarU = this.i.u();
                    Uri uri = gp4Var.a;
                    Bundle bundle = gp4Var.c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    nn4VarU.a.playFromUri(uri, bundle);
                } else {
                    nn4 nn4VarU2 = this.i.u();
                    Uri uri2 = gp4Var.a;
                    Bundle bundle2 = gp4Var.c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    nn4VarU2.d(uri2, bundle2);
                }
            } else if (gp4Var.b != null) {
                if (((he6) this.p.a).t) {
                    nn4 nn4VarU3 = this.i.u();
                    String str2 = gp4Var.b;
                    Bundle bundle3 = gp4Var.c;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    nn4VarU3.a.playFromSearch(str2, bundle3);
                } else {
                    nn4 nn4VarU4 = this.i.u();
                    String str3 = gp4Var.b;
                    Bundle bundle4 = gp4Var.c;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    nn4VarU4.c(bundle4, str3);
                }
            } else if (((he6) this.p.a).t) {
                nn4 nn4VarU5 = this.i.u();
                Bundle bundle5 = gp4Var.c;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                nn4VarU5.a.playFromMediaId(str, bundle5);
            } else {
                nn4 nn4VarU6 = this.i.u();
                Bundle bundle6 = gp4Var.c;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                nn4VarU6.b(bundle6, str);
            }
        } else if (((he6) this.p.a).t) {
            this.i.u().a.play();
        } else {
            this.i.u().a();
        }
        if (((he6) this.p.a).c.a.f != 0) {
            this.i.u().a.seekTo(((he6) this.p.a).c.a.f);
        }
        if (((cb6) this.p.c).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < dp6Var.o(); i2++) {
                if (i2 != i && dp6Var.r(i2) == -1) {
                    dp6Var.m(i2, am8Var, 0L);
                    arrayList.add(am8Var.c);
                }
            }
            m0(0, arrayList);
        }
    }

    @Override // defpackage.fn4
    public final void stop() {
        he6 he6Var = (he6) this.p.a;
        if (he6Var.y == 1) {
            return;
        }
        aq7 aq7Var = he6Var.c;
        fb6 fb6Var = aq7Var.a;
        long j = aq7Var.d;
        long j2 = fb6Var.f;
        he6 he6VarG = he6Var.g(new aq7(fb6Var, false, SystemClock.elapsedRealtime(), j, j2, y97.o(j2, j), 0L, -9223372036854775807L, j, j2));
        he6 he6Var2 = (he6) this.p.a;
        if (he6Var2.y != 1) {
            he6VarG = he6VarG.d(1, he6Var2.a);
        }
        he6 he6Var3 = he6VarG;
        on onVar = this.p;
        y0(new on(he6Var3, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        this.i.u().a.stop();
    }

    @Override // defpackage.fn4
    public final void t() {
        w0(M(), 0L);
    }

    public final boolean t0() {
        return ((he6) this.p.a).y != 1;
    }

    @Override // defpackage.fn4
    public final int u() {
        return -1;
    }

    public final void u0() {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        int i;
        int iJ;
        if (this.k || this.l) {
            return;
        }
        this.l = true;
        MediaController.PlaybackInfo playbackInfo = ((androidx.media3.session.legacy.a) this.i.b).a.getPlaybackInfo();
        mn4 mn4Var = playbackInfo != null ? new mn4(playbackInfo.getPlaybackType(), py.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()) : null;
        PlaybackStateCompat playbackStateCompatO0 = o0(this.i.s());
        MediaMetadata metadata = ((androidx.media3.session.legacy.a) this.i.b).a.getMetadata();
        if (metadata != null) {
            wv wvVar = MediaMetadataCompat.c;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.b = metadata;
        } else {
            mediaMetadataCompatCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((androidx.media3.session.legacy.a) this.i.b).a.getQueue();
        List listN0 = n0(queue != null ? MediaSessionCompat$QueueItem.a(queue) : null);
        CharSequence queueTitle = ((androidx.media3.session.legacy.a) this.i.b).a.getQueueTitle();
        yf3 yf3VarA = ((androidx.media3.session.legacy.a) this.i.b).e.a();
        int iF = -1;
        if (yf3VarA != null) {
            try {
                i = -1;
                iF = yf3VarA.f();
            } catch (RemoteException | SecurityException e) {
                t0.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
                i = -1;
            }
        } else {
            i = -1;
        }
        yf3 yf3VarA2 = ((androidx.media3.session.legacy.a) this.i.b).e.a();
        if (yf3VarA2 != null) {
            try {
                iJ = yf3VarA2.J();
            } catch (RemoteException | SecurityException e2) {
                t0.e("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                iJ = i;
            }
        } else {
            iJ = i;
        }
        r0(true, new oo4(mn4Var, playbackStateCompatO0, mediaMetadataCompatCreateFromParcel, listN0, queueTitle, iF, iJ, ((androidx.media3.session.legacy.a) this.i.b).a.getExtras()));
    }

    @Override // defpackage.fn4
    public final void v(SurfaceView surfaceView) {
        wn5.k0("MCImplLegacy", "Session doesn't support setting SurfaceView");
    }

    public final void v0(int i, int i2) {
        vy2.j(i >= 0 && i2 >= i);
        int iO = S().o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin) {
            return;
        }
        dp6 dp6Var = (dp6) ((he6) this.p.a).j;
        dp6Var.getClass();
        lj3 lj3Var = new lj3(4);
        ImmutableList immutableList = dp6Var.e;
        lj3Var.Q(immutableList.subList(0, i));
        lj3Var.Q(immutableList.subList(iMin, immutableList.size()));
        dp6 dp6Var2 = new dp6(lj3Var.S(), dp6Var.f);
        int iM = M();
        int i3 = iMin - i;
        if (iM >= i) {
            iM = iM < iMin ? -1 : iM - i3;
        }
        if (iM == -1) {
            iM = j29.i(i, 0, dp6Var2.o() - 1);
            wn5.k0("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iM + " is the new current item");
        }
        he6 he6VarJ = ((he6) this.p.a).j(dp6Var2, iM);
        on onVar = this.p;
        y0(new on(he6VarJ, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), null, null);
        if (t0()) {
            while (i < iMin && i < this.m.d.size()) {
                nc2 nc2Var = this.i;
                MediaDescriptionCompat mediaDescriptionCompat = ((MediaSessionCompat$QueueItem) this.m.d.get(i)).a;
                androidx.media3.session.legacy.a aVar = (androidx.media3.session.legacy.a) nc2Var.b;
                if ((aVar.a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", yh0.p(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                aVar.a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
                i++;
            }
        }
    }

    public final void w0(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        vy2.j(i3 >= 0);
        int iM = M();
        bm8 bm8Var = ((he6) this.p.a).j;
        if ((bm8Var.p() || i3 < bm8Var.o()) && !h()) {
            if (i3 != iM) {
                long jR = ((dp6) ((he6) this.p.a).j).r(i3);
                if (jR != -1) {
                    this.i.u().a.skipToQueueItem(jR);
                    num = 2;
                } else {
                    o40.E(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
                    i3 = iM;
                    num = null;
                }
            } else {
                i3 = iM;
                num = null;
            }
            long jD0 = d0();
            if (j5 == -9223372036854775807L) {
                j5 = jD0;
                num2 = null;
            } else {
                this.i.u().a.seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jQ0 = q0();
                long duration = getDuration();
                long jMax = j5 < jD0 ? j5 : Math.max(j5, jQ0);
                j2 = jMax;
                i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            he6 he6VarG = ((he6) this.p.a).g(new aq7(p0(i3, !bm8Var.p() ? bm8Var.m(i3, new am8(), 0L).c : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (he6VarG.y != 1) {
                he6VarG = he6VarG.d(2, null);
            }
            he6 he6Var = he6VarG;
            on onVar = this.p;
            y0(new on(he6Var, (xp7) onVar.b, (cb6) onVar.c, (ImmutableList) onVar.d, (Bundle) onVar.e, (yp7) null), num2, num);
        }
    }

    @Override // defpackage.fn4
    public final void x(long j) {
        w0(M(), j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(boolean r19, defpackage.oo4 r20, boolean r21, final defpackage.on r22, java.lang.Integer r23, java.lang.Integer r24) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.a.x0(boolean, oo4, boolean, on, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // defpackage.fn4
    public final void y(float f) {
        wn5.k0("MCImplLegacy", "Session doesn't support setting player volume");
    }

    public final void y0(on onVar, Integer num, Integer num2) {
        x0(false, this.m, false, onVar, num, num2);
    }

    @Override // defpackage.fn4
    public final void z() {
        this.i.u().a.skipToPrevious();
    }

    @Override // defpackage.fn4
    public final void w(hp8 hp8Var) {
    }
}
