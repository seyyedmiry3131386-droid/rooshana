package kotlinx.serialization.json.internal;

import defpackage.js3;
import defpackage.no7;
import defpackage.qp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        no7 no7Var = (no7) obj;
        int iIntValue = ((Number) obj2).intValue();
        js3.p(no7Var, "p0");
        a aVar = (a) this.receiver;
        aVar.getClass();
        boolean z = !no7Var.i(iIntValue) && no7Var.h(iIntValue).c();
        aVar.b = z;
        return Boolean.valueOf(z);
    }
}
