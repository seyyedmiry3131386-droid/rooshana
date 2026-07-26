package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ew3 implements no7 {
    public static final ew3 b = new ew3();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ u74 a = ct2.e(b88.a, nv3.a).c;

    @Override // defpackage.no7
    public final String a() {
        return c;
    }

    @Override // defpackage.no7
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.a.d(str);
    }

    @Override // defpackage.no7
    public final int e() {
        this.a.getClass();
        return 2;
    }

    @Override // defpackage.no7
    public final String f(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.no7
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        this.a.getClass();
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        this.a.getClass();
        return g98.d;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        return this.a.h(i);
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        this.a.i(i);
        return false;
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }
}
