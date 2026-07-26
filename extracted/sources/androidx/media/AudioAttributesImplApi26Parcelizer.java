package androidx.media;

import android.media.AudioAttributes;
import defpackage.q49;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(q49 q49Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) q49Var.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = q49Var.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, q49 q49Var) {
        q49Var.getClass();
        q49Var.k(audioAttributesImplApi26.a, 1);
        q49Var.j(audioAttributesImplApi26.b, 2);
    }
}
