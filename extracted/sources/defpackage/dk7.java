package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import ir.mservices.market.common.search.a;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class dk7 implements TextWatcher {
    public String a;
    public String b;
    public final /* synthetic */ SearchView c;

    public dk7(SearchView searchView) {
        this.c = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        js3.p(editable, "s");
        SearchView searchView = this.c;
        if (searchView.n) {
            if (m88.T(this.a, this.b, true)) {
                String str = this.a;
                if (str != null && !f88.n0(str)) {
                    return;
                }
                String str2 = this.b;
                if (str2 != null && !f88.n0(str2)) {
                    return;
                }
            }
            searchView.p = editable.toString();
            hk7 searchCallback = searchView.getSearchCallback();
            if (searchCallback != null) {
                ((a) searchCallback).c(searchView.p);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        js3.p(charSequence, "s");
        this.a = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        js3.p(charSequence, "s");
        this.b = charSequence.toString();
        SearchView searchView = this.c;
        if (searchView.n) {
            searchView.d(charSequence.toString());
        }
    }
}
