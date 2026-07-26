package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ez0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ez0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.a) {
            case 0:
                ((li1) this.b).g(null);
                break;
            default:
                f fVar = (f) this.b;
                if (fVar != null) {
                    x44 x44Var = fVar.d;
                    if (x44Var != null) {
                        x44Var.e(zi8.b);
                    }
                    x44 x44Var2 = fVar.d;
                    if (x44Var2 != null) {
                        x44Var2.f(zi8.b);
                    }
                }
                break;
        }
    }
}
