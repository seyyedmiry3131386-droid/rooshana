package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.h;
import com.sun.jna.Native;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class mi extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ mi(int i) {
        this.a = i;
    }

    private final Object a() {
        e98 e98Var;
        synchronized (this) {
            e98Var = new e98();
        }
        return e98Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        HashMap map;
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                h hVar = new h(choreographer, rq4.s(looperMyLooper));
                return bt2.L(hVar, hVar.l);
            case 1:
                vy2.m(3, "initialArraySize");
                return new ArrayList(3);
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ih9.a);
                return simpleDateFormat;
            case 3:
                return new s32();
            case 4:
                return new Random();
            case 5:
                gt4 gt4Var = new gt4(4L);
                Native.setMemory(gt4Var, gt4Var.a, 0L, gt4Var.b, (byte) 0);
                return gt4Var;
            case 6:
                synchronized (this) {
                    map = new HashMap();
                }
                return map;
            case 7:
                return a();
            case 8:
                return new PathMeasure();
            case 9:
                return new Path();
            case 10:
                return new Path();
            case 11:
                return new float[4];
            case 12:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case 13:
                return new io.sentry.util.Random();
            case 14:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
