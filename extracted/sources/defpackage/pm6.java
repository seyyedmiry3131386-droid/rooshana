package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class pm6 implements pc7 {
    public final int a;
    public final /* synthetic */ rm6 b;

    public pm6(rm6 rm6Var, int i) {
        this.b = rm6Var;
        this.a = i;
    }

    @Override // defpackage.pc7
    public final boolean b() {
        rm6 rm6Var = this.b;
        return !rm6Var.G() && rm6Var.u[this.a].u(rm6Var.O);
    }

    @Override // defpackage.pc7
    public final void f() throws IOException {
        int i = this.a;
        rm6 rm6Var = this.b;
        oc7 oc7Var = rm6Var.u[i];
        pw1 pw1Var = oc7Var.h;
        if (pw1Var != null && pw1Var.getState() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = oc7Var.h.f();
            drmSession$DrmSessionExceptionF.getClass();
            throw drmSession$DrmSessionExceptionF;
        }
        wv8 wv8Var = rm6Var.m;
        int iZ = rm6Var.d.z(rm6Var.E);
        IOException iOException = (IOException) wv8Var.d;
        if (iOException != null) {
            throw iOException;
        }
        qa4 qa4Var = (qa4) wv8Var.c;
        if (qa4Var != null) {
            if (iZ == Integer.MIN_VALUE) {
                iZ = qa4Var.a;
            }
            IOException iOException2 = qa4Var.e;
            if (iOException2 != null && qa4Var.f > iZ) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.pc7
    public final int g(long j) throws Throwable {
        rm6 rm6Var = this.b;
        if (rm6Var.G()) {
            return 0;
        }
        int i = this.a;
        rm6Var.B(i);
        oc7 oc7Var = rm6Var.u[i];
        int iS = oc7Var.s(j, rm6Var.O);
        oc7Var.D(iS);
        if (iS == 0) {
            rm6Var.C(i);
        }
        return iS;
    }

    @Override // defpackage.pc7
    public final int h(hh2 hh2Var, fc1 fc1Var, int i) {
        rm6 rm6Var = this.b;
        if (rm6Var.G()) {
            return -3;
        }
        int i2 = this.a;
        rm6Var.B(i2);
        int iY = rm6Var.u[i2].y(hh2Var, fc1Var, i, rm6Var.O);
        if (iY == -3) {
            rm6Var.C(i2);
        }
        return iY;
    }
}
