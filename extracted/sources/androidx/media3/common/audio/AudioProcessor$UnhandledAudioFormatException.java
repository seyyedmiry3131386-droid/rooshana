package androidx.media3.common.audio;

import defpackage.f00;

/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(f00 f00Var) {
        this("Unhandled input format:", f00Var);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, f00 f00Var) {
        super(str + " " + f00Var);
    }
}
