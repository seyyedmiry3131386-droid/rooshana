package ir.mservices.market.social.users.common;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.d16;
import defpackage.ds6;
import defpackage.i5;
import defpackage.js3;
import defpackage.og5;
import defpackage.p3;
import defpackage.pq6;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.t61;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.social.users.common.BaseAccountUsersFragment;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.recycler.OwnUsersEmptyData;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketTextView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAccountUsersFragment extends Hilt_BaseAccountUsersFragment {
    public static final /* synthetic */ int i1 = 0;

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        TextView textView;
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        a.e((LottieAnimationView) viewFindViewById, ((Boolean) Q1().w.a.getValue()).booleanValue() ? qs6.private_account : qs6.no_followers);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        if (myketTextView != null) {
            myketTextView.setVisibility(0);
            myketTextView.setText(((Boolean) Q1().w.a.getValue()).booleanValue() ? rs6.private_account : S1());
        }
        Integer numR1 = R1();
        if (!((Boolean) Q1().w.a.getValue()).booleanValue() || numR1 == null || (textView = (TextView) view.findViewById(rr6.empty_message)) == null) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(numR1.intValue());
    }

    public abstract BaseAccountUsersViewModel Q1();

    public Integer R1() {
        return Integer.valueOf(rs6.private_account_description);
    }

    public abstract int S1();

    public abstract UserProfileRefId T1();

    public abstract String U1();

    /* JADX WARN: Type inference failed for: r0v2, types: [p50] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p50] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p50] */
    /* JADX WARN: Type inference failed for: r0v5, types: [p50] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        GraphicUtils$Dimension graphicUtils$DimensionG = p3.g(F());
        i5 i5Var = new i5(v1(), t61.e(K(), pq6.horizontal_space_outer, 2, graphicUtils$DimensionG.a) / v1(), graphicUtils$DimensionG, this.F0.f());
        final int i = 0;
        i5Var.o = new og5(this) { // from class: p50
            public final /* synthetic */ BaseAccountUsersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                BaseAccountUsersFragment baseAccountUsersFragment = this.b;
                switch (i2) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i3 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto.getAccountKey(), userDto.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    case 1:
                        int i4 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((ey5) qg5Var, "<unused var>");
                        js3.p((OwnUsersEmptyData) obj, "<unused var>");
                        pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.MynetSocial(), -1);
                        break;
                    case 2:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i5 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    default:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i6 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        i5Var.p = new og5(this) { // from class: p50
            public final /* synthetic */ BaseAccountUsersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                BaseAccountUsersFragment baseAccountUsersFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i3 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto.getAccountKey(), userDto.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    case 1:
                        int i4 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((ey5) qg5Var, "<unused var>");
                        js3.p((OwnUsersEmptyData) obj, "<unused var>");
                        pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.MynetSocial(), -1);
                        break;
                    case 2:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i5 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    default:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i6 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        i5Var.q = new og5(this) { // from class: p50
            public final /* synthetic */ BaseAccountUsersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                BaseAccountUsersFragment baseAccountUsersFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i32 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto.getAccountKey(), userDto.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    case 1:
                        int i4 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((ey5) qg5Var, "<unused var>");
                        js3.p((OwnUsersEmptyData) obj, "<unused var>");
                        pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.MynetSocial(), -1);
                        break;
                    case 2:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i5 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    default:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i6 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        i5Var.r = new og5(this) { // from class: p50
            public final /* synthetic */ BaseAccountUsersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                BaseAccountUsersFragment baseAccountUsersFragment = this.b;
                switch (i22) {
                    case 0:
                        UserCardData userCardData = (UserCardData) obj;
                        int i32 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((d19) qg5Var, "<unused var>");
                        js3.p(userCardData, "recyclerData");
                        UserDto userDto = userCardData.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto.getAccountKey(), userDto.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    case 1:
                        int i42 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((ey5) qg5Var, "<unused var>");
                        js3.p((OwnUsersEmptyData) obj, "<unused var>");
                        pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.MynetSocial(), -1);
                        break;
                    case 2:
                        UserCardData userCardData2 = (UserCardData) obj;
                        int i5 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((b29) qg5Var, "<unused var>");
                        js3.p(userCardData2, "recyclerData");
                        UserDto userDto2 = userCardData2.a;
                        pk5.e(baseAccountUsersFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), baseAccountUsersFragment.T1());
                        break;
                    default:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i6 = BaseAccountUsersFragment.i1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.b;
                        if (str != null && !f88.n0(str)) {
                            pk5.g(baseAccountUsersFragment.J0, new NavIntentDirections.UserList(new g19(str, homeMoreTitleRowData.a)), -1);
                            break;
                        }
                        break;
                }
            }
        };
        return i5Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAccountUsersFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return Q1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.space_xl), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_4), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.account_users_max_span);
    }
}
