package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 implements rj1, cg9, id1 {
    public static final sj1 a = new sj1();
    public static final sj1 b = new sj1();

    @Override // defpackage.cg9
    public yf9 a(Activity activity2, rj1 rj1Var) {
        js3.p(rj1Var, "densityCompatHelper");
        wf0.b0.getClass();
        return new yf9(new uf0(vf0.a().g(activity2)), rj1Var.b(activity2));
    }

    @Override // defpackage.rj1
    public float b(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    public AudioTrack c(o00 o00Var, ly lyVar, int i, Context context) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = o00Var.b;
        int i4 = o00Var.c;
        int i5 = o00Var.a;
        String str = j29.a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(o00Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) lyVar.b().b).setAudioFormat(new AudioFormat.Builder().setSampleRate(i3).setChannelMask(i4).setEncoding(i5).build()).setTransferMode(1).setBufferSizeInBytes(o00Var.f).setSessionId(i);
        if (i2 >= 29) {
            sessionId.setOffloadedPlayback(o00Var.e);
        }
        if (i2 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }

    @Override // defpackage.cg9
    public yf9 d(Context context, rj1 rj1Var) {
        js3.p(rj1Var, "densityCompatHelper");
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        js3.o(bounds, "getBounds(...)");
        return new yf9(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
