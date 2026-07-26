package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class rl4 {
    public static final /* synthetic */ int b = 0;
    public final nl4 a;

    public rl4(Context context, ComponentName componentName, on onVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new pl4(context, componentName, onVar);
        } else {
            this.a = new nl4(context, componentName, onVar);
        }
    }
}
