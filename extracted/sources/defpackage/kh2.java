package defpackage;

import ir.mservices.market.core.Font$FontStyle;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class kh2 implements pz3 {
    public static final Object a = a.b(LazyThreadSafetyMode.a, new i30(new kh2(), 5));
    public static Font$FontStyle b = Font$FontStyle.e;

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public static final void a(Font$FontStyle font$FontStyle) {
        b = font$FontStyle;
        ir.myket.persistent.datasource.a aVar = (ir.myket.persistent.datasource.a) a.getValue();
        String strName = font$FontStyle.name();
        js3.p(aVar, "<this>");
        js3.p(strName, "fontStyleName");
        String upperCase = strName.toUpperCase(Locale.ROOT);
        js3.o(upperCase, "toUpperCase(...)");
        aVar.j.b(aVar, ir.myket.persistent.datasource.a.n[9], upperCase);
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
