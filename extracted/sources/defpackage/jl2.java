package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.k;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.fragment.app.h;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class jl2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;

    public jl2(kl2 kl2Var, h hVar) {
        this.c = kl2Var;
        this.b = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                d dVar = hVar.c;
                hVar.k();
                c.j((ViewGroup) dVar.J.getParent(), ((kl2) this.c).a).i();
                break;
            case 1:
                js3.p(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity2 = (Activity) ((WeakReference) this.c).get();
                IBinder iBinder = (activity2 == null || (window = activity2.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity2 != null && iBinder != null) {
                    ((yv7) this.b).c(iBinder, activity2);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                js3.p(view, "view");
                break;
            default:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((k) this.c).E();
                break;
        }
    }

    public jl2(yv7 yv7Var, Activity activity2) {
        js3.p(yv7Var, "sidecarCompat");
        this.b = yv7Var;
        this.c = new WeakReference(activity2);
    }

    public jl2(View view, k kVar) {
        this.b = view;
        this.c = kVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
