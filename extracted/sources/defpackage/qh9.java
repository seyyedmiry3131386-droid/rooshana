package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class qh9 extends ml9 {
    public final /* synthetic */ int n;

    @Override // defpackage.ml9
    public sl i(Context context, Looper looper, on onVar, Object obj, iu2 iu2Var, ju2 ju2Var) {
        switch (this.n) {
            case 0:
                onVar.getClass();
                Integer num = (Integer) onVar.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new bw7(context, looper, onVar, bundle, iu2Var, ju2Var);
            case 1:
                throw bl4.n(obj);
            case 2:
            case 3:
            case 6:
            default:
                return super.i(context, looper, onVar, obj, iu2Var, ju2Var);
            case 4:
                return new hj9(context, looper, onVar, (ij9) obj, (wh9) iu2Var, (wh9) ju2Var);
            case 5:
                return new kj9(context, looper, onVar, (GoogleSignInOptions) obj, (wh9) iu2Var, (wh9) ju2Var);
            case 7:
                if (obj != null) {
                    throw new ClassCastException();
                }
                zm9 zm9Var = new zm9(context, looper, onVar, (wh9) iu2Var, (wh9) ju2Var);
                zm9Var.b = zm9Var.hashCode();
                return zm9Var;
            case 8:
                return new lk9(context, looper, 45, onVar, iu2Var, ju2Var, 0);
        }
    }

    @Override // defpackage.ml9
    public sl j(Context context, Looper looper, on onVar, Object obj, wh9 wh9Var, wh9 wh9Var2) {
        switch (this.n) {
            case 2:
                return new uh9(context, looper, 449, onVar, wh9Var, wh9Var2, 0);
            case 3:
                return new aj9(context, looper, onVar, (lf8) obj, wh9Var, wh9Var2);
            case 4:
            case 5:
            default:
                return super.j(context, looper, onVar, obj, wh9Var, wh9Var2);
            case 6:
                return new lx9(context, looper, 126, onVar, wh9Var, wh9Var2, 0);
        }
    }
}
