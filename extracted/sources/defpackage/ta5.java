package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ta5 extends l71 {
    public ta5(l71 l71Var) {
        js3.p(l71Var, "initialExtras");
        LinkedHashMap linkedHashMap = l71Var.a;
        js3.p(linkedHashMap, "initialExtras");
        this.a.putAll(linkedHashMap);
    }

    @Override // defpackage.l71
    public final Object a(k71 k71Var) {
        return this.a.get(k71Var);
    }

    public /* synthetic */ ta5(int i) {
        this(j71.b);
    }
}
