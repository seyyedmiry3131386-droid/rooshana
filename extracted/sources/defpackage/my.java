package defpackage;

import android.media.AudioAttributes;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class my {
    public final AudioAttributes a;
    public final int b = -1;

    public my(AudioAttributes audioAttributes, int i) {
        this.a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof my) {
            return Objects.equals(this.a, ((my) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
