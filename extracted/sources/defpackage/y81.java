package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class y81 extends z12 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y81(y12 y12Var, int i) {
        super(y12Var);
        this.e = i;
    }

    @Override // defpackage.z12
    public void q() {
        switch (this.e) {
            case 0:
                y12 y12Var = this.b;
                y12Var.o = null;
                CheckableImageButton checkableImageButton = y12Var.g;
                checkableImageButton.setOnLongClickListener(null);
                dt2.D(checkableImageButton, null);
                break;
        }
    }
}
