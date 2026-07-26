package ir.mservices.market.social.profile.user;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import defpackage.a79;
import defpackage.au7;
import defpackage.ay5;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt5;
import defpackage.c24;
import defpackage.c5;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.g27;
import defpackage.h69;
import defpackage.im2;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k19;
import defpackage.mm2;
import defpackage.ms6;
import defpackage.o19;
import defpackage.o79;
import defpackage.ot4;
import defpackage.p3;
import defpackage.p40;
import defpackage.p52;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q69;
import defpackage.q79;
import defpackage.rn8;
import defpackage.rq4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.tt3;
import defpackage.ue7;
import defpackage.v7;
import defpackage.vb0;
import defpackage.wd4;
import defpackage.x79;
import defpackage.yw6;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.data.MenuDto;
import ir.mservices.market.social.profile.user.UserProfileAction;
import ir.mservices.market.social.profile.user.UserProfileHeaderAction;
import ir.mservices.market.social.profile.user.data.ReportType;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.dialog.f;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.TryAgainView;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileFragment extends Hilt_UserProfileFragment implements mm2 {
    public static final /* synthetic */ int c1 = 0;
    public c5 V0;
    public final o79 W0;
    public final o79 X0;
    public final bi5 Y0;
    public im2 Z0;
    public vb0 a1;
    public ay5 b1;

    public UserProfileFragment() {
        final UserProfileFragment$special$$inlined$viewModels$default$1 userProfileFragment$special$$inlined$viewModels$default$1 = new UserProfileFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) userProfileFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.W0 = new o79(g27.a(UserProfileViewModel.class), new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        final UserProfileFragment$special$$inlined$viewModels$default$6 userProfileFragment$special$$inlined$viewModels$default$6 = new UserProfileFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) userProfileFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.X0 = new o79(g27.a(UserProfileHeaderViewModel.class), new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        this.Y0 = new bi5(g27.a(o19.class), new yw6(27, this));
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        AccountDto accountDto;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(k1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_LOGIN_REPORT".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                l1().r(UserProfileHeaderAction.RefreshAction.INSTANCE);
                o1();
                return;
            }
            if ("DIALOG_KEY_REPORT".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a && (accountDto = (AccountDto) l1().P.a.getValue()) != null) {
                UserProfileViewModel userProfileViewModelM1 = m1();
                String accountKey = accountDto.getAccountKey();
                int i = bundle.getInt("SELECT_INDEX");
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(0, ReportType.NAME);
                sparseArray.put(1, ReportType.AVATAR);
                sparseArray.put(2, ReportType.BIO);
                sparseArray.put(3, ReportType.OTHER);
                Object obj = sparseArray.get(i);
                js3.o(obj, "get(...)");
                userProfileViewModelM1.r(new UserProfileAction.ReportAction(accountKey, (ReportType) obj, bundle.getString("BUNDLE_KEY_DESCRIPTION")));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_social_user_profile);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int R0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            ay5 ay5Var = this.b1;
            if (ay5Var == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            rn8Var.z(ay5Var.l);
        }
        if (G().F(rr6.profile_subheader_layout) instanceof UserProfileHeaderFragment) {
            return;
        }
        g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        p40Var.k(rr6.profile_subheader_layout, new UserProfileHeaderFragment(), null);
        p40Var.e();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = vb0.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        this.a1 = (vb0) fa1.c(layoutInflater, js6.birthday_animation_view, viewGroup, false);
        int i2 = im2.D;
        im2 im2Var = (im2) fa1.c(layoutInflater, js6.fragment_own_profile, viewGroup, false);
        this.Z0 = im2Var;
        js3.m(im2Var);
        View view = im2Var.l;
        js3.n(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view;
        vb0 vb0Var = this.a1;
        frameLayout.addView(vb0Var != null ? vb0Var.l : null);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i3 = ay5.A;
        ay5 ay5Var = (ay5) a79.f0(layoutInflaterFrom, js6.own_profile_toolbar_view, null, false, null);
        js3.o(ay5Var, "inflate(...)");
        this.b1 = ay5Var;
        n1(false);
        im2 im2Var2 = this.Z0;
        js3.m(im2Var2);
        im2Var2.A.setTabBackgroundColor(sj8.b().l);
        im2 im2Var3 = this.Z0;
        js3.m(im2Var3);
        im2Var3.y.setTabBackgroundColor(sj8.b().p);
        im2 im2Var4 = this.Z0;
        js3.m(im2Var4);
        View view2 = im2Var4.z;
        im2 im2Var5 = this.Z0;
        js3.m(im2Var5);
        Context context = im2Var5.l.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.h = 0;
        ea7Var.d = K().getDimensionPixelSize(pq6.default_curve_layouts_radius);
        ea7Var.b();
        ea7Var.e = K().getDimensionPixelSize(pq6.default_curve_layouts_radius);
        ea7Var.b();
        ea7Var.f = 0;
        ea7Var.b();
        ea7Var.g = 0;
        ea7Var.b();
        view2.setBackground(ea7Var.a());
        im2 im2Var6 = this.Z0;
        js3.m(im2Var6);
        View view3 = im2Var6.l;
        js3.o(view3, "getRoot(...)");
        return view3;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        UserProfileViewModel userProfileViewModelM1 = m1();
        im2 im2Var = this.Z0;
        js3.m(im2Var);
        userProfileViewModelM1.r(new UserProfileAction.ScrollYAction(Integer.valueOf(im2Var.B.getScrollY())));
        this.J0.x(k1());
        im2 im2Var2 = this.Z0;
        js3.m(im2Var2);
        im2Var2.A.clearAnimation();
        this.a1 = null;
        this.Z0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemFindItem;
        Drawable icon;
        MenuItem menuItemFindItem2;
        Drawable icon2;
        MenuItem menuItemFindItem3;
        String text;
        MenuItem menuItemFindItem4;
        String text2;
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.user_profile, menu);
        MenuItem menuItemFindItem5 = menu.findItem(rr6.action_more);
        ot4 ot4VarS0 = S0(ms6.user_profile_more, menuItemFindItem5);
        String str = "";
        if (ot4VarS0 != null && (menuItemFindItem4 = ot4VarS0.findItem(rr6.action_article)) != null) {
            rq4.O(menuItemFindItem4, l1().M.a.getValue() != null, ot4VarS0, menuItemFindItem5);
            Resources resourcesK = K();
            js3.o(resourcesK, "getResources(...)");
            MenuDto menuDto = (MenuDto) l1().M.a.getValue();
            if (menuDto == null || (text2 = menuDto.getText()) == null) {
                text2 = "";
            }
            menuItemFindItem4.setTitle(tt3.H(resourcesK, text2));
            Drawable icon3 = menuItemFindItem4.getIcon();
            if (icon3 != null) {
                icon3.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            }
        }
        if (ot4VarS0 != null && (menuItemFindItem3 = ot4VarS0.findItem(rr6.action_other)) != null) {
            rq4.O(menuItemFindItem3, l1().N.a.getValue() != null, ot4VarS0, menuItemFindItem5);
            Resources resourcesK2 = K();
            js3.o(resourcesK2, "getResources(...)");
            MenuDto menuDto2 = (MenuDto) l1().N.a.getValue();
            if (menuDto2 != null && (text = menuDto2.getText()) != null) {
                str = text;
            }
            menuItemFindItem3.setTitle(tt3.H(resourcesK2, str));
            Drawable icon4 = menuItemFindItem3.getIcon();
            if (icon4 != null) {
                icon4.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            }
        }
        if (ot4VarS0 != null && (menuItemFindItem2 = ot4VarS0.findItem(rr6.action_share)) != null && (icon2 = menuItemFindItem2.getIcon()) != null) {
            icon2.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        if (ot4VarS0 != null && (menuItemFindItem = ot4VarS0.findItem(rr6.action_report)) != null && (icon = menuItemFindItem.getIcon()) != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        AccountDto accountDto;
        js3.p(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == rr6.action_article) {
            Context contextH = H();
            MenuDto menuDto = (MenuDto) l1().M.a.getValue();
            String action = menuDto != null ? menuDto.getAction() : null;
            if (action != null) {
                t61.v(action, "parse(...)", contextH, null, null);
                return false;
            }
        } else if (itemId == rr6.action_other) {
            Context contextH2 = H();
            MenuDto menuDto2 = (MenuDto) l1().N.a.getValue();
            String action2 = menuDto2 != null ? menuDto2.getAction() : null;
            if (action2 != null) {
                t61.v(action2, "parse(...)", contextH2, null, null);
                return false;
            }
        } else if (itemId == rr6.action_share) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("action_bar_user_profile_share");
            actionBarEventBuilder.a();
            Context contextH3 = H();
            if (contextH3 != null && (accountDto = (AccountDto) l1().P.a.getValue()) != null) {
                Context contextH4 = H();
                if (this.V0 == null) {
                    js3.V("accountManager");
                    throw null;
                }
                String strI = c5.i(contextH3, accountDto.getAccountKey(), accountDto.getUserName(), ((o19) this.Y0.getValue()).b);
                js3.o(strI, "shareProfileLink(...)");
                au7.a(contextH4, strI, new v7(27));
                return false;
            }
        } else if (itemId == rr6.action_report) {
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("action_bar_user_profile_report");
            actionBarEventBuilder2.a();
            c5 c5Var = this.V0;
            if (c5Var == null) {
                js3.V("accountManager");
                throw null;
            }
            if (c5Var.d()) {
                o1();
                return false;
            }
            DialogDataModel dialogDataModel = new DialogDataModel(k1(), "DIALOG_KEY_LOGIN_REPORT", null, 12);
            PhoneBindData phoneBindData = new PhoneBindData("");
            String strL = L(rs6.bind_message_report);
            String strL2 = L(rs6.login_label_user_profile_report);
            js3.o(strL2, "getString(...)");
            pk5.g(this.J0, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, strL, strL2, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
            return false;
        }
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(k1(), this);
        im2 im2Var = this.Z0;
        js3.m(im2Var);
        ViewGroup.LayoutParams layoutParams = im2Var.z.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).O = p3.g(F()).b;
        im2 im2Var2 = this.Z0;
        js3.m(im2Var2);
        TryAgainView tryAgainView = im2Var2.C;
        js3.m(tryAgainView);
        int i = TryAgainView.t;
        p52 p52Var = new p52(0, 8, tryAgainView);
        WeakHashMap weakHashMap = q69.a;
        h69.m(tryAgainView, p52Var);
        tryAgainView.setPrimaryColor(sj8.b().c, sj8.b().d);
        tryAgainView.setColors(sj8.b().p);
        tryAgainView.setOnTryAgainListener(new k19(this));
        tryAgainView.setOnSettingListener(new ue7(8, this));
        im2 im2Var3 = this.Z0;
        js3.m(im2Var3);
        NestedScrollView nestedScrollView = im2Var3.B;
        nestedScrollView.setOnScrollChangeListener(new k19(this));
        nestedScrollView.setSaveEnabled(false);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$8(this, view, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$9(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$10(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$11(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileFragment$onViewCreated$12(this, null));
    }

    public final String k1() {
        return dw1.n("UserProfileFragment_", this.H0);
    }

    public final UserProfileHeaderViewModel l1() {
        return (UserProfileHeaderViewModel) this.X0.getValue();
    }

    public final UserProfileViewModel m1() {
        return (UserProfileViewModel) this.W0.getValue();
    }

    public final void n1(boolean z) {
        AccountDto accountDto = (AccountDto) l1().P.a.getValue();
        ay5 ay5Var = this.b1;
        if (ay5Var == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        AvatarImageView avatarImageView = ay5Var.v;
        avatarImageView.setSize(avatarImageView.getResources().getDimensionPixelSize(pq6.profile_icon_toolbar_size));
        avatarImageView.setVisibility(z ? 0 : 8);
        AvatarImageView.setImage$default(avatarImageView, accountDto != null ? accountDto.getAvatarUrl() : null, accountDto != null ? accountDto.getNickName() : null, null, Integer.valueOf(sj8.b().l), 4, null);
        MyketTextView myketTextView = ay5Var.y;
        js3.m(myketTextView);
        myketTextView.setVisibility(z ? 0 : 8);
        myketTextView.setText(accountDto != null ? accountDto.getNickName() : null);
        ImageView imageView = ay5Var.z;
        js3.o(imageView, "notification");
        imageView.setVisibility(8);
        ImageView imageView2 = ay5Var.w;
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(i, mode));
        ay5Var.x.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
    }

    public final void o1() {
        String strL = L(rs6.report_user_name);
        js3.o(strL, "getString(...)");
        ReportDialogFragment.Option option = new ReportDialogFragment.Option(strL);
        String strL2 = L(rs6.report_user_avatar);
        js3.o(strL2, "getString(...)");
        ReportDialogFragment.Option option2 = new ReportDialogFragment.Option(strL2);
        String strL3 = L(rs6.report_user_bio);
        js3.o(strL3, "getString(...)");
        ReportDialogFragment.Option option3 = new ReportDialogFragment.Option(strL3);
        String strL4 = L(rs6.report_user_other);
        js3.o(strL4, "getString(...)");
        pk5.g(this.J0, new NavIntentDirections.Report(new f(new DialogDataModel(k1(), "DIALOG_KEY_REPORT", null, 12), null, L(rs6.report_message), -1, sj8.b().c, sj8.b().d, sj8.b(), true, new ReportDialogFragment.Option[]{option, option2, option3, new ReportDialogFragment.Option(strL4)})), -1);
    }
}
