package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: classes.dex */
public final class e6 extends cu4 {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ b m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(b bVar, Context context, ot4 ot4Var, View view) {
        super(context, ot4Var, view, true, xp6.actionOverflowMenuStyle, 0);
        this.m = bVar;
        this.f = 8388613;
        ql4 ql4Var = bVar.x;
        this.h = ql4Var;
        au4 au4Var = this.i;
        if (au4Var != null) {
            au4Var.i(ql4Var);
        }
    }

    @Override // defpackage.cu4
    public final void c() {
        switch (this.l) {
            case 0:
                b bVar = this.m;
                bVar.u = null;
                bVar.y = 0;
                super.c();
                break;
            default:
                b bVar2 = this.m;
                ot4 ot4Var = bVar2.c;
                if (ot4Var != null) {
                    ot4Var.c(true);
                }
                bVar2.t = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(b bVar, Context context, p98 p98Var, View view) {
        super(context, p98Var, view, false, xp6.actionOverflowMenuStyle, 0);
        this.m = bVar;
        if ((p98Var.A.x & 32) != 32) {
            View view2 = bVar.j;
            this.e = view2 == null ? (View) bVar.h : view2;
        }
        ql4 ql4Var = bVar.x;
        this.h = ql4Var;
        au4 au4Var = this.i;
        if (au4Var != null) {
            au4Var.i(ql4Var);
        }
    }
}
