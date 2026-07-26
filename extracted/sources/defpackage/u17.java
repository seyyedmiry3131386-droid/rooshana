package defpackage;

import ir.mservices.market.reels.download.a;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class u17 implements nr1 {
    public final a a;
    public final k68 b;
    public final l c;
    public final l d;

    public u17(a aVar, k68 k68Var) {
        js3.p(aVar, "downloadManager");
        js3.p(k68Var, "storageUtils");
        this.a = aVar;
        this.b = k68Var;
        this.c = ja1.b(new LinkedHashMap());
        this.d = ja1.b(new LinkedHashMap());
        ((xl5) aVar.a.get()).d(this);
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        l lVar;
        Object value;
        js3.p(bs1Var, "downloadInfo");
        do {
            lVar = this.c;
            value = lVar.getValue();
        } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(((es1) bs1Var).d, new z07(bs1Var))))));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        l lVar;
        Object value;
        Object obj;
        l lVar2;
        Object value2;
        Map mapU;
        js3.p(es1Var, "downloadInfo");
        do {
            lVar = this.d;
            value = lVar.getValue();
            obj = es1Var.d;
        } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(obj, new a17(es1Var))))));
        if (i == 252) {
            do {
                lVar2 = this.c;
                value2 = lVar2.getValue();
                Map map = (Map) value2;
                js3.p(map, "<this>");
                mapU = b.U(map);
                mapU.remove(obj);
                int size = mapU.size();
                if (size == 0) {
                    mapU = b.I();
                } else if (size == 1) {
                    mapU = b.V(mapU);
                }
            } while (!lVar2.n(value2, mapU));
            return;
        }
        if (es1Var.f == 140) {
            try {
                k68 k68Var = this.b;
                String str = es1Var.c;
                js3.o(str, "getDestFilePath(...)");
                k68Var.a(str, "reels");
                a aVar = this.a;
                aVar.getClass();
                if (((xl5) aVar.a.get()).a.a(es1Var)) {
                    try {
                        String strY = y97.y(es1Var);
                        zb2.f(strY != null ? new File(strY) : null);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                zk8.X(e, true);
            }
        }
    }
}
