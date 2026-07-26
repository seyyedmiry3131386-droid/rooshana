package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.e;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class go4 implements fn4 {
    public SurfaceHolder A;
    public TextureView B;
    public xf3 D;
    public MediaController E;
    public long F;
    public long G;
    public he6 H;
    public Bundle I;
    public final gn4 a;
    public final eo5 b;
    public final so4 c;
    public final Context d;
    public final eq7 e;
    public final Bundle f;
    public final un4 g;
    public final fo4 h;
    public final t94 i;
    public final hh2 j;
    public final zv k;
    public final Handler l;
    public eq7 m;
    public do4 n;
    public boolean o;
    public PendingIntent q;
    public cb6 w;
    public cb6 x;
    public cb6 y;
    public Surface z;
    public he6 p = he6.F;
    public cy7 C = cy7.c;
    public xp7 v = xp7.b;
    public ImmutableList r = ImmutableList.q();
    public ImmutableList s = ImmutableList.q();
    public ImmutableList t = ImmutableList.q();
    public ImmutableList u = ImmutableList.q();

    /* JADX WARN: Type inference failed for: r4v4, types: [un4] */
    public go4(Context context, gn4 gn4Var, eq7 eq7Var, Bundle bundle, Looper looper) {
        ImmutableMap.l();
        cb6 cb6Var = cb6.b;
        this.w = cb6Var;
        this.x = cb6Var;
        this.y = n0(cb6Var, cb6Var);
        this.i = new t94(looper, td8.a, new sn4(this, 2));
        this.l = new Handler(looper);
        this.a = gn4Var;
        vy2.o(eq7Var, "token must not be null");
        this.d = context;
        this.b = new eo5();
        this.c = new so4(this);
        this.k = new zv(0);
        this.e = eq7Var;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: un4
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                gn4 gn4Var2 = this.a.a;
                Objects.requireNonNull(gn4Var2);
                gn4Var2.j0(new u03(7, gn4Var2));
            }
        };
        this.h = new fo4(this);
        this.I = Bundle.EMPTY;
        this.n = eq7Var.a.getType() == 0 ? null : new do4(this, bundle);
        this.j = new hh2(this, looper);
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
    }

    public static void D0(bm8 bm8Var, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            am8 am8Var = (am8) arrayList.get(i);
            int i2 = am8Var.n;
            int i3 = am8Var.o;
            if (i2 == -1 || i3 == -1) {
                am8Var.n = arrayList2.size();
                am8Var.o = arrayList2.size();
                yl8 yl8Var = new yl8();
                yl8Var.i(null, null, i, -9223372036854775807L, 0L, bb.f, true);
                arrayList2.add(yl8Var);
            } else {
                am8Var.n = arrayList2.size();
                am8Var.o = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    yl8 yl8Var2 = new yl8();
                    bm8Var.f(i2, yl8Var2, false);
                    yl8Var2.c = i;
                    arrayList2.add(yl8Var2);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.ImmutableList E0(defpackage.cb6 r2, defpackage.xp7 r3, android.os.Bundle r4, java.util.List r5, java.util.List r6) {
        /*
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Lb
            com.google.common.collect.ImmutableList r2 = defpackage.cw0.c(r6, r3, r2)
            return r2
        Lb:
            java.lang.String r3 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            boolean r3 = r4.getBoolean(r3)
            r6 = 0
            r0 = 1
            if (r3 != 0) goto L25
            r3 = 6
            r1 = 7
            int[] r3 = new int[]{r3, r1}
            vd2 r1 = r2.a
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L25
            r3 = r0
            goto L26
        L25:
            r3 = r6
        L26:
            java.lang.String r1 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            boolean r4 = r4.getBoolean(r1)
            if (r4 != 0) goto L3f
            r4 = 8
            r1 = 9
            int[] r4 = new int[]{r4, r1}
            vd2 r2 = r2.a
            boolean r2 = r2.a(r4)
            if (r2 != 0) goto L3f
            r6 = r0
        L3f:
            com.google.common.collect.ImmutableList r2 = defpackage.cw0.e(r5, r3, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go4.E0(cb6, xp7, android.os.Bundle, java.util.List, java.util.List):com.google.common.collect.ImmutableList");
    }

    public static ImmutableList F0(cb6 cb6Var, xp7 xp7Var, Bundle bundle, List list, List list2) {
        if (list.isEmpty()) {
            list = cw0.f(list2, cb6Var, bundle);
        }
        return cw0.c(list, xp7Var, cb6Var);
    }

    public static cb6 n0(cb6 cb6Var, cb6 cb6Var2) {
        cb6 cb6VarJ = y97.J(cb6Var, cb6Var2);
        if (cb6VarJ.a(32)) {
            return cb6VarJ;
        }
        xe1 xe1Var = new xe1(5);
        xe1Var.b(cb6VarJ.a);
        xe1Var.a(32);
        return new cb6(xe1Var.h());
    }

    public static zl8 o0(ArrayList arrayList, ArrayList arrayList2) {
        lj3 lj3Var = new lj3(4);
        lj3Var.Q(arrayList);
        ImmutableList immutableListS = lj3Var.S();
        lj3 lj3Var2 = new lj3(4);
        lj3Var2.Q(arrayList2);
        ImmutableList immutableListS2 = lj3Var2.S();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new zl8(immutableListS, immutableListS2, iArr);
    }

    public static int s0(he6 he6Var) {
        int i = he6Var.c.a.b;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static he6 x0(he6 he6Var, int i, List list, long j, long j2) {
        int size;
        bm8 bm8Var = he6Var.j;
        aq7 aq7Var = he6Var.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < bm8Var.o(); i2++) {
            arrayList.add(bm8Var.m(i2, new am8(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            jp4 jp4Var = (jp4) list.get(i3);
            am8 am8Var = new am8();
            am8Var.b(0, jp4Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, am8Var);
        }
        D0(bm8Var, arrayList, arrayList2);
        zl8 zl8VarO0 = o0(arrayList, arrayList2);
        if (he6Var.j.p()) {
            size = 0;
        } else {
            int i4 = aq7Var.a.b;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = aq7Var.a.e;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return y0(he6Var, zl8VarO0, size2, size, j, j2, 5);
    }

    public static he6 y0(he6 he6Var, zl8 zl8Var, int i, int i2, long j, long j2, int i3) {
        am8 am8Var = new am8();
        zl8Var.m(i, am8Var, 0L);
        jp4 jp4Var = am8Var.c;
        fb6 fb6Var = he6Var.c.a;
        fb6 fb6Var2 = new fb6(null, i, jp4Var, null, i2, j, j2, fb6Var.h, fb6Var.i);
        aq7 aq7Var = he6Var.c;
        return z0(he6Var, zl8Var, fb6Var2, new aq7(fb6Var2, aq7Var.b, SystemClock.elapsedRealtime(), aq7Var.d, aq7Var.e, aq7Var.f, aq7Var.g, aq7Var.h, aq7Var.i, aq7Var.j), i3);
    }

    public static he6 z0(he6 he6Var, bm8 bm8Var, fb6 fb6Var, aq7 aq7Var, int i) {
        aq7 aq7Var2;
        hp8 hp8Var;
        rp8 rp8Var;
        boolean z;
        PlaybackException playbackException = he6Var.a;
        int i2 = he6Var.b;
        aq7 aq7Var3 = he6Var.c;
        ua6 ua6Var = he6Var.g;
        int i3 = he6Var.h;
        boolean z2 = he6Var.i;
        int i4 = he6Var.k;
        w59 w59Var = he6Var.l;
        qp4 qp4Var = he6Var.m;
        float f = he6Var.n;
        ly lyVar = he6Var.o;
        m81 m81Var = he6Var.p;
        wl1 wl1Var = he6Var.q;
        int i5 = he6Var.r;
        boolean z3 = he6Var.s;
        boolean z4 = he6Var.t;
        int i6 = he6Var.u;
        boolean z5 = he6Var.v;
        boolean z6 = he6Var.w;
        int i7 = he6Var.x;
        int i8 = he6Var.y;
        qp4 qp4Var2 = he6Var.z;
        long j = he6Var.A;
        long j2 = he6Var.B;
        long j3 = he6Var.C;
        rp8 rp8Var2 = he6Var.D;
        hp8 hp8Var2 = he6Var.E;
        fb6 fb6Var2 = aq7Var3.a;
        if (!bm8Var.p()) {
            aq7Var2 = aq7Var;
            hp8Var = hp8Var2;
            rp8Var = rp8Var2;
            if (aq7Var2.a.b >= bm8Var.o()) {
                z = false;
            }
            vy2.s(z);
            return new he6(playbackException, i2, aq7Var2, fb6Var2, fb6Var, i, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
        }
        aq7Var2 = aq7Var;
        hp8Var = hp8Var2;
        rp8Var = rp8Var2;
        z = true;
        vy2.s(z);
        return new he6(playbackException, i2, aq7Var2, fb6Var2, fb6Var, i, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
    }

    @Override // defpackage.fn4
    public final void A(final List list, final int i, final long j) {
        if (w0(20)) {
            q0(new co4() { // from class: wn4
                @Override // defpackage.co4
                public final void c(xf3 xf3Var, int i2) {
                    so4 so4Var = this.a.c;
                    lj3 lj3VarM = ImmutableList.m();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            xf3Var.r(so4Var, i2, new zh0(lj3VarM.S()), i, j);
                            return;
                        } else {
                            lj3VarM.O(((jp4) list2.get(i3)).c(true));
                            i3++;
                        }
                    }
                }
            });
            J0(list, i, j, false);
        }
    }

    public final void A0(int i, int i2) {
        cy7 cy7Var = this.C;
        if (cy7Var.a == i && cy7Var.b == i2) {
            return;
        }
        this.C = new cy7(i, i2);
        this.i.f(24, new t52(i, i2, 1));
    }

    @Override // defpackage.fn4
    public final PlaybackException B() {
        return this.p.a;
    }

    public final void B0(he6 he6Var, final he6 he6Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        t94 t94Var = this.i;
        if (num != null) {
            final int i = 0;
            t94Var.c(0, new q94() { // from class: xn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i) {
                        case 0:
                            eb6Var.F(he6Var2.j, num.intValue());
                            break;
                        case 1:
                            he6 he6Var3 = he6Var2;
                            eb6Var.B(num.intValue(), he6Var3.d, he6Var3.e);
                            break;
                        default:
                            eb6Var.m(num.intValue(), he6Var2.t);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i2 = 1;
            t94Var.c(11, new q94() { // from class: xn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i2) {
                        case 0:
                            eb6Var.F(he6Var2.j, num3.intValue());
                            break;
                        case 1:
                            he6 he6Var3 = he6Var2;
                            eb6Var.B(num3.intValue(), he6Var3.d, he6Var3.e);
                            break;
                        default:
                            eb6Var.m(num3.intValue(), he6Var2.t);
                            break;
                    }
                }
            });
        }
        jp4 jp4VarP = he6Var2.p();
        if (num4 != null) {
            t94Var.c(1, new j2(jp4VarP, num4, 23));
        }
        PlaybackException playbackException = he6Var.a;
        PlaybackException playbackException2 = he6Var2.a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            t94Var.c(10, new ao4(0, playbackException2));
            if (playbackException2 != null) {
                t94Var.c(10, new ao4(1, playbackException2));
            }
        }
        if (!he6Var.D.equals(he6Var2.D)) {
            final int i3 = 17;
            t94Var.c(2, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i3) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.z.equals(he6Var2.z)) {
            final int i4 = 18;
            t94Var.c(14, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i4) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.w != he6Var2.w) {
            final int i5 = 19;
            t94Var.c(3, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i5) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.y != he6Var2.y) {
            final int i6 = 20;
            t94Var.c(4, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i6) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i7 = 2;
            t94Var.c(5, new q94() { // from class: xn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i7) {
                        case 0:
                            eb6Var.F(he6Var2.j, num2.intValue());
                            break;
                        case 1:
                            he6 he6Var3 = he6Var2;
                            eb6Var.B(num2.intValue(), he6Var3.d, he6Var3.e);
                            break;
                        default:
                            eb6Var.m(num2.intValue(), he6Var2.t);
                            break;
                    }
                }
            });
        }
        if (he6Var.x != he6Var2.x) {
            final int i8 = 0;
            t94Var.c(6, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i8) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.v != he6Var2.v) {
            final int i9 = 1;
            t94Var.c(7, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i9) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.g.equals(he6Var2.g)) {
            final int i10 = 2;
            t94Var.c(12, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i10) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.h != he6Var2.h) {
            final int i11 = 3;
            t94Var.c(8, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i11) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.i != he6Var2.i) {
            final int i12 = 4;
            t94Var.c(9, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i12) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.m.equals(he6Var2.m)) {
            final int i13 = 5;
            t94Var.c(15, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i13) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.n != he6Var2.n) {
            final int i14 = 6;
            t94Var.c(22, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i14) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.o.equals(he6Var2.o)) {
            final int i15 = 7;
            t94Var.c(20, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i15) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.p.a.equals(he6Var2.p.a)) {
            final int i16 = 8;
            t94Var.c(27, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i16) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
            final int i17 = 9;
            t94Var.c(27, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i17) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.q.equals(he6Var2.q)) {
            final int i18 = 10;
            t94Var.c(29, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i18) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.r != he6Var2.r || he6Var.s != he6Var2.s) {
            final int i19 = 11;
            t94Var.c(30, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i19) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.l.equals(he6Var2.l)) {
            final int i20 = 12;
            t94Var.c(25, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i20) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.A != he6Var2.A) {
            final int i21 = 13;
            t94Var.c(16, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i21) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.B != he6Var2.B) {
            final int i22 = 14;
            t94Var.c(17, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i22) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (he6Var.C != he6Var2.C) {
            final int i23 = 15;
            t94Var.c(18, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i23) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        if (!he6Var.E.equals(he6Var2.E)) {
            final int i24 = 16;
            t94Var.c(19, new q94() { // from class: yn4
                @Override // defpackage.q94
                public final void invoke(Object obj) {
                    eb6 eb6Var = (eb6) obj;
                    switch (i24) {
                        case 0:
                            eb6Var.c(he6Var2.x);
                            break;
                        case 1:
                            eb6Var.V(he6Var2.v);
                            break;
                        case 2:
                            eb6Var.M(he6Var2.g);
                            break;
                        case 3:
                            eb6Var.h(he6Var2.h);
                            break;
                        case 4:
                            eb6Var.t(he6Var2.i);
                            break;
                        case 5:
                            eb6Var.D(he6Var2.m);
                            break;
                        case 6:
                            eb6Var.n(he6Var2.n);
                            break;
                        case 7:
                            eb6Var.i(he6Var2.o);
                            break;
                        case 8:
                            eb6Var.J(he6Var2.p.a);
                            break;
                        case 9:
                            eb6Var.v(he6Var2.p);
                            break;
                        case 10:
                            eb6Var.Q(he6Var2.q);
                            break;
                        case 11:
                            he6 he6Var3 = he6Var2;
                            eb6Var.z(he6Var3.r, he6Var3.s);
                            break;
                        case 12:
                            eb6Var.a(he6Var2.l);
                            break;
                        case 13:
                            eb6Var.A(he6Var2.A);
                            break;
                        case 14:
                            eb6Var.E(he6Var2.B);
                            break;
                        case 15:
                            eb6Var.R(he6Var2.C);
                            break;
                        case 16:
                            eb6Var.j(he6Var2.E);
                            break;
                        case 17:
                            eb6Var.x(he6Var2.D);
                            break;
                        case 18:
                            eb6Var.C(he6Var2.z);
                            break;
                        case 19:
                            eb6Var.l(he6Var2.w);
                            break;
                        default:
                            eb6Var.r(he6Var2.y);
                            break;
                    }
                }
            });
        }
        t94Var.b();
    }

    @Override // defpackage.fn4
    public final void C(boolean z) {
        if (w0(1)) {
            q0(new tn4(this, z, 1));
            K0(z);
        } else if (z) {
            wn5.k0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    public final void C0(he6 he6Var, fe6 fe6Var) {
        if (E()) {
            he6 he6Var2 = this.H;
            if (he6Var2 != null) {
                this.H = y97.M(he6Var2, he6Var, fe6Var, this.y);
                if (!this.k.isEmpty()) {
                    return;
                }
                he6Var = this.H;
                fe6Var = fe6.c;
                this.H = null;
            }
            he6 he6Var3 = this.p;
            he6 he6VarM = y97.M(he6Var3, he6Var, fe6Var, this.y);
            this.p = he6VarM;
            Integer numValueOf = (he6Var3.d.equals(he6Var.d) && he6Var3.e.equals(he6Var.e)) ? null : Integer.valueOf(he6VarM.f);
            Integer numValueOf2 = !Objects.equals(he6Var3.p(), he6VarM.p()) ? Integer.valueOf(he6VarM.b) : null;
            Integer numValueOf3 = !he6Var3.j.equals(he6VarM.j) ? Integer.valueOf(he6VarM.k) : null;
            int i = he6Var3.u;
            int i2 = he6VarM.u;
            B0(he6Var3, he6VarM, numValueOf3, (i == i2 && he6Var3.t == he6VarM.t) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    @Override // defpackage.fn4
    public final long D() {
        return this.p.B;
    }

    @Override // defpackage.fn4
    public final boolean E() {
        return this.D != null;
    }

    @Override // defpackage.fn4
    public final long F() {
        aq7 aq7Var = this.p.c;
        return !aq7Var.b ? d0() : aq7Var.a.g;
    }

    @Override // defpackage.fn4
    public final rp8 G() {
        return this.p.D;
    }

    public final void G0(int i, long j) {
        int i2;
        int i3;
        he6 he6VarZ0;
        bm8 bm8Var = this.p.j;
        if ((bm8Var.p() || i < bm8Var.o()) && !h()) {
            he6 he6Var = this.p;
            he6 he6VarD = he6Var.d(he6Var.y == 1 ? 1 : 2, he6Var.a);
            ca4 ca4VarU0 = u0(bm8Var, i, j);
            if (ca4VarU0 == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                fb6 fb6Var = new fb6(null, i, null, null, i, j3, j2, -1, -1);
                he6 he6Var2 = this.p;
                bm8 bm8Var2 = he6Var2.j;
                boolean z = this.p.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                aq7 aq7Var = this.p.c;
                he6VarZ0 = z0(he6Var2, bm8Var2, fb6Var, new aq7(fb6Var, z, jElapsedRealtime, aq7Var.d, j == -9223372036854775807L ? 0L : j, 0, 0L, aq7Var.h, aq7Var.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                aq7 aq7Var2 = he6VarD.c;
                fb6 fb6Var2 = aq7Var2.a;
                fb6 fb6Var3 = aq7Var2.a;
                int i4 = fb6Var2.e;
                int i5 = ca4VarU0.a;
                yl8 yl8Var = new yl8();
                bm8Var.f(i4, yl8Var, false);
                yl8 yl8Var2 = new yl8();
                bm8Var.f(i5, yl8Var2, false);
                boolean z2 = i4 != i5;
                long j4 = ca4VarU0.b;
                long jV = j29.V(d0()) - yl8Var.e;
                if (z2 || j4 != jV) {
                    vy2.s(fb6Var3.h == -1);
                    fb6 fb6Var4 = new fb6(null, yl8Var.c, fb6Var3.c, null, i4, j29.k0(yl8Var.e + jV), j29.k0(yl8Var.e + jV), -1, -1);
                    bm8Var.f(i5, yl8Var2, false);
                    am8 am8Var = new am8();
                    bm8Var.n(yl8Var2.c, am8Var);
                    long jK0 = j29.k0(yl8Var2.e + j4);
                    fb6 fb6Var5 = new fb6(null, yl8Var2.c, am8Var.c, null, i5, jK0, jK0, -1, -1);
                    he6 he6VarE = he6VarD.e(1, fb6Var4, fb6Var5);
                    if (z2 || j4 < jV) {
                        he6VarD = he6VarE.g(new aq7(fb6Var5, false, SystemClock.elapsedRealtime(), j29.k0(am8Var.m), jK0, y97.o(jK0, j29.k0(am8Var.m)), 0L, -9223372036854775807L, -9223372036854775807L, jK0));
                    } else {
                        long jMax = Math.max(0L, j29.V(he6VarE.c.g) - (j4 - jV));
                        long jK02 = j29.k0(yl8Var2.e + j4 + jMax);
                        he6VarD = he6VarE.g(new aq7(fb6Var5, false, SystemClock.elapsedRealtime(), j29.k0(am8Var.m), jK02, y97.o(jK02, j29.k0(am8Var.m)), j29.k0(jMax), -9223372036854775807L, -9223372036854775807L, jK02));
                    }
                }
                he6VarZ0 = he6VarD;
            }
            aq7 aq7Var3 = he6VarZ0.c;
            int i6 = (this.p.j.p() || aq7Var3.a.b == this.p.c.a.b) ? 0 : i2;
            if (i6 == 0 && aq7Var3.a.f == this.p.c.a.f) {
                return;
            }
            L0(he6VarZ0, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // defpackage.fn4
    public final boolean H() {
        return this.p.v;
    }

    public final void H0(long j) {
        long jD0 = d0() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jD0 = Math.min(jD0, duration);
        }
        G0(s0(this.p), Math.max(jD0, 0L));
    }

    @Override // defpackage.fn4
    public final m81 I() {
        return this.p.p;
    }

    public final void I0(int i, n94 n94Var) {
        n94Var.e(new cy0(this, n94Var, i, 5), e.a());
    }

    @Override // defpackage.fn4
    public final void J(jp4 jp4Var) {
        if (w0(20)) {
            q0(new rn4(this, jp4Var, 0));
            int iO = this.p.j.o();
            List listSingletonList = Collections.singletonList(jp4Var);
            if (listSingletonList.isEmpty()) {
                return;
            }
            if (this.p.j.p()) {
                J0(listSingletonList, -1, -9223372036854775807L, false);
            } else {
                L0(x0(this.p, Math.min(iO, this.p.j.o()), listSingletonList, d0(), F()), 0, null, null, this.p.j.p() ? 3 : null);
            }
        }
    }

    public final void J0(List list, int i, long j, boolean z) {
        int iA;
        boolean z2;
        long j2;
        fb6 fb6Var;
        aq7 aq7Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            jp4 jp4Var = (jp4) list.get(i2);
            ImmutableSet immutableSet = r44.a;
            am8 am8Var = new am8();
            int i3 = i2;
            am8Var.b(0, jp4Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i3, i3, 0L);
            arrayList.add(am8Var);
            yl8 yl8Var = new yl8();
            yl8Var.i(null, null, i3, -9223372036854775807L, 0L, bb.f, true);
            arrayList2.add(yl8Var);
            i2 = i3 + 1;
        }
        zl8 zl8VarO0 = o0(arrayList, arrayList2);
        ImmutableList immutableList = zl8VarO0.e;
        if (!zl8VarO0.p() && i >= immutableList.size()) {
            throw new IllegalSeekPositionException();
        }
        if (z) {
            iA = zl8VarO0.a(this.p.i);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            fb6 fb6Var2 = this.p.c.a;
            int i4 = fb6Var2.b;
            long j3 = fb6Var2.f;
            if (zl8VarO0.p() || i4 < immutableList.size()) {
                z2 = false;
                j2 = j3;
                iA = i4;
            } else {
                iA = zl8VarO0.a(this.p.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iA = i;
            z2 = false;
            j2 = j;
        }
        ca4 ca4VarU0 = u0(zl8VarO0, iA, j2);
        if (ca4VarU0 == null) {
            fb6Var = new fb6(null, iA, null, null, iA, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            aq7Var = new aq7(fb6Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = ca4VarU0.b;
            fb6Var = new fb6(null, iA, (jp4) list.get(iA), null, ca4VarU0.a, j29.k0(j4), j29.k0(j4), -1, -1);
            aq7Var = new aq7(fb6Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j29.k0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, j29.k0(j4));
        }
        he6 he6VarZ0 = z0(this.p, zl8VarO0, fb6Var, aq7Var, 4);
        int i5 = he6VarZ0.y;
        if (iA != -1 && i5 != 1) {
            i5 = (zl8VarO0.p() || z2) ? 4 : 2;
        }
        he6 he6VarD = he6VarZ0.d(i5, this.p.a);
        L0(he6VarD, 0, null, !this.p.j.p() ? 4 : null, (this.p.j.p() && he6VarD.j.p()) ? null : 3);
    }

    @Override // defpackage.fn4
    public final void K() {
        MediaController mediaController;
        if (!w0(1)) {
            wn5.k0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.E) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        q0(new sn4(this, 6));
        K0(true);
    }

    public final void K0(boolean z) {
        he6 he6Var = this.p;
        int i = he6Var.x;
        int i2 = i == 1 ? 0 : i;
        if (he6Var.t == z && i == i2) {
            return;
        }
        this.F = y97.F(he6Var, this.F, this.G, this.a.f);
        this.G = SystemClock.elapsedRealtime();
        L0(this.p.b(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.fn4
    public final int L() {
        return this.p.c.a.h;
    }

    public final void L0(he6 he6Var, Integer num, Integer num2, Integer num3, Integer num4) {
        he6 he6Var2 = this.p;
        this.p = he6Var;
        B0(he6Var2, he6Var, num, num2, num3, num4);
    }

    @Override // defpackage.fn4
    public final int M() {
        return s0(this.p);
    }

    @Override // defpackage.fn4
    public final void N(int i) {
        if (w0(15)) {
            q0(new p52(i, 2, this));
            he6 he6Var = this.p;
            if (he6Var.h != i) {
                this.p = he6Var.f(i);
                u52 u52Var = new u52(i, 4);
                t94 t94Var = this.i;
                t94Var.c(8, u52Var);
                t94Var.b();
            }
        }
    }

    @Override // defpackage.fn4
    public final void O(eb6 eb6Var) {
        this.i.e(eb6Var);
    }

    @Override // defpackage.fn4
    public final void P(jp4 jp4Var) {
        if (w0(31)) {
            q0(new rn4(this, jp4Var, 1));
            J0(Collections.singletonList(jp4Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.fn4
    public final void Q(SurfaceView surfaceView) {
        if (w0(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (w0(27) && holder != null && this.A == holder) {
                m0();
            }
        }
    }

    @Override // defpackage.fn4
    public final int R() {
        return this.p.x;
    }

    @Override // defpackage.fn4
    public final bm8 S() {
        return this.p.j;
    }

    @Override // defpackage.fn4
    public final void T(int i, jp4 jp4Var) {
        int i2;
        int iA;
        int i3;
        int i4;
        int i5;
        he6 he6VarY0;
        if (w0(20)) {
            vy2.j(i >= 0);
            q0(new y52(this, i, jp4Var));
            int i6 = i + 1;
            ImmutableList immutableListS = ImmutableList.s(jp4Var);
            int iO = this.p.j.o();
            if (i > iO) {
                return;
            }
            if (this.p.j.p()) {
                J0(immutableListS, -1, -9223372036854775807L, false);
                return;
            }
            int iMin = Math.min(i6, iO);
            he6 he6VarX0 = x0(this.p, iMin, immutableListS, d0(), F());
            long jD0 = d0();
            long jF = F();
            bm8 bm8Var = he6VarX0.j;
            boolean z = he6VarX0.i;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < bm8Var.o(); i7++) {
                if (i7 < i || i7 >= iMin) {
                    arrayList.add(bm8Var.m(i7, new am8(), 0L));
                }
            }
            D0(bm8Var, arrayList, arrayList2);
            zl8 zl8VarO0 = o0(arrayList, arrayList2);
            int iS0 = s0(he6VarX0);
            int i8 = he6VarX0.c.a.e;
            am8 am8Var = new am8();
            boolean z2 = iS0 >= i && iS0 < iMin;
            if (zl8VarO0.p()) {
                iA = -1;
                i3 = 0;
                i2 = 1;
            } else {
                if (z2) {
                    int i9 = he6VarX0.h;
                    i2 = 1;
                    int iO2 = bm8Var.o();
                    iA = iS0;
                    for (int i10 = 0; i10 < iO2; i10++) {
                        iA = bm8Var.e(iA, i9, z);
                        if (iA == -1) {
                            break;
                        }
                        if (iA < i || iA >= iMin) {
                            break;
                        }
                    }
                    iA = -1;
                    if (iA == -1) {
                        iA = zl8VarO0.a(z);
                    } else if (iA >= iMin) {
                        iA -= iMin - i;
                    }
                    zl8VarO0.m(iA, am8Var, 0L);
                    i4 = am8Var.n;
                } else {
                    i2 = 1;
                    if (iS0 >= iMin) {
                        iA = iS0 - (iMin - i);
                        if (i8 != -1) {
                            for (int i11 = i; i11 < iMin; i11++) {
                                am8 am8Var2 = new am8();
                                bm8Var.n(i11, am8Var2);
                                i8 -= (am8Var2.o - am8Var2.n) + 1;
                            }
                        }
                        i4 = i8;
                    } else {
                        iA = iS0;
                        i3 = i8;
                    }
                }
                i3 = i4;
            }
            if (z2 && iA == -1) {
                he6VarY0 = z0(he6VarX0, zl8VarO0, aq7.k, aq7.l, 4);
                i5 = i2;
            } else {
                i5 = i2;
                he6VarY0 = y0(he6VarX0, zl8VarO0, iA, i3, jD0, jF, 4);
            }
            int i12 = he6VarY0.y;
            if (i12 != i5 && i12 != 4 && i < iMin && iMin == bm8Var.o() && iS0 >= i) {
                he6VarY0 = he6VarY0.d(4, null);
            }
            int i13 = this.p.c.a.b;
            boolean z3 = i13 >= i && i13 < iMin;
            L0(he6VarY0, 0, null, z3 ? 4 : null, z3 ? 3 : null);
        }
    }

    @Override // defpackage.fn4
    public final boolean U() {
        return this.p.i;
    }

    @Override // defpackage.fn4
    public final hp8 V() {
        return this.p.E;
    }

    @Override // defpackage.fn4
    public final long W() {
        return this.p.c.j;
    }

    @Override // defpackage.fn4
    public final void X() {
        if (w0(9)) {
            q0(new sn4(this, 5));
            bm8 bm8Var = this.p.j;
            if (bm8Var.p() || h()) {
                return;
            }
            if (t0() != -1) {
                G0(t0(), -9223372036854775807L);
                return;
            }
            am8 am8VarM = bm8Var.m(s0(this.p), new am8(), 0L);
            if (am8VarM.i && am8VarM.a()) {
                G0(s0(this.p), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.fn4
    public final void Y() {
        if (w0(12)) {
            q0(new sn4(this, 14));
            H0(this.p.B);
        }
    }

    @Override // defpackage.fn4
    public final void Z(TextureView textureView) {
        if (w0(27)) {
            if (textureView == null) {
                m0();
                return;
            }
            if (this.B == textureView) {
                return;
            }
            l0();
            this.B = textureView;
            textureView.setSurfaceTextureListener(this.h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                r0(new sn4(this, 9));
                A0(0, 0);
            } else {
                this.z = new Surface(surfaceTexture);
                r0(new sn4(this, 10));
                A0(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override // defpackage.fn4
    public final void a() {
        xf3 xf3Var = this.D;
        if (this.o) {
            return;
        }
        this.o = true;
        this.m = null;
        this.l.removeCallbacksAndMessages(null);
        hh2 hh2Var = this.j;
        Handler handler = (Handler) hh2Var.b;
        if (handler.hasMessages(1)) {
            try {
                go4 go4Var = (go4) hh2Var.c;
                go4Var.D.b0(go4Var.c);
            } catch (RemoteException unused) {
                wn5.k0("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.D = null;
        if (xf3Var != null) {
            int iC = this.b.c();
            try {
                xf3Var.asBinder().unlinkToDeath(this.g, 0);
                xf3Var.U(this.c, iC);
            } catch (RemoteException unused2) {
            }
        }
        this.i.d();
        eo5 eo5Var = this.b;
        bo4 bo4Var = new bo4(this, 0);
        synchronized (eo5Var.c) {
            try {
                Handler handlerP = j29.p(null);
                eo5Var.f = handlerP;
                eo5Var.e = bo4Var;
                if (((wv) eo5Var.d).isEmpty()) {
                    eo5Var.d();
                } else {
                    handlerP.postDelayed(new u03(25, eo5Var), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fn4
    public final void a0() {
        if (w0(11)) {
            q0(new sn4(this, 3));
            H0(-this.p.A);
        }
    }

    @Override // defpackage.fn4
    public final void b() {
        if (w0(1)) {
            q0(new sn4(this, 4));
            K0(false);
        }
    }

    @Override // defpackage.fn4
    public final qp4 b0() {
        return this.p.z;
    }

    @Override // defpackage.fn4
    public final void c() {
        if (w0(2)) {
            q0(new sn4(this, 8));
            he6 he6Var = this.p;
            if (he6Var.y == 1) {
                L0(he6Var.d(he6Var.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.fn4
    public final void c0(List list) {
        if (w0(20)) {
            q0(new j2(this, list, 24));
            J0(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.fn4
    public final void d(ua6 ua6Var) {
        if (w0(13)) {
            q0(new j2(this, ua6Var, 22));
            if (this.p.g.equals(ua6Var)) {
                return;
            }
            this.p = this.p.c(ua6Var);
            zn4 zn4Var = new zn4(ua6Var);
            t94 t94Var = this.i;
            t94Var.c(12, zn4Var);
            t94Var.b();
        }
    }

    @Override // defpackage.fn4
    public final long d0() {
        long jF = y97.F(this.p, this.F, this.G, this.a.f);
        this.F = jF;
        return jF;
    }

    @Override // defpackage.fn4
    public final int e() {
        return this.p.y;
    }

    @Override // defpackage.fn4
    public final long e0() {
        return this.p.A;
    }

    @Override // defpackage.fn4
    public final int f() {
        return this.p.h;
    }

    @Override // defpackage.fn4
    public final cb6 f0() {
        return this.y;
    }

    @Override // defpackage.fn4
    public final ua6 g() {
        return this.p.g;
    }

    @Override // defpackage.fn4
    public final xp7 g0() {
        return this.v;
    }

    @Override // defpackage.fn4
    public final long getDuration() {
        return this.p.c.d;
    }

    @Override // defpackage.fn4
    public final boolean h() {
        return this.p.c.b;
    }

    @Override // defpackage.fn4
    public final ImmutableList h0() {
        return this.t;
    }

    @Override // defpackage.fn4
    public final long i() {
        return this.p.c.g;
    }

    @Override // defpackage.fn4
    public final void i0() {
        xf3 xf3Var;
        eq7 eq7Var = this.e;
        dq7 dq7Var = eq7Var.a;
        dq7 dq7Var2 = eq7Var.a;
        int type = dq7Var.getType();
        gn4 gn4Var = this.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.n = null;
            Object binder = dq7Var2.getBinder();
            vy2.t(binder);
            IBinder iBinder = (IBinder) binder;
            int i = is4.s;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xf3)) {
                tf3 tf3Var = new tf3();
                tf3Var.n = iBinder;
                xf3Var = tf3Var;
            } else {
                xf3Var = (xf3) iInterfaceQueryLocalInterface;
            }
            int iC = this.b.c();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            gn4Var.getClass();
            try {
                xf3Var.Z(this.c, iC, new v11(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e) {
                wn5.l0("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.n = new do4(this, bundle);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(dq7Var2.f(), dq7Var2.b());
            try {
                if (context.bindService(intent, this.n, i2)) {
                    return;
                }
                wn5.k0("MCImplBase", "bind to " + eq7Var + " failed");
            } catch (SecurityException e2) {
                wn5.l0("MCImplBase", "bind to " + eq7Var + " not allowed", e2);
            }
        }
        Objects.requireNonNull(gn4Var);
        gn4Var.j0(new u03(7, gn4Var));
    }

    @Override // defpackage.fn4
    public final void j(int i, long j) {
        if (w0(10)) {
            vy2.j(i >= 0);
            q0(new zc1(i, j, this));
            G0(i, j);
        }
    }

    @Override // defpackage.fn4
    public final Bundle j0() {
        return this.f;
    }

    @Override // defpackage.fn4
    public final void k(jp4 jp4Var, long j) {
        if (w0(31)) {
            q0(new vn4(j, this, jp4Var));
            J0(Collections.singletonList(jp4Var), -1, j, false);
        }
    }

    @Override // defpackage.fn4
    public final n94 k0(wp7 wp7Var) {
        xf3 xf3Var;
        Bundle bundle = Bundle.EMPTY;
        j2 j2Var = new j2(this, wp7Var);
        vy2.j(wp7Var.a == 0);
        if (this.v.a.contains(wp7Var)) {
            xf3Var = this.D;
        } else {
            wn5.k0("MCImplBase", "Controller isn't allowed to call custom session command:" + wp7Var.b);
            xf3Var = null;
        }
        return p0(xf3Var, j2Var, false);
    }

    @Override // defpackage.fn4
    public final boolean l() {
        return this.p.t;
    }

    public final void l0() {
        TextureView textureView = this.B;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.B = null;
        }
        SurfaceHolder surfaceHolder = this.A;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    @Override // defpackage.fn4
    public final void m(boolean z) {
        if (w0(14)) {
            q0(new tn4(this, z, 0));
            he6 he6Var = this.p;
            if (he6Var.i != z) {
                this.p = he6Var.h(z);
                x52 x52Var = new x52(2, z);
                t94 t94Var = this.i;
                t94Var.c(9, x52Var);
                t94Var.b();
            }
        }
    }

    public final void m0() {
        if (w0(27)) {
            l0();
            r0(new sn4(this, 12));
            A0(0, 0);
        }
    }

    @Override // defpackage.fn4
    public final void n(eb6 eb6Var) {
        this.i.a(eb6Var);
    }

    @Override // defpackage.fn4
    public final long o() {
        return this.p.c.i;
    }

    @Override // defpackage.fn4
    public final int p() {
        return this.p.c.a.e;
    }

    public final n94 p0(xf3 xf3Var, co4 co4Var, boolean z) {
        if (xf3Var == null) {
            return ja1.y(new bq7(-4));
        }
        bq7 bq7Var = new bq7(1);
        eo5 eo5Var = this.b;
        lo7 lo7VarB = eo5Var.b(bq7Var);
        int i = lo7VarB.h;
        zv zvVar = this.k;
        if (z) {
            if (zvVar.isEmpty()) {
                this.H = this.p;
            }
            zvVar.add(Integer.valueOf(i));
        }
        try {
            co4Var.c(xf3Var, i);
            return lo7VarB;
        } catch (RemoteException e) {
            wn5.l0("MCImplBase", "Cannot connect to the service or the session is gone", e);
            zvVar.remove(Integer.valueOf(i));
            eo5Var.e(i, new bq7(-100));
            return lo7VarB;
        }
    }

    @Override // defpackage.fn4
    public final void q(TextureView textureView) {
        if (w0(27) && textureView != null && this.B == textureView) {
            m0();
        }
    }

    public final void q0(co4 co4Var) {
        hh2 hh2Var = this.j;
        Handler handler = (Handler) hh2Var.b;
        if (((go4) hh2Var.c).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        p0(this.D, co4Var, true);
    }

    @Override // defpackage.fn4
    public final w59 r() {
        return this.p.l;
    }

    public final void r0(co4 co4Var) {
        hh2 hh2Var = this.j;
        Handler handler = (Handler) hh2Var.b;
        if (((go4) hh2Var.c).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        n94 n94VarP0 = p0(this.D, co4Var, true);
        try {
            r44.t(n94VarP0);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            if (n94VarP0 instanceof lo7) {
                int i = ((lo7) n94VarP0).h;
                this.k.remove(Integer.valueOf(i));
                this.b.e(i, new bq7(-1));
            }
            wn5.l0("MCImplBase", "Synchronous command takes too long on the session side.", e2);
        }
    }

    @Override // defpackage.fn4
    public final float s() {
        return this.p.n;
    }

    @Override // defpackage.fn4
    public final void stop() {
        if (w0(3)) {
            q0(new sn4(this, 7));
            he6 he6Var = this.p;
            aq7 aq7Var = this.p.c;
            fb6 fb6Var = aq7Var.a;
            boolean z = aq7Var.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aq7 aq7Var2 = this.p.c;
            long j = aq7Var2.d;
            long j2 = aq7Var2.a.f;
            int iO = y97.o(j2, j);
            aq7 aq7Var3 = this.p.c;
            he6 he6VarG = he6Var.g(new aq7(fb6Var, z, jElapsedRealtime, j, j2, iO, 0L, aq7Var3.h, aq7Var3.i, aq7Var3.a.f));
            this.p = he6VarG;
            if (he6VarG.y != 1) {
                this.p = he6VarG.d(1, he6VarG.a);
                vj3 vj3Var = new vj3(17);
                t94 t94Var = this.i;
                t94Var.c(4, vj3Var);
                t94Var.b();
            }
        }
    }

    @Override // defpackage.fn4
    public final void t() {
        if (w0(4)) {
            q0(new sn4(this, 0));
            G0(s0(this.p), -9223372036854775807L);
        }
    }

    public final int t0() {
        if (this.p.j.p()) {
            return -1;
        }
        he6 he6Var = this.p;
        bm8 bm8Var = he6Var.j;
        int iS0 = s0(he6Var);
        he6 he6Var2 = this.p;
        int i = he6Var2.h;
        if (i == 1) {
            i = 0;
        }
        return bm8Var.e(iS0, i, he6Var2.i);
    }

    @Override // defpackage.fn4
    public final int u() {
        return this.p.c.a.i;
    }

    public final ca4 u0(bm8 bm8Var, int i, long j) {
        if (bm8Var.p()) {
            return null;
        }
        am8 am8Var = new am8();
        yl8 yl8Var = new yl8();
        if (i == -1 || i >= bm8Var.o()) {
            i = bm8Var.a(this.p.i);
            j = j29.k0(bm8Var.m(i, am8Var, 0L).l);
        }
        long jV = j29.V(j);
        vy2.l(i, bm8Var.o());
        bm8Var.n(i, am8Var);
        if (jV == -9223372036854775807L) {
            jV = am8Var.l;
            if (jV == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = am8Var.n;
        bm8Var.f(i2, yl8Var, false);
        while (i2 < am8Var.o && yl8Var.e != jV) {
            int i3 = i2 + 1;
            if (bm8Var.f(i3, yl8Var, false).e > jV) {
                break;
            }
            i2 = i3;
        }
        bm8Var.f(i2, yl8Var, false);
        return new ca4(i2, jV - yl8Var.e, false);
    }

    @Override // defpackage.fn4
    public final void v(SurfaceView surfaceView) {
        if (w0(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (w0(27)) {
                if (holder == null) {
                    m0();
                    return;
                }
                if (this.A == holder) {
                    return;
                }
                l0();
                this.A = holder;
                holder.addCallback(this.h);
                Surface surface = holder.getSurface();
                if (surface == null || !surface.isValid()) {
                    this.z = null;
                    r0(new sn4(this, 15));
                    A0(0, 0);
                } else {
                    this.z = surface;
                    r0(new j2(this, surface, 25));
                    Rect surfaceFrame = holder.getSurfaceFrame();
                    A0(surfaceFrame.width(), surfaceFrame.height());
                }
            }
        }
    }

    public final int v0() {
        if (this.p.j.p()) {
            return -1;
        }
        he6 he6Var = this.p;
        bm8 bm8Var = he6Var.j;
        int iS0 = s0(he6Var);
        he6 he6Var2 = this.p;
        int i = he6Var2.h;
        if (i == 1) {
            i = 0;
        }
        return bm8Var.k(iS0, i, he6Var2.i);
    }

    @Override // defpackage.fn4
    public final void w(hp8 hp8Var) {
        if (w0(29)) {
            q0(new j2(this, hp8Var, 21));
            he6 he6Var = this.p;
            if (hp8Var != he6Var.E) {
                this.p = he6Var.l(hp8Var);
                w52 w52Var = new w52(hp8Var, 1);
                t94 t94Var = this.i;
                t94Var.c(19, w52Var);
                t94Var.b();
            }
        }
    }

    public final boolean w0(int i) {
        if (this.y.a(i)) {
            return true;
        }
        o40.E(i, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    }

    @Override // defpackage.fn4
    public final void x(long j) {
        if (w0(5)) {
            q0(new dd1(j, this));
            G0(s0(this.p), j);
        }
    }

    @Override // defpackage.fn4
    public final void y(float f) {
        if (w0(24)) {
            q0(new uc1(this, f));
            he6 he6Var = this.p;
            if (he6Var.n != f) {
                this.p = he6Var.m(f);
                s52 s52Var = new s52(1, f);
                t94 t94Var = this.i;
                t94Var.c(22, s52Var);
                t94Var.b();
            }
        }
    }

    @Override // defpackage.fn4
    public final void z() {
        if (w0(7)) {
            q0(new sn4(this, 1));
            bm8 bm8Var = this.p.j;
            if (bm8Var.p() || h()) {
                return;
            }
            boolean z = v0() != -1;
            am8 am8VarM = bm8Var.m(s0(this.p), new am8(), 0L);
            if (am8VarM.i && am8VarM.a()) {
                if (z) {
                    G0(v0(), -9223372036854775807L);
                }
            } else if (!z || d0() > this.p.C) {
                G0(s0(this.p), 0L);
            } else {
                G0(v0(), -9223372036854775807L);
            }
        }
    }
}
