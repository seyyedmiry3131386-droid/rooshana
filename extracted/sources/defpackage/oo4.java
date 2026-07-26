package defpackage;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oo4 {
    public final mn4 a;
    public final PlaybackStateCompat b;
    public final MediaMetadataCompat c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public oo4() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.EMPTY_LIST;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }

    public oo4(mn4 mn4Var, PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = mn4Var;
        this.b = playbackStateCompat;
        this.c = mediaMetadataCompat;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public oo4(oo4 oo4Var) {
        this.a = oo4Var.a;
        this.b = oo4Var.b;
        this.c = oo4Var.c;
        this.d = oo4Var.d;
        this.e = oo4Var.e;
        this.f = oo4Var.f;
        this.g = oo4Var.g;
        this.h = oo4Var.h;
    }
}
