package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.o;
import ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$ViewHolderType;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final class se5 extends ka4 {
    public final MultiSelectViewHolder$ViewHolderType e = MultiSelectViewHolder$ViewHolderType.a;
    public final int f;

    public se5(int i) {
        this.f = i;
    }

    @Override // defpackage.ka4
    public final void y(o oVar, ja4 ja4Var) {
        js3.p(ja4Var, "loadState");
        i06 i06Var = ((la4) oVar).u;
        i06Var.v.getLayoutParams().width = this.f;
        LoadingView loadingView = i06Var.w;
        js3.o(loadingView, "progressLoading");
        loadingView.setVisibility(ja4Var instanceof ha4 ? 0 : 8);
    }

    @Override // defpackage.ka4
    public final o z(ViewGroup viewGroup, ja4 ja4Var) {
        js3.p(ja4Var, "loadState");
        return new la4(this.e, viewGroup);
    }
}
