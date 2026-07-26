package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class au2 extends d70 implements sl {
    public final Set a;

    /* JADX WARN: Illegal instructions before constructor call */
    public au2(Context context, Looper looper, int i, on onVar, iu2 iu2Var, ju2 ju2Var, int i2) {
        gv9 gv9VarA = bu2.a(context);
        gu2 gu2Var = gu2.e;
        rq4.n(iu2Var);
        rq4.n(ju2Var);
        super(context, looper, gv9VarA, gu2Var, i, new vo4(19, iu2Var), new ck4(25, ju2Var), (String) onVar.d);
        Set set = (Set) onVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
    }

    @Override // defpackage.d70
    public final Account getAccount() {
        return null;
    }

    @Override // defpackage.d70
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // defpackage.d70
    public final Set getScopes() {
        return this.a;
    }
}
