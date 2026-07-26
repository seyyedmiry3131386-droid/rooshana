package defpackage;

import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class o82 extends c67 {
    public final Object c;
    public final String d;
    public final VerificationMode e;
    public final WindowStrictModeException f;

    public o82(Object obj, String str, fz1 fz1Var, VerificationMode verificationMode) {
        Collection collectionB;
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        js3.p(verificationMode, "verificationMode");
        this.c = obj;
        this.d = str;
        this.e = verificationMode;
        String strC = c67.c(obj, str);
        js3.p(strC, "message");
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(strC);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        js3.o(stackTrace, "getStackTrace(...)");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(bl4.q(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionB = EmptyList.a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionB = ew.X0(stackTrace);
            } else if (length == 1) {
                collectionB = br9.B(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collectionB = arrayList;
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionB.toArray(new StackTraceElement[0]));
        this.f = windowStrictModeException;
    }

    @Override // defpackage.c67
    public final Object b() throws WindowStrictModeException {
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            throw this.f;
        }
        if (iOrdinal == 1) {
            js3.p(c67.c(this.c, this.d), "message");
            return null;
        }
        if (iOrdinal == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.c67
    public final c67 k(String str, dp2 dp2Var) {
        return this;
    }
}
