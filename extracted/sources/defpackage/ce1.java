package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends qt8 {
    public static final be1 c = new be1();
    public final th0 a;
    public final ArrayList b;

    public ce1() {
        th0 th0Var = th0.h;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = th0Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (vt3.a >= 9) {
            arrayList.add(new SimpleDateFormat(t61.j("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        Date dateB;
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = pg3.b(strT, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbN = t61.n("Failed parsing '", strT, "' as Date; at path ");
                            sbN.append(mw3Var.k(true));
                            throw new JsonSyntaxException(sbN.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strT);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.getClass();
        return dateB;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            uw3Var.u();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        uw3Var.U(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
