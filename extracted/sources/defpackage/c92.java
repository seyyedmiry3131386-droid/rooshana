package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class c92 extends e92 {
    public final long b;
    public final long c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(List list, long j, long j2, boolean z) {
        super(list);
        js3.p(list, "cubics");
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.e92
    public final e92 a(rn6 rn6Var) {
        ListBuilder listBuilderS = br9.s();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            listBuilderS.add(((h81) list.get(i)).e(rn6Var));
        }
        return new c92(br9.q(listBuilderS), yq2.x0(this.b, rn6Var), yq2.x0(this.c, rn6Var), this.d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) ge2.b(this.b)) + ", center=" + ((Object) ge2.b(this.c)) + ", convex=" + this.d;
    }
}
