package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b96 b;

    public /* synthetic */ q(b96 b96Var, int i) {
        this.a = i;
        this.b = b96Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                a96.j((a96) obj, this.b, 0, 0);
                break;
            case 1:
                a96.j((a96) obj, this.b, 0, 0);
                break;
            case 2:
                ((a96) obj).g(this.b, 0, 0, 0.0f);
                break;
            case 3:
                a96 a96Var = (a96) obj;
                js3.p(a96Var, "$this$layout");
                a96Var.g(this.b, 0, 0, 0.0f);
                break;
            case 4:
                a96.j((a96) obj, this.b, 0, 0);
                break;
            case 5:
                a96 a96Var2 = (a96) obj;
                LayoutDirection layoutDirectionE = a96Var2.e();
                LayoutDirection layoutDirection = LayoutDirection.a;
                b96 b96Var = this.b;
                if (layoutDirectionE == layoutDirection || a96Var2.f() == 0) {
                    a96.a(a96Var2, b96Var);
                    b96Var.W(rq3.c(0L, b96Var.e), 0.0f, null);
                } else {
                    int i = (int) 0;
                    long jF = ((long) ((a96Var2.f() - b96Var.a) - i)) << 32;
                    a96.a(a96Var2, b96Var);
                    b96Var.W(rq3.c((((long) i) & 4294967295L) | jF, b96Var.e), 0.0f, null);
                }
                return tx8.a;
            case 6:
                ((a96) obj).g(this.b, 0, 0, 0.0f);
                break;
            case 7:
                a96.l((a96) obj, this.b, 0, 0, null, 12);
                break;
            case 8:
                a96.j((a96) obj, this.b, 0, 0);
                break;
            case 9:
                ((a96) obj).g(this.b, 0, 0, 0.0f);
                break;
            case 10:
                ((a96) obj).g(this.b, 0, 0, 0.0f);
                break;
            case 11:
                a96.j((a96) obj, this.b, 0, 0);
                break;
            case 12:
                ((a96) obj).g(this.b, 0, 0, 0.0f);
                break;
            default:
                a96.j((a96) obj, this.b, 0, 0);
                break;
        }
        return tx8.a;
    }
}
