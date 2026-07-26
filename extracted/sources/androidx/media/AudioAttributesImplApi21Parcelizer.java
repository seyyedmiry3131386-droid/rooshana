package androidx.media;

import android.media.AudioAttributes;
import defpackage.q49;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(q49 q49Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) q49Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = q49Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, q49 q49Var) {
        q49Var.getClass();
        q49Var.k(audioAttributesImplApi21.a, 1);
        q49Var.j(audioAttributesImplApi21.b, 2);
    }
}
