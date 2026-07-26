package defpackage;

import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu1 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp2 b;

    public /* synthetic */ tu1(int i, bp2 bp2Var) {
        this.a = i;
        this.b = bp2Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        bp2 bp2Var = this.b;
        switch (i) {
            case 0:
                bp2Var.invoke();
                return tx8Var;
            case 1:
                bp2Var.invoke();
                return tx8Var;
            case 2:
                bp2Var.invoke();
                return tx8Var;
            case 3:
                nn7 nn7Var = (nn7) obj;
                Object objInvoke = bp2Var.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                yl6 yl6Var = new yl6(f != null ? f.floatValue() : 0.0f, new gu0(1.0f));
                ox3[] ox3VarArr = f.a;
                g gVar = d.c;
                ox3 ox3Var = f.a[1];
                nn7Var.a(gVar, yl6Var);
                return tx8Var;
            case 4:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) bp2Var.invoke()).floatValue());
            default:
                return (nr5) bp2Var.invoke();
        }
    }
}
