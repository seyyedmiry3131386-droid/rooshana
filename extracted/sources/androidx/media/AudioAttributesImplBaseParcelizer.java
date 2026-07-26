package androidx.media;

import defpackage.q49;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(q49 q49Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = q49Var.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = q49Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = q49Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = q49Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, q49 q49Var) {
        q49Var.getClass();
        q49Var.j(audioAttributesImplBase.a, 1);
        q49Var.j(audioAttributesImplBase.b, 2);
        q49Var.j(audioAttributesImplBase.c, 3);
        q49Var.j(audioAttributesImplBase.d, 4);
    }
}
