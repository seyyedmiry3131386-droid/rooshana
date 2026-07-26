package defpackage;

import ir.mservices.market.intro.IntroFragment;
import ir.mservices.market.views.BigFillRectangleButton;

/* JADX INFO: loaded from: classes3.dex */
public final class os3 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntroFragment b;

    public /* synthetic */ os3(IntroFragment introFragment, int i) {
        this.a = i;
        this.b = introFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        IntroFragment introFragment = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int i2 = IntroFragment.Z0;
                introFragment.getClass();
                for (int i3 = 0; i3 < 4; i3++) {
                    if (i3 < iIntValue) {
                        introFragment.n1(i3, 100);
                    } else if (i3 > iIntValue) {
                        introFragment.n1(i3, 0);
                    }
                }
                if (iIntValue >= 0 && iIntValue < 4) {
                    fl2 fl2Var = introFragment.W0;
                    js3.m(fl2Var);
                    fl2Var.E.setCurrentItem(iIntValue, true);
                    introFragment.p1();
                }
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fl2 fl2Var2 = introFragment.W0;
                js3.m(fl2Var2);
                fl2Var2.x.setVisibility(zBooleanValue ? 4 : 0);
                fl2 fl2Var3 = introFragment.W0;
                js3.m(fl2Var3);
                BigFillRectangleButton bigFillRectangleButton = fl2Var3.y;
                js3.o(bigFillRectangleButton, "done");
                bigFillRectangleButton.setVisibility(zBooleanValue ? 0 : 8);
                if (zBooleanValue) {
                    li1 li1Var = introFragment.Y0;
                    if (li1Var != null) {
                        li1Var.g(null);
                    }
                    introFragment.n1(introFragment.k1(), 100);
                }
                break;
            default:
                int i4 = IntroFragment.Z0;
                introFragment.n1(introFragment.k1(), 0);
                fl2 fl2Var4 = introFragment.W0;
                js3.m(fl2Var4);
                fl2Var4.E.setCurrentItem(introFragment.k1(), true);
                introFragment.p1();
                break;
        }
        return tx8Var;
    }
}
