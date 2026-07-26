package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class re implements e30 {
    public final AndroidComposeView a;
    public final m30 b;
    public final AutofillManager c;
    public final AutofillId d;

    public re(AndroidComposeView androidComposeView, m30 m30Var) {
        this.a = androidComposeView;
        this.b = m30Var;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        k30 k30VarD = lb7.d(androidComposeView);
        AutofillId autofillId = k30VarD != null ? (AutofillId) k30VarD.a : null;
        if (autofillId == null) {
            throw t61.r("Required value was null.");
        }
        this.d = autofillId;
    }
}
