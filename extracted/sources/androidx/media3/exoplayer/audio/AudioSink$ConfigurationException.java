package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final b a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, b bVar) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = bVar;
    }

    public AudioSink$ConfigurationException(String str, b bVar) {
        super(str);
        this.a = bVar;
    }
}
