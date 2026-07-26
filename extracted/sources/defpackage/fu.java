package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.d;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public final class fu implements br2 {
    public final /* synthetic */ int a = 2;
    public final Object b = new Object();
    public volatile ar2 c;
    public final Object d;

    public fu(pj9 pj9Var) {
        this.d = pj9Var;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    private final Object d() {
        if (((w91) this.c) == null) {
            synchronized (this.b) {
                try {
                    if (((w91) this.c) == null) {
                        this.c = new w91(new gu((ApplicationLauncher) ((pj9) this.d).a, false), new cv(11), new fv(15), new rl3());
                    }
                } finally {
                }
            }
        }
        return (w91) this.c;
    }

    private final Object f() {
        if (((t91) this.c) == null) {
            synchronized (this.b) {
                try {
                    if (((t91) this.c) == null) {
                        this.c = a();
                    }
                } finally {
                }
            }
        }
        return (t91) this.c;
    }

    public t91 a() {
        d dVar = (d) this.d;
        tk2 tk2Var = dVar.w;
        if ((tk2Var == null ? null : tk2Var.w) == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        y97.q((tk2Var == null ? null : tk2Var.w) instanceof br2, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (tk2Var == null ? null : tk2Var.w).getClass());
        tk2 tk2Var2 = dVar.w;
        q91 q91Var = (q91) ((cl2) rq4.x(cl2.class, tk2Var2 != null ? tk2Var2.w : null));
        return new t91(q91Var.a, q91Var.b, q91Var.c);
    }

    public u91 b() {
        View view = (View) this.d;
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !br2.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application applicationO = m91.o(context.getApplicationContext());
        Object obj = context;
        if (context == applicationO) {
            y97.q(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass());
            obj = null;
        }
        if (obj instanceof br2) {
            w91 w91Var = ((q91) ((s69) rq4.x(s69.class, (br2) obj))).a;
            view.getClass();
            return new u91(w91Var);
        }
        throw new IllegalStateException(view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // defpackage.br2
    public final Object e() {
        switch (this.a) {
            case 0:
                return d();
            case 1:
                return f();
            default:
                if (((u91) this.c) == null) {
                    synchronized (this.b) {
                        try {
                            if (((u91) this.c) == null) {
                                this.c = b();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return (u91) this.c;
        }
    }

    public fu(d dVar) {
        this.d = dVar;
    }

    public fu(View view) {
        this.d = view;
    }
}
