package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public class ju8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        int iNextInt;
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        mw3Var.P0();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (mw3Var.R() != JsonToken.d) {
            String strM0 = mw3Var.m0();
            iNextInt = mw3Var.nextInt();
            strM0.getClass();
            switch (strM0) {
                case "dayOfMonth":
                    i3 = iNextInt;
                    break;
                case "minute":
                    i5 = iNextInt;
                    break;
                case "second":
                    i6 = iNextInt;
                    break;
                case "year":
                    i = iNextInt;
                    break;
                case "month":
                    i2 = iNextInt;
                    break;
                case "hourOfDay":
                    i4 = iNextInt;
                    break;
            }
        }
        mw3Var.t0();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            uw3Var.u();
            return;
        }
        uw3Var.P0();
        uw3Var.g("year");
        uw3Var.P(r4.get(1));
        uw3Var.g("month");
        uw3Var.P(r4.get(2));
        uw3Var.g("dayOfMonth");
        uw3Var.P(r4.get(5));
        uw3Var.g("hourOfDay");
        uw3Var.P(r4.get(11));
        uw3Var.g("minute");
        uw3Var.P(r4.get(12));
        uw3Var.g("second");
        uw3Var.P(r4.get(13));
        uw3Var.t0();
    }
}
