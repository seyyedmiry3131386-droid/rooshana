package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.b;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aj8 extends v80 implements Handler.Callback {
    public do0 A;
    public do0 B;
    public int C;
    public final Handler D;
    public final b62 E;
    public final hh2 F;
    public boolean G;
    public boolean H;
    public b I;
    public long J;
    public long K;
    public final fv s;
    public final fc1 t;
    public n81 u;
    public final va8 v;
    public boolean w;
    public int x;
    public ua8 y;
    public ya8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj8(b62 b62Var, Looper looper) {
        Handler handler;
        super(3);
        hl5 hl5Var = va8.l0;
        this.E = b62Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = j29.a;
            handler = new Handler(looper, this);
        }
        this.D = handler;
        this.v = hl5Var;
        this.s = new fv(10);
        this.t = new fc1(1);
        this.F = new hh2((char) 0, 1);
        this.K = -9223372036854775807L;
        this.J = -9223372036854775807L;
    }

    public final void B() {
        vy2.r("Legacy decoding is disabled, can't handle " + this.I.n + " samples (expected application/x-media3-cues).", Objects.equals(this.I.n, "application/cea-608") || Objects.equals(this.I.n, "application/x-mp4-cea-608") || Objects.equals(this.I.n, "application/cea-708"));
    }

    public final void C() {
        m81 m81Var = new m81(E(this.J), ImmutableList.q());
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, m81Var).sendToTarget();
        } else {
            G(m81Var);
        }
    }

    public final long D() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        this.A.getClass();
        if (this.C >= this.A.k()) {
            return Long.MAX_VALUE;
        }
        return this.A.e(this.C);
    }

    public final long E(long j) {
        vy2.s(j != -9223372036854775807L);
        return j - this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r7 = this;
            r0 = 1
            r7.w = r0
            androidx.media3.common.b r1 = r7.I
            r1.getClass()
            va8 r2 = r7.v
            hl5 r2 = (defpackage.hl5) r2
            java.lang.Object r2 = r2.b
            av r2 = (defpackage.av) r2
            java.lang.String r3 = r1.n
            int r4 = r1.K
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r6
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            bo0 r0 = new bo0
            java.util.List r1 = r1.q
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            xn0 r0 = new xn0
            r0.<init>(r3, r4)
            goto L6d
        L50:
            boolean r0 = r2.r(r1)
            if (r0 == 0) goto L75
            cb8 r0 = r2.p(r1)
            dj1 r1 = new dj1
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.y = r0
            long r1 = r7.l
            r0.b(r1)
            return
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = defpackage.dw1.n(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj8.F():void");
    }

    public final void G(m81 m81Var) {
        ImmutableList immutableList = m81Var.a;
        b62 b62Var = this.E;
        b62Var.a.m.f(27, new a62(immutableList, 0));
        e62 e62Var = b62Var.a;
        e62Var.c0 = m81Var;
        e62Var.m.f(27, new v4(20, m81Var));
    }

    public final void H() {
        this.z = null;
        this.C = -1;
        do0 do0Var = this.A;
        if (do0Var != null) {
            do0Var.g();
            this.A = null;
        }
        do0 do0Var2 = this.B;
        if (do0Var2 != null) {
            do0Var2.g();
            this.B = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        G((m81) message.obj);
        return true;
    }

    @Override // defpackage.v80
    public final String j() {
        return "TextRenderer";
    }

    @Override // defpackage.v80
    public final boolean l() {
        return this.H;
    }

    @Override // defpackage.v80
    public final boolean m() {
        b bVar = this.I;
        if (bVar != null) {
            if (Objects.equals(bVar.n, "application/x-media3-cues")) {
                n81 n81Var = this.u;
                n81Var.getClass();
                if (n81Var.a(this.J) == Long.MIN_VALUE) {
                    try {
                        pc7 pc7Var = this.i;
                        pc7Var.getClass();
                        pc7Var.f();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.H) {
                    return false;
                }
                if (this.G) {
                    do0 do0Var = this.A;
                    long j = this.J;
                    if (do0Var == null || do0Var.k() <= 0 || do0Var.e(do0Var.k() - 1) <= j) {
                        do0 do0Var2 = this.B;
                        long j2 = this.J;
                        if ((do0Var2 == null || do0Var2.k() <= 0 || do0Var2.e(do0Var2.k() - 1) <= j2) && this.z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.v80
    public final void n() {
        this.I = null;
        this.K = -9223372036854775807L;
        C();
        this.J = -9223372036854775807L;
        if (this.y != null) {
            H();
            ua8 ua8Var = this.y;
            ua8Var.getClass();
            ua8Var.a();
            this.y = null;
            this.x = 0;
        }
    }

    @Override // defpackage.v80
    public final void p(long j, boolean z) {
        this.J = j;
        n81 n81Var = this.u;
        if (n81Var != null) {
            n81Var.clear();
        }
        C();
        this.G = false;
        this.H = false;
        this.K = -9223372036854775807L;
        b bVar = this.I;
        if (bVar == null || Objects.equals(bVar.n, "application/x-media3-cues")) {
            return;
        }
        if (this.x == 0) {
            H();
            ua8 ua8Var = this.y;
            ua8Var.getClass();
            ua8Var.flush();
            ua8Var.b(this.l);
            return;
        }
        H();
        ua8 ua8Var2 = this.y;
        ua8Var2.getClass();
        ua8Var2.a();
        this.y = null;
        this.x = 0;
        F();
    }

    @Override // defpackage.v80
    public final void u(b[] bVarArr, long j, long j2, ks4 ks4Var) {
        b bVar = bVarArr[0];
        this.I = bVar;
        if (Objects.equals(bVar.n, "application/x-media3-cues")) {
            this.u = this.I.L == 1 ? new ou4() : new vo4(8);
            return;
        }
        B();
        if (this.y != null) {
            this.x = 1;
        } else {
            F();
        }
    }

    @Override // defpackage.v80
    public final void w(long j, long j2) {
        boolean z;
        hh2 hh2Var;
        boolean z2;
        long jE;
        if (this.n) {
            long j3 = this.K;
            if (j3 != -9223372036854775807L && j >= j3) {
                H();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        b bVar = this.I;
        bVar.getClass();
        boolean zEquals = Objects.equals(bVar.n, "application/x-media3-cues");
        Handler handler = this.D;
        hh2 hh2Var2 = this.F;
        boolean zD = false;
        zD = false;
        zD = false;
        if (zEquals) {
            this.u.getClass();
            if (!this.G) {
                fc1 fc1Var = this.t;
                if (v(hh2Var2, fc1Var, 0) == -4) {
                    if (fc1Var.d(4)) {
                        this.G = true;
                    } else {
                        fc1Var.j();
                        ByteBuffer byteBuffer = fc1Var.e;
                        byteBuffer.getClass();
                        long j4 = fc1Var.g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.s.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME);
                        parcelableArrayList.getClass();
                        lj3 lj3VarM = ImmutableList.m();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            lj3VarM.O(l81.b(bundle2));
                        }
                        o81 o81Var = new o81(lj3VarM.S(), j4, bundle.getLong(ByteArrayResult.AppInfo.NAME_SERIALISED_NAME));
                        fc1Var.f();
                        zD = this.u.d(o81Var, j);
                    }
                }
            }
            long jA = this.u.a(this.J);
            if (jA == Long.MIN_VALUE && this.G && !zD) {
                this.H = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zD = true;
            }
            if (zD) {
                ImmutableList immutableListE = this.u.e(j);
                long jG = this.u.g(j);
                m81 m81Var = new m81(E(jG), immutableListE);
                if (handler != null) {
                    handler.obtainMessage(1, m81Var).sendToTarget();
                } else {
                    G(m81Var);
                }
                this.u.h(jG);
            }
            this.J = j;
            return;
        }
        B();
        this.J = j;
        if (this.B == null) {
            ua8 ua8Var = this.y;
            ua8Var.getClass();
            ua8Var.c(j);
            try {
                ua8 ua8Var2 = this.y;
                ua8Var2.getClass();
                this.B = (do0) ua8Var2.d();
            } catch (SubtitleDecoderException e) {
                wn5.H("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, e);
                C();
                H();
                ua8 ua8Var3 = this.y;
                ua8Var3.getClass();
                ua8Var3.a();
                this.y = null;
                this.x = 0;
                F();
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.A != null) {
            long jD = D();
            z = false;
            while (jD <= j) {
                this.C++;
                jD = D();
                z = true;
            }
        } else {
            z = false;
        }
        do0 do0Var = this.B;
        if (do0Var == null) {
            hh2Var = hh2Var2;
            z2 = z;
        } else if (do0Var.d(4)) {
            if (!z && D() == Long.MAX_VALUE) {
                if (this.x == 2) {
                    H();
                    ua8 ua8Var4 = this.y;
                    ua8Var4.getClass();
                    ua8Var4.a();
                    this.y = null;
                    this.x = 0;
                    F();
                } else {
                    H();
                    this.H = true;
                }
            }
            hh2Var = hh2Var2;
            z2 = z;
        } else {
            hh2Var = hh2Var2;
            z2 = z;
            if (do0Var.c <= j) {
                do0 do0Var2 = this.A;
                if (do0Var2 != null) {
                    do0Var2.g();
                }
                this.C = do0Var.a(j);
                this.A = do0Var;
                this.B = null;
                z2 = true;
            }
        }
        if (z2) {
            this.A.getClass();
            int iA = this.A.a(j);
            if (iA == 0 || this.A.k() == 0) {
                jE = this.A.c;
            } else if (iA == -1) {
                do0 do0Var3 = this.A;
                jE = do0Var3.e(do0Var3.k() - 1);
            } else {
                jE = this.A.e(iA - 1);
            }
            m81 m81Var2 = new m81(E(jE), this.A.h(j));
            if (handler != null) {
                handler.obtainMessage(1, m81Var2).sendToTarget();
            } else {
                G(m81Var2);
            }
        }
        if (this.x == 2) {
            return;
        }
        while (!this.G) {
            try {
                ya8 ya8Var = this.z;
                if (ya8Var == null) {
                    ua8 ua8Var5 = this.y;
                    ua8Var5.getClass();
                    ya8Var = (ya8) ua8Var5.e();
                    if (ya8Var == null) {
                        return;
                    } else {
                        this.z = ya8Var;
                    }
                }
                if (this.x == 1) {
                    ya8Var.b = 4;
                    ua8 ua8Var6 = this.y;
                    ua8Var6.getClass();
                    ua8Var6.f(ya8Var);
                    this.z = null;
                    this.x = 2;
                    return;
                }
                int iV = v(hh2Var, ya8Var, 0);
                if (iV == -4) {
                    if (ya8Var.d(4)) {
                        this.G = true;
                        this.w = false;
                    } else {
                        b bVar2 = (b) hh2Var.c;
                        if (bVar2 == null) {
                            return;
                        }
                        ya8Var.j = bVar2.s;
                        ya8Var.j();
                        this.w &= !ya8Var.d(1);
                    }
                    if (!this.w) {
                        ua8 ua8Var7 = this.y;
                        ua8Var7.getClass();
                        ua8Var7.f(ya8Var);
                        this.z = null;
                    }
                } else if (iV == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                wn5.H("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, e2);
                C();
                H();
                ua8 ua8Var8 = this.y;
                ua8Var8.getClass();
                ua8Var8.a();
                this.y = null;
                this.x = 0;
                F();
                return;
            }
        }
    }

    @Override // defpackage.v80
    public final int z(b bVar) {
        boolean zEquals = Objects.equals(bVar.n, "application/x-media3-cues");
        String str = bVar.n;
        if (!zEquals) {
            hl5 hl5Var = (hl5) this.v;
            hl5Var.getClass();
            if (!((av) hl5Var.b).r(bVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return tv4.k(str) ? bl4.k(1, 0, 0, 0) : bl4.k(0, 0, 0, 0);
            }
        }
        return bl4.k(bVar.O == 0 ? 4 : 2, 0, 0, 0);
    }
}
