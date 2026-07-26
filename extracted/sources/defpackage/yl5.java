package defpackage;

import ir.mservices.market.download.app.model.NeneDownloadRepository$downloadInfoFlow$$inlined$transform$1;
import ir.mservices.market.download.app.model.NeneDownloadRepository$downloadProgressFlow$$inlined$transform$1;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class yl5 implements nr1 {
    public final ps1 a;
    public final l b;
    public final rv6 c;
    public final l d;
    public final rv6 e;

    public yl5(ps1 ps1Var) {
        js3.p(ps1Var, "downloadManager");
        this.a = ps1Var;
        l lVarB = ja1.b(new LinkedHashMap());
        this.b = lVarB;
        this.c = new rv6(lVarB);
        l lVarB2 = ja1.b(new LinkedHashMap());
        this.d = lVarB2;
        this.e = new rv6(lVarB2);
        ps1Var.u(this);
    }

    public final xe2 a(String str) {
        js3.p(str, "packageName");
        return new vb7(new NeneDownloadRepository$downloadInfoFlow$$inlined$transform$1(this.e, null, str));
    }

    public final xe2 b(String str) {
        js3.p(str, "packageName");
        return new vb7(new NeneDownloadRepository$downloadProgressFlow$$inlined$transform$1(this.b, null, str));
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        l lVar;
        Object value;
        js3.p(bs1Var, "downloadInfo");
        AppDownloadInfo appDownloadInfoE = this.a.e(bs1Var);
        if (appDownloadInfoE != null) {
            do {
                lVar = this.b;
                value = lVar.getValue();
            } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(appDownloadInfoE.getPackageName(), appDownloadInfoE)))));
        }
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
        js3.p(es1Var, "downloadInfo");
        LinkedHashMap linkedHashMapP = b.P((Map) this.e.a.getValue(), b.M(new Pair(eq.q(es1Var), new cs1(es1Var, i))));
        l lVar = this.d;
        lVar.getClass();
        lVar.p(null, linkedHashMapP);
        if (i == 252) {
            l lVar2 = this.b;
            Map map = (Map) lVar2.getValue();
            Object objQ = eq.q(es1Var);
            js3.p(map, "<this>");
            Map mapU = b.U(map);
            mapU.remove(objQ);
            int size = mapU.size();
            if (size == 0) {
                mapU = b.I();
            } else if (size == 1) {
                mapU = b.V(mapU);
            }
            lVar2.getClass();
            lVar2.p(null, mapU);
        }
    }
}
