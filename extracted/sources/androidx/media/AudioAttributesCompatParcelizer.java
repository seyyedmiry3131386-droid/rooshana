package androidx.media;

import defpackage.q49;
import defpackage.s49;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(q49 q49Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        s49 s49VarH = audioAttributesCompat.a;
        if (q49Var.e(1)) {
            s49VarH = q49Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) s49VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, q49 q49Var) {
        q49Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        q49Var.i(1);
        q49Var.l(audioAttributesImpl);
    }
}
