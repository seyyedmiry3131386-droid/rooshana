package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class d92 extends e92 {
    @Override // defpackage.e92
    public final e92 a(rn6 rn6Var) {
        ListBuilder listBuilderS = br9.s();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            listBuilderS.add(((h81) list.get(i)).e(rn6Var));
        }
        ListBuilder listBuilderQ = br9.q(listBuilderS);
        js3.p(listBuilderQ, "cubics");
        return new d92(listBuilderQ);
    }

    public final String toString() {
        return "Edge";
    }
}
