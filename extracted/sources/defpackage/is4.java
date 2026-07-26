package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i0;
import com.google.common.util.concurrent.e;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class is4 extends Binder implements xf3 {
    public static final /* synthetic */ int s = 0;
    public final WeakReference n;
    public final vp7 o;
    public final Set p;
    public ImmutableBiMap q;
    public int r;

    public is4(xq4 xq4Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.n = new WeakReference(xq4Var);
        this.o = new vp7(xq4Var);
        this.p = DesugarCollections.synchronizedSet(new HashSet());
        this.q = ImmutableBiMap.q();
    }

    public static n94 o0(xq4 xq4Var, hq4 hq4Var, int i, hs4 hs4Var, n31 n31Var) {
        if (xq4Var.j()) {
            return ij3.b;
        }
        n94 n94Var = (n94) hs4Var.h(xq4Var, hq4Var, i);
        rq7 rq7Var = new rq7();
        n94Var.e(new m11(xq4Var, rq7Var, n31Var, n94Var, 7), e.a());
        return rq7Var;
    }

    public static void s0(xq4 xq4Var, hq4 hq4Var, int i, bq7 bq7Var) {
        try {
            gq4 gq4Var = hq4Var.d;
            vy2.t(gq4Var);
            gq4Var.f(i, bq7Var);
            xq4Var.c.a(true, true);
        } catch (RemoteException e) {
            wn5.l0("MediaSessionStub", "Failed to send result to controller " + hq4Var, e);
        }
    }

    public static qs3 t0(n31 n31Var) {
        return new qs3(9, new qs3(10, n31Var));
    }

    @Override // defpackage.xf3
    public final void A(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 11, t0(new sr4(4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xf3
    public final void C(qf3 qf3Var, int i, IBinder iBinder, boolean z) {
        if (qf3Var == null || iBinder == null) {
            return;
        }
        try {
            ImmutableList immutableListA = zh0.a(iBinder);
            lj3 lj3VarM = ImmutableList.m();
            for (int i2 = 0; i2 < immutableListA.size(); i2++) {
                Bundle bundle = (Bundle) immutableListA.get(i2);
                bundle.getClass();
                lj3VarM.O(jp4.b(bundle));
            }
            int i3 = 3;
            q0(qf3Var, i, 20, new bs4(new ur4(new nk3(i3, lj3VarM.S(), z), new sr4(22), i3), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.xf3
    public final void D(qf3 qf3Var, int i, int i2) {
        if (qf3Var == null || i2 < 0) {
            return;
        }
        q0(qf3Var, i, 20, new qs3(9, new tr4(this, i2, 4)));
    }

    @Override // defpackage.xf3
    public final void G(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 9, t0(new sr4(9)));
    }

    @Override // defpackage.xf3
    public final void H(qf3 qf3Var, int i, int i2, long j) {
        if (qf3Var == null || i2 < 0) {
            return;
        }
        q0(qf3Var, i, 10, new qs3(9, new zc1(i2, j, this)));
    }

    @Override // defpackage.xf3
    public final void K(qf3 qf3Var, int i) {
        if (qf3Var == null) {
            return;
        }
        q0(qf3Var, i, 4, t0(new sr4(18)));
    }

    public final void L(qf3 qf3Var, hq4 hq4Var) {
        if (qf3Var == null) {
            z67.f(qf3Var);
            return;
        }
        xq4 xq4Var = (xq4) this.n.get();
        if (xq4Var == null || xq4Var.j()) {
            z67.f(qf3Var);
        } else {
            this.p.add(hq4Var);
            j29.a0(xq4Var.l, new m11(this, hq4Var, xq4Var, qf3Var, 6));
        }
    }

    @Override // defpackage.xf3
    public final void R(qf3 qf3Var, int i, final long j) {
        if (qf3Var == null) {
            return;
        }
        q0(qf3Var, i, 5, t0(new n31() { // from class: yr4
            @Override // defpackage.n31
            public final void accept(Object obj) {
                ((qg6) obj).x(j);
            }
        }));
    }

    @Override // defpackage.xf3
    public final void S(qf3 qf3Var, int i) {
        if (qf3Var == null) {
            return;
        }
        q0(qf3Var, i, 2, t0(new sr4(17)));
    }

    @Override // defpackage.xf3
    public final void T(qf3 qf3Var, int i, boolean z) {
        if (qf3Var == null) {
            return;
        }
        q0(qf3Var, i, 1, t0(new x52(3, z)));
    }

    @Override // defpackage.xf3
    public final void U(qf3 qf3Var, int i) {
        if (qf3Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            xq4 xq4Var = (xq4) this.n.get();
            if (xq4Var != null && !xq4Var.j()) {
                j29.a0(xq4Var.l, new lo4(this, qf3Var, 13));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.xf3
    public final void Y(qf3 qf3Var, int i, Surface surface) {
        if (qf3Var == null) {
            return;
        }
        q0(qf3Var, i, 27, t0(new qs3(8, surface)));
    }

    @Override // defpackage.xf3
    public final void Z(qf3 qf3Var, int i, Bundle bundle) {
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            v11 v11VarA = v11.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = v11VarA.d;
            }
            try {
                jr4 jr4Var = new jr4(v11VarA.c, callingPid, callingUid);
                xq4 xq4Var = (xq4) this.n.get();
                boolean z = xq4Var != null && mr4.a(xq4Var.f).b(jr4Var);
                int i2 = v11VarA.a;
                int i3 = v11VarA.b;
                L(qf3Var, new hq4(jr4Var, i2, i3, z, new es4(qf3Var, i3), v11VarA.e));
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.xf3
    public final void a0(qf3 qf3Var, int i, Bundle bundle, boolean z) {
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            q0(qf3Var, i, 31, new bs4(new ur4(new nk3(1, jp4.b(bundle), z), new sr4(22), 3), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.xf3
    public final void b0(qf3 qf3Var) {
        if (qf3Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            xq4 xq4Var = (xq4) this.n.get();
            if (xq4Var != null && !xq4Var.j()) {
                hq4 hq4VarP = this.o.P(qf3Var.asBinder());
                if (hq4VarP != null) {
                    j29.a0(xq4Var.l, new lo4(this, hq4VarP, 14));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.xf3
    public final void c0(qf3 qf3Var, int i, Bundle bundle) {
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            q0(qf3Var, i, 13, t0(new zn4(new ua6(bundle.getFloat(ua6.e, 1.0f), bundle.getFloat(ua6.f, 1.0f)))));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // defpackage.xf3
    public final void d0(qf3 qf3Var, int i, Bundle bundle, Bundle bundle2) {
        if (qf3Var == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            wp7 wp7VarA = wp7.a(bundle);
            m0(qf3Var, i, wp7VarA, 0, new bs4(new ur4(wp7VarA, bundle2, 1), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.xf3
    public final void f0(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 7, t0(new sr4(5)));
    }

    @Override // defpackage.xf3
    public final void g0(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 3, t0(new sr4(15)));
    }

    @Override // defpackage.xf3
    public final void h0(qf3 qf3Var, int i, int i2) {
        if (qf3Var == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            q0(qf3Var, i, 15, t0(new u52(i2, 7)));
        }
    }

    @Override // defpackage.xf3
    public final void i0(qf3 qf3Var, int i, int i2, Bundle bundle) {
        if (qf3Var == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            q0(qf3Var, i, 20, new bs4(new ur4(new vr4(1, jp4.b(bundle)), new tr4(this, i2, 2), 4), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.xf3
    public final void j(qf3 qf3Var, int i, Bundle bundle) {
        o11 o11Var;
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            bq7 bq7VarA = bq7.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                vp7 vp7Var = this.o;
                IBinder iBinderAsBinder = qf3Var.asBinder();
                synchronized (vp7Var.b) {
                    try {
                        hq4 hq4VarP = vp7Var.P(iBinderAsBinder);
                        o11Var = hq4VarP != null ? (o11) ((wv) vp7Var.d).get(hq4VarP) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                eo5 eo5Var = o11Var != null ? o11Var.b : null;
                if (eo5Var == null) {
                    return;
                }
                eo5Var.e(i, bq7VarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.xf3
    public final void j0(qf3 qf3Var, int i, boolean z) {
        if (qf3Var == null) {
            return;
        }
        q0(qf3Var, i, 14, t0(new x52(5, z)));
    }

    @Override // defpackage.xf3
    public final void k(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 1, t0(new sr4(1)));
    }

    public final void m0(qf3 qf3Var, final int i, final wp7 wp7Var, final int i2, final hs4 hs4Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final xq4 xq4Var = (xq4) this.n.get();
            if (xq4Var != null && !xq4Var.j()) {
                final hq4 hq4VarP = this.o.P(qf3Var.asBinder());
                if (hq4VarP == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    j29.a0(xq4Var.l, new Runnable() { // from class: zr4
                        @Override // java.lang.Runnable
                        public final void run() {
                            vp7 vp7Var = this.a.o;
                            hq4 hq4Var = hq4VarP;
                            if (vp7Var.d0(hq4Var)) {
                                wp7 wp7Var2 = wp7Var;
                                xq4 xq4Var2 = xq4Var;
                                int i3 = i;
                                if (wp7Var2 != null) {
                                    if (!vp7Var.g0(hq4Var, wp7Var2)) {
                                        is4.s0(xq4Var2, hq4Var, i3, new bq7(-4));
                                        return;
                                    }
                                } else if (!vp7Var.f0(hq4Var, i2)) {
                                    is4.s0(xq4Var2, hq4Var, i3, new bq7(-4));
                                    return;
                                }
                                hs4Var.h(xq4Var2, hq4Var, i3);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.xf3
    public final void n(qf3 qf3Var, int i, Bundle bundle, long j) {
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            q0(qf3Var, i, 31, new bs4(new ur4(new dd1(j, jp4.b(bundle)), new sr4(22), 3), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final he6 n0(he6 he6Var) {
        ImmutableList immutableList = he6Var.D.a;
        lj3 lj3VarM = ImmutableList.m();
        i0 i0Var = new i0(4);
        for (int i = 0; i < immutableList.size(); i++) {
            qp8 qp8Var = (qp8) immutableList.get(i);
            yo8 yo8Var = qp8Var.b;
            String string = (String) this.q.get(yo8Var);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.r;
                this.r = i2 + 1;
                String str = j29.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(yo8Var.b);
                string = sb.toString();
            }
            i0Var.g(yo8Var, string);
            lj3VarM.O(new qp8(new yo8(string, qp8Var.b.d), qp8Var.c, qp8Var.d, qp8Var.e));
        }
        this.q = i0Var.b();
        he6 he6VarA = he6Var.a(new rp8(lj3VarM.S()));
        hp8 hp8Var = he6VarA.E;
        if (hp8Var.D.isEmpty()) {
            return he6VarA;
        }
        gp8 gp8VarC = hp8Var.a().c();
        zx8 it = hp8Var.D.values().iterator();
        while (it.hasNext()) {
            ep8 ep8Var = (ep8) it.next();
            yo8 yo8Var2 = ep8Var.a;
            String str2 = (String) this.q.get(yo8Var2);
            if (str2 != null) {
                gp8VarC.a(new ep8(new yo8(str2, yo8Var2.d), ep8Var.b));
            } else {
                gp8VarC.a(ep8Var);
            }
        }
        return he6VarA.l(gp8VarC.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        final boolean z;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i) {
            case 3002:
                s(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                qf3 qf3VarL = so4.L(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                if (qf3VarL != null && i4 >= 0) {
                    q0(qf3VarL, i3, 25, t0(new u52(i4, 8)));
                }
                return true;
            case 3004:
                qf3 qf3VarL2 = so4.L(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                if (qf3VarL2 != null) {
                    q0(qf3VarL2, i5, 26, t0(new sr4(3)));
                }
                return true;
            case 3005:
                qf3 qf3VarL3 = so4.L(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                if (qf3VarL3 != null) {
                    q0(qf3VarL3, i6, 26, t0(new sr4(12)));
                }
                return true;
            case 3006:
                qf3 qf3VarL4 = so4.L(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                z = parcel.readInt() != 0;
                if (qf3VarL4 != null) {
                    q0(qf3VarL4, i7, 26, t0(new x52(4, z)));
                }
                return true;
            case 3007:
                a0(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                n(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                a0(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                C(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                C(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                r(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                T(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                j(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                Z(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                qf3 qf3VarL5 = so4.L(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                d0(qf3VarL5, i8, (Bundle) xq2.h(parcel, creator), (Bundle) xq2.h(parcel, creator));
                return true;
            case 3017:
                h0(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                j0(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                D(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                qf3 qf3VarL6 = so4.L(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                if (qf3VarL6 != null && i10 >= 0 && i11 >= i10) {
                    q0(qf3VarL6, i9, 20, new qs3(9, new rr4(this, i10, i11)));
                }
                return true;
            case 3021:
                qf3 qf3VarL7 = so4.L(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                if (qf3VarL7 != null) {
                    q0(qf3VarL7, i12, 20, t0(new sr4(20)));
                }
                return true;
            case 3022:
                qf3 qf3VarL8 = so4.L(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                if (qf3VarL8 != null && i14 >= 0 && i15 >= 0) {
                    q0(qf3VarL8, i13, 20, t0(new t52(i14, i15, 3)));
                }
                return true;
            case 3023:
                qf3 qf3VarL9 = so4.L(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                if (qf3VarL9 != null && i17 >= 0 && i18 >= i17 && i19 >= 0) {
                    q0(qf3VarL9, i16, 20, t0(new wr4(i17, i18, i19)));
                }
                return true;
            case 3024:
                p(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                k(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                S(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                c0(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                qf3 qf3VarL10 = so4.L(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                float f = parcel.readFloat();
                if (qf3VarL10 != null && f > 0.0f) {
                    q0(qf3VarL10, i20, 13, t0(new s52(2, f)));
                }
                return true;
            case 3029:
                z(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3030:
                x(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                qf3 qf3VarL11 = so4.L(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (qf3VarL11 != null && strongBinder != null) {
                    try {
                        ImmutableList immutableListA = zh0.a(strongBinder);
                        lj3 lj3VarM = ImmutableList.m();
                        for (int i22 = 0; i22 < immutableListA.size(); i22++) {
                            Bundle bundle = (Bundle) immutableListA.get(i22);
                            bundle.getClass();
                            lj3VarM.O(jp4.b(bundle));
                        }
                        q0(qf3VarL11, i21, 20, new bs4(new ur4(new a62(lj3VarM.S(), 2), new sr4(11), 4), 1));
                    } catch (RuntimeException e) {
                        wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    }
                }
                return true;
            case 3032:
                qf3 qf3VarL12 = so4.L(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                int i24 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (qf3VarL12 != null && strongBinder2 != null && i24 >= 0) {
                    try {
                        ImmutableList immutableListA2 = zh0.a(strongBinder2);
                        lj3 lj3VarM2 = ImmutableList.m();
                        for (int i25 = 0; i25 < immutableListA2.size(); i25++) {
                            Bundle bundle2 = (Bundle) immutableListA2.get(i25);
                            bundle2.getClass();
                            lj3VarM2.O(jp4.b(bundle2));
                        }
                        q0(qf3VarL12, i23, 20, new bs4(new ur4(new a62(lj3VarM2.S(), 1), new tr4(this, i24, 3), 4), 1));
                    } catch (RuntimeException e2) {
                        wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    }
                }
                return true;
            case 3033:
                qf3 qf3VarL13 = so4.L(parcel.readStrongBinder());
                int i26 = parcel.readInt();
                Bundle bundle3 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                if (qf3VarL13 != null && bundle3 != null) {
                    try {
                        q0(qf3VarL13, i26, 19, t0(new q52(qp4.b(bundle3))));
                    } catch (RuntimeException e3) {
                        wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e3);
                    }
                }
                return true;
            case 3034:
                g0(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                U(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                K(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                qf3 qf3VarL14 = so4.L(parcel.readStrongBinder());
                int i27 = parcel.readInt();
                int i28 = parcel.readInt();
                if (qf3VarL14 != null && i28 >= 0) {
                    q0(qf3VarL14, i27, 10, new qs3(9, new tr4(this, i28, 0)));
                }
                return true;
            case 3038:
                R(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                H(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                A(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                v(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                qf3 qf3VarL15 = so4.L(parcel.readStrongBinder());
                int i29 = parcel.readInt();
                if (qf3VarL15 != null) {
                    q0(qf3VarL15, i29, 6, t0(new sr4(6)));
                }
                return true;
            case 3043:
                qf3 qf3VarL16 = so4.L(parcel.readStrongBinder());
                int i30 = parcel.readInt();
                if (qf3VarL16 != null) {
                    q0(qf3VarL16, i30, 8, t0(new sr4(2)));
                }
                return true;
            case 3044:
                Y(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Surface) xq2.h(parcel, Surface.CREATOR));
                return true;
            case 3045:
                b0(so4.L(parcel.readStrongBinder()));
                return true;
            case 3046:
                f0(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                G(so4.L(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                u(so4.L(parcel.readStrongBinder()), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                qf3 qf3VarL17 = so4.L(parcel.readStrongBinder());
                int i31 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle4 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                if (qf3VarL17 != null && string != null && bundle4 != null) {
                    if (TextUtils.isEmpty(string)) {
                        wn5.k0("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            m0(qf3VarL17, i31, null, 40010, new bs4(new sr4(string, fv6.a(bundle4)), 1));
                        } catch (RuntimeException e4) {
                            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e4);
                        }
                    }
                }
                return true;
            case 3050:
                qf3 qf3VarL18 = so4.L(parcel.readStrongBinder());
                int i32 = parcel.readInt();
                Bundle bundle5 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                if (qf3VarL18 != null && bundle5 != null) {
                    try {
                        m0(qf3VarL18, i32, null, 40010, new bs4(new sr4(fv6.a(bundle5)), 1));
                    } catch (RuntimeException e5) {
                        wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e5);
                    }
                }
                return true;
            case 3051:
                qf3 qf3VarL19 = so4.L(parcel.readStrongBinder());
                int i33 = parcel.readInt();
                int i34 = parcel.readInt();
                int i35 = parcel.readInt();
                if (qf3VarL19 != null && i34 >= 0) {
                    q0(qf3VarL19, i33, 33, t0(new t52(i34, i35, 2)));
                }
                return true;
            case 3052:
                qf3 qf3VarL20 = so4.L(parcel.readStrongBinder());
                int i36 = parcel.readInt();
                int i37 = parcel.readInt();
                if (qf3VarL20 != null) {
                    q0(qf3VarL20, i36, 34, t0(new u52(i37, 6)));
                }
                return true;
            case 3053:
                qf3 qf3VarL21 = so4.L(parcel.readStrongBinder());
                int i38 = parcel.readInt();
                int i39 = parcel.readInt();
                if (qf3VarL21 != null) {
                    q0(qf3VarL21, i38, 34, t0(new u52(i39, 5)));
                }
                return true;
            case 3054:
                qf3 qf3VarL22 = so4.L(parcel.readStrongBinder());
                int i40 = parcel.readInt();
                z = parcel.readInt() != 0;
                final int i41 = parcel.readInt();
                if (qf3VarL22 != null) {
                    q0(qf3VarL22, i40, 34, t0(new n31() { // from class: xr4
                        @Override // defpackage.n31
                        public final void accept(Object obj) {
                            ((qg6) obj).G0(i41, z);
                        }
                    }));
                }
                return true;
            case 3055:
                i0(so4.L(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) xq2.h(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                qf3 qf3VarL23 = so4.L(parcel.readStrongBinder());
                int i42 = parcel.readInt();
                int i43 = parcel.readInt();
                int i44 = parcel.readInt();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (qf3VarL23 != null && strongBinder3 != null && i43 >= 0 && i44 >= i43) {
                    try {
                        ImmutableList immutableListA3 = zh0.a(strongBinder3);
                        lj3 lj3VarM3 = ImmutableList.m();
                        for (int i45 = 0; i45 < immutableListA3.size(); i45++) {
                            Bundle bundle6 = (Bundle) immutableListA3.get(i45);
                            bundle6.getClass();
                            lj3VarM3.O(jp4.b(bundle6));
                        }
                        q0(qf3VarL23, i42, 20, new bs4(new ur4(new qs3(7, lj3VarM3.S()), new rr4(this, i43, i44), 4), 1));
                    } catch (RuntimeException e6) {
                        wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                    }
                }
                return true;
            case 3057:
                qf3 qf3VarL24 = so4.L(parcel.readStrongBinder());
                int i46 = parcel.readInt();
                Bundle bundle7 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                z = parcel.readInt() != 0;
                if (qf3VarL24 != null && bundle7 != null) {
                    try {
                        q0(qf3VarL24, i46, 35, t0(new nk3(2, ly.a(bundle7), z)));
                    } catch (RuntimeException e7) {
                        wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e7);
                    }
                }
                return true;
            default:
                switch (i) {
                    case 4001:
                        qf3 qf3VarL25 = so4.L(parcel.readStrongBinder());
                        int i47 = parcel.readInt();
                        Bundle bundle8 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                        if (qf3VarL25 != null) {
                            if (bundle8 == null) {
                                m0(qf3VarL25, i47, null, 50000, new bs4(new sr4(16), 0));
                            } else {
                                try {
                                    mp4.a(bundle8);
                                    m0(qf3VarL25, i47, null, 50000, new bs4(new sr4(16), 0));
                                } catch (RuntimeException e8) {
                                    wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                }
                            }
                        }
                        return true;
                    case 4002:
                        qf3 qf3VarL26 = so4.L(parcel.readStrongBinder());
                        int i48 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (qf3VarL26 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                wn5.k0("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            m0(qf3VarL26, i48, null, 50004, new bs4(new sr4(7), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        qf3 qf3VarL27 = so4.L(parcel.readStrongBinder());
                        int i49 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i50 = parcel.readInt();
                        int i51 = parcel.readInt();
                        Bundle bundle9 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                        if (qf3VarL27 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                wn5.k0("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i50 < 0) {
                                wn5.k0("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i51 < 1) {
                                wn5.k0("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else if (bundle9 == null) {
                                int i52 = 0;
                                m0(qf3VarL27, i49, null, 50003, new bs4(new sr4(i52), i52));
                            } else {
                                try {
                                    mp4.a(bundle9);
                                    int i522 = 0;
                                    m0(qf3VarL27, i49, null, 50003, new bs4(new sr4(i522), i522));
                                } catch (RuntimeException e9) {
                                    wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e9);
                                }
                            }
                        }
                        return true;
                    case 4004:
                        qf3 qf3VarL28 = so4.L(parcel.readStrongBinder());
                        int i53 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle10 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                        if (qf3VarL28 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                wn5.k0("MediaSessionStub", "search(): Ignoring empty query");
                            } else if (bundle10 == null) {
                                m0(qf3VarL28, i53, null, 50005, new bs4(new sr4(21), 0));
                            } else {
                                try {
                                    mp4.a(bundle10);
                                    m0(qf3VarL28, i53, null, 50005, new bs4(new sr4(21), 0));
                                } catch (RuntimeException e10) {
                                    wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                                }
                            }
                        }
                        return true;
                    case 4005:
                        qf3 qf3VarL29 = so4.L(parcel.readStrongBinder());
                        int i54 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i55 = parcel.readInt();
                        int i56 = parcel.readInt();
                        Bundle bundle11 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                        if (qf3VarL29 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                wn5.k0("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i55 < 0) {
                                wn5.k0("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i56 < 1) {
                                wn5.k0("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else if (bundle11 == null) {
                                m0(qf3VarL29, i54, null, 50006, new bs4(new sr4(14), 0));
                            } else {
                                try {
                                    mp4.a(bundle11);
                                    m0(qf3VarL29, i54, null, 50006, new bs4(new sr4(14), 0));
                                } catch (RuntimeException e11) {
                                    wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                }
                            }
                        }
                        return true;
                    case 4006:
                        qf3 qf3VarL30 = so4.L(parcel.readStrongBinder());
                        int i57 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle12 = (Bundle) xq2.h(parcel, Bundle.CREATOR);
                        if (qf3VarL30 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                wn5.k0("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else if (bundle12 == null) {
                                m0(qf3VarL30, i57, null, 50001, new bs4(new sr4(19), 0));
                            } else {
                                try {
                                    mp4.a(bundle12);
                                    m0(qf3VarL30, i57, null, 50001, new bs4(new sr4(19), 0));
                                } catch (RuntimeException e12) {
                                    wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                }
                            }
                        }
                        return true;
                    case 4007:
                        qf3 qf3VarL31 = so4.L(parcel.readStrongBinder());
                        int i58 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (qf3VarL31 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                wn5.k0("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            m0(qf3VarL31, i58, null, 50002, new bs4(new vj3(29), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.xf3
    public final void p(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 1, t0(new ur4(this, hq4VarP, 2)));
    }

    public final int p0(hq4 hq4Var, qg6 qg6Var, int i) {
        if (qg6Var.f0(17)) {
            vp7 vp7Var = this.o;
            if (!vp7Var.e0(hq4Var, 17) && vp7Var.e0(hq4Var, 16)) {
                return qg6Var.M() + i;
            }
        }
        return i;
    }

    public final void q0(qf3 qf3Var, int i, int i2, hs4 hs4Var) {
        hq4 hq4VarP = this.o.P(qf3Var.asBinder());
        if (hq4VarP != null) {
            r0(hq4VarP, i, i2, hs4Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xf3
    public final void r(qf3 qf3Var, int i, IBinder iBinder, int i2, long j) {
        if (qf3Var == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                ImmutableList immutableListA = zh0.a(iBinder);
                lj3 lj3VarM = ImmutableList.m();
                for (int i3 = 0; i3 < immutableListA.size(); i3++) {
                    Bundle bundle = (Bundle) immutableListA.get(i3);
                    bundle.getClass();
                    lj3VarM.O(jp4.b(bundle));
                }
                q0(qf3Var, i, 20, new bs4(new ur4(new zc1(i2, j, lj3VarM.S()), new sr4(22), 3), 1));
            } catch (RuntimeException e) {
                wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void r0(final hq4 hq4Var, final int i, final int i2, final hs4 hs4Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final xq4 xq4Var = (xq4) this.n.get();
            if (xq4Var != null && !xq4Var.j()) {
                j29.a0(xq4Var.l, new Runnable() { // from class: as4
                    @Override // java.lang.Runnable
                    public final void run() {
                        vp7 vp7Var = this.a.o;
                        final hq4 hq4Var2 = hq4Var;
                        int i3 = i2;
                        boolean zE0 = vp7Var.e0(hq4Var2, i3);
                        final xq4 xq4Var2 = xq4Var;
                        final int i4 = i;
                        if (!zE0) {
                            is4.s0(xq4Var2, hq4Var2, i4, new bq7(-4));
                            return;
                        }
                        ol3 ol3Var = xq4Var2.e;
                        xq4Var2.t(hq4Var2);
                        ol3Var.getClass();
                        final hs4 hs4Var2 = hs4Var;
                        if (i3 != 27) {
                            vp7Var.q(hq4Var2, i3, new n11() { // from class: ds4
                                @Override // defpackage.n11
                                public final n94 run() {
                                    return (n94) hs4Var2.h(xq4Var2, hq4Var2, i4);
                                }
                            });
                        } else {
                            hs4Var2.h(xq4Var2, hq4Var2, i4);
                            vp7Var.q(hq4Var2, i3, new cs4());
                        }
                    }
                });
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.xf3
    public final void s(qf3 qf3Var, int i, float f) {
        if (qf3Var == null || f < 0.0f || f > 1.0f) {
            return;
        }
        q0(qf3Var, i, 24, t0(new s52(3, f)));
    }

    @Override // defpackage.xf3
    public final void u(qf3 qf3Var, int i, Bundle bundle) {
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            q0(qf3Var, i, 29, t0(new ur4(this, hp8.b(bundle), 0)));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // defpackage.xf3
    public final void v(qf3 qf3Var, int i) {
        hq4 hq4VarP;
        if (qf3Var == null || (hq4VarP = this.o.P(qf3Var.asBinder())) == null) {
            return;
        }
        r0(hq4VarP, i, 12, t0(new sr4(8)));
    }

    @Override // defpackage.xf3
    public final void x(qf3 qf3Var, int i, int i2, Bundle bundle) {
        if (qf3Var == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            q0(qf3Var, i, 20, new bs4(new ur4(new vr4(0, jp4.b(bundle)), new tr4(this, i2, 1), 4), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.xf3
    public final void z(qf3 qf3Var, int i, Bundle bundle) {
        if (qf3Var == null || bundle == null) {
            return;
        }
        try {
            q0(qf3Var, i, 20, new bs4(new ur4(new vr4(2, jp4.b(bundle)), new sr4(13), 4), 1));
        } catch (RuntimeException e) {
            wn5.l0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
