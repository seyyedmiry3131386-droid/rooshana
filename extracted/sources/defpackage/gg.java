package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class gg implements gc2 {
    public final AutofillValue a;

    public gg(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Boolean a() {
        if (this.a.isToggle()) {
            return Boolean.valueOf(this.a.getToggleValue());
        }
        return null;
    }

    public final CharSequence b() {
        if (this.a.isText()) {
            return this.a.getTextValue();
        }
        return null;
    }
}
