package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
public final class lf2 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ lf2(Ref$ObjectRef ref$ObjectRef, int i) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                this.b.a = obj;
                throw new AbortFlowException(this);
            case 1:
                this.b.a = obj;
                throw new AbortFlowException(this);
            case 2:
                this.b.a = obj;
                return tx8.a;
            default:
                Ref$ObjectRef ref$ObjectRef = this.b;
                Object obj2 = ref$ObjectRef.a;
                mu3 mu3Var = vy2.f;
                if (obj2 == mu3Var) {
                    ref$ObjectRef.a = obj;
                    return tx8.a;
                }
                ref$ObjectRef.a = mu3Var;
                throw new AbortFlowException(this);
        }
    }
}
