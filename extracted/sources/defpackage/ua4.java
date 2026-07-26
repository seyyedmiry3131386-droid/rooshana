package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ua4 implements ir5 {
    public final xg5 a;
    public boolean b = false;

    public ua4(fj9 fj9Var, xg5 xg5Var) {
        this.a = xg5Var;
    }

    @Override // defpackage.ir5
    public final void a(Object obj) {
        this.b = true;
        xg5 xg5Var = this.a;
        xg5Var.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) xg5Var.b;
        signInHubActivity.setResult(signInHubActivity.E, signInHubActivity.F);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.a.toString();
    }
}
