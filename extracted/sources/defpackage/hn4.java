package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hn4 extends MediaController.Callback {
    public final WeakReference a;

    public hn4(no4 no4Var) {
        this.a = new WeakReference(no4Var);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        no4 no4Var = (no4) this.a.get();
        if (no4Var == null || playbackInfo == null) {
            return;
        }
        no4Var.a(new mn4(playbackInfo.getPlaybackType(), py.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        qq4.l(bundle);
        no4 no4Var = (no4) this.a.get();
        if (no4Var != null) {
            no4Var.c(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        no4 no4Var = (no4) this.a.get();
        if (no4Var != null) {
            wv wvVar = MediaMetadataCompat.c;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.b = mediaMetadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            no4Var.d(mediaMetadataCompatCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        no4 no4Var = (no4) this.a.get();
        if (no4Var == null || no4Var.c != null) {
            return;
        }
        no4Var.e(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        no4 no4Var = (no4) this.a.get();
        if (no4Var != null) {
            no4Var.f(MediaSessionCompat$QueueItem.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        no4 no4Var = (no4) this.a.get();
        if (no4Var != null) {
            no4Var.g(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        no4 no4Var = (no4) this.a.get();
        if (no4Var != null) {
            no4Var.e.b.a();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        qq4.l(bundle);
        no4 no4Var = (no4) this.a.get();
        if (no4Var != null) {
            no4Var.h(str, bundle);
        }
    }
}
