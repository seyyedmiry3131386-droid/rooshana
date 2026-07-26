package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends defpackage.y {
    @Override // defpackage.y
    public final void A(boolean z) {
        super.A(z);
        if (z) {
            c("android.webkit.WebView");
            c("android.widget.VideoView");
            c("androidx.camera.view.PreviewView");
            c("androidx.media3.ui.PlayerView");
            c("com.google.android.exoplayer2.ui.PlayerView");
            c("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.a;
        copyOnWriteArraySet.remove("android.webkit.WebView");
        copyOnWriteArraySet.remove("android.widget.VideoView");
        copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
        copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    @Override // defpackage.y
    public final void E() {
    }
}
