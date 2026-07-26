package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import defpackage.j29;
import defpackage.ks4;
import defpackage.t61;
import defpackage.vy2;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int j;
    public final String k;
    public final int l;
    public final b m;
    public final int n;
    public final ks4 o;
    public final boolean p;

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = j29.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.j == exoPlaybackException.j && Objects.equals(this.k, exoPlaybackException.k) && this.l == exoPlaybackException.l && Objects.equals(this.m, exoPlaybackException.m) && this.n == exoPlaybackException.n && Objects.equals(this.o, exoPlaybackException.o) && this.p == exoPlaybackException.p;
    }

    public final ExoPlaybackException c(ks4 ks4Var) {
        String message = getMessage();
        String str = j29.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.j, this.k, this.l, this.m, this.n, ks4Var, this.b, this.p);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, b bVar, int i4, ks4 ks4Var, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        vy2.j(!z || i2 == 1);
        vy2.j(th != null || i2 == 3);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = bVar;
        this.n = i4;
        this.o = ks4Var;
        this.p = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, b bVar, int i4, ks4 ks4Var, boolean z) {
        String str2;
        int i5;
        b bVar2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            bVar2 = bVar;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i5 = i3;
            bVar2 = bVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            bVar2 = bVar;
            sb.append(bVar2);
            sb.append(", format_supported=");
            sb.append(j29.B(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : t61.i(string, ": null"), exc, i2, i, str2, i5, bVar2, i4, ks4Var, SystemClock.elapsedRealtime(), z);
    }
}
