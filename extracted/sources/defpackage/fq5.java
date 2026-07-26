package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class fq5 implements rt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fq5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        switch (this.a) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (tv2) this.b;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new cr5(vv2Var, (om8) this.b);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (ju8) this.b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((ju8) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
