package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.social.profile.common.ProfileTabView;
import ir.mservices.market.social.profile.common.recycler.ProfileHeaderData;
import ir.mservices.market.social.profile.common.recycler.a;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.user.UserProfileFragment;
import ir.mservices.market.social.profile.user.UserProfileHeaderAction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k19 implements vt5, im5, og5 {
    public final /* synthetic */ UserProfileFragment a;

    public /* synthetic */ k19(UserProfileFragment userProfileFragment) {
        this.a = userProfileFragment;
    }

    @Override // defpackage.vt5
    public void f() {
        int i = UserProfileFragment.c1;
        this.a.l1().r(UserProfileHeaderAction.RefreshAction.INSTANCE);
    }

    @Override // defpackage.im5
    public void l(NestedScrollView nestedScrollView) {
        int i = UserProfileFragment.c1;
        UserProfileFragment userProfileFragment = this.a;
        im2 im2Var = userProfileFragment.Z0;
        js3.m(im2Var);
        int scrollY = im2Var.B.getScrollY();
        im2 im2Var2 = userProfileFragment.Z0;
        js3.m(im2Var2);
        userProfileFragment.n1(scrollY - im2Var2.z.getTop() >= 0);
        im2 im2Var3 = userProfileFragment.Z0;
        js3.m(im2Var3);
        ProfileTabView profileTabView = im2Var3.y;
        js3.o(profileTabView, "profileHeaderTabs");
        im2 im2Var4 = userProfileFragment.Z0;
        js3.m(im2Var4);
        int scrollY2 = im2Var4.B.getScrollY();
        im2 im2Var5 = userProfileFragment.Z0;
        js3.m(im2Var5);
        profileTabView.setVisibility(scrollY2 - im2Var5.A.getTop() < 0 ? 8 : 0);
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        ProfileHeaderData profileHeaderData = (ProfileHeaderData) obj;
        js3.p(view, "<unused var>");
        js3.p((a) qg5Var, "<unused var>");
        js3.p(profileHeaderData, "recyclerData");
        AccountDto accountDto = profileHeaderData.c;
        String highResAvatarUrl = accountDto.getHighResAvatarUrl();
        if (highResAvatarUrl == null) {
            highResAvatarUrl = accountDto.getAvatarUrl();
        }
        if (highResAvatarUrl != null) {
            if (f88.n0(highResAvatarUrl)) {
                highResAvatarUrl = null;
            }
            if (highResAvatarUrl != null) {
                UserProfileFragment userProfileFragment = this.a;
                bt5 bt5VarF = userProfileFragment.F();
                zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                if (zt5Var != null) {
                    ((LaunchContentActivity) zt5Var).s0(userProfileFragment.K().getDimensionPixelSize(pq6.space_8), highResAvatarUrl);
                }
            }
        }
    }
}
