package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import ir.mservices.market.common.search.a;
import ir.mservices.market.login.ui.LoginDialogFragment;
import ir.mservices.market.login.ui.PinLoginDialogFragment;
import ir.mservices.market.myAccount.city.SelectCityAction;
import ir.mservices.market.myAccount.city.SelectCityFragment;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ud4 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ud4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                LoginDialogFragment loginDialogFragment = (LoginDialogFragment) obj;
                if (i != 5) {
                    return false;
                }
                loginDialogFragment.f1();
                return true;
            case 1:
                PinLoginDialogFragment pinLoginDialogFragment = (PinLoginDialogFragment) obj;
                if (i != 5 || ((Boolean) pinLoginDialogFragment.f1().j.a.getValue()).booleanValue()) {
                    return false;
                }
                wn2 wn2Var = pinLoginDialogFragment.n1;
                js3.m(wn2Var);
                Editable text = wn2Var.y.getText();
                if ((text != null ? text.length() : 0) > 0) {
                    wn2 wn2Var2 = pinLoginDialogFragment.n1;
                    js3.m(wn2Var2);
                    wn2Var2.w.setErrorEnabled(false);
                    pinLoginDialogFragment.g1();
                } else {
                    wn2 wn2Var3 = pinLoginDialogFragment.n1;
                    js3.m(wn2Var3);
                    wn2Var3.v.setVisibility(0);
                    wn2 wn2Var4 = pinLoginDialogFragment.n1;
                    js3.m(wn2Var4);
                    wn2Var4.v.setText(rs6.bind_verify_phone_empty_message);
                    wn2 wn2Var5 = pinLoginDialogFragment.n1;
                    js3.m(wn2Var5);
                    wn2Var5.w.setErrorEnabled(true);
                    pinLoginDialogFragment.T0();
                }
                return true;
            case 2:
                oh7 oh7Var = (oh7) obj;
                if (i != 3) {
                    return false;
                }
                textView.clearFocus();
                if (oh7Var.A != null) {
                    lw8.a(textView);
                    return true;
                }
                js3.V("uiUtils");
                throw null;
            case 3:
                SearchView searchView = (SearchView) obj;
                boolean z = SearchView.r;
                CharSequence text2 = textView.getText();
                if (text2 == null || f88.n0(text2)) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(10.0f, -10.0f, 0.0f, 0.0f);
                    translateAnimation.setRepeatCount(2);
                    translateAnimation.setDuration(100L);
                    textView.startAnimation(translateAnimation);
                } else {
                    hk7 hk7Var = searchView.i;
                    if (hk7Var != null) {
                        ((a) hk7Var).a();
                    }
                    hk7 hk7Var2 = searchView.i;
                    if (hk7Var2 != null) {
                        ((a) hk7Var2).b(textView.getText().toString(), "Manual");
                    }
                }
                return true;
            default:
                SelectCityFragment selectCityFragment = (SelectCityFragment) obj;
                int i3 = SelectCityFragment.n1;
                selectCityFragment.R1();
                lw8.b(selectCityFragment.F());
                selectCityFragment.R1();
                hs0 hs0Var = selectCityFragment.l1;
                js3.m(hs0Var);
                lw8.a(hs0Var.v);
                selectCityFragment.Q1().r(new SelectCityAction.UpdateQueryAction(textView.getText().toString()));
                ir.mservices.market.version2.ui.recycler.adapter.a aVar = selectCityFragment.Z0;
                if (aVar != null) {
                    aVar.A();
                }
                return true;
        }
    }
}
