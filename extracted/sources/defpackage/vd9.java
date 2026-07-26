package defpackage;

import com.bumptech.glide.a;
import ir.mservices.market.social.welcome.recycler.b;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final class vd9 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ vd9(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                LoadingView loadingView = this.b.x().v;
                js3.o(loadingView, "avatarProgressLoading");
                loadingView.setVisibility(zBooleanValue ? 0 : 8);
                return tx8.a;
            case 1:
                b bVar = this.b;
                c5 c5Var = bVar.x;
                if (c5Var != null) {
                    c5Var.g(bVar.x().y, true);
                    return tx8.a;
                }
                js3.V("accountManager");
                throw null;
            default:
                xe1 xe1Var = new xe1(true);
                b bVar2 = this.b;
                f57 f57VarS = a.f(bVar2.x().y).s((String) obj);
                js3.o(f57VarS, "load(...)");
                x80 x80VarG = f57VarS.G(new na7(bVar2.a.getResources().getDimensionPixelSize(pq6.welcome_user_icon_size) / 2));
                js3.o(x80VarG, "transform(...)");
                uv1 uv1Var = new uv1();
                uv1Var.a = xe1Var;
                ((f57) x80VarG).W(uv1Var).P(bVar2.x().y);
                return tx8.a;
        }
    }
}
