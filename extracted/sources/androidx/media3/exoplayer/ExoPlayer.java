package androidx.media3.exoplayer;

import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.gb6;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends gb6 {
    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
