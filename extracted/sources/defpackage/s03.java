package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s03 implements pc7 {
    public final int a;
    public final x03 b;
    public int c = -1;

    public s03(x03 x03Var, int i) {
        this.b = x03Var;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.vy2.j(r0)
            x03 r0 = r6.b
            r0.w()
            int[] r3 = r0.K
            r3.getClass()
            int[] r3 = r0.K
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.J
            zo8 r0 = r0.I
            yo8 r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.N
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s03.a():void");
    }

    @Override // defpackage.pc7
    public final boolean b() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.c;
        x03 x03Var = this.b;
        return !x03Var.E() && x03Var.v[i].u(x03Var.T);
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.pc7
    public final void f() throws IOException {
        int i = this.c;
        x03 x03Var = this.b;
        if (i == -2) {
            x03Var.w();
            throw new SampleQueueMappingException(o40.y("Unable to bind a sample queue to TrackGroup with MIME type ", x03Var.I.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            x03Var.G();
            return;
        }
        if (i != -3) {
            x03Var.G();
            w03 w03Var = x03Var.v[i];
            pw1 pw1Var = w03Var.h;
            if (pw1Var == null || pw1Var.getState() != 1) {
                return;
            }
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = w03Var.h.f();
            drmSession$DrmSessionExceptionF.getClass();
            throw drmSession$DrmSessionExceptionF;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // defpackage.pc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 == 0) goto L5e
            int r0 = r4.c
            x03 r1 = r4.b
            boolean r2 = r1.E()
            if (r2 == 0) goto L11
            goto L5e
        L11:
            w03[] r2 = r1.v
            r2 = r2[r0]
            boolean r3 = r1.T
            int r5 = r2.s(r5, r3)
            java.util.ArrayList r6 = r1.n
            if (r6 == 0) goto L2c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L42
        L26:
            r1 = 1
            java.lang.Object r6 = defpackage.o40.u(r1, r6)
            goto L43
        L2c:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L42
        L36:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L36
            r6 = r1
            goto L43
        L42:
            r6 = 0
        L43:
            zz2 r6 = (defpackage.zz2) r6
            if (r6 == 0) goto L5a
            boolean r1 = r6.f()
            if (r1 != 0) goto L5a
            int r1 = r2.q()
            int r6 = r6.e(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5a:
            r2.D(r5)
            return r5
        L5e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s03.g(long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (((defpackage.zz2) r6.get(0)).f() == false) goto L59;
     */
    @Override // defpackage.pc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(defpackage.hh2 r20, defpackage.fc1 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s03.h(hh2, fc1, int):int");
    }
}
