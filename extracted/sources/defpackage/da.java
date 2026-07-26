package defpackage;

import android.content.Context;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class da implements bp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ da(dp2 dp2Var, t9 t9Var, x9 x9Var, Context context, long j) {
        this.c = dp2Var;
        this.d = t9Var;
        this.e = x9Var;
        this.f = context;
        this.b = j;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                dp2 dp2Var = (dp2) this.c;
                t9 t9Var = (t9) this.d;
                x9 x9Var = (x9) this.e;
                Context context = (Context) this.f;
                dp2Var.invoke(t9Var.d);
                if (x9Var instanceof m8) {
                    ok4.O(context, (m8) x9Var, true);
                } else if (x9Var instanceof wa) {
                    ct2.v(context, (wa) x9Var, this.b);
                }
                break;
            default:
                ((lw4) this.c).e((bp2) this.d, (uw4) this.e, this.b, (LayoutDirection) this.f);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ da(lw4 lw4Var, bp2 bp2Var, uw4 uw4Var, long j, LayoutDirection layoutDirection) {
        this.c = lw4Var;
        this.d = bp2Var;
        this.e = uw4Var;
        this.b = j;
        this.f = layoutDirection;
    }
}
