package defpackage;

import android.view.View;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.version2.ui.recycler.holder.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w95 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w95(bd6 bd6Var, gb6 gb6Var, yo8 yo8Var, kd6 kd6Var) {
        this.b = bd6Var;
        this.c = gb6Var;
        this.d = yo8Var;
        this.e = kd6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MultiSelectRecyclerData multiSelectRecyclerData = (MultiSelectRecyclerData) this.b;
                a aVar = (a) this.c;
                z95 z95Var = (z95) this.e;
                a aVar2 = (a) this.d;
                if (!((Boolean) multiSelectRecyclerData.a.getValue()).booleanValue()) {
                    og5 og5VarX = aVar.x();
                    if (og5VarX != null) {
                        js3.m(view);
                        og5VarX.m(view, aVar2, multiSelectRecyclerData);
                    }
                } else {
                    if (((Boolean) multiSelectRecyclerData.e.a.getValue()).booleanValue()) {
                        multiSelectRecyclerData.f = !multiSelectRecyclerData.f;
                    }
                    aVar.B(multiSelectRecyclerData);
                    js3.m(view);
                    z95Var.f(view, aVar2, multiSelectRecyclerData);
                }
                break;
            default:
                bd6 bd6Var = (bd6) this.b;
                gb6 gb6Var = (gb6) this.c;
                yo8 yo8Var = (yo8) this.d;
                kd6 kd6Var = (kd6) this.e;
                if (gb6Var.f0(29)) {
                    gb6Var.w(gb6Var.V().a().h(new ep8(yo8Var, ImmutableList.s(Integer.valueOf(kd6Var.b)))).m(kd6Var.a.b.c, false).b());
                    String str = kd6Var.c;
                    switch (bd6Var.f) {
                        case 0:
                            bd6Var.g.l.e[1] = str;
                            break;
                    }
                    bd6Var.e.q.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w95(MultiSelectRecyclerData multiSelectRecyclerData, a aVar, z95 z95Var, a aVar2) {
        this.b = multiSelectRecyclerData;
        this.c = aVar;
        this.e = z95Var;
        this.d = aVar2;
    }
}
