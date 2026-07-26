package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.b;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xh1 {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final wh1 d;

    public xh1(Context context, ci1 ci1Var, Boolean bool) {
        AudioManager audioManagerI = context == null ? null : fz.i(context);
        if (audioManagerI == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerI.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        wh1 wh1Var = new wh1(ci1Var);
        this.d = wh1Var;
        Looper looperMyLooper = Looper.myLooper();
        vy2.t(looperMyLooper);
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        spatializer.addOnSpatializerStateChangedListener(new od1(0, handler), wh1Var);
    }

    public final boolean a(ly lyVar, b bVar) {
        String str = bVar.n;
        String str2 = bVar.n;
        int i = bVar.F;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iS = j29.s(i);
        if (iS == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
        int i2 = bVar.G;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) lyVar.b().b, channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        wh1 wh1Var;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (wh1Var = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(wh1Var);
        handler.removeCallbacksAndMessages(null);
    }
}
