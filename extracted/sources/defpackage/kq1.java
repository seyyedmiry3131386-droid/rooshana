package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq1 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ kq1(float f, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hv1 hv1Var = (hv1) obj;
                float f = this.b;
                float fS = hv1Var.S(f);
                float f2 = 2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(hv1Var.S(f) / f2)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (hv1Var.d() >> 32));
                hv1Var.y(this.c, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(hv1Var.S(f) / f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fS, (496 & 16) != 0 ? 0 : 1);
                break;
            default:
                hv1 hv1Var2 = (hv1) obj;
                float f3 = this.b;
                float fS2 = hv1Var2.S(f3);
                float f4 = 2;
                hv1Var2.y(this.c, (((long) Float.floatToRawIntBits(hv1Var2.S(f3) / f4)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(hv1Var2.S(f3) / f4)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (hv1Var2.d() & 4294967295L))))), fS2, (496 & 16) != 0 ? 0 : 1);
                break;
        }
        return tx8.a;
    }
}
