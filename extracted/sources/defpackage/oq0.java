package defpackage;

import androidx.compose.ui.semantics.f;
import androidx.compose.ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq0 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn7 b;

    public /* synthetic */ oq0(nn7 nn7Var, int i) {
        this.a = i;
        this.b = nn7Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        switch (this.a) {
            case 0:
                fs8 fs8Var = (fs8) obj;
                js3.n(fs8Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                f26 f26Var = (f26) fs8Var;
                f26Var.p = true;
                f26Var.o.invoke(this.b);
                t17.f(f26Var);
                return Boolean.FALSE;
            default:
                Boolean boolA = ((gg) ((gc2) obj)).a();
                if (boolA != null) {
                    f.h(this.b, boolA.booleanValue() ? ToggleableState.a : ToggleableState.b);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
