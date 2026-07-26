package ir.mservices.market.myAccount.city;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.js3;
import ir.mservices.market.myAccount.city.SelectCityAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements TextWatcher {
    public final /* synthetic */ SelectCityFragment a;

    public a(SelectCityFragment selectCityFragment) {
        this.a = selectCityFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        js3.p(editable, "s");
        int i = SelectCityFragment.n1;
        SelectCityFragment selectCityFragment = this.a;
        selectCityFragment.Q1().r(new SelectCityAction.UpdateQueryAction(editable.toString()));
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = selectCityFragment.Z0;
        if (aVar != null) {
            aVar.A();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        js3.p(charSequence, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        js3.p(charSequence, "s");
    }
}
