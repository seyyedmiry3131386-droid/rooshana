package defpackage;

import android.view.View;
import ir.mservices.market.views.DialogButtonComponentVertical;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sm1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp2 b;

    public /* synthetic */ sm1(int i, bp2 bp2Var) {
        this.a = i;
        this.b = bp2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        bp2 bp2Var = this.b;
        switch (i) {
            case 0:
                int i2 = DialogButtonComponentVertical.b;
                bp2Var.invoke();
                break;
            case 1:
                int i3 = DialogButtonComponentVertical.b;
                bp2Var.invoke();
                break;
            default:
                if (bp2Var != null) {
                    bp2Var.invoke();
                }
                break;
        }
    }
}
