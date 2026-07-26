package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import io.sentry.android.core.t0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hi9 extends ei9 implements iu2, ju2 {
    public static final qh9 v = ki9.a;
    public final Context o;
    public final Handler p;
    public final qh9 q;
    public final Set r;
    public final on s;
    public bw7 t;
    public gg1 u;

    public hi9(Context context, jx jxVar, on onVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.o = context;
        this.p = jxVar;
        this.s = onVar;
        this.r = (Set) onVar.a;
        this.q = v;
    }

    @Override // defpackage.iu2
    public final void L() {
        bw7 bw7Var = this.t;
        bw7Var.getClass();
        try {
            bw7Var.c.getClass();
            Account account = new Account(d70.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = d70.DEFAULT_ACCOUNT.equals(account.name) ? e68.a(bw7Var.getContext()).b() : null;
            Integer num = bw7Var.e;
            rq4.n(num);
            zaw zawVar = new zaw(2, account, num.intValue(), googleSignInAccountB);
            ni9 ni9Var = (ni9) bw7Var.getService();
            zai zaiVar = new zai(1, zawVar);
            ni9Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(ni9Var.p);
            di9.b(parcelObtain, zaiVar);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                ni9Var.o.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            t0.m("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.p.post(new zh9(1, this, new zak(1, new ConnectionResult(8, null, null), null), false));
            } catch (RemoteException unused) {
                t0.o("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.ju2
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.u.B(connectionResult);
    }

    @Override // defpackage.iu2
    public final void onConnectionSuspended(int i) {
        gg1 gg1Var = this.u;
        wh9 wh9Var = (wh9) ((ku2) gg1Var.f).j.get((cm) gg1Var.c);
        if (wh9Var != null) {
            if (wh9Var.v) {
                wh9Var.k(new ConnectionResult(17, null, null));
            } else {
                wh9Var.onConnectionSuspended(i);
            }
        }
    }
}
