package defpackage;

import androidx.compose.material3.n;
import ir.myket.player.ui.client.utils.extensions.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iw5 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ iw5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                dp2 dp2Var = (dp2) this.b;
                b32 b32Var = (b32) this.c;
                n nVar = (n) this.d;
                e71 e71Var = (e71) this.e;
                bp2 bp2Var = (bp2) this.f;
                dp2Var.invoke(b32Var.b);
                a.a(nVar, e71Var, bp2Var, new v7(27));
                break;
            default:
                String str = (String) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                pj3<pk7> pj3Var = (pj3) this.e;
                dl5 dl5Var = (dl5) this.f;
                ArrayList arrayList = new ArrayList(wu0.V(pj3Var, 10));
                for (pk7 pk7Var : pj3Var) {
                    String str4 = pk7Var.b;
                    pj3 pj3Var2 = pk7Var.c;
                    int size = pj3Var2.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                        }
                        if (js3.i(((b32) pj3Var2.get(i)).b, str)) {
                            z = true;
                        } else {
                            i++;
                        }
                        break;
                    }
                    arrayList.add(new nm7(z, str4, new pp(dl5Var, pk7Var, str, str2)));
                }
                dl5Var.a(new cr(new bf6(ml9.z(arrayList), str3)));
                break;
        }
        return tx8.a;
    }
}
