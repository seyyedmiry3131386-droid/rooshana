package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class jh4 implements px3 {
    public final px3 a;
    public final px3 b;
    public final /* synthetic */ int c;
    public final po7 d;

    public jh4(px3 px3Var, px3 px3Var2, byte b) {
        this.a = px3Var;
        this.b = px3Var2;
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        Object ih4Var;
        Object obj = dy3.g;
        no7 descriptor = getDescriptor();
        tz0 tz0VarC = cc1Var.c(descriptor);
        Object objS = obj;
        Object objS2 = objS;
        while (true) {
            int i = tz0VarC.i(getDescriptor());
            if (i == -1) {
                if (objS == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objS2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        ih4Var = new ih4(objS, objS2);
                        break;
                    default:
                        ih4Var = new Pair(objS, objS2);
                        break;
                }
                tz0VarC.a(descriptor);
                return ih4Var;
            }
            if (i == 0) {
                objS = tz0VarC.s(getDescriptor(), 0, this.a, null);
            } else {
                if (i != 1) {
                    throw new SerializationException(rm7.n(i, "Invalid index: "));
                }
                objS2 = tz0VarC.s(getDescriptor(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        switch (this.c) {
        }
        return this.d;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        Object key;
        Object value;
        uz0 uz0VarC = q12Var.c(getDescriptor());
        no7 descriptor = getDescriptor();
        px3 px3Var = this.a;
        switch (this.c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                js3.p(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                js3.p(pair, "<this>");
                key = pair.a;
                break;
        }
        uz0VarC.o(descriptor, 0, px3Var, key);
        no7 descriptor2 = getDescriptor();
        px3 px3Var2 = this.b;
        switch (this.c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                js3.p(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                js3.p(pair2, "<this>");
                value = pair2.b;
                break;
        }
        uz0VarC.o(descriptor2, 1, px3Var2, value);
        uz0VarC.a(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jh4(final px3 px3Var, final px3 px3Var2, int i) {
        this(px3Var, px3Var2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(px3Var, px3Var2, (byte) 0);
                final int i2 = 1;
                this.d = z27.b("kotlin.Pair", new no7[0], new dp2() { // from class: hh4
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        qs0 qs0Var = (qs0) obj;
                        switch (i2) {
                            case 0:
                                js3.p(qs0Var, "$this$buildSerialDescriptor");
                                qs0.a(qs0Var, "key", px3Var.getDescriptor());
                                qs0.a(qs0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE, px3Var2.getDescriptor());
                                break;
                            default:
                                js3.p(qs0Var, "$this$buildClassSerialDescriptor");
                                qs0.a(qs0Var, "first", px3Var.getDescriptor());
                                qs0.a(qs0Var, "second", px3Var2.getDescriptor());
                                break;
                        }
                        return tx8.a;
                    }
                });
                break;
            default:
                final int i3 = 0;
                this.d = z27.c("kotlin.collections.Map.Entry", g98.d, new no7[0], new dp2() { // from class: hh4
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        qs0 qs0Var = (qs0) obj;
                        switch (i3) {
                            case 0:
                                js3.p(qs0Var, "$this$buildSerialDescriptor");
                                qs0.a(qs0Var, "key", px3Var.getDescriptor());
                                qs0.a(qs0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE, px3Var2.getDescriptor());
                                break;
                            default:
                                js3.p(qs0Var, "$this$buildClassSerialDescriptor");
                                qs0.a(qs0Var, "first", px3Var.getDescriptor());
                                qs0.a(qs0Var, "second", px3Var2.getDescriptor());
                                break;
                        }
                        return tx8.a;
                    }
                });
                break;
        }
    }
}
