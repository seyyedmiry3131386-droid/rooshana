package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class r26 extends z12 {
    public final int e;
    public EditText f;
    public final cd g;

    public r26(y12 y12Var, int i) {
        super(y12Var);
        this.e = xq6.design_password_eye;
        this.g = new cd(20, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.z12
    public final void b() {
        p();
    }

    @Override // defpackage.z12
    public final int c() {
        return ft6.password_toggle_content_description;
    }

    @Override // defpackage.z12
    public final int d() {
        return this.e;
    }

    @Override // defpackage.z12
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.z12
    public final boolean j() {
        return true;
    }

    @Override // defpackage.z12
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.z12
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.z12
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.z12
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
