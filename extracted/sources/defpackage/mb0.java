package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import ir.mservices.market.feedback.recycler.FeedbackBodyData;
import ir.mservices.market.feedback.recycler.FeedbackPhoneNumberData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.login.ui.LoginDialogFragment;
import ir.mservices.market.login.ui.PinLoginDialogFragment;
import ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment;
import ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment;
import ir.mservices.market.social.list.common.ProfileListTitleDialogFragment;
import ir.mservices.market.social.welcome.recycler.c;
import ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment;
import ir.mservices.market.views.BindAutoCompleteView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class mb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        int i = this.a;
        boolean z = false;
        z = false;
        z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                BindAutoCompleteView bindAutoCompleteView = (BindAutoCompleteView) obj;
                Drawable drawable = bindAutoCompleteView.t;
                if (drawable != null) {
                    drawable.setColorFilter(editable.length() > 0 ? bindAutoCompleteView.getCurrentTextColor() : bindAutoCompleteView.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                }
                Drawable drawable2 = bindAutoCompleteView.r;
                if (drawable2 != null) {
                    drawable2.setColorFilter(editable.length() > 0 ? bindAutoCompleteView.getCurrentTextColor() : bindAutoCompleteView.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                }
                Drawable drawable3 = bindAutoCompleteView.q;
                if (drawable3 != null) {
                    drawable3.setColorFilter(editable.length() > 0 ? bindAutoCompleteView.getCurrentTextColor() : bindAutoCompleteView.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                }
                Drawable drawable4 = bindAutoCompleteView.s;
                if (drawable4 != null) {
                    drawable4.setColorFilter(editable.length() > 0 ? bindAutoCompleteView.getCurrentTextColor() : bindAutoCompleteView.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                }
                break;
            case 1:
                BioBottomDialogFragment bioBottomDialogFragment = (BioBottomDialogFragment) obj;
                h4 h4Var = bioBottomDialogFragment.h1;
                js3.m(h4Var);
                h4Var.B.setVisibility(4);
                h4 h4Var2 = bioBottomDialogFragment.h1;
                js3.m(h4Var2);
                h4Var2.y.setErrorEnabled(false);
                break;
            case 2:
                js3.p(editable, "s");
                xb5 xb5Var = ((FeedbackBodyData) obj).a;
                do {
                    lVar = (l) xb5Var;
                    value = lVar.getValue();
                } while (!lVar.n(value, new aa2(editable.toString())));
                break;
            case 3:
                xb5 xb5Var2 = ((FeedbackPhoneNumberData) obj).a;
                do {
                    lVar2 = (l) xb5Var2;
                    value2 = lVar2.getValue();
                } while (!lVar2.n(value2, new aa2(String.valueOf(editable))));
                break;
            case 4:
                js3.p(editable, "s");
                LoginDialogFragment loginDialogFragment = (LoginDialogFragment) obj;
                ml2 ml2Var = loginDialogFragment.n1;
                js3.m(ml2Var);
                ml2Var.w.setErrorEnabled(false);
                ml2 ml2Var2 = loginDialogFragment.n1;
                js3.m(ml2Var2);
                ml2Var2.v.setVisibility(4);
                String string = editable.toString();
                ml2 ml2Var3 = loginDialogFragment.n1;
                js3.m(ml2Var3);
                ml2Var3.x.setCommitButtonEnable(!f88.n0(string), sj8.b().d);
                break;
            case 5:
                MyketEditText myketEditText = (MyketEditText) obj;
                if (!myketEditText.q) {
                    Drawable drawable5 = myketEditText.o;
                    if (drawable5 != null) {
                        drawable5.setColorFilter(editable.length() > 0 ? myketEditText.getCurrentTextColor() : myketEditText.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                    }
                    Drawable drawable6 = myketEditText.m;
                    if (drawable6 != null) {
                        drawable6.setColorFilter(editable.length() > 0 ? myketEditText.getCurrentTextColor() : myketEditText.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                    }
                    Drawable drawable7 = myketEditText.l;
                    if (drawable7 != null) {
                        drawable7.setColorFilter(editable.length() > 0 ? myketEditText.getCurrentTextColor() : myketEditText.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                    }
                    Drawable drawable8 = myketEditText.n;
                    if (drawable8 != null) {
                        drawable8.setColorFilter(editable.length() > 0 ? myketEditText.getCurrentTextColor() : myketEditText.getCurrentHintTextColor(), PorterDuff.Mode.MULTIPLY);
                    }
                    break;
                }
                break;
            case 6:
                NicknameDialogFragment nicknameDialogFragment = (NicknameDialogFragment) obj;
                d5 d5Var = nicknameDialogFragment.j1;
                js3.m(d5Var);
                DialogButtonComponent dialogButtonComponent = d5Var.w;
                js3.m(nicknameDialogFragment.j1);
                dialogButtonComponent.setCommitButtonEnable(!f88.n0(r0.A.getEditableText().toString()), sj8.b().d);
                d5 d5Var2 = nicknameDialogFragment.j1;
                js3.m(d5Var2);
                d5Var2.z.setErrorEnabled(false);
                d5 d5Var3 = nicknameDialogFragment.j1;
                js3.m(d5Var3);
                d5Var3.y.setVisibility(4);
                break;
            case 7:
                js3.p(editable, "s");
                PinLoginDialogFragment pinLoginDialogFragment = (PinLoginDialogFragment) obj;
                wn2 wn2Var = pinLoginDialogFragment.n1;
                js3.m(wn2Var);
                wn2Var.w.setErrorEnabled(false);
                wn2 wn2Var2 = pinLoginDialogFragment.n1;
                js3.m(wn2Var2);
                wn2Var2.v.setVisibility(4);
                if (!((Boolean) pinLoginDialogFragment.f1().j.a.getValue()).booleanValue()) {
                    PinBindData pinBindData = (PinBindData) pinLoginDialogFragment.f1().v.a.getValue();
                    int i2 = pinBindData != null ? pinBindData.c : 0;
                    if (i2 != 0 && editable.length() == i2) {
                        pinLoginDialogFragment.g1();
                        z = true;
                    }
                }
                pinLoginDialogFragment.e1(z);
                if (!z) {
                    String string2 = editable.toString();
                    wn2 wn2Var3 = pinLoginDialogFragment.n1;
                    js3.m(wn2Var3);
                    wn2Var3.x.setCommitButtonEnable(!f88.n0(string2), sj8.b().d);
                }
                break;
            case 8:
                ProfileListTitleDialogFragment profileListTitleDialogFragment = (ProfileListTitleDialogFragment) obj;
                wm1 wm1Var = profileListTitleDialogFragment.i1;
                js3.m(wm1Var);
                wm1Var.w.setCommitButtonEnable(!(editable == null || f88.n0(editable)), sj8.b().d);
                wm1 wm1Var2 = profileListTitleDialogFragment.i1;
                js3.m(wm1Var2);
                wm1Var2.y.setErrorEnabled(false);
                wm1 wm1Var3 = profileListTitleDialogFragment.i1;
                js3.m(wm1Var3);
                wm1Var3.x.setVisibility(4);
                break;
            case 9:
                js3.p(editable, "s");
                oh7 oh7Var = (oh7) obj;
                ImageView imageView = oh7Var.x().v;
                js3.o(imageView, "close");
                imageView.setVisibility(editable.length() <= 0 ? 8 : 0);
                nm5 nm5Var = oh7Var.x;
                String string3 = editable.toString();
                nm5Var.getClass();
                js3.p(string3, "query");
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = (InstalledAppsRecyclerListFragment) nm5Var.b;
                int i3 = InstalledAppsRecyclerListFragment.n1;
                installedAppsRecyclerListFragment.R1().r(string3);
                break;
            case 10:
            case 11:
                break;
            case 12:
                js3.p(editable, "s");
                ((SendReplyBottomDialogFragment) obj).V0(editable.toString());
                break;
            default:
                c cVar = (c) obj;
                og5 og5Var = cVar.w;
                View view = cVar.a;
                js3.o(view, "itemView");
                og5Var.m(view, cVar, String.valueOf(editable));
                cVar.y().v.setVisibility(4);
                cVar.y().w.setErrorEnabled(false);
                if (editable == null || f88.n0(editable)) {
                    String string4 = cVar.a.getResources().getString(rs6.account_state_nickname_length_error);
                    js3.o(string4, "getString(...)");
                    c.x(cVar, string4);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 2:
            case 4:
            case 7:
            case 9:
            case 12:
                js3.p(charSequence, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 2:
                js3.p(charSequence, "s");
                break;
            case 4:
                js3.p(charSequence, "s");
                break;
            case 7:
                js3.p(charSequence, "s");
                break;
            case 9:
                js3.p(charSequence, "s");
                break;
            case 10:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.p.getText();
                searchView.V = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                int i4 = 8;
                if (searchView.U && !searchView.N && zIsEmpty) {
                    searchView.u.setVisibility(8);
                    i4 = 0;
                }
                searchView.w.setVisibility(i4);
                searchView.r();
                searchView.u();
                charSequence.toString();
                break;
            case 11:
                ((com.google.android.material.search.SearchView) this.b).l.setVisibility(charSequence.length() > 0 ? 0 : 8);
                break;
            case 12:
                js3.p(charSequence, "s");
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }
}
