package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class n00 {
    public final /* synthetic */ int a;
    public final Handler b;
    public final b62 c;

    public n00(Handler handler, b62 b62Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                if (b62Var != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.b = handler;
                this.c = b62Var;
                break;
            default:
                this.b = handler;
                this.c = b62Var;
                break;
        }
    }

    private final void b(ec1 ec1Var) {
        synchronized (ec1Var) {
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new i00(this, ec1Var, 0));
        }
    }

    public final void a(ec1 ec1Var) {
        switch (this.a) {
            case 0:
                b(ec1Var);
                break;
            default:
                synchronized (ec1Var) {
                }
                Handler handler = this.b;
                if (handler != null) {
                    handler.post(new t59(this, ec1Var, 1));
                }
                break;
        }
    }

    public void c(w59 w59Var) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new lo4(this, w59Var, 29));
        }
    }
}
