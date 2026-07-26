package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements dp2 {
    public final /* synthetic */ int a;
    public Object b;

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((pm0) this.b).cancel();
                return tx8.a;
            case 1:
                xt3 xt3Var = (xt3) this.b;
                if (xt3Var.b()) {
                    xt3Var.v(new AbortFlowException(xt3Var));
                }
                return tx8.a;
            case 2:
                Object obj2 = ((Ref$ObjectRef) this.b).a;
                if (obj2 != null) {
                    ((ie6) obj2).c.set(true);
                    return tx8.a;
                }
                js3.V("listener");
                throw null;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fh6 fh6Var = (fh6) this.b;
                if (fh6Var != null) {
                    fh6Var.d = zBooleanValue;
                }
                return tx8.a;
            default:
                float[] fArr = ((pk4) obj).a;
                v04 v04Var = (v04) this.b;
                if (v04Var.h()) {
                    c26.t(v04Var).j(v04Var, fArr);
                }
                return tx8.a;
        }
    }

    public /* synthetic */ ah0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
