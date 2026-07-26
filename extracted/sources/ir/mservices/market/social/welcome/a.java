package ir.mservices.market.social.welcome;

import defpackage.rm1;
import ir.mservices.market.social.welcome.WelcomeAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rm1 {
    public final /* synthetic */ WelcomeFragment a;

    public a(WelcomeFragment welcomeFragment) {
        this.a = welcomeFragment;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
        int i = WelcomeFragment.a1;
        this.a.m1().r(WelcomeAction.SkipStepAcion.INSTANCE);
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        int i = WelcomeFragment.a1;
        this.a.m1().r(WelcomeAction.SubmitStepAction.INSTANCE);
    }
}
