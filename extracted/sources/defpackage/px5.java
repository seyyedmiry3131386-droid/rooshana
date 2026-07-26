package defpackage;

import androidx.core.widget.NestedScrollView;
import ir.mservices.market.social.profile.common.ProfileTabView;
import ir.mservices.market.social.profile.own.OwnProfileFragment;
import ir.mservices.market.social.profile.own.OwnProfileHeaderAction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class px5 implements vt5, im5 {
    public final /* synthetic */ OwnProfileFragment a;

    public /* synthetic */ px5(OwnProfileFragment ownProfileFragment) {
        this.a = ownProfileFragment;
    }

    @Override // defpackage.vt5
    public void f() {
        int i = OwnProfileFragment.d1;
        this.a.l1().r(new OwnProfileHeaderAction.RefreshAction(true));
    }

    @Override // defpackage.im5
    public void l(NestedScrollView nestedScrollView) {
        int i = OwnProfileFragment.d1;
        OwnProfileFragment ownProfileFragment = this.a;
        im2 im2Var = ownProfileFragment.Y0;
        js3.m(im2Var);
        int scrollY = im2Var.B.getScrollY();
        im2 im2Var2 = ownProfileFragment.Y0;
        js3.m(im2Var2);
        ownProfileFragment.n1(scrollY - im2Var2.z.getTop() >= 0);
        im2 im2Var3 = ownProfileFragment.Y0;
        js3.m(im2Var3);
        ProfileTabView profileTabView = im2Var3.y;
        js3.o(profileTabView, "profileHeaderTabs");
        im2 im2Var4 = ownProfileFragment.Y0;
        js3.m(im2Var4);
        int scrollY2 = im2Var4.B.getScrollY();
        im2 im2Var5 = ownProfileFragment.Y0;
        js3.m(im2Var5);
        profileTabView.setVisibility(scrollY2 - im2Var5.A.getTop() < 0 ? 8 : 0);
    }
}
