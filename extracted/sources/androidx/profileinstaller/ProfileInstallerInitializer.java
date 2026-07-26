package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import defpackage.mn3;
import defpackage.nk;
import defpackage.sl3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements mn3 {
    @Override // defpackage.mn3
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.mn3
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new sl3(17);
        }
        Choreographer.getInstance().postFrameCallback(new nk(this, context.getApplicationContext()));
        return new sl3(17);
    }
}
