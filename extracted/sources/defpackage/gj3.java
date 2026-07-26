package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$Event;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class gj3 implements b64 {
    public static final c24 b = a.a(new qq1(11));
    public final ComponentActivity a;

    public gj3(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event != Lifecycle$Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.a.getSystemService("input_method");
        js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        dj3 dj3Var = (dj3) b.getValue();
        Object objB = dj3Var.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = dj3Var.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = dj3Var.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
