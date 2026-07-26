package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;
import ir.myket.player.provider.service.PlaybackService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class jq4 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final xq4 a;

    public jq4(PlaybackService playbackService, ExoPlayer exoPlayer, PendingIntent pendingIntent, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ol3 ol3Var, Bundle bundle, Bundle bundle2, do3 do3Var) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            map.put("", this);
        }
        this.a = new xq4(this, playbackService, exoPlayer, pendingIntent, immutableList, immutableList2, immutableList3, ol3Var, bundle, bundle2, do3Var);
    }

    public final gb6 a() {
        return this.a.t.a;
    }
}
