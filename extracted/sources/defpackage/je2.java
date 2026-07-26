package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je2 implements px3 {
    public static final je2 a = new je2();
    public static final bk6 b = new bk6("kotlin.Float", xj6.f);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Float.valueOf(cc1Var.D());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.p(((Number) obj).floatValue());
    }
}
