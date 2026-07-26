package defpackage;

import android.view.View;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.common.recycler.ProfileHeaderData;
import ir.mservices.market.social.profile.common.recycler.a;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.own.OwnProfileFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class sx5 implements ze2 {
    public final /* synthetic */ OwnProfileFragment a;

    public sx5(OwnProfileFragment ownProfileFragment) {
        this.a = ownProfileFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        ProfileHeaderData profileHeaderData = (ProfileHeaderData) obj;
        final AccountDto accountDto = profileHeaderData.c;
        final OwnProfileFragment ownProfileFragment = this.a;
        im2 im2Var = ownProfileFragment.Y0;
        js3.m(im2Var);
        View view = im2Var.x.l;
        js3.o(view, "getRoot(...)");
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        final int i4 = 3;
        a aVar = new a(view, new og5() { // from class: rx5
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i5 = i;
                OwnProfileFragment ownProfileFragment2 = ownProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i5) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Followers followers = new NavIntentDirections.Followers(new j4(accountDto2.getAccountKey()));
                        int i6 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, followers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Following following = new NavIntentDirections.Following(new p4(accountDto2.getAccountKey()));
                        int i7 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, following, -1);
                        break;
                    case 2:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i8 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, level, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        String highResAvatarUrl = accountDto2.getHighResAvatarUrl();
                        if (highResAvatarUrl == null) {
                            highResAvatarUrl = accountDto2.getAvatarUrl();
                        }
                        if (highResAvatarUrl != null) {
                            if (f88.n0(highResAvatarUrl)) {
                                highResAvatarUrl = null;
                            }
                            if (highResAvatarUrl != null) {
                                bt5 bt5VarF = ownProfileFragment2.F();
                                zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                                if (zt5Var != null) {
                                    ((LaunchContentActivity) zt5Var).s0(ownProfileFragment2.K().getDimensionPixelSize(pq6.space_8), highResAvatarUrl);
                                }
                            }
                        }
                        break;
                }
            }
        }, new og5() { // from class: rx5
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i5 = i2;
                OwnProfileFragment ownProfileFragment2 = ownProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i5) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Followers followers = new NavIntentDirections.Followers(new j4(accountDto2.getAccountKey()));
                        int i6 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, followers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Following following = new NavIntentDirections.Following(new p4(accountDto2.getAccountKey()));
                        int i7 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, following, -1);
                        break;
                    case 2:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i8 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, level, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        String highResAvatarUrl = accountDto2.getHighResAvatarUrl();
                        if (highResAvatarUrl == null) {
                            highResAvatarUrl = accountDto2.getAvatarUrl();
                        }
                        if (highResAvatarUrl != null) {
                            if (f88.n0(highResAvatarUrl)) {
                                highResAvatarUrl = null;
                            }
                            if (highResAvatarUrl != null) {
                                bt5 bt5VarF = ownProfileFragment2.F();
                                zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                                if (zt5Var != null) {
                                    ((LaunchContentActivity) zt5Var).s0(ownProfileFragment2.K().getDimensionPixelSize(pq6.space_8), highResAvatarUrl);
                                }
                            }
                        }
                        break;
                }
            }
        }, new og5() { // from class: rx5
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i5 = i3;
                OwnProfileFragment ownProfileFragment2 = ownProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i5) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Followers followers = new NavIntentDirections.Followers(new j4(accountDto2.getAccountKey()));
                        int i6 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, followers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Following following = new NavIntentDirections.Following(new p4(accountDto2.getAccountKey()));
                        int i7 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, following, -1);
                        break;
                    case 2:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i8 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, level, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        String highResAvatarUrl = accountDto2.getHighResAvatarUrl();
                        if (highResAvatarUrl == null) {
                            highResAvatarUrl = accountDto2.getAvatarUrl();
                        }
                        if (highResAvatarUrl != null) {
                            if (f88.n0(highResAvatarUrl)) {
                                highResAvatarUrl = null;
                            }
                            if (highResAvatarUrl != null) {
                                bt5 bt5VarF = ownProfileFragment2.F();
                                zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                                if (zt5Var != null) {
                                    ((LaunchContentActivity) zt5Var).s0(ownProfileFragment2.K().getDimensionPixelSize(pq6.space_8), highResAvatarUrl);
                                }
                            }
                        }
                        break;
                }
            }
        }, new og5() { // from class: rx5
            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj2) {
                int i5 = i4;
                OwnProfileFragment ownProfileFragment2 = ownProfileFragment;
                AccountDto accountDto2 = accountDto;
                a aVar2 = (a) qg5Var;
                ProfileHeaderData profileHeaderData2 = (ProfileHeaderData) obj2;
                switch (i5) {
                    case 0:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Followers followers = new NavIntentDirections.Followers(new j4(accountDto2.getAccountKey()));
                        int i6 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, followers, -1);
                        break;
                    case 1:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Following following = new NavIntentDirections.Following(new p4(accountDto2.getAccountKey()));
                        int i7 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, following, -1);
                        break;
                    case 2:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        NavIntentDirections.Level level = new NavIntentDirections.Level(new g54(accountDto2.getAccountKey(), accountDto2.getAvatarUrl(), accountDto2.getNickName()));
                        int i8 = OwnProfileFragment.d1;
                        pk5.g(ownProfileFragment2.J0, level, -1);
                        break;
                    default:
                        js3.p(view2, "<unused var>");
                        js3.p(aVar2, "<unused var>");
                        js3.p(profileHeaderData2, "<unused var>");
                        String highResAvatarUrl = accountDto2.getHighResAvatarUrl();
                        if (highResAvatarUrl == null) {
                            highResAvatarUrl = accountDto2.getAvatarUrl();
                        }
                        if (highResAvatarUrl != null) {
                            if (f88.n0(highResAvatarUrl)) {
                                highResAvatarUrl = null;
                            }
                            if (highResAvatarUrl != null) {
                                bt5 bt5VarF = ownProfileFragment2.F();
                                zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                                if (zt5Var != null) {
                                    ((LaunchContentActivity) zt5Var).s0(ownProfileFragment2.K().getDimensionPixelSize(pq6.space_8), highResAvatarUrl);
                                }
                            }
                        }
                        break;
                }
            }
        });
        im2 im2Var2 = ownProfileFragment.Y0;
        js3.m(im2Var2);
        aVar.w(im2Var2.x);
        aVar.t(profileHeaderData);
        return tx8.a;
    }
}
