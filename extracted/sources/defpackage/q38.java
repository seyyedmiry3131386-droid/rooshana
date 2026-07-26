package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class q38 extends qt8 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    public class a implements rt8 {
        @Override // defpackage.rt8
        public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new q38(0);
            }
            return null;
        }
    }

    public /* synthetic */ q38(int i) {
        this();
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        Date date;
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(strT).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strT + "' as SQL Date; at path " + mw3Var.k(true), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            uw3Var.u();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        uw3Var.U(str);
    }

    private q38() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
