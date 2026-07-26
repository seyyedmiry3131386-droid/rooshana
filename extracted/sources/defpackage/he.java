package defpackage;

import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je b;
    public final /* synthetic */ Ref$FloatRef c;

    public /* synthetic */ he(je jeVar, Ref$FloatRef ref$FloatRef, int i) {
        this.a = i;
        this.b = jeVar;
        this.c = ref$FloatRef;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                this.b.a(fFloatValue, fFloatValue2);
                this.c.a = fFloatValue;
                break;
            default:
                this.b.a(fFloatValue, fFloatValue2);
                this.c.a = fFloatValue;
                break;
        }
        return tx8.a;
    }
}
