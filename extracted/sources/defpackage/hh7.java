package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hh7 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih7 b;

    public /* synthetic */ hh7(ih7 ih7Var, int i) {
        this.a = i;
        this.b = ih7Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        qs0 qs0Var = (qs0) obj;
        switch (this.a) {
            case 0:
                js3.p(qs0Var, "$this$buildSerialDescriptor");
                qs0.a(qs0Var, "type", b88.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                ih7 ih7Var = this.b;
                sb.append(ih7Var.a.d());
                sb.append('>');
                hh7 hh7Var = new hh7(ih7Var, 1);
                qs0.a(qs0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE, z27.c(sb.toString(), qo7.b, new no7[0], hh7Var));
                List list = ih7Var.b;
                js3.p(list, "<set-?>");
                qs0Var.b = list;
                break;
            default:
                js3.p(qs0Var, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.b.e.entrySet()) {
                    qs0.a(qs0Var, (String) entry.getKey(), ((px3) entry.getValue()).getDescriptor());
                }
                break;
        }
        return tx8.a;
    }
}
