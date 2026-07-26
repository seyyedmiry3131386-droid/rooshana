package defpackage;

import androidx.compose.material3.SheetValue;
import androidx.compose.material3.n;
import androidx.compose.ui.node.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh implements dp2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bp2 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sh(bp2 bp2Var, boolean z, og ogVar, tc0 tc0Var) {
        this.c = bp2Var;
        this.b = z;
        this.d = ogVar;
        this.e = tc0Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                og ogVar = (og) this.d;
                tc0 tc0Var = (tc0) this.e;
                i iVar = (i) obj;
                iVar.a();
                vm0 vm0Var = iVar.a;
                if (((Boolean) this.c.invoke()).booleanValue()) {
                    if (this.b) {
                        long jD0 = vm0Var.d0();
                        wv8 wv8Var = vm0Var.b;
                        long jA = wv8Var.A();
                        wv8Var.v().e();
                        try {
                            ((nm5) wv8Var.b).y(-1.0f, 1.0f, jD0);
                            vm0Var.c(ogVar, tc0Var);
                        } finally {
                            o40.F(wv8Var, jA);
                        }
                    } else {
                        vm0Var.c(ogVar, tc0Var);
                    }
                }
                return tx8.a;
            default:
                bp2 bp2Var = (bp2) this.d;
                dp2 dp2Var = (dp2) this.e;
                return new n(this.b, this.c, bp2Var, (SheetValue) obj, dp2Var);
        }
    }

    public /* synthetic */ sh(bp2 bp2Var, boolean z, dp2 dp2Var, bp2 bp2Var2) {
        this.b = z;
        this.c = bp2Var;
        this.d = bp2Var2;
        this.e = dp2Var;
    }
}
