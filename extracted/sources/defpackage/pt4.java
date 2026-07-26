package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class pt4 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, fu4 {
    public p98 a;
    public ld b;
    public c94 c;

    @Override // defpackage.fu4
    public final void d(ot4 ot4Var, boolean z) {
        ld ldVar;
        if ((z || ot4Var == this.a) && (ldVar = this.b) != null) {
            ldVar.dismiss();
        }
    }

    @Override // defpackage.fu4
    public final boolean l(ot4 ot4Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        p98 p98Var = this.a;
        c94 c94Var = this.c;
        if (c94Var.g == null) {
            c94Var.g = new b94(c94Var);
        }
        p98Var.q(c94Var.g.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.d(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        p98 p98Var = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                p98Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return p98Var.performShortcut(i, keyEvent, 0);
    }
}
