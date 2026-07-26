package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import defpackage.s49;
import defpackage.yf3;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new fr5(28);
    public final Object a = new Object();
    public final MediaSession.Token b;
    public yf3 c;
    public s49 d;

    public MediaSessionCompat$Token(MediaSession.Token token, yf3 yf3Var, s49 s49Var) {
        this.b = token;
        this.c = yf3Var;
        this.d = s49Var;
    }

    public final yf3 a() {
        yf3 yf3Var;
        synchronized (this.a) {
            yf3Var = this.c;
        }
        return yf3Var;
    }

    public final void b(yf3 yf3Var) {
        synchronized (this.a) {
            this.c = yf3Var;
        }
    }

    public final void c(s49 s49Var) {
        synchronized (this.a) {
            this.d = s49Var;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSessionCompat$Token) {
            return this.b.equals(((MediaSessionCompat$Token) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
