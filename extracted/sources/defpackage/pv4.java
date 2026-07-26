package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pv4 extends v80 implements Handler.Callback {
    public jv4 A;
    public long B;
    public final hy2 s;
    public final b62 t;
    public final Handler u;
    public final mv4 v;
    public lb7 w;
    public boolean x;
    public boolean y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv4(b62 b62Var, Looper looper) {
        Handler handler;
        super(5);
        hy2 hy2Var = hy2.n;
        this.t = b62Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = j29.a;
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.s = hy2Var;
        this.v = new mv4(1);
        this.B = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.jv4 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            iv4[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            androidx.media3.common.b r2 = r2.a()
            if (r2 == 0) goto L3e
            hy2 r3 = r5.s
            boolean r4 = r3.u(r2)
            if (r4 == 0) goto L3e
            lb7 r2 = r3.q(r2)
            r1 = r1[r0]
            byte[] r1 = r1.c()
            r1.getClass()
            mv4 r3 = r5.v
            r3.f()
            int r4 = r1.length
            r3.i(r4)
            java.nio.ByteBuffer r4 = r3.e
            r4.put(r1)
            r3.j()
            jv4 r1 = r2.b(r3)
            if (r1 == 0) goto L43
            r5.B(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv4.B(jv4, java.util.ArrayList):void");
    }

    public final long C(long j) {
        vy2.s(j != -9223372036854775807L);
        vy2.s(this.B != -9223372036854775807L);
        return j - this.B;
    }

    public final void D(jv4 jv4Var) {
        b62 b62Var = this.t;
        e62 e62Var = b62Var.a;
        qp4 qp4Var = e62Var.j0;
        t94 t94Var = e62Var.m;
        pp4 pp4VarA = qp4Var.a();
        int i = 0;
        while (true) {
            iv4[] iv4VarArr = jv4Var.a;
            if (i >= iv4VarArr.length) {
                break;
            }
            iv4VarArr[i].b(pp4VarA);
            i++;
        }
        e62Var.j0 = new qp4(pp4VarA);
        qp4 qp4VarY0 = e62Var.y0();
        if (!qp4VarY0.equals(e62Var.P)) {
            e62Var.P = qp4VarY0;
            t94Var.c(14, new v4(21, b62Var));
        }
        t94Var.c(28, new v4(22, jv4Var));
        t94Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        D((jv4) message.obj);
        return true;
    }

    @Override // defpackage.v80
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // defpackage.v80
    public final boolean l() {
        return this.y;
    }

    @Override // defpackage.v80
    public final boolean m() {
        return true;
    }

    @Override // defpackage.v80
    public final void n() {
        this.A = null;
        this.w = null;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.v80
    public final void p(long j, boolean z) {
        this.A = null;
        this.x = false;
        this.y = false;
    }

    @Override // defpackage.v80
    public final void u(b[] bVarArr, long j, long j2, ks4 ks4Var) {
        this.w = this.s.q(bVarArr[0]);
        jv4 jv4Var = this.A;
        if (jv4Var != null) {
            long j3 = jv4Var.b;
            long j4 = (this.B + j3) - j2;
            if (j3 != j4) {
                jv4Var = new jv4(j4, jv4Var.a);
            }
            this.A = jv4Var;
        }
        this.B = j2;
    }

    @Override // defpackage.v80
    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.x && this.A == null) {
                mv4 mv4Var = this.v;
                mv4Var.f();
                hh2 hh2Var = this.c;
                hh2Var.g();
                int iV = v(hh2Var, mv4Var, 0);
                if (iV == -4) {
                    if (mv4Var.d(4)) {
                        this.x = true;
                    } else if (mv4Var.g >= this.l) {
                        mv4Var.j = this.z;
                        mv4Var.j();
                        lb7 lb7Var = this.w;
                        String str = j29.a;
                        jv4 jv4VarB = lb7Var.b(mv4Var);
                        if (jv4VarB != null) {
                            ArrayList arrayList = new ArrayList(jv4VarB.a.length);
                            B(jv4VarB, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.A = new jv4(C(mv4Var.g), (iv4[]) arrayList.toArray(new iv4[0]));
                            }
                        }
                    }
                } else if (iV == -5) {
                    b bVar = (b) hh2Var.c;
                    bVar.getClass();
                    this.z = bVar.s;
                }
            }
            jv4 jv4Var = this.A;
            if (jv4Var == null || jv4Var.b > C(j)) {
                z = false;
            } else {
                jv4 jv4Var2 = this.A;
                Handler handler = this.u;
                if (handler != null) {
                    handler.obtainMessage(1, jv4Var2).sendToTarget();
                } else {
                    D(jv4Var2);
                }
                this.A = null;
                z = true;
            }
            if (this.x && this.A == null) {
                this.y = true;
            }
        }
    }

    @Override // defpackage.v80
    public final int z(b bVar) {
        if (this.s.u(bVar)) {
            return bl4.k(bVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return bl4.k(0, 0, 0, 0);
    }
}
