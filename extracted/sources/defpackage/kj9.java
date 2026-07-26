package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kj9 extends au2 {
    public final GoogleSignInOptions b;

    public kj9(Context context, Looper looper, on onVar, GoogleSignInOptions googleSignInOptions, wh9 wh9Var, wh9 wh9Var2) {
        mu2 mu2Var;
        super(context, looper, 91, onVar, wh9Var, wh9Var2, 0);
        Set<Scope> set = (Set) onVar.b;
        if (googleSignInOptions != null) {
            mu2Var = new mu2();
            mu2Var.a = new HashSet();
            mu2Var.h = new HashMap();
            mu2Var.a = new HashSet(googleSignInOptions.b);
            mu2Var.b = googleSignInOptions.e;
            mu2Var.c = googleSignInOptions.f;
            mu2Var.d = googleSignInOptions.d;
            mu2Var.e = googleSignInOptions.g;
            mu2Var.f = googleSignInOptions.c;
            mu2Var.g = googleSignInOptions.h;
            mu2Var.h = GoogleSignInOptions.U(googleSignInOptions.i);
            mu2Var.i = googleSignInOptions.j;
        } else {
            mu2Var = new mu2();
            mu2Var.a = new HashSet();
            mu2Var.h = new HashMap();
        }
        byte[] bArr = new byte[16];
        cj9.a.nextBytes(bArr);
        mu2Var.i = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = mu2Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = mu2Var.a;
        if (hashSet2.contains(GoogleSignInOptions.n)) {
            Scope scope2 = GoogleSignInOptions.m;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (mu2Var.d && (mu2Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.l);
        }
        this.b = new GoogleSignInOptions(3, new ArrayList(hashSet2), mu2Var.f, mu2Var.d, mu2Var.b, mu2Var.c, mu2Var.e, mu2Var.g, mu2Var.h, mu2Var.i);
    }

    @Override // defpackage.d70
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof rj9 ? (rj9) iInterfaceQueryLocalInterface : new rj9(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.d70
    public final Intent getSignInIntent() {
        Context context = getContext();
        pg pgVar = oj9.a;
        if (pgVar.b <= 3) {
            ((String) pgVar.d).concat("getSignInIntent()");
        }
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.b);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // defpackage.d70
    public final boolean providesSignIn() {
        return true;
    }
}
