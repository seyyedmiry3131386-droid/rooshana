package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class w12 extends oj8 {
    public final /* synthetic */ y12 a;

    public w12(y12 y12Var) {
        this.a = y12Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // defpackage.oj8, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
