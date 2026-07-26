package ir.mservices.market.social.welcome;

import defpackage.g51;
import defpackage.hh2;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.social.welcome.WelcomeAction;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ze2 {
    public final /* synthetic */ WelcomeFragment a;

    public b(WelcomeFragment welcomeFragment) {
        this.a = welcomeFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        WelcomeFragment welcomeFragment = this.a;
        hh2.H(new hh2(welcomeFragment.F(), (String) obj));
        welcomeFragment.m1().r(new WelcomeAction.ToastAction(null));
        return tx8.a;
    }
}
