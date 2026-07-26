package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class r38 extends qt8 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    public class a implements rt8 {
        @Override // defpackage.rt8
        public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new r38(0);
            }
            return null;
        }
    }

    public /* synthetic */ r38(int i) {
        this();
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        Time time;
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(strT).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strT + "' as SQL Time; at path " + mw3Var.k(true), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            uw3Var.u();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        uw3Var.U(str);
    }

    private r38() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
