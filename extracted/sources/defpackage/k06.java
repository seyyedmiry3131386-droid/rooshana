package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.common.data.RowType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k06 extends l06 {
    public final int m;
    public final boolean n;

    public k06(int i, boolean z) {
        super(1);
        this.m = i;
        this.n = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        View view = qg5Var.a;
        super.l(qg5Var, i);
        if (qg5Var instanceof oq1) {
            return;
        }
        boolean z = this.n;
        int i2 = this.m;
        RowType rowType = i == 0 ? c() == 1 ? RowType.SINGLE : i2 == 1 ? RowType.TOP : z ? RowType.RIGHT : RowType.LEFT : i == c() - 1 ? i2 == 1 ? RowType.BOTTOM : z ? RowType.LEFT : RowType.RIGHT : RowType.CENTER;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().S;
        ea7Var.d = view.getResources().getDimensionPixelSize(rowType.getTopLeft());
        ea7Var.b();
        ea7Var.e = view.getResources().getDimensionPixelSize(rowType.getTopRight());
        ea7Var.b();
        ea7Var.f = view.getResources().getDimensionPixelSize(rowType.getBottomLeft());
        ea7Var.b();
        ea7Var.g = view.getResources().getDimensionPixelSize(rowType.getBottomRight());
        ea7Var.b();
        ea7Var.h = 0;
        ea7Var.j = true;
        view.setBackground(ea7Var.a());
    }
}
