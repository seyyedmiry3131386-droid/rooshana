package defpackage;

import android.view.View;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.common.recycler.ProfileHeaderData;
import ir.mservices.market.social.profile.common.recycler.a;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.user.UserProfileFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class n19 implements ze2 {
    public final /* synthetic */ UserProfileFragment a;

    public n19(UserProfileFragment userProfileFragment) {
        this.a = userProfileFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        ProfileHeaderData profileHeaderData = (ProfileHeaderData) obj;
        final AccountDto accountDto = profileHeaderData.c;
        final UserProfileFragment userProfileFragment = this.a;
        im2 im2Var = userProfileFragment.Z0;
        js3.m(im2Var);
        View view = im2Var.x.l;
        js3.o(view, "getRoot(...)");
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        a aVar = new a(view, new og5() { // from class: m19
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i4 = i;
                UserProfileFragment userProfileFragment2 = userProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i4) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.OtherFollowers otherFollowers = new NavIntentDirections.OtherFollowers(new dw5(accountDto2.getAccountKey()));
                        int i5 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, otherFollowers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.OtherFollowing otherFollowing = new NavIntentDirections.OtherFollowing(new fw5(accountDto2.getAccountKey()));
                        int i6 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, otherFollowing, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i7 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, level, -1);
                        break;
                }
            }
        }, new og5() { // from class: m19
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i4 = i2;
                UserProfileFragment userProfileFragment2 = userProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i4) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.OtherFollowers otherFollowers = new NavIntentDirections.OtherFollowers(new dw5(accountDto2.getAccountKey()));
                        int i5 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, otherFollowers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.OtherFollowing otherFollowing = new NavIntentDirections.OtherFollowing(new fw5(accountDto2.getAccountKey()));
                        int i6 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, otherFollowing, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i7 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, level, -1);
                        break;
                }
            }
        }, new og5() { // from class: m19
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i4 = i3;
                UserProfileFragment userProfileFragment2 = userProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i4) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.OtherFollowers otherFollowers = new NavIntentDirections.OtherFollowers(new dw5(accountDto2.getAccountKey()));
                        int i5 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, otherFollowers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.OtherFollowing otherFollowing = new NavIntentDirections.OtherFollowing(new fw5(accountDto2.getAccountKey()));
                        int i6 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, otherFollowing, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i7 = UserProfileFragment.c1;
                        pk5.g(userProfileFragment2.J0, level, -1);
                        break;
                }
            }
        }, new k19(userProfileFragment));
        im2 im2Var2 = userProfileFragment.Z0;
        js3.m(im2Var2);
        aVar.w(im2Var2.x);
        aVar.t(profileHeaderData);
        return tx8.a;
    }
}
