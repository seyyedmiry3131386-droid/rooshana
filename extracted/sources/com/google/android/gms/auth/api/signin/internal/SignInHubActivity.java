package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import defpackage.e68;
import defpackage.fj9;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.m28;
import defpackage.o77;
import defpackage.pj9;
import defpackage.ps0;
import defpackage.ta4;
import defpackage.u79;
import defpackage.ua4;
import defpackage.va4;
import defpackage.xg5;
import io.sentry.android.core.t0;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends FragmentActivity {
    public static boolean G = false;
    public boolean B = false;
    public SignInConfiguration C;
    public boolean D;
    public int E;
    public Intent F;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void O() {
        u79 u79VarM = m();
        js3.p(u79VarM, "store");
        j71 j71Var = j71.b;
        js3.p(j71Var, "defaultCreationExtras");
        o77 o77Var = new o77(u79VarM, va4.d, j71Var);
        ps0 ps0VarA = g27.a(va4.class);
        String strB = ps0VarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        va4 va4Var = (va4) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        xg5 xg5Var = new xg5(19, this);
        boolean z = va4Var.c;
        m28 m28Var = va4Var.b;
        if (z) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        ta4 ta4Var = (ta4) m28Var.c(0);
        if (ta4Var == null) {
            try {
                va4Var.c = true;
                fj9 fj9Var = new fj9(this, GoogleApiClient.a());
                if (fj9.class.isMemberClass() && !Modifier.isStatic(fj9.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fj9Var);
                }
                ta4 ta4Var2 = new ta4(fj9Var);
                m28Var.e(0, ta4Var2);
                va4Var.c = false;
                ua4 ua4Var = new ua4(ta4Var2.l, xg5Var);
                ta4Var2.d(this, ua4Var);
                ua4 ua4Var2 = ta4Var2.n;
                if (ua4Var2 != null) {
                    ta4Var2.g(ua4Var2);
                }
                ta4Var2.m = this;
                ta4Var2.n = ua4Var;
            } catch (Throwable th) {
                va4Var.c = false;
                throw th;
            }
        } else {
            ua4 ua4Var3 = new ua4(ta4Var.l, xg5Var);
            ta4Var.d(this, ua4Var3);
            ua4 ua4Var4 = ta4Var.n;
            if (ua4Var4 != null) {
                ta4Var.g(ua4Var4);
            }
            ta4Var.m = this;
            ta4Var.n = ua4Var3;
        }
        G = false;
    }

    public final void P(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        G = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.B) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                pj9 pj9VarY = pj9.y(this);
                GoogleSignInOptions googleSignInOptions = this.C.b;
                synchronized (pj9VarY) {
                    ((e68) pj9VarY.a).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.D = true;
                this.E = i2;
                this.F = intent;
                O();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                P(intExtra);
                return;
            }
        }
        P(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            t0.d("AuthSignInClient", "Null action");
            P(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            t0.d("AuthSignInClient", "Action not implemented");
            P(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            t0.d("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            t0.d("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            t0.d("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.C = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.D = z;
            if (z) {
                this.E = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.F = intent2;
                    O();
                    return;
                } else {
                    t0.d("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (G) {
            setResult(0);
            P(12502);
            return;
        }
        G = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.C);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.B = true;
            t0.m("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            P(17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        G = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.D);
        if (this.D) {
            bundle.putInt("signInResultCode", this.E);
            bundle.putParcelable("signInResultData", this.F);
        }
    }
}
