package defpackage;

import androidx.recyclerview.widget.k;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.setting.themeStyle.ThemeStyleFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class ik8 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeStyleFragment b;
    public final /* synthetic */ fa2 c;

    public /* synthetic */ ik8(ThemeStyleFragment themeStyleFragment, fa2 fa2Var, int i) {
        this.a = i;
        this.b = themeStyleFragment;
        this.c = fa2Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        xe2 xe2Var;
        switch (this.a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                ThemeStyleFragment themeStyleFragment = this.b;
                boolean z = themeStyleFragment.K().getBoolean(yp6.theme_style_tablet_land);
                jk8 jk8Var = themeStyleFragment.W0;
                js3.m(jk8Var);
                k layoutManager = jk8Var.y.getLayoutManager();
                js3.n(layoutManager, "null cannot be cast to non-null type ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager");
                MyketGridLayoutManager myketGridLayoutManager = (MyketGridLayoutManager) layoutManager;
                if (!z) {
                    iIntValue = ((Number) themeStyleFragment.Y0.getValue()).intValue();
                }
                myketGridLayoutManager.z1(iIntValue);
                myketGridLayoutManager.K = new hk8(z, this.c);
                myketGridLayoutManager.r0();
                break;
            case 1:
                jk8 jk8Var2 = this.b.W0;
                js3.m(jk8Var2);
                jk8Var2.C.v();
                Object objE = this.c.E((a06) obj, g51Var);
                if (objE != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                bz6 bz6Var = (bz6) obj;
                if (bz6Var != null && (xe2Var = bz6Var.a) != null) {
                    Object objA = xe2Var.a(new ik8(this.b, this.c, 1), g51Var);
                    if (objA == CoroutineSingletons.a) {
                    }
                }
                break;
        }
        return tx8.a;
    }
}
