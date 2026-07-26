package ir.mservices.market.myAccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.k;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.c5;
import defpackage.cv;
import defpackage.d11;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fp6;
import defpackage.g27;
import defpackage.g76;
import defpackage.gc5;
import defpackage.is3;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lw;
import defpackage.n15;
import defpackage.nv2;
import defpackage.o79;
import defpackage.og5;
import defpackage.ol3;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.ql3;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.tc5;
import defpackage.uc5;
import defpackage.ur4;
import defpackage.x79;
import defpackage.y97;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketStaggeredLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.MyAccountRecyclerListFragment;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.myAccount.dialog.MessageAccessLevel;
import ir.mservices.market.myAccount.dialog.PrivacyAccessLevel;
import ir.mservices.market.myAccount.recycler.MyAccountCheckBoxData;
import ir.mservices.market.myAccount.recycler.MyAccountHeaderData;
import ir.mservices.market.myAccount.recycler.MyAccountItemData;
import ir.mservices.market.myAccount.recycler.MyAccountLinkItemData;
import ir.mservices.market.myAccount.recycler.a;
import ir.mservices.market.myAccount.recycler.b;
import ir.mservices.market.myAccount.recycler.c;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.crop.util.PhotoUtils$PhotoData;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.mservices.market.views.TryAgainView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountRecyclerListFragment extends Hilt_MyAccountRecyclerListFragment {
    public static final /* synthetic */ int m1 = 0;
    public c5 i1;
    public g76 j1;
    public final o79 k1;
    public final bi5 l1;

    public MyAccountRecyclerListFragment() {
        final MyAccountRecyclerListFragment$special$$inlined$viewModels$default$1 myAccountRecyclerListFragment$special$$inlined$viewModels$default$1 = new MyAccountRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.MyAccountRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) myAccountRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(BaseMyAccountViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.MyAccountRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.MyAccountRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myAccount.MyAccountRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.l1 = new bi5(g27.a(uc5.class), new n15(5, this));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        String string;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
        js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
        DialogDataModel dialogDataModel = (DialogDataModel) objP;
        String str2 = dialogDataModel.b;
        if (str.equalsIgnoreCase(R1()) && "FRAGMENT_KEY_CITY".equalsIgnoreCase(str2) && (string = bundle.getString("city")) != null) {
            T1().u(MyAccountItemsType.f, string, this);
        }
        if (str.equalsIgnoreCase(S1())) {
            if ("DIALOG_KEY_GENDER".equalsIgnoreCase(str2)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult != DialogResult.a) {
                    if (dialogResult == DialogResult.b) {
                        dw1.y("profile_gender_cancel");
                        return;
                    }
                    return;
                }
                cv cvVar = Gender.d;
                int i = bundle.getInt("BUNDLE_KEY_SELECTED_ITEM");
                cvVar.getClass();
                String str3 = ((Gender) Gender.h.get(i)).a;
                T1().u(MyAccountItemsType.e, str3, this);
                if (str3.equals("Female")) {
                    dw1.y("profile_gender_set_female");
                    return;
                } else {
                    if (str3.equals("Male")) {
                        dw1.y("profile_gender_set_male");
                        return;
                    }
                    return;
                }
            }
            if ("DIALOG_KEY_BIRTHDAY".equalsIgnoreCase(str2)) {
                DialogResult dialogResult2 = dialogDataModel.d;
                int i2 = dialogResult2 != null ? tc5.a[dialogResult2.ordinal()] : -1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    dw1.y("profile_birthday_cancel");
                    return;
                }
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("profile_birthday_set");
                clickEventBuilder.a();
                String string2 = bundle.getString("DATE");
                if (string2 != null) {
                    T1().t(new Pair(MyAccountItemsType.g, string2));
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_NAME".equalsIgnoreCase(str2)) {
                DialogResult dialogResult3 = dialogDataModel.d;
                if (dialogResult3 == null || !dialogResult3.equals(DialogResult.a)) {
                    return;
                }
                T1().t(new Pair(MyAccountItemsType.c, bundle.getString("BUNDLE_KEY_NICK_NAME")));
                return;
            }
            if ("DIALOG_KEY_BIO".equalsIgnoreCase(str2)) {
                DialogResult dialogResult4 = dialogDataModel.d;
                if (dialogResult4 == null || !dialogResult4.equals(DialogResult.a)) {
                    return;
                }
                T1().t(new Pair(MyAccountItemsType.d, bundle.getString("BUNDLE_KEY_ACCOUNT_INFO")));
                return;
            }
            if ("DIALOG_KEY_PRIVACY_LEVEL".equalsIgnoreCase(str2)) {
                DialogResult dialogResult5 = dialogDataModel.d;
                if (dialogResult5 == null || !dialogResult5.equals(DialogResult.a)) {
                    return;
                }
                ol3 ol3Var = PrivacyAccessLevel.c;
                int i3 = bundle.getInt("BUNDLE_KEY_SELECTED_ITEM");
                ol3Var.getClass();
                T1().u(MyAccountItemsType.h, ((PrivacyAccessLevel) PrivacyAccessLevel.f.get(i3)).a, this);
                return;
            }
            if ("DIALOG_KEY_MESSAGE_ACCESS_LEVEL".equalsIgnoreCase(str2)) {
                DialogResult dialogResult6 = dialogDataModel.d;
                if (dialogResult6 == null || !dialogResult6.equals(DialogResult.a)) {
                    return;
                }
                ql3 ql3Var = MessageAccessLevel.c;
                int i4 = bundle.getInt("BUNDLE_KEY_SELECTED_ITEM");
                ql3Var.getClass();
                T1().u(MyAccountItemsType.i, ((MessageAccessLevel) MessageAccessLevel.f.get(i4)).a, this);
                return;
            }
            if ("DIALOG_KEY_CONFIRM".equalsIgnoreCase(str2)) {
                DialogResult dialogResult7 = dialogDataModel.d;
                if ((dialogResult7 != null ? tc5.a[dialogResult7.ordinal()] : -1) != 1) {
                    dw1.y("profile_avatar_delete_dialog_cancel");
                    return;
                }
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("profile_avatar_delete_dialog_ok");
                clickEventBuilder2.a();
                BaseMyAccountViewModel baseMyAccountViewModelT1 = T1();
                baseMyAccountViewModelT1.s(true);
                bt2.G(y97.G(baseMyAccountViewModelT1), null, null, new BaseMyAccountViewModel$deleteAvatar$1(baseMyAccountViewModelT1, null), 3);
                return;
            }
            if (!"DIALOG_KEY_LINE_MENU".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_UNBIND_ALL".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    this.J0.clearAll();
                    return;
                }
                return;
            }
            DialogResult dialogResult8 = dialogDataModel.d;
            int i5 = dialogResult8 == null ? -1 : tc5.a[dialogResult8.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                dw1.y("profile_avatar_dialog_cancel");
                return;
            }
            String string3 = bundle.getString("BUNDLE_KEY_ID");
            if (string3 != null) {
                if (string3.equalsIgnoreCase("TAKE_PHOTO")) {
                    if (Q1().e()) {
                        dw1.y("profile_avatar_dialog_camera_replace");
                    } else {
                        dw1.y("profile_avatar_dialog_camera");
                    }
                    g76 g76Var = this.j1;
                    if (g76Var != null) {
                        g76Var.d(F());
                        return;
                    } else {
                        js3.V("photoUtils");
                        throw null;
                    }
                }
                if (string3.equalsIgnoreCase("LIBRARY_PHOTO")) {
                    if (Q1().e()) {
                        dw1.y("profile_avatar_dialog_gallery_replace");
                    } else {
                        dw1.y("profile_avatar_dialog_gallery");
                    }
                    if (this.j1 != null) {
                        g76.e(F());
                        return;
                    } else {
                        js3.V("photoUtils");
                        throw null;
                    }
                }
                if (string3.equalsIgnoreCase("REMOVE_PHOTO")) {
                    ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                    clickEventBuilder3.b("profile_avatar_dialog_delete");
                    clickEventBuilder3.a();
                    DialogDataModel dialogDataModel2 = new DialogDataModel(S1(), "DIALOG_KEY_CONFIRM", null, 12);
                    String strL = L(rs6.delete_upload_text);
                    js3.o(strL, "getString(...)");
                    pk5.g(this.J0, new NavIntentDirections.Confirm(new d11(dialogDataModel2, strL, L(rs6.dismiss), L(rs6.delete_upload_title), sj8.b().c, sj8.b().d, sj8.b())), -1);
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_edit_profile);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean G1() {
        return true;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int M0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.my_account_page_title);
        js3.o(string, "getString(...)");
        return string;
    }

    public final c5 Q1() {
        c5 c5Var = this.i1;
        if (c5Var != null) {
            return c5Var;
        }
        js3.V("accountManager");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int R0() {
        return sj8.b().p;
    }

    public final String R1() {
        return t61.i(S1(), "_city");
    }

    public final String S1() {
        return dw1.n("MyAccountRecyclerListFragment_", this.H0);
    }

    public final BaseMyAccountViewModel T1() {
        return (BaseMyAccountViewModel) this.k1.getValue();
    }

    @Override // androidx.fragment.app.d
    public final void U(int i, int i2, Intent intent) {
        super.U(i, i2, intent);
        if (F() != null) {
            d dVarF = G().F(rr6.content);
            if (dVarF != null) {
                dVarF.U(i, i2, intent);
            }
            g76 g76Var = this.j1;
            if (g76Var != null) {
                g76Var.c(i2, i, intent, F(), this.J0, new PhotoUtils$PhotoData(this.H0, null));
            } else {
                js3.V("photoUtils");
                throw null;
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        lw.f(null, "User must have a binding to open account.", Q1().d());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        DialogDataModel dialogDataModel;
        if (((Boolean) T1().E.a.getValue()).booleanValue() && (dialogDataModel = ((uc5) this.l1.getValue()).a) != null) {
            dialogDataModel.d = DialogResult.a;
            this.J0.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModel)), dialogDataModel.a);
        }
        super.b0();
        this.J0.x(S1());
        this.J0.x(R1());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sc5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [sc5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [sc5] */
    /* JADX WARN: Type inference failed for: r0v6, types: [sc5] */
    /* JADX WARN: Type inference failed for: r0v7, types: [sc5] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        gc5 gc5Var = new gc5(v1(), p3.g(F()), this.F0.f());
        final int i = 0;
        gc5Var.n = new og5(this) { // from class: sc5
            public final /* synthetic */ MyAccountRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Object next;
                int iOrdinal;
                int i2;
                String strL;
                String[] stringArray;
                String str;
                Object next2;
                int i3 = i;
                MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
                switch (i3) {
                    case 0:
                        int i4 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((MyAccountHeaderData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("profile_avatar_camera");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", myAccountRecyclerListFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", myAccountRecyclerListFragment.L(rs6.take_photo)));
                        if (myAccountRecyclerListFragment.Q1().e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", myAccountRecyclerListFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    case 1:
                        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) obj;
                        int i5 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(myAccountHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("profile_avatar");
                        clickEventBuilder2.a();
                        String str2 = myAccountHeaderData.b;
                        if (str2 == null) {
                            str2 = (String) myAccountRecyclerListFragment.Q1().h.b;
                        }
                        if (str2 != null) {
                            bt5 bt5VarF = myAccountRecyclerListFragment.F();
                            zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                            if (zt5Var != null) {
                                ((LaunchContentActivity) zt5Var).s0(myAccountRecyclerListFragment.K().getDimensionPixelSize(pq6.space_8), str2);
                            }
                        }
                        break;
                    case 2:
                        MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
                        int i6 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(myAccountItemData, "recyclerData");
                        v48 v48Var = myAccountItemData.b.a;
                        int iOrdinal2 = ((MyAccountItemsType) ((Pair) v48Var.getValue()).a).ordinal();
                        if (iOrdinal2 == 1) {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("profile_name_edit");
                            clickEventBuilder3.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NAME", null, 12), null)), -1);
                            break;
                        } else if (iOrdinal2 == 2) {
                            DialogDataModel dialogDataModel = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIO", null, 12);
                            String string = myAccountRecyclerListFragment.K().getString(rs6.account_bio);
                            js3.o(string, "getString(...)");
                            String str3 = (String) ((Pair) v48Var.getValue()).b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Bio(new sb0(dialogDataModel, string, str3)), -1);
                            break;
                        } else if (iOrdinal2 == 3) {
                            String[] stringArray2 = myAccountRecyclerListFragment.K().getStringArray(mp6.gender_spinner_titles);
                            js3.o(stringArray2, "getStringArray(...)");
                            DialogDataModel dialogDataModel2 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_GENDER", null, 12);
                            String strL2 = myAccountRecyclerListFragment.L(rs6.account_gender);
                            js3.o(strL2, "getString(...)");
                            String strL3 = myAccountRecyclerListFragment.L(rs6.save);
                            js3.o(strL3, "getString(...)");
                            cv cvVar = Gender.d;
                            String str4 = (String) ((Pair) v48Var.getValue()).b;
                            cvVar.getClass();
                            Gender genderV = cv.v(str4);
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel2, strL2, strL3, stringArray2, genderV != null ? genderV.ordinal() : -1, null, false)), -1);
                            break;
                        } else if (iOrdinal2 == 4) {
                            ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                            clickEventBuilder4.b("profile_select_city");
                            clickEventBuilder4.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SelectCity(new em7(new DialogDataModel(myAccountRecyclerListFragment.R1(), "FRAGMENT_KEY_CITY", null, 12))), -1);
                            break;
                        } else if (iOrdinal2 == 5) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("profile_select_birthday");
                            clickEventBuilder5.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Birthday(new xb0(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIRTHDAY", null, 12), (String) ((Pair) v48Var.getValue()).b)), -1);
                            break;
                        }
                        break;
                    case 3:
                        int i7 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((MyAccountCheckBoxData) obj, "<unused var>");
                        DialogDataModel dialogDataModel3 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NO_RESULT", null, 12);
                        String string2 = myAccountRecyclerListFragment.K().getString(rs6.about_private_mode);
                        String string3 = myAccountRecyclerListFragment.K().getString(rs6.private_mode_dialog_description);
                        String string4 = myAccountRecyclerListFragment.K().getString(rs6.button_ok);
                        js3.o(string4, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel3, string2, string3, string4, 0)), -1);
                        break;
                    default:
                        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
                        int i8 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myAccount.recycler.d) qg5Var, "<unused var>");
                        js3.p(myAccountLinkItemData, "recyclerData");
                        v48 v48Var2 = myAccountLinkItemData.c.a;
                        if (((Pair) v48Var2.getValue()).a == MyAccountItemsType.h) {
                            ol3 ol3Var = PrivacyAccessLevel.c;
                            String str5 = (String) ((Pair) v48Var2.getValue()).b;
                            ol3Var.getClass();
                            Iterator it = ((z0) PrivacyAccessLevel.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (((PrivacyAccessLevel) next2).a.equalsIgnoreCase(str5)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            PrivacyAccessLevel privacyAccessLevel = (PrivacyAccessLevel) next2;
                            iOrdinal = privacyAccessLevel != null ? privacyAccessLevel.ordinal() : -1;
                            i2 = rs6.who_see_you;
                            str = "DIALOG_KEY_PRIVACY_LEVEL";
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_privacy_spinner_titles);
                            strL = null;
                        } else {
                            ql3 ql3Var = MessageAccessLevel.c;
                            String str6 = (String) ((Pair) v48Var2.getValue()).b;
                            ql3Var.getClass();
                            Iterator it2 = ((z0) MessageAccessLevel.f).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((MessageAccessLevel) next).a.equalsIgnoreCase(str6)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            MessageAccessLevel messageAccessLevel = (MessageAccessLevel) next;
                            iOrdinal = messageAccessLevel != null ? messageAccessLevel.ordinal() : -1;
                            i2 = rs6.followers_send_you_messages;
                            strL = myAccountRecyclerListFragment.L(rs6.account_massage_access_level_spinner_hint);
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_message_level_spinner_titles);
                            str = "DIALOG_KEY_MESSAGE_ACCESS_LEVEL";
                        }
                        int i9 = iOrdinal;
                        js3.m(stringArray);
                        DialogDataModel dialogDataModel4 = new DialogDataModel(myAccountRecyclerListFragment.S1(), str, null, 12);
                        String strL4 = myAccountRecyclerListFragment.L(i2);
                        js3.o(strL4, "getString(...)");
                        String strL5 = myAccountRecyclerListFragment.L(rs6.save);
                        js3.o(strL5, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel4, strL4, strL5, stringArray, i9, strL, false)), -1);
                        break;
                }
            }
        };
        final int i2 = 1;
        gc5Var.o = new og5(this) { // from class: sc5
            public final /* synthetic */ MyAccountRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Object next;
                int iOrdinal;
                int i22;
                String strL;
                String[] stringArray;
                String str;
                Object next2;
                int i3 = i2;
                MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
                switch (i3) {
                    case 0:
                        int i4 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((MyAccountHeaderData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("profile_avatar_camera");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", myAccountRecyclerListFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", myAccountRecyclerListFragment.L(rs6.take_photo)));
                        if (myAccountRecyclerListFragment.Q1().e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", myAccountRecyclerListFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    case 1:
                        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) obj;
                        int i5 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(myAccountHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("profile_avatar");
                        clickEventBuilder2.a();
                        String str2 = myAccountHeaderData.b;
                        if (str2 == null) {
                            str2 = (String) myAccountRecyclerListFragment.Q1().h.b;
                        }
                        if (str2 != null) {
                            bt5 bt5VarF = myAccountRecyclerListFragment.F();
                            zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                            if (zt5Var != null) {
                                ((LaunchContentActivity) zt5Var).s0(myAccountRecyclerListFragment.K().getDimensionPixelSize(pq6.space_8), str2);
                            }
                        }
                        break;
                    case 2:
                        MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
                        int i6 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(myAccountItemData, "recyclerData");
                        v48 v48Var = myAccountItemData.b.a;
                        int iOrdinal2 = ((MyAccountItemsType) ((Pair) v48Var.getValue()).a).ordinal();
                        if (iOrdinal2 == 1) {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("profile_name_edit");
                            clickEventBuilder3.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NAME", null, 12), null)), -1);
                            break;
                        } else if (iOrdinal2 == 2) {
                            DialogDataModel dialogDataModel = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIO", null, 12);
                            String string = myAccountRecyclerListFragment.K().getString(rs6.account_bio);
                            js3.o(string, "getString(...)");
                            String str3 = (String) ((Pair) v48Var.getValue()).b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Bio(new sb0(dialogDataModel, string, str3)), -1);
                            break;
                        } else if (iOrdinal2 == 3) {
                            String[] stringArray2 = myAccountRecyclerListFragment.K().getStringArray(mp6.gender_spinner_titles);
                            js3.o(stringArray2, "getStringArray(...)");
                            DialogDataModel dialogDataModel2 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_GENDER", null, 12);
                            String strL2 = myAccountRecyclerListFragment.L(rs6.account_gender);
                            js3.o(strL2, "getString(...)");
                            String strL3 = myAccountRecyclerListFragment.L(rs6.save);
                            js3.o(strL3, "getString(...)");
                            cv cvVar = Gender.d;
                            String str4 = (String) ((Pair) v48Var.getValue()).b;
                            cvVar.getClass();
                            Gender genderV = cv.v(str4);
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel2, strL2, strL3, stringArray2, genderV != null ? genderV.ordinal() : -1, null, false)), -1);
                            break;
                        } else if (iOrdinal2 == 4) {
                            ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                            clickEventBuilder4.b("profile_select_city");
                            clickEventBuilder4.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SelectCity(new em7(new DialogDataModel(myAccountRecyclerListFragment.R1(), "FRAGMENT_KEY_CITY", null, 12))), -1);
                            break;
                        } else if (iOrdinal2 == 5) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("profile_select_birthday");
                            clickEventBuilder5.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Birthday(new xb0(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIRTHDAY", null, 12), (String) ((Pair) v48Var.getValue()).b)), -1);
                            break;
                        }
                        break;
                    case 3:
                        int i7 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((MyAccountCheckBoxData) obj, "<unused var>");
                        DialogDataModel dialogDataModel3 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NO_RESULT", null, 12);
                        String string2 = myAccountRecyclerListFragment.K().getString(rs6.about_private_mode);
                        String string3 = myAccountRecyclerListFragment.K().getString(rs6.private_mode_dialog_description);
                        String string4 = myAccountRecyclerListFragment.K().getString(rs6.button_ok);
                        js3.o(string4, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel3, string2, string3, string4, 0)), -1);
                        break;
                    default:
                        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
                        int i8 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myAccount.recycler.d) qg5Var, "<unused var>");
                        js3.p(myAccountLinkItemData, "recyclerData");
                        v48 v48Var2 = myAccountLinkItemData.c.a;
                        if (((Pair) v48Var2.getValue()).a == MyAccountItemsType.h) {
                            ol3 ol3Var = PrivacyAccessLevel.c;
                            String str5 = (String) ((Pair) v48Var2.getValue()).b;
                            ol3Var.getClass();
                            Iterator it = ((z0) PrivacyAccessLevel.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (((PrivacyAccessLevel) next2).a.equalsIgnoreCase(str5)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            PrivacyAccessLevel privacyAccessLevel = (PrivacyAccessLevel) next2;
                            iOrdinal = privacyAccessLevel != null ? privacyAccessLevel.ordinal() : -1;
                            i22 = rs6.who_see_you;
                            str = "DIALOG_KEY_PRIVACY_LEVEL";
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_privacy_spinner_titles);
                            strL = null;
                        } else {
                            ql3 ql3Var = MessageAccessLevel.c;
                            String str6 = (String) ((Pair) v48Var2.getValue()).b;
                            ql3Var.getClass();
                            Iterator it2 = ((z0) MessageAccessLevel.f).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((MessageAccessLevel) next).a.equalsIgnoreCase(str6)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            MessageAccessLevel messageAccessLevel = (MessageAccessLevel) next;
                            iOrdinal = messageAccessLevel != null ? messageAccessLevel.ordinal() : -1;
                            i22 = rs6.followers_send_you_messages;
                            strL = myAccountRecyclerListFragment.L(rs6.account_massage_access_level_spinner_hint);
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_message_level_spinner_titles);
                            str = "DIALOG_KEY_MESSAGE_ACCESS_LEVEL";
                        }
                        int i9 = iOrdinal;
                        js3.m(stringArray);
                        DialogDataModel dialogDataModel4 = new DialogDataModel(myAccountRecyclerListFragment.S1(), str, null, 12);
                        String strL4 = myAccountRecyclerListFragment.L(i22);
                        js3.o(strL4, "getString(...)");
                        String strL5 = myAccountRecyclerListFragment.L(rs6.save);
                        js3.o(strL5, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel4, strL4, strL5, stringArray, i9, strL, false)), -1);
                        break;
                }
            }
        };
        final int i3 = 2;
        gc5Var.p = new og5(this) { // from class: sc5
            public final /* synthetic */ MyAccountRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Object next;
                int iOrdinal;
                int i22;
                String strL;
                String[] stringArray;
                String str;
                Object next2;
                int i32 = i3;
                MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
                switch (i32) {
                    case 0:
                        int i4 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((MyAccountHeaderData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("profile_avatar_camera");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", myAccountRecyclerListFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", myAccountRecyclerListFragment.L(rs6.take_photo)));
                        if (myAccountRecyclerListFragment.Q1().e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", myAccountRecyclerListFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    case 1:
                        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) obj;
                        int i5 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(myAccountHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("profile_avatar");
                        clickEventBuilder2.a();
                        String str2 = myAccountHeaderData.b;
                        if (str2 == null) {
                            str2 = (String) myAccountRecyclerListFragment.Q1().h.b;
                        }
                        if (str2 != null) {
                            bt5 bt5VarF = myAccountRecyclerListFragment.F();
                            zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                            if (zt5Var != null) {
                                ((LaunchContentActivity) zt5Var).s0(myAccountRecyclerListFragment.K().getDimensionPixelSize(pq6.space_8), str2);
                            }
                        }
                        break;
                    case 2:
                        MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
                        int i6 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(myAccountItemData, "recyclerData");
                        v48 v48Var = myAccountItemData.b.a;
                        int iOrdinal2 = ((MyAccountItemsType) ((Pair) v48Var.getValue()).a).ordinal();
                        if (iOrdinal2 == 1) {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("profile_name_edit");
                            clickEventBuilder3.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NAME", null, 12), null)), -1);
                            break;
                        } else if (iOrdinal2 == 2) {
                            DialogDataModel dialogDataModel = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIO", null, 12);
                            String string = myAccountRecyclerListFragment.K().getString(rs6.account_bio);
                            js3.o(string, "getString(...)");
                            String str3 = (String) ((Pair) v48Var.getValue()).b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Bio(new sb0(dialogDataModel, string, str3)), -1);
                            break;
                        } else if (iOrdinal2 == 3) {
                            String[] stringArray2 = myAccountRecyclerListFragment.K().getStringArray(mp6.gender_spinner_titles);
                            js3.o(stringArray2, "getStringArray(...)");
                            DialogDataModel dialogDataModel2 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_GENDER", null, 12);
                            String strL2 = myAccountRecyclerListFragment.L(rs6.account_gender);
                            js3.o(strL2, "getString(...)");
                            String strL3 = myAccountRecyclerListFragment.L(rs6.save);
                            js3.o(strL3, "getString(...)");
                            cv cvVar = Gender.d;
                            String str4 = (String) ((Pair) v48Var.getValue()).b;
                            cvVar.getClass();
                            Gender genderV = cv.v(str4);
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel2, strL2, strL3, stringArray2, genderV != null ? genderV.ordinal() : -1, null, false)), -1);
                            break;
                        } else if (iOrdinal2 == 4) {
                            ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                            clickEventBuilder4.b("profile_select_city");
                            clickEventBuilder4.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SelectCity(new em7(new DialogDataModel(myAccountRecyclerListFragment.R1(), "FRAGMENT_KEY_CITY", null, 12))), -1);
                            break;
                        } else if (iOrdinal2 == 5) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("profile_select_birthday");
                            clickEventBuilder5.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Birthday(new xb0(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIRTHDAY", null, 12), (String) ((Pair) v48Var.getValue()).b)), -1);
                            break;
                        }
                        break;
                    case 3:
                        int i7 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((MyAccountCheckBoxData) obj, "<unused var>");
                        DialogDataModel dialogDataModel3 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NO_RESULT", null, 12);
                        String string2 = myAccountRecyclerListFragment.K().getString(rs6.about_private_mode);
                        String string3 = myAccountRecyclerListFragment.K().getString(rs6.private_mode_dialog_description);
                        String string4 = myAccountRecyclerListFragment.K().getString(rs6.button_ok);
                        js3.o(string4, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel3, string2, string3, string4, 0)), -1);
                        break;
                    default:
                        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
                        int i8 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myAccount.recycler.d) qg5Var, "<unused var>");
                        js3.p(myAccountLinkItemData, "recyclerData");
                        v48 v48Var2 = myAccountLinkItemData.c.a;
                        if (((Pair) v48Var2.getValue()).a == MyAccountItemsType.h) {
                            ol3 ol3Var = PrivacyAccessLevel.c;
                            String str5 = (String) ((Pair) v48Var2.getValue()).b;
                            ol3Var.getClass();
                            Iterator it = ((z0) PrivacyAccessLevel.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (((PrivacyAccessLevel) next2).a.equalsIgnoreCase(str5)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            PrivacyAccessLevel privacyAccessLevel = (PrivacyAccessLevel) next2;
                            iOrdinal = privacyAccessLevel != null ? privacyAccessLevel.ordinal() : -1;
                            i22 = rs6.who_see_you;
                            str = "DIALOG_KEY_PRIVACY_LEVEL";
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_privacy_spinner_titles);
                            strL = null;
                        } else {
                            ql3 ql3Var = MessageAccessLevel.c;
                            String str6 = (String) ((Pair) v48Var2.getValue()).b;
                            ql3Var.getClass();
                            Iterator it2 = ((z0) MessageAccessLevel.f).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((MessageAccessLevel) next).a.equalsIgnoreCase(str6)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            MessageAccessLevel messageAccessLevel = (MessageAccessLevel) next;
                            iOrdinal = messageAccessLevel != null ? messageAccessLevel.ordinal() : -1;
                            i22 = rs6.followers_send_you_messages;
                            strL = myAccountRecyclerListFragment.L(rs6.account_massage_access_level_spinner_hint);
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_message_level_spinner_titles);
                            str = "DIALOG_KEY_MESSAGE_ACCESS_LEVEL";
                        }
                        int i9 = iOrdinal;
                        js3.m(stringArray);
                        DialogDataModel dialogDataModel4 = new DialogDataModel(myAccountRecyclerListFragment.S1(), str, null, 12);
                        String strL4 = myAccountRecyclerListFragment.L(i22);
                        js3.o(strL4, "getString(...)");
                        String strL5 = myAccountRecyclerListFragment.L(rs6.save);
                        js3.o(strL5, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel4, strL4, strL5, stringArray, i9, strL, false)), -1);
                        break;
                }
            }
        };
        gc5Var.q = new ur4(this, gc5Var, 8);
        final int i4 = 3;
        gc5Var.r = new og5(this) { // from class: sc5
            public final /* synthetic */ MyAccountRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Object next;
                int iOrdinal;
                int i22;
                String strL;
                String[] stringArray;
                String str;
                Object next2;
                int i32 = i4;
                MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
                switch (i32) {
                    case 0:
                        int i42 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((MyAccountHeaderData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("profile_avatar_camera");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", myAccountRecyclerListFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", myAccountRecyclerListFragment.L(rs6.take_photo)));
                        if (myAccountRecyclerListFragment.Q1().e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", myAccountRecyclerListFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    case 1:
                        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) obj;
                        int i5 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(myAccountHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("profile_avatar");
                        clickEventBuilder2.a();
                        String str2 = myAccountHeaderData.b;
                        if (str2 == null) {
                            str2 = (String) myAccountRecyclerListFragment.Q1().h.b;
                        }
                        if (str2 != null) {
                            bt5 bt5VarF = myAccountRecyclerListFragment.F();
                            zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                            if (zt5Var != null) {
                                ((LaunchContentActivity) zt5Var).s0(myAccountRecyclerListFragment.K().getDimensionPixelSize(pq6.space_8), str2);
                            }
                        }
                        break;
                    case 2:
                        MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
                        int i6 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(myAccountItemData, "recyclerData");
                        v48 v48Var = myAccountItemData.b.a;
                        int iOrdinal2 = ((MyAccountItemsType) ((Pair) v48Var.getValue()).a).ordinal();
                        if (iOrdinal2 == 1) {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("profile_name_edit");
                            clickEventBuilder3.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NAME", null, 12), null)), -1);
                            break;
                        } else if (iOrdinal2 == 2) {
                            DialogDataModel dialogDataModel = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIO", null, 12);
                            String string = myAccountRecyclerListFragment.K().getString(rs6.account_bio);
                            js3.o(string, "getString(...)");
                            String str3 = (String) ((Pair) v48Var.getValue()).b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Bio(new sb0(dialogDataModel, string, str3)), -1);
                            break;
                        } else if (iOrdinal2 == 3) {
                            String[] stringArray2 = myAccountRecyclerListFragment.K().getStringArray(mp6.gender_spinner_titles);
                            js3.o(stringArray2, "getStringArray(...)");
                            DialogDataModel dialogDataModel2 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_GENDER", null, 12);
                            String strL2 = myAccountRecyclerListFragment.L(rs6.account_gender);
                            js3.o(strL2, "getString(...)");
                            String strL3 = myAccountRecyclerListFragment.L(rs6.save);
                            js3.o(strL3, "getString(...)");
                            cv cvVar = Gender.d;
                            String str4 = (String) ((Pair) v48Var.getValue()).b;
                            cvVar.getClass();
                            Gender genderV = cv.v(str4);
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel2, strL2, strL3, stringArray2, genderV != null ? genderV.ordinal() : -1, null, false)), -1);
                            break;
                        } else if (iOrdinal2 == 4) {
                            ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                            clickEventBuilder4.b("profile_select_city");
                            clickEventBuilder4.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SelectCity(new em7(new DialogDataModel(myAccountRecyclerListFragment.R1(), "FRAGMENT_KEY_CITY", null, 12))), -1);
                            break;
                        } else if (iOrdinal2 == 5) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("profile_select_birthday");
                            clickEventBuilder5.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Birthday(new xb0(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIRTHDAY", null, 12), (String) ((Pair) v48Var.getValue()).b)), -1);
                            break;
                        }
                        break;
                    case 3:
                        int i7 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((MyAccountCheckBoxData) obj, "<unused var>");
                        DialogDataModel dialogDataModel3 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NO_RESULT", null, 12);
                        String string2 = myAccountRecyclerListFragment.K().getString(rs6.about_private_mode);
                        String string3 = myAccountRecyclerListFragment.K().getString(rs6.private_mode_dialog_description);
                        String string4 = myAccountRecyclerListFragment.K().getString(rs6.button_ok);
                        js3.o(string4, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel3, string2, string3, string4, 0)), -1);
                        break;
                    default:
                        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
                        int i8 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myAccount.recycler.d) qg5Var, "<unused var>");
                        js3.p(myAccountLinkItemData, "recyclerData");
                        v48 v48Var2 = myAccountLinkItemData.c.a;
                        if (((Pair) v48Var2.getValue()).a == MyAccountItemsType.h) {
                            ol3 ol3Var = PrivacyAccessLevel.c;
                            String str5 = (String) ((Pair) v48Var2.getValue()).b;
                            ol3Var.getClass();
                            Iterator it = ((z0) PrivacyAccessLevel.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (((PrivacyAccessLevel) next2).a.equalsIgnoreCase(str5)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            PrivacyAccessLevel privacyAccessLevel = (PrivacyAccessLevel) next2;
                            iOrdinal = privacyAccessLevel != null ? privacyAccessLevel.ordinal() : -1;
                            i22 = rs6.who_see_you;
                            str = "DIALOG_KEY_PRIVACY_LEVEL";
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_privacy_spinner_titles);
                            strL = null;
                        } else {
                            ql3 ql3Var = MessageAccessLevel.c;
                            String str6 = (String) ((Pair) v48Var2.getValue()).b;
                            ql3Var.getClass();
                            Iterator it2 = ((z0) MessageAccessLevel.f).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((MessageAccessLevel) next).a.equalsIgnoreCase(str6)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            MessageAccessLevel messageAccessLevel = (MessageAccessLevel) next;
                            iOrdinal = messageAccessLevel != null ? messageAccessLevel.ordinal() : -1;
                            i22 = rs6.followers_send_you_messages;
                            strL = myAccountRecyclerListFragment.L(rs6.account_massage_access_level_spinner_hint);
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_message_level_spinner_titles);
                            str = "DIALOG_KEY_MESSAGE_ACCESS_LEVEL";
                        }
                        int i9 = iOrdinal;
                        js3.m(stringArray);
                        DialogDataModel dialogDataModel4 = new DialogDataModel(myAccountRecyclerListFragment.S1(), str, null, 12);
                        String strL4 = myAccountRecyclerListFragment.L(i22);
                        js3.o(strL4, "getString(...)");
                        String strL5 = myAccountRecyclerListFragment.L(rs6.save);
                        js3.o(strL5, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel4, strL4, strL5, stringArray, i9, strL, false)), -1);
                        break;
                }
            }
        };
        final int i5 = 4;
        gc5Var.s = new og5(this) { // from class: sc5
            public final /* synthetic */ MyAccountRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Object next;
                int iOrdinal;
                int i22;
                String strL;
                String[] stringArray;
                String str;
                Object next2;
                int i32 = i5;
                MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
                switch (i32) {
                    case 0:
                        int i42 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((MyAccountHeaderData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("profile_avatar_camera");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", myAccountRecyclerListFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", myAccountRecyclerListFragment.L(rs6.take_photo)));
                        if (myAccountRecyclerListFragment.Q1().e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", myAccountRecyclerListFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    case 1:
                        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) obj;
                        int i52 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(myAccountHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("profile_avatar");
                        clickEventBuilder2.a();
                        String str2 = myAccountHeaderData.b;
                        if (str2 == null) {
                            str2 = (String) myAccountRecyclerListFragment.Q1().h.b;
                        }
                        if (str2 != null) {
                            bt5 bt5VarF = myAccountRecyclerListFragment.F();
                            zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                            if (zt5Var != null) {
                                ((LaunchContentActivity) zt5Var).s0(myAccountRecyclerListFragment.K().getDimensionPixelSize(pq6.space_8), str2);
                            }
                        }
                        break;
                    case 2:
                        MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
                        int i6 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(myAccountItemData, "recyclerData");
                        v48 v48Var = myAccountItemData.b.a;
                        int iOrdinal2 = ((MyAccountItemsType) ((Pair) v48Var.getValue()).a).ordinal();
                        if (iOrdinal2 == 1) {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("profile_name_edit");
                            clickEventBuilder3.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NAME", null, 12), null)), -1);
                            break;
                        } else if (iOrdinal2 == 2) {
                            DialogDataModel dialogDataModel = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIO", null, 12);
                            String string = myAccountRecyclerListFragment.K().getString(rs6.account_bio);
                            js3.o(string, "getString(...)");
                            String str3 = (String) ((Pair) v48Var.getValue()).b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Bio(new sb0(dialogDataModel, string, str3)), -1);
                            break;
                        } else if (iOrdinal2 == 3) {
                            String[] stringArray2 = myAccountRecyclerListFragment.K().getStringArray(mp6.gender_spinner_titles);
                            js3.o(stringArray2, "getStringArray(...)");
                            DialogDataModel dialogDataModel2 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_GENDER", null, 12);
                            String strL2 = myAccountRecyclerListFragment.L(rs6.account_gender);
                            js3.o(strL2, "getString(...)");
                            String strL3 = myAccountRecyclerListFragment.L(rs6.save);
                            js3.o(strL3, "getString(...)");
                            cv cvVar = Gender.d;
                            String str4 = (String) ((Pair) v48Var.getValue()).b;
                            cvVar.getClass();
                            Gender genderV = cv.v(str4);
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel2, strL2, strL3, stringArray2, genderV != null ? genderV.ordinal() : -1, null, false)), -1);
                            break;
                        } else if (iOrdinal2 == 4) {
                            ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                            clickEventBuilder4.b("profile_select_city");
                            clickEventBuilder4.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SelectCity(new em7(new DialogDataModel(myAccountRecyclerListFragment.R1(), "FRAGMENT_KEY_CITY", null, 12))), -1);
                            break;
                        } else if (iOrdinal2 == 5) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("profile_select_birthday");
                            clickEventBuilder5.a();
                            pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.Birthday(new xb0(new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_BIRTHDAY", null, 12), (String) ((Pair) v48Var.getValue()).b)), -1);
                            break;
                        }
                        break;
                    case 3:
                        int i7 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((MyAccountCheckBoxData) obj, "<unused var>");
                        DialogDataModel dialogDataModel3 = new DialogDataModel(myAccountRecyclerListFragment.S1(), "DIALOG_KEY_NO_RESULT", null, 12);
                        String string2 = myAccountRecyclerListFragment.K().getString(rs6.about_private_mode);
                        String string3 = myAccountRecyclerListFragment.K().getString(rs6.private_mode_dialog_description);
                        String string4 = myAccountRecyclerListFragment.K().getString(rs6.button_ok);
                        js3.o(string4, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel3, string2, string3, string4, 0)), -1);
                        break;
                    default:
                        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
                        int i8 = MyAccountRecyclerListFragment.m1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myAccount.recycler.d) qg5Var, "<unused var>");
                        js3.p(myAccountLinkItemData, "recyclerData");
                        v48 v48Var2 = myAccountLinkItemData.c.a;
                        if (((Pair) v48Var2.getValue()).a == MyAccountItemsType.h) {
                            ol3 ol3Var = PrivacyAccessLevel.c;
                            String str5 = (String) ((Pair) v48Var2.getValue()).b;
                            ol3Var.getClass();
                            Iterator it = ((z0) PrivacyAccessLevel.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (((PrivacyAccessLevel) next2).a.equalsIgnoreCase(str5)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            PrivacyAccessLevel privacyAccessLevel = (PrivacyAccessLevel) next2;
                            iOrdinal = privacyAccessLevel != null ? privacyAccessLevel.ordinal() : -1;
                            i22 = rs6.who_see_you;
                            str = "DIALOG_KEY_PRIVACY_LEVEL";
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_privacy_spinner_titles);
                            strL = null;
                        } else {
                            ql3 ql3Var = MessageAccessLevel.c;
                            String str6 = (String) ((Pair) v48Var2.getValue()).b;
                            ql3Var.getClass();
                            Iterator it2 = ((z0) MessageAccessLevel.f).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((MessageAccessLevel) next).a.equalsIgnoreCase(str6)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            MessageAccessLevel messageAccessLevel = (MessageAccessLevel) next;
                            iOrdinal = messageAccessLevel != null ? messageAccessLevel.ordinal() : -1;
                            i22 = rs6.followers_send_you_messages;
                            strL = myAccountRecyclerListFragment.L(rs6.account_massage_access_level_spinner_hint);
                            stringArray = myAccountRecyclerListFragment.K().getStringArray(mp6.account_message_level_spinner_titles);
                            str = "DIALOG_KEY_MESSAGE_ACCESS_LEVEL";
                        }
                        int i9 = iOrdinal;
                        js3.m(stringArray);
                        DialogDataModel dialogDataModel4 = new DialogDataModel(myAccountRecyclerListFragment.S1(), str, null, 12);
                        String strL4 = myAccountRecyclerListFragment.L(i22);
                        js3.o(strL4, "getString(...)");
                        String strL5 = myAccountRecyclerListFragment.L(rs6.save);
                        js3.o(strL5, "getString(...)");
                        pk5.g(myAccountRecyclerListFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel4, strL4, strL5, stringArray, i9, strL, false)), -1);
                        break;
                }
            }
        };
        return gc5Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        TryAgainView tryAgainViewC1 = C1();
        if (tryAgainViewC1 != null) {
            tryAgainViewC1.setColors(sj8.b().p);
        }
        this.J0.d(S1(), this);
        this.J0.d(R1(), this);
        bt2.G(androidx.lifecycle.b.a(N()), null, null, new MyAccountRecyclerListFragment$onViewCreated$1(this, null), 3);
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new MyAccountRecyclerListFragment$onViewCreated$2(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final k k1() {
        MyketStaggeredLayoutManager myketStaggeredLayoutManager = new MyketStaggeredLayoutManager(v1());
        myketStaggeredLayoutManager.N = u1();
        return myketStaggeredLayoutManager;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.viewModel.c l1() {
        return T1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final View p1(ViewGroup viewGroup) {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return fp6.layout_animation_fall_down_fast;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new nv2(K().getDimensionPixelSize(pq6.space_xl), K().getDimensionPixelSize(pq6.space_xl));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new PaddingLayoutManager$Padding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.my_account_max_span);
    }
}
