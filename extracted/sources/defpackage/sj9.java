package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class sj9 extends ei9 {
    public final RevocationBoundService o;

    public sj9(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.o = revocationBoundService;
    }

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
    @Override // defpackage.ei9
    public final boolean m0(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strE;
        RevocationBoundService revocationBoundService = this.o;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            p0();
            pj9.y(revocationBoundService).z();
            return true;
        }
        p0();
        e68 e68VarA = e68.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = e68VarA.b();
        GoogleSignInOptions googleSignInOptionsU = GoogleSignInOptions.k;
        if (googleSignInAccountB != null) {
            String strE2 = e68VarA.e("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strE2) || (strE = e68VarA.e(e68.f("googleSignInOptions", strE2))) == null) {
                googleSignInOptionsU = null;
            } else {
                try {
                    googleSignInOptionsU = GoogleSignInOptions.u(strE);
                } catch (JSONException unused) {
                    googleSignInOptionsU = null;
                }
            }
        }
        rq4.n(googleSignInOptionsU);
        yi9 yi9Var = new yi9(revocationBoundService, u00.a, googleSignInOptionsU, new eu2(new fz1(26), Looper.getMainLooper()));
        Context context = yi9Var.a;
        yh9 yh9Var = yi9Var.i;
        if (googleSignInAccountB != null) {
            boolean z = yi9Var.h() == 3;
            pg pgVar = oj9.a;
            if (pgVar.b <= 3) {
                ((String) pgVar.d).concat("Revoking access");
            }
            String strE3 = e68.a(context).e("refreshToken");
            oj9.a(context);
            if (!z) {
                mj9 mj9Var = new mj9(yh9Var, 1);
                yh9Var.b.e(1, mj9Var);
                basePendingResult2 = mj9Var;
            } else if (strE3 == null) {
                pg pgVar2 = dj9.c;
                Status status = new Status(4, null, null, null);
                rq4.h("Status code must not be SUCCESS", !status.u());
                ji9 ji9Var = new ji9(status);
                ji9Var.s0(status);
                basePendingResult2 = ji9Var;
            } else {
                dj9 dj9Var = new dj9(strE3);
                new Thread(dj9Var).start();
                basePendingResult2 = dj9Var.b;
            }
            basePendingResult2.o0(new zi9(basePendingResult2, new cf8(), new bq8()));
        } else {
            boolean z2 = yi9Var.h() == 3;
            pg pgVar3 = oj9.a;
            if (pgVar3.b <= 3) {
                ((String) pgVar3.d).concat("Signing out");
            }
            oj9.a(context);
            if (z2) {
                x58 x58Var = new x58(yh9Var);
                x58Var.s0(Status.e);
                basePendingResult = x58Var;
            } else {
                mj9 mj9Var2 = new mj9(yh9Var, 0);
                yh9Var.b.e(1, mj9Var2);
                basePendingResult = mj9Var2;
            }
            basePendingResult.o0(new zi9(basePendingResult, new cf8(), new bq8()));
        }
        return true;
    }

    public final void p0() {
        if (z27.h(this.o, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
