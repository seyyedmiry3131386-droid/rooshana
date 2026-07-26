package defpackage;

import ir.mservices.market.social.welcome.WelcomeFragment;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class sd9 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WelcomeFragment b;

    public /* synthetic */ sd9(WelcomeFragment welcomeFragment, int i) {
        this.a = i;
        this.b = welcomeFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        WelcomeFragment welcomeFragment = this.b;
        switch (i) {
            case 0:
                WelcomeFragment.k1(welcomeFragment, (Pair) obj);
                break;
            case 1:
                int i2 = WelcomeFragment.a1;
                welcomeFragment.J0.q();
                break;
            case 2:
                int i3 = WelcomeFragment.a1;
                WelcomeFragment.k1(welcomeFragment, (Pair) welcomeFragment.m1().H.a.getValue());
                break;
            default:
                String str = (String) obj;
                ao2 ao2Var = welcomeFragment.X0;
                js3.m(ao2Var);
                MyketTextView myketTextView = ao2Var.x;
                js3.m(myketTextView);
                myketTextView.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
                myketTextView.setText(str);
                break;
        }
        return tx8Var;
    }
}
