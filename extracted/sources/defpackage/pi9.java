package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class pi9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pi9(Intent intent, Object obj, int i) {
        this.a = i;
        this.b = intent;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c64, java.lang.Object] */
    public final void a() {
        switch (this.a) {
            case 0:
                Intent intent = this.b;
                if (intent != null) {
                    ((GoogleApiActivity) this.c).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.b;
                if (intent2 != null) {
                    this.c.startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                t0.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
