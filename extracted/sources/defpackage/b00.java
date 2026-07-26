package defpackage;

import android.content.Context;
import ir.myket.movie.common.domain.models.RestrictionInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class b00 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b00(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                l32 l32Var = (l32) obj;
                l32Var.getClass();
                Context context = this.b;
                js3.p(context, "context");
                String string = l32Var.a;
                if (string == null) {
                    string = context.getString(l32Var.b);
                    js3.o(string, "getString(...)");
                }
                if (f88.n0(string)) {
                    string = null;
                }
                if (string != null) {
                    fz1.q(1, context, string).show();
                }
                break;
            case 1:
                vy2.M(this.b, (RestrictionInfo) obj);
                break;
            case 2:
                l32 l32Var2 = (l32) obj;
                l32Var2.getClass();
                Context context2 = this.b;
                js3.p(context2, "context");
                String string2 = l32Var2.a;
                if (string2 == null) {
                    string2 = context2.getString(l32Var2.b);
                    js3.o(string2, "getString(...)");
                }
                if (f88.n0(string2)) {
                    string2 = null;
                }
                if (string2 != null) {
                    fz1.q(1, context2, string2).show();
                }
                break;
            default:
                vy2.M(this.b, (RestrictionInfo) obj);
                break;
        }
        return tx8.a;
    }
}
