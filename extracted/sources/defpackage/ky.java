package defpackage;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class ky {
    public static void a(AudioAttributes.Builder builder, boolean z) {
        builder.setIsContentSpatialized(z);
    }

    public static void b(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
