package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ez {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final ly d;
    public final boolean e;
    public final Object f;

    public ez(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, ly lyVar, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = lyVar;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new dz(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes((AudioAttributes) lyVar.b().b).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return this.a == ezVar.a && this.e == ezVar.e && Objects.equals(this.b, ezVar.b) && Objects.equals(this.c, ezVar.c) && Objects.equals(this.d, ezVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
