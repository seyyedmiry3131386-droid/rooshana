package defpackage;

import android.content.Context;
import ir.myket.core.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class vl8 {
    public final lw8 a;
    public final Context b;

    public vl8(lw8 lw8Var, Context context) {
        this.a = lw8Var;
        this.b = context;
    }

    public static boolean c(long j) {
        return j > System.currentTimeMillis();
    }

    public final String a(long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / ((long) 1000);
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        long j2 = 3600;
        long j3 = 60;
        return lw8.e(this.a, String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / j2), Long.valueOf((jCurrentTimeMillis % j2) / j3), Long.valueOf(jCurrentTimeMillis % j3)}, 3)));
    }

    public final String b(int i) {
        Context context = this.b;
        switch (i) {
            case 0:
                String string = context.getString(R.string.month_1);
                js3.o(string, "getString(...)");
                return string;
            case 1:
                String string2 = context.getString(R.string.month_2);
                js3.o(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = context.getString(R.string.month_3);
                js3.o(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = context.getString(R.string.month_4);
                js3.o(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = context.getString(R.string.month_5);
                js3.o(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = context.getString(R.string.month_6);
                js3.o(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = context.getString(R.string.month_7);
                js3.o(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = context.getString(R.string.month_8);
                js3.o(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = context.getString(R.string.month_9);
                js3.o(string9, "getString(...)");
                return string9;
            case 9:
                String string10 = context.getString(R.string.month_10);
                js3.o(string10, "getString(...)");
                return string10;
            case 10:
                String string11 = context.getString(R.string.month_11);
                js3.o(string11, "getString(...)");
                return string11;
            case 11:
                String string12 = context.getString(R.string.month_12);
                js3.o(string12, "getString(...)");
                return string12;
            default:
                lw.g(null, null, null);
                return "";
        }
    }
}
