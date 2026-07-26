package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y8 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;

    public /* synthetic */ y8(int i, dp2 dp2Var) {
        this.a = i;
        this.b = dp2Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(new ec6((String) obj));
                return tx8.a;
            case 1:
                dp2 dp2Var = this.b;
                String str = (String) obj;
                js3.p(str, "playId");
                dp2Var.invoke(new sd6(new hb6(str)));
                return tx8.a;
            case 2:
                dp2 dp2Var2 = this.b;
                String str2 = (String) obj;
                js3.p(str2, "playId");
                dp2Var2.invoke(new sd6(new hb6(str2)));
                return tx8.a;
            case 3:
                dp2 dp2Var3 = this.b;
                ((Float) obj).getClass();
                dp2Var3.invoke(new lb6());
                return tx8.a;
            case 4:
                throw bl4.n(obj);
            case 5:
                throw bl4.n(obj);
            case 6:
                dp2 dp2Var4 = this.b;
                Context context = (Context) obj;
                js3.p(context, "it");
                return (View) dp2Var4.invoke(context);
            case 7:
                this.b.invoke(new qb6(false));
                return tx8.a;
            case 8:
                c08 c08Var = (c08) this.b.invoke((a) obj);
                synchronized (g08.c) {
                    g08.d = g08.d.f(c08Var.g());
                }
                return c08Var;
            default:
                dp2 dp2Var5 = this.b;
                Long l = (Long) obj;
                l.longValue();
                return dp2Var5.invoke(l);
        }
    }
}
