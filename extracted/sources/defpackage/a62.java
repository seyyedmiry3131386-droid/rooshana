package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a62 implements q94, hs4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ a62(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        switch (this.a) {
        }
        return xq4Var.l(hq4Var, this.b);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((eb6) obj).J(this.b);
    }
}
