package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.text.contextmenu.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ei(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                bp2 bp2Var = (bp2) obj;
                View view = this.b.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    bp2Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new d8(2, bp2Var));
                    }
                }
                return tx8.a;
            case 1:
                ActionMode actionMode = this.b.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return tx8.a;
            case 2:
                ActionMode actionMode2 = this.b.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return tx8.a;
            default:
                a aVar = this.b;
                aVar.e.e();
                return new pf(3, aVar);
        }
    }
}
