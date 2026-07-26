package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends at2 {
    public final /* synthetic */ int D = 1;
    public final /* synthetic */ kw3 E;
    public final /* synthetic */ String F;
    public final Object G;

    public v0(kw3 kw3Var, String str) {
        this.E = kw3Var;
        this.F = str;
        this.G = kw3Var.b.b;
    }

    @Override // defpackage.at2, defpackage.q12
    public void A(long j) {
        String str;
        switch (this.D) {
            case 1:
                if (j == 0) {
                    str = "0";
                } else if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
                o0(str);
                break;
            default:
                super.A(j);
                break;
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public void C(String str) {
        switch (this.D) {
            case 0:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this.E.L(this.F, new uv3(str, false, (no7) this.G));
                break;
            default:
                super.C(str);
                break;
        }
    }

    @Override // defpackage.q12
    public final rb4 b() {
        switch (this.D) {
            case 0:
                return this.E.b.b;
            default:
                return (rb4) this.G;
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public void i(short s) {
        switch (this.D) {
            case 1:
                o0(String.valueOf(s & 65535));
                break;
            default:
                super.i(s);
                break;
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public void k(byte b) {
        switch (this.D) {
            case 1:
                o0(String.valueOf(b & 255));
                break;
            default:
                super.k(b);
                break;
        }
    }

    public void o0(String str) {
        js3.p(str, "s");
        this.E.L(this.F, new uv3(str, false, null));
    }

    @Override // defpackage.at2, defpackage.q12
    public void y(int i) {
        switch (this.D) {
            case 1:
                o0(Long.toString(((long) i) & 4294967295L, 10));
                break;
            default:
                super.y(i);
                break;
        }
    }

    public v0(kw3 kw3Var, String str, no7 no7Var) {
        this.E = kw3Var;
        this.F = str;
        this.G = no7Var;
    }
}
