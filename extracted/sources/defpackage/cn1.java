package defpackage;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.g;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 implements ir5 {
    public final /* synthetic */ DialogFragment a;

    public cn1(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // defpackage.ir5
    public final void a(Object obj) {
        if (((g64) obj) != null) {
            DialogFragment dialogFragment = this.a;
            if (dialogFragment.H0) {
                View viewS0 = dialogFragment.s0();
                if (viewS0.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogFragment.L0 != null) {
                    if (g.N(3)) {
                        Objects.toString(dialogFragment.L0);
                    }
                    dialogFragment.L0.setContentView(viewS0);
                }
            }
        }
    }
}
