package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import defpackage.a28;
import defpackage.g51;
import defpackage.is3;
import defpackage.jj1;
import defpackage.js3;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qa;
import defpackage.sc9;
import defpackage.tc9;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManagerImplCommon extends is3 {
    public final MeasurementManager u;

    public MeasurementManagerImplCommon(MeasurementManager measurementManager) {
        this.u = measurementManager;
    }

    public static Object S(MeasurementManagerImplCommon measurementManagerImplCommon, jj1 jj1Var, g51<? super tx8> g51Var) {
        new om0(1, ok4.I(g51Var)).v();
        MeasurementManager measurementManager = measurementManagerImplCommon.u;
        throw null;
    }

    public static Object T(MeasurementManagerImplCommon measurementManagerImplCommon, g51<? super Integer> g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        measurementManagerImplCommon.u.getMeasurementApiStatus(new qa(0), androidx.core.os.a.a(om0Var));
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public static Object V(MeasurementManagerImplCommon measurementManagerImplCommon, a28 a28Var, g51<? super tx8> g51Var) {
        Object objV = js3.v(new MeasurementManagerImplCommon$registerSource$4(measurementManagerImplCommon, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    public static Object W(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, g51<? super tx8> g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        measurementManagerImplCommon.u.registerSource(uri, inputEvent, new qa(0), androidx.core.os.a.a(om0Var));
        Object objU = om0Var.u();
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }

    public static Object X(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, g51<? super tx8> g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        measurementManagerImplCommon.u.registerTrigger(uri, new qa(0), androidx.core.os.a.a(om0Var));
        Object objU = om0Var.u();
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }

    public static Object Z(MeasurementManagerImplCommon measurementManagerImplCommon, sc9 sc9Var, g51<? super tx8> g51Var) {
        new om0(1, ok4.I(g51Var)).v();
        MeasurementManager measurementManager = measurementManagerImplCommon.u;
        throw null;
    }

    public static Object b0(MeasurementManagerImplCommon measurementManagerImplCommon, tc9 tc9Var, g51<? super tx8> g51Var) {
        new om0(1, ok4.I(g51Var)).v();
        MeasurementManager measurementManager = measurementManagerImplCommon.u;
        throw null;
    }

    @Override // defpackage.is3
    public Object F(Uri uri, InputEvent inputEvent, g51<? super tx8> g51Var) {
        return W(this, uri, inputEvent, g51Var);
    }

    @Override // defpackage.is3
    public Object G(Uri uri, g51<? super tx8> g51Var) {
        return X(this, uri, g51Var);
    }

    public Object R(jj1 jj1Var, g51<? super tx8> g51Var) {
        return S(this, jj1Var, g51Var);
    }

    public Object U(a28 a28Var, g51<? super tx8> g51Var) {
        return V(this, a28Var, g51Var);
    }

    public Object Y(sc9 sc9Var, g51<? super tx8> g51Var) {
        return Z(this, sc9Var, g51Var);
    }

    public Object a0(tc9 tc9Var, g51<? super tx8> g51Var) {
        return b0(this, tc9Var, g51Var);
    }

    @Override // defpackage.is3
    public Object s(g51<? super Integer> g51Var) {
        return T(this, g51Var);
    }
}
