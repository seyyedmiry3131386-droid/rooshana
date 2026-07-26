package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class zy {
    public final Context a;
    public final v4 b;
    public final Handler c;
    public final xy d;
    public final in e;
    public final yy f;
    public wy g;
    public r79 h;
    public ly i;
    public boolean j;

    public zy(Context context, v4 v4Var, ly lyVar, r79 r79Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = v4Var;
        this.i = lyVar;
        this.h = r79Var;
        Handler handler = new Handler(j29.x(), null);
        this.c = handler;
        this.d = new xy(this);
        this.e = new in(1, this);
        wy wyVar = wy.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new yy(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(wy wyVar) {
        ci1 ci1Var;
        if (!this.j || wyVar.equals(this.g)) {
            return;
        }
        this.g = wyVar;
        rd1 rd1Var = (rd1) this.b.b;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = rd1Var.h0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? Ssh2PublicKeyAlgorithmName.NULL : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = rd1Var.h0;
        sb.append(looper == null ? Ssh2PublicKeyAlgorithmName.NULL : looper.getThread().getName());
        sb.append(")");
        vy2.r(sb.toString(), z);
        wy wyVar2 = rd1Var.x;
        if (wyVar2 == null || wyVar.equals(wyVar2)) {
            return;
        }
        rd1Var.x = wyVar;
        qm5 qm5Var = rd1Var.s;
        if (qm5Var != null) {
            qm4 qm4Var = (qm4) qm5Var.b;
            synchronized (qm4Var.a) {
                ci1Var = qm4Var.r;
            }
            if (ci1Var != null) {
                ci1Var.h();
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        r79 r79Var = this.h;
        if (Objects.equals(audioDeviceInfo, r79Var == null ? null : (AudioDeviceInfo) r79Var.b)) {
            return;
        }
        r79 r79Var2 = audioDeviceInfo != null ? new r79(7, audioDeviceInfo) : null;
        this.h = r79Var2;
        a(wy.b(this.a, this.i, r79Var2));
    }
}
