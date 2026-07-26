package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.h;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q14 implements dl4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ dp2 d;
    public final /* synthetic */ r14 e;
    public final /* synthetic */ g f;
    public final /* synthetic */ dp2 g;

    public q14(int i, int i2, Map map, dp2 dp2Var, r14 r14Var, g gVar, dp2 dp2Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = dp2Var;
        this.e = r14Var;
        this.f = gVar;
        this.g = dp2Var2;
    }

    @Override // defpackage.dl4
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dl4
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dl4
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.dl4
    public final void d() {
        yn3 yn3Var;
        h hVar = this.f.a;
        boolean zQ = this.e.Q();
        dp2 dp2Var = this.g;
        if (!zQ || (yn3Var = ((e) hVar.H.d).W) == null) {
            dp2Var.invoke(((e) hVar.H.d).l);
        } else {
            dp2Var.invoke(yn3Var.l);
        }
    }

    @Override // defpackage.dl4
    public final dp2 e() {
        return this.d;
    }
}
