package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class x12 {
    public final /* synthetic */ y12 a;

    public x12(y12 y12Var) {
        this.a = y12Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        y12 y12Var = this.a;
        w12 w12Var = y12Var.v;
        if (y12Var.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = y12Var.s;
        if (editText != null) {
            editText.removeTextChangedListener(w12Var);
            if (y12Var.s.getOnFocusChangeListener() == y12Var.b().e()) {
                y12Var.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        y12Var.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(w12Var);
        }
        y12Var.b().l(y12Var.s);
        y12Var.j(y12Var.b());
    }
}
