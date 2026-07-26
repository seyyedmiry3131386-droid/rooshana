package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ov3 implements no7 {
    public final c24 a;

    public ov3(bp2 bp2Var) {
        this.a = a.a(bp2Var);
    }

    @Override // defpackage.no7
    public final String a() {
        return b().a();
    }

    public final no7 b() {
        return (no7) this.a.getValue();
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return b().d(str);
    }

    @Override // defpackage.no7
    public final int e() {
        return b().e();
    }

    @Override // defpackage.no7
    public final String f(int i) {
        return b().f(i);
    }

    @Override // defpackage.no7
    public final List g(int i) {
        return b().g(i);
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return b().getKind();
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        return b().h(i);
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        return b().i(i);
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }
}
