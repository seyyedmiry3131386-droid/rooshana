package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug0 implements wg0 {
    public final /* synthetic */ int b;

    public /* synthetic */ ug0(int i) {
        this.b = i;
    }

    @Override // defpackage.wg0
    public final float a(float f, float f2, float f3) {
        switch (this.b) {
            case 0:
                wg0.a.getClass();
                float f4 = f2 + f;
                if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                    return 0.0f;
                }
                float f5 = f4 - f3;
                return Math.abs(f) < Math.abs(f5) ? f : f5;
            default:
                float fAbs = Math.abs((f2 + f) - f);
                float f6 = (0.3f * f3) - (0.0f * fAbs);
                float f7 = f3 - f6;
                if ((fAbs <= f3) && f7 < fAbs) {
                    f6 = f3 - fAbs;
                }
                return f - f6;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // defpackage.wg0
    public final o38 b() {
        switch (this.b) {
        }
        wg0.a.getClass();
        return vg0.b;
    }
}
