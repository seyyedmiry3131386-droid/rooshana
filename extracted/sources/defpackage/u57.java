package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import com.bumptech.glide.a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u57 implements Handler.Callback {
    public static final ql3 f = new ql3();
    public volatile s57 a;
    public final t57 b;
    public final wv c = new wv(0);
    public final jo2 d;
    public final nc2 e;

    public u57(t57 t57Var) {
        t57Var = t57Var == null ? f : t57Var;
        this.b = t57Var;
        this.e = new nc2(t57Var);
        this.d = (cx2.f && cx2.e) ? new fd2() : new cv(15);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, wv wvVar) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar != null && (obj = dVar.J) != null) {
                wvVar.put(obj, dVar);
                b(dVar.G().c.S(), wvVar);
            }
        }
    }

    public final s57 c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = i29.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return e((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.b.a(a.a(context.getApplicationContext()), new th0(29), new cv(17), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public final s57 d(d dVar) {
        View view;
        ok4.p(dVar.H(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = i29.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(dVar.H().getApplicationContext());
        }
        if (dVar.F() != null) {
            this.d.i(dVar.F());
        }
        g gVarG = dVar.G();
        Context contextH = dVar.H();
        return this.e.r(contextH, a.a(contextH.getApplicationContext()), dVar.U, gVarG, (!dVar.Q() || dVar.R() || (view = dVar.J) == null || view.getWindowToken() == null || dVar.J.getVisibility() != 0) ? false : true);
    }

    public final s57 e(FragmentActivity fragmentActivity) {
        char[] cArr = i29.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.d.i(fragmentActivity);
        Activity activityA = a(fragmentActivity);
        return this.e.r(fragmentActivity, a.a(fragmentActivity.getApplicationContext()), fragmentActivity.a, fragmentActivity.L(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
